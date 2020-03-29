package com.vaibhav.service;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    
    public List<String> getUserDepartments(){
        ArrayList<String> departmentList = new ArrayList<String>();

        departmentList.add("Accounting");
        departmentList.add("Software");
        departmentList.add("Human Resource");

        return departmentList;
    }
}


