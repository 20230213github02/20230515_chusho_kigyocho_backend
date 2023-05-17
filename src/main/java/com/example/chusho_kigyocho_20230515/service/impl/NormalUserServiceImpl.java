package com.example.chusho_kigyocho_20230515.service.impl;

import com.example.chusho_kigyocho_20230515.entity.Normaluser;
import com.example.chusho_kigyocho_20230515.mapper.NormaluserMapper;
import com.example.chusho_kigyocho_20230515.service.NormaluserService;
import org.springframework.beans.factory.annotation.Autowired;

public class NormalUserServiceImpl implements NormaluserService {

    @Autowired
    private NormaluserMapper normaluserMapper;

    @Override
    public int save(Normaluser normaluser) {
        int save = normaluserMapper.save(normaluser);
        return save;
    }

    @Override
    public int delete(Integer normaluserId) {
        int delete = normaluserMapper.delete(normaluserId);
        return delete;
    }

    @Override
    public boolean login(Normaluser manager) {
        boolean login = normaluserMapper.login(manager);
        return login;
    }
}
