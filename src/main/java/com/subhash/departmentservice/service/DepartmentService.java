package com.subhash.departmentservice.service;

import com.subhash.departmentservice.entity.Department;

public interface DepartmentService {

    Department saveDepartment(Department department);
    Department getDepartmentById(Long departmentId);

}
