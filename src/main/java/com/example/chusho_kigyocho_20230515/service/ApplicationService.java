package com.example.chusho_kigyocho_20230515.service;

import com.example.chusho_kigyocho_20230515.entity.Application;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service("ApplicationService2")
//@Service
public interface ApplicationService {

    List<Application> all();

    PageInfo<Application> selectPage(int pageNum, int pageSize);
}
