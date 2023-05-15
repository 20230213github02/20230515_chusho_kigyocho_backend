package com.example.chusho_kigyocho_20230515.mapper;

import com.example.chusho_kigyocho_20230515.entity.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ManagerMapper {
    int save(Manager manager);

    int delete(Integer managerId);

    boolean login(Manager manager);
}
