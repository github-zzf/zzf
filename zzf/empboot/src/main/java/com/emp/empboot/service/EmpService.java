package com.emp.empboot.service;

import com.emp.empboot.dao.EmployeeDao;
import com.emp.empboot.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpService {
    @Autowired
    EmployeeDao employeeDao;
    public List<Employee> search(){
        return employeeDao.search();
    };
    public Employee  searchEmpAndDep(int id){
        return employeeDao.searchEmpAndDep(id);
    };
    public boolean add(Employee emp){
        employeeDao.add(emp);
        return true;
    };
    public Employee searchById(int id){
        return employeeDao.searchById(id);
    };
    public boolean update(Employee emp){
        employeeDao.update(emp);
        return true;
    };
    public boolean delete(int id){
        employeeDao.delete(id);
        return true;
    };
    public Employee searchEmpAndDep2(int id){
        return searchEmpAndDep2(id);
    };
}
