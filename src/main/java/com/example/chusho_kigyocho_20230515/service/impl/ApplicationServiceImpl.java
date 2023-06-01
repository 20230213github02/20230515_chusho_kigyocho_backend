package com.example.chusho_kigyocho_20230515.service.impl;

import com.example.chusho_kigyocho_20230515.entity.Application;
import com.example.chusho_kigyocho_20230515.mapper.ApplicationMapper;
import com.example.chusho_kigyocho_20230515.service.ApplicationService;
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
}
