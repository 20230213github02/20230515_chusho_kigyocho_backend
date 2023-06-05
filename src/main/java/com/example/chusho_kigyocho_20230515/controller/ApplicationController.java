package com.example.chusho_kigyocho_20230515.controller;

import com.example.chusho_kigyocho_20230515.entity.Application;
import com.example.chusho_kigyocho_20230515.service.ApplicationService;
import com.example.chusho_kigyocho_20230515.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Application")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public JsonResult all(){
        JsonResult<List> result = new JsonResult<>();
        List<Application> all;
        try {
                    all = applicationService.all();
                    result.setData(all);
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
