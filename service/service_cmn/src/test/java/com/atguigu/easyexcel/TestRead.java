package com.atguigu.easyexcel;

import com.alibaba.excel.EasyExcel;

/**
 * @author linxinying
 * @version 1.0.0
 * @className TestRead.java
 * @description
 * @createTime 2021-08-13 09:30:00
 */
public class TestRead {

    public static void main(String[] args) {
        // 设置excel文件路径和文件名称
        String fileName = "E:\\excel\\01.xlsx";

        // 调用方法实现读取操作
        EasyExcel.read(fileName, UserData.class, new ExcelListener())
        .sheet()
        .doRead();
    }
}
