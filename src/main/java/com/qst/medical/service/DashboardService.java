package com.qst.medical.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.qst.medical.domain.DrugCompany;
import com.qst.medical.domain.Sale;
import com.qst.medical.mapper.CompanyMapper;
import com.qst.medical.mapper.DoctorMapper;
import com.qst.medical.mapper.DrugMapper;
import com.qst.medical.mapper.SaleMapper;
import com.qst.medical.model.CompanyPolicyModel;
import com.qst.medical.model.DoctorModel;
import com.qst.medical.model.DrugModel;
import com.qst.medical.model.MaterialModel;
import com.qst.medical.model.TreatTypeModel;
import com.qst.medical.param.DoctorParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class DashboardService {

    @Autowired
    DoctorMapper doctorMapper;

    @Autowired
    DrugMapper drugMapper;

    @Autowired
    CompanyMapper companyMapper;

    @Autowired
    SaleMapper saleMapper;

    @Autowired
    MaterialService materialService;

    @Autowired
    CompanyPolicyService companyPolicyService;

    public ObjectNode getDashboardData() {
        List<DoctorModel> allDoctor = doctorMapper.getAllDoctor(new DoctorParam());
        List<DrugModel> allDrug = drugMapper.getAllDrug("");
        List<DrugCompany> allCompany = companyMapper.getAllCompany("");
        List<Sale> allSale = saleMapper.getAllSale("");
        int doctorNumb = allDoctor.size();
        int drugNumb = allDrug.size();
        int companyNumb = allCompany.size();
        int saleNumb = allSale.size();

        int docLevel1 = 0, docLevel2 = 0, docLevel3 = 0;
        List<TreatTypeModel> allTreatType = doctorMapper.getAllTreatType();
        HashMap<String, Integer> treatMap = new HashMap<>();
        for (TreatTypeModel treat : allTreatType) {
            treatMap.put(treat.getName(), 0);
        }
        for (DoctorModel doc : allDoctor) {
            if (doc.getLevelId() == 1) {
                docLevel1++;
            } else if (doc.getLevelId() == 2) {
                docLevel2++;
            }
            if (doc.getLevelId() == 3) {
                docLevel3++;
            }
            treatMap.put(doc.getTreatType(), treatMap.get(doc.getTreatType()) + 1);
        }

        List<MaterialModel> allMaterial = materialService.getFirstMaterialWithPage();
        List<CompanyPolicyModel> allPolicy = companyPolicyService.getFirstPolicyWithPage();
        ObjectMapper objectMapper = new ObjectMapper();

        ObjectNode objectNode = objectMapper.createObjectNode();
        objectNode.put("doctorNumb", doctorNumb);
        objectNode.put("drugNumb", drugNumb);
        objectNode.put("companyNumb", companyNumb);
        objectNode.put("saleNumb", saleNumb);

        ObjectNode docLevelNode = objectMapper.createObjectNode();
        docLevelNode.put("l1", docLevel1);
        docLevelNode.put("l2", docLevel2);
        docLevelNode.put("l3", docLevel3);
        objectNode.set("docLevel", docLevelNode);

        JsonNode treatNode = objectMapper.convertValue(treatMap, JsonNode.class);
        objectNode.set("treatMap", treatNode);

        JsonNode materialNode = objectMapper.valueToTree(allMaterial);
        JsonNode policyNode = objectMapper.valueToTree(allPolicy);
        objectNode.set("materials", materialNode);
        objectNode.set("policys", policyNode);

        return objectNode;
    }
}
