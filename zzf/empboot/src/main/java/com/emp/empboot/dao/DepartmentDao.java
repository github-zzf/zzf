package com.emp.empboot.dao;

import com.emp.empboot.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DepartmentDao {
    public List<Department> search();
    public Department searchById(int id);
}
