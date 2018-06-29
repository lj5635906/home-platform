package com.home.employee.server.service;

import com.home.employee.common.dto.EmployeeDto;
import com.home.employee.server.domain.Employee;

/**
 * 员工信息表 业务处理接口
 *
 * @author Roger
 * @email 190642964@qq.com
 * @create 2018-6-29 16:05:46
 */
public interface EmployeeService{

    /**
     * 添加、修改员工信息
     * @param param EmployeeDto
     */
    void save(EmployeeDto param);

}