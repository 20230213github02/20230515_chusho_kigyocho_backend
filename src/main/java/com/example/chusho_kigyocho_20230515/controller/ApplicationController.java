package com.example.chusho_kigyocho_20230515.controller;

import com.example.chusho_kigyocho_20230515.entity.Application;
import com.example.chusho_kigyocho_20230515.service.ApplicationService;
import com.example.chusho_kigyocho_20230515.util.JsonResult;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//added by ZHY for test
@Component
@RestController
@RequestMapping("/Application")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @CrossOrigin
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public JsonResult all(){
        JsonResult<List> result = new JsonResult<>();
        List<Application> all;


        try {
                    all = applicationService.all();

            // for test by ZHY
            System.out.println(all);

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

    @RequestMapping(value = "/page/{pageNum}/{pageSize}")
    @CrossOrigin
    public PageInfo<Application> selectPage(@PathVariable("pageNum") int pageNum,@PathVariable("pageSize") int pageSize){
        PageInfo<Application> pageInfo = applicationService.selectPage(pageNum, pageSize);
        return pageInfo;
    }
}
