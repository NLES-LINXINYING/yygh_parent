package com.atguigu.yygh.hosp.respository;

import com.atguigu.yygh.model.hosp.Hospital;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author linxinying
 * @version 1.0.0
 * @className HospitalRespository.java
 * @description
 * @createTime 2021-08-16 17:59:00
 */

@Repository
public interface HospitalRepository extends MongoRepository<Hospital, String> {

    // 判断是否存在数据
    Hospital getHospitalByHoscode(String hoscode);
}
