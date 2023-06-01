package com.example.chusho_kigyocho_20230515.service;

import com.example.chusho_kigyocho_20230515.entity.Application;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service("ApplicationService2")
//@Service
public interface ApplicationService {

    List<Application> all();
}
