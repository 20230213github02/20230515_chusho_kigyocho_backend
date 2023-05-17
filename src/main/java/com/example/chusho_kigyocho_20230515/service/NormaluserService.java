package com.example.chusho_kigyocho_20230515.service;

import com.example.chusho_kigyocho_20230515.entity.Normaluser;
import org.springframework.stereotype.Service;

@Service
public interface NormaluserService {
    int save(Normaluser normaluser);

    int delete(Integer normaluserId);

    boolean login(Normaluser normaluser);

}
