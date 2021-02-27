package com.wxc.controller;

import com.wxc.entity.Employee;
import com.wxc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.Service;
import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        model.addAttribute("employeeList",employeeService.findAll());
        return "list";
   }
    @RequestMapping("/save")
    public String save(Employee employee){
        employeeService.save(employee);
        return "redirect:/employee/findAll";
    }
    @RequestMapping("/findByid")
    @ResponseBody
    public Employee findByid(int id){
        return  employeeService.findByid(id);
    }


}
