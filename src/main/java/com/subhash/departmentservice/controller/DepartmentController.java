package com.subhash.departmentservice.controller;

import com.subhash.departmentservice.entity.Department;
import com.subhash.departmentservice.service.DepartmentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(
        name = "CRUD REST APIs for Department Service",
        description = "CRUD APIs"
)
@RestController
@RequestMapping("api/departments")
@AllArgsConstructor
public class DepartmentController {

    DepartmentService departmentService;

    @Operation(
            summary = "Save Department in the DB",
            description = "Save using PostMapping"

    )
    @ApiResponse(
            responseCode = "201",
            description = "Created"
    )
    @PostMapping
    public ResponseEntity<Department> saveDepartment(@RequestBody Department department){
        Department savedDepartment = departmentService.saveDepartment(department);
        return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
    }

    @Operation(
            summary = "Get Department by Id",
            description = "Get using GetMapping"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Success"
    )
    @GetMapping("{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable("id") Long departmentId){
        Department department = departmentService.getDepartmentById(departmentId);
        return ResponseEntity.ok(department);
    }
}
