package com.home.employee.common.dto;

import lombok.Data;

/**
 * ${DESCRIPTION}
 *
 * @author roger
 * @email 190642964@qq.com
 * @create 2018-06-29 16:35
 **/
@Data
public class EmployeeDto {
    /**
     * 主键id
     */
    private Long id;
    /**
     * 姓名
     */
    private String staffName;
    /**
     * 电话
     */
    private String mobile;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 头像
     */
    private String headImage;
    /**
     * 密码
     */
    private String employeePassword;
    /**
     * 婚姻状况 0-未婚,1-已婚
     */
    private Boolean maritalStatus;


}
