package com.atguigu.yygh.hosp.service;

import com.atguigu.yygh.model.hosp.HospitalSet;
import com.atguigu.yygh.vo.order.SignInfoVo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author linxinying
 * @version 1.0.0
 * @className HospitalSetService.java
 * @description
 * @createTime 2021-08-10 12:00:00
 */
public interface HospitalSetService extends IService<HospitalSet> {
    //2 根据传递过来医院编码，查询数据库，查询签名
    String getSignKey(String hoscode);

    //获取医院签名信息
    SignInfoVo getSignInfoVo(String hoscode);
}
