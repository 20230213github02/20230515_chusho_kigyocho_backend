package com.example.chusho_kigyocho_20230515.service.impl;

import com.example.chusho_kigyocho_20230515.entity.Application;
import com.example.chusho_kigyocho_20230515.mapper.ApplicationMapper;
import com.example.chusho_kigyocho_20230515.service.ApplicationService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    private ApplicationMapper applicationMapper;
    @Override
    public List<Application> all() {
        List<Application> all = applicationMapper.all();
        return all;
    }

    @Override
    public PageInfo<Application> selectPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Application> applications=applicationMapper.all();
        PageInfo<Application> pageInfo = new PageInfo<>(applications);
        return pageInfo;
    }
}
