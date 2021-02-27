package com.wxc.service;

import com.wxc.entity.Employee;

import java.util.List;

public interface EmployeeService {
    /**
     * 根据ID查询
     */
    public Employee findByid(int id);

    /**
     *  查询全部
     *
     */
    public List<Employee> findAll();

    /**
     * 新增
     */
    public int save(Employee employee);
}
