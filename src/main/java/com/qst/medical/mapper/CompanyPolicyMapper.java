package com.qst.medical.mapper;

import com.qst.medical.domain.entity.CompanyPolicyEntity;
import com.qst.medical.model.CompanyPolicyModel;
import com.qst.medical.param.CompanyPolicyParam;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CompanyPolicyMapper {

    /**
     * 查询所有的医药公司政策
     */
    List<CompanyPolicyModel> getAllPolicy(CompanyPolicyParam param);

    /**
     * 新增医药公司政策
     */
    int savePolicy(CompanyPolicyEntity entity);

    /**
     * 更新医药公司政策
     */
    int updatePolicy(CompanyPolicyEntity entity);

    /**
     * 根据政策id删除医药公司政策
     */
    int deletePolicy(Long id);

    /**
     * 根据公司id删除医药公司政策
     */
    int deletePolicyByCompany(Integer id);
}
