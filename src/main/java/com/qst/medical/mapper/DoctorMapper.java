package com.qst.medical.mapper;

import com.qst.medical.domain.entity.DoctorEntity;
import com.qst.medical.model.DoctorLevelModel;
import com.qst.medical.model.DoctorModel;
import com.qst.medical.model.TreatTypeModel;
import com.qst.medical.param.DoctorParam;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DoctorMapper {

    /**
     * 获取所有的医师信息
     */
    List<DoctorModel> getAllDoctor(DoctorParam param);

    /**
     * 获取所有的医师级别
     */
    List<DoctorLevelModel> getAllLevel();

    /**
     * 获取所有的诊治类型
     */
    List<TreatTypeModel> getAllTreatType();

    /**
     * 新增医师信息
     */
    int saveDoctor(DoctorEntity param);

    /**
     * 更新医师信息
     */
    int updateDoctor(DoctorEntity param);

    /**
     * 根据id删除医师
     */
    int deleteDoctorById(Long id);
}
