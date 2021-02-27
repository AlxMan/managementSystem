package com.wxc.dao;

import com.wxc.entity.Employee;
import java.util.List;

public interface EmployeeDao {
    /**
     *   查询所有
     */
    public List<Employee> findAll();
    /**
     * 根据ID查询
     */
    public Employee findByid(int id);
    /**
     * 新增
     */
    public int save(Employee employee);
}
