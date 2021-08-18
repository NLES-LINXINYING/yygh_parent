package com.atguigu.yygh.hosp.respository;

import com.atguigu.yygh.model.hosp.Schedule;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * @author linxinying
 * @version 1.0.0
 * @className HospitalRespository.java
 * @description
 * @createTime 2021-08-16 17:59:00
 */

@Repository
public interface ScheduleRepository extends MongoRepository<Schedule, String> {

    // 根据医院编号和排班编号查询
    Schedule getScheduleByHoscodeAndHosScheduleId(String hoscode, String hosScheduleId);

    // 根据医院编号 、科室编号和工作日期，查询排班详细信息
    List<Schedule> findScheduleByHoscodeAndDepcodeAndWorkDate(String hoscode, String depcode, Date toDate);
}
