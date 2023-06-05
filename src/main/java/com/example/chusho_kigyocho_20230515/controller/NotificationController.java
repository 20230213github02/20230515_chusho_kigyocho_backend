package com.example.chusho_kigyocho_20230515.controller;

import com.example.chusho_kigyocho_20230515.entity.Notification;
import com.example.chusho_kigyocho_20230515.service.NotificationService;
import com.example.chusho_kigyocho_20230515.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Notification")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    public JsonResult all(){
        JsonResult<List> result = new JsonResult<>();
        List<Notification> all;
        try {
                    all = notificationService.all();
                    result.setState(200);
            System.out.println("success");
        } catch (Exception e){
            result.setState(4000);
            result.setMessage("异常");
            System.out.println("fail");
        }
        return  result;
    }
}
