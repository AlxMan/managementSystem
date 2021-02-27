package com.wxc.service.impl;

import com.wxc.dao.DeptDao;
import com.wxc.entity.Dept;
import com.wxc.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;
    @Override
    public Dept findByid(int id) {
        Dept Deptbyid = deptDao.findByid(id);
        return Deptbyid;
    }
}
