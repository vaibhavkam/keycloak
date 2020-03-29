package com.vaibhav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DepartmentController {
    
    @GetMapping("/dept")
    public List<String> getDepartments(){
        ArrayList<String> departmentList = new ArrayList<String>();
        departmentList.add("Accounting");
        departmentList.add("Software");
        departmentList.add("Human Resource");
        return departmentList;
    }
}
