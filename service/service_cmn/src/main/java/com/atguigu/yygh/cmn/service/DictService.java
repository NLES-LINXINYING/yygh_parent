package com.atguigu.yygh.cmn.service;

import com.atguigu.yygh.model.cmn.Dict;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * @author linxinying
 * @version 1.0.0
 * @className DictService.java
 * @description
 * @createTime 2021-08-12 17:11:00
 */

public interface DictService extends IService<Dict> {

    List<Dict> findChlidData(Long id);

    void exportDictData(HttpServletResponse response);

    void importDictData(MultipartFile file);

    // 根据dictCode和value查询
    String getDictName(String dictCode, String value);

    //根据dictCode获取下级节点
    List<Dict> findByDictCode(String dictCode);
}
