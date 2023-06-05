package com.example.chusho_kigyocho_20230515.mapper;

import com.example.chusho_kigyocho_20230515.entity.Notification;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface NotificationMapper {
    List<Notification> all();
}
