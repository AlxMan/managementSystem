package com.wxc.service.impl;

import com.wxc.dao.EmployeeDao;
import com.wxc.entity.Employee;
import com.wxc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public Employee findByid(int id) {
        Employee byid = employeeDao.findByid(id);
        return byid;
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> employeeall = employeeDao.findAll();
        return employeeall;
    }

    @Override
    public int save(Employee employee) {
        int save = employeeDao.save(employee);
        return save;
    }
}
