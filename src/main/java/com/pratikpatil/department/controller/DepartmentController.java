package com.pratikpatil.department.controller;

import com.pratikpatil.department.entity.Department;
import com.pratikpatil.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department/")
@Slf4j
public class DepartmentController {

//    private Department dept;
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside department save method of department controller");
        return departmentService.save(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){
        log.info("Inside department find method of department controller");

        return departmentService.findDepartmentById(departmentId);

    }
}
