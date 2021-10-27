package com.pratikpatil.department.service;

import com.pratikpatil.department.entity.Department;
import com.pratikpatil.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department save(Department department) {
        log.info("Inside department save method of department controller");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("Inside department find method of department controller");

        return departmentRepository.findByDepartmentId(departmentId);
    }
}
