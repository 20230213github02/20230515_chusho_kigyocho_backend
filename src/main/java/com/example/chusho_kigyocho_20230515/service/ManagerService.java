package com.example.chusho_kigyocho_20230515.service;

import com.example.chusho_kigyocho_20230515.entity.Manager;
import com.example.chusho_kigyocho_20230515.entity.Normaluser;
import com.example.chusho_kigyocho_20230515.mapper.ManagerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public interface ManagerService {
    int save(Manager manager);

    int delete(Integer managerId);

    boolean login(Manager manager);

}
