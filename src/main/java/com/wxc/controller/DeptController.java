package com.wxc.controller;

import com.wxc.entity.Dept;
import com.wxc.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;
    /**
     * 根据id查询
     *
     */
    @RequestMapping("/findByid")
    @ResponseBody
    public Dept findByid(int id){
        return deptService.findByid(id);

    }
}
