package com.emp.empboot.dao;

import com.emp.empboot.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDao {
    public List<Employee> search();
    public Employee  searchEmpAndDep(int id);
    public int add(Employee emp);
    public Employee searchById(int id);
    public int update(Employee emp);
    public int delete(int id);
    Employee searchEmpAndDep2(int id);
}