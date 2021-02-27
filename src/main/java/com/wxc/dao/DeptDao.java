package com.wxc.dao;

import com.wxc.entity.Dept;

import java.util.List;

public interface DeptDao {
    /**
     * 查询所有
     */
    public List<Dept> findAll();
    /**
     * 根据id查询
     *
     */
    public Dept findByid(int id);
}
