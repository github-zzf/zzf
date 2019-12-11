package com.emp.empboot.service;

import com.emp.empboot.dao.DepartmentDao;
import com.emp.empboot.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentService {
    @Autowired
    DepartmentDao departmentDao;
    public List<Department> search(){
        return departmentDao.search();
    };
    public Department searchById(int id){
        return departmentDao.searchById(id);
    };
}
