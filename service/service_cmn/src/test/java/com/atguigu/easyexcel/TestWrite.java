package com.atguigu.easyexcel;

import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linxinying
 * @version 1.0.0
 * @className TestWrite.java
 * @description
 * @createTime 2021-08-12 20:39:00
 */

public class TestWrite {
    public static void main(String[] args) {
        // 设置excel文件路径和文件名称
        String fileName = "E:\\excel\\01.xlsx";

        List<UserData> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            UserData data = new UserData();
            data.setUid(i);
            data.setUsername("lucy_" + i);
            list.add(data);
        }

        EasyExcel.write(fileName, UserData.class)
                .sheet("用户信息")
                .doWrite(list);
    }
}
