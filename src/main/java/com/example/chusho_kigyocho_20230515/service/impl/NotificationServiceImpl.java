package com.example.chusho_kigyocho_20230515.service.impl;

import com.example.chusho_kigyocho_20230515.entity.Notification;
import com.example.chusho_kigyocho_20230515.mapper.NotificationMapper;
import com.example.chusho_kigyocho_20230515.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    private NotificationMapper notificationMapper;
    @Override
    public List<Notification> all() {
        List<Notification> all = notificationMapper.all();
        return all;
    }
}
