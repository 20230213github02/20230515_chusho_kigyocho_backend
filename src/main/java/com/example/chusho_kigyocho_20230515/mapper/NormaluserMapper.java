package com.example.chusho_kigyocho_20230515.mapper;

import com.example.chusho_kigyocho_20230515.entity.Normaluser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface NormaluserMapper {
    int save(Normaluser normaluser);

    int delete(Integer normaluserId);

    boolean login(Normaluser normaluser);
}
