package com.emp.empboot.controller;

import com.emp.empboot.entity.Department;
import com.emp.empboot.entity.Employee;
import com.emp.empboot.service.DepartmentService;
import com.emp.empboot.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    EmpService empService;
    @Autowired
    DepartmentService departmentService;
    @RequestMapping("add")
    private String add(Employee emp) {
        boolean flag = empService.add(emp);
        if (flag) {
            return "redirect:emp";
        } else {
            return "redirect:showAdd";
        }

    }

    @RequestMapping("update")
    private String update(Employee emp) {
        boolean flag = empService.update(emp);
        if (flag) {
            return "redirect:emp";
        } else {
            return "redirect:showUpdate";
        }
    }

    @RequestMapping("delete")
    private String delete(int id) {
        boolean flag = empService.delete(id);
        return "redirect:emp";


    }
    @RequestMapping("showAdd")
    private ModelAndView showAdd(ModelAndView mv) {
        List<Department> deps = departmentService.search();
        mv.setViewName("add");
        mv.addObject("deps",deps);
        return mv;
    }
    @RequestMapping("showUpdate")
    private ModelAndView showUpdate(int id) {
        ModelAndView mv = new ModelAndView("update");
        List<Department> depList = departmentService.search();
        //Employee emp = empService.search(id);
        Employee emp = empService.searchEmpAndDep2(id);
        mv.addObject("emp", emp);
        return mv;
    }

    @RequestMapping("search")
    public ModelAndView search() {
        ModelAndView mv = new ModelAndView("emp2");
        List<Employee> list = empService.search();
        list.add(new Employee());
        mv.addObject("list", list);
        return mv;
    }

    @RequestMapping("testJson")
    @ResponseBody
    public List<Employee> testJson() {
        List<Employee> list = empService.search();
        return list;
    }
}