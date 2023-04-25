package com.learn.chapter5.mapper;

import com.learn.chapter5.pojo.EmployeeTask;

public interface EmployeeTaskMapper {

    EmployeeTask getEmployeeTaskByEmpId(Long empId);
}
