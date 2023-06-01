package com.example.chusho_kigyocho_20230515.mapper;

import com.example.chusho_kigyocho_20230515.entity.Application;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ApplicationMapper {

    List<Application> all();

}
