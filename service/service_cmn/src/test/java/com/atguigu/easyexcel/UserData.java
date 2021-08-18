package com.atguigu.easyexcel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @author linxinying
 * @version 1.0.0
 * @className UserData.java
 * @description
 * @createTime 2021-08-12 20:37:00
 */

@Data
public class UserData {

    @ExcelProperty(value = "用户编号", index = 0)
    private int uid;

    @ExcelProperty(value = "用户名称", index = 1)
    private String username;
}
