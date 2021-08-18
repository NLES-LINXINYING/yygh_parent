package com.atguigu.easyexcel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.Map;

/**
 * @author linxinying
 * @version 1.0.0
 * @className ExcelListener.java
 * @description
 * @createTime 2021-08-13 09:25:00
 */
public class ExcelListener extends AnalysisEventListener<UserData> {
    // 一行一行读取，从第二行开始读取
    @Override
    public void invoke(UserData userData, AnalysisContext analysisContext) {
        System.out.println(userData);
    }

    // 读取之后执行
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        System.out.println("读取之后执行......");
    }

    // 读取表头信息
    @Override
    public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {
        //super.invokeHeadMap(headMap, context);
        System.out.println("表头信息：" + headMap);
    }
}
