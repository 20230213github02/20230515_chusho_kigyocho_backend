package com.example.chusho_kigyocho_20230515.service.impl;

import com.example.chusho_kigyocho_20230515.entity.Manager;
import com.example.chusho_kigyocho_20230515.mapper.ManagerMapper;
import com.example.chusho_kigyocho_20230515.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerMapper managerMapper;

    @Override
    public int save(Manager manager) {
        int save = managerMapper.save(manager);
        return save;
    }

    @Override
    public int delete(Integer normaluserId) {
        int delete = managerMapper.delete(normaluserId);
        return delete;
    }

    @Override
    public boolean login(Manager manager) {
        boolean login = managerMapper.login(manager);
        return login;
    }
}
