package com.wxc.service;

import com.wxc.entity.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeptService {
    /**
     * 根据id查询
     * @return
     */
    public Dept findByid(int id);
}
