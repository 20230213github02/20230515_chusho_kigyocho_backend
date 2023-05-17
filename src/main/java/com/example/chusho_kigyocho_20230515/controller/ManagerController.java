package com.example.chusho_kigyocho_20230515.controller;

import com.example.chusho_kigyocho_20230515.entity.Manager;
import com.example.chusho_kigyocho_20230515.mapper.ManagerMapper;
import com.example.chusho_kigyocho_20230515.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

// fortest
@Component
@RestController
@RequestMapping("/Manager")
public class ManagerController {
    @Autowired
    private ManagerMapper managerMapper;

    @CrossOrigin
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public JsonResult save(@RequestBody Manager manager){
        JsonResult<Void> result = new JsonResult<>();

        try{
            managerMapper.save(manager);
            result.setState(200);
            System.out.println("success");
        } catch (Exception e){
            result.setState(4000);
            result.setMessage("异常");
            System.out.println("fail");
        }
        return result;
    }

    @RequestMapping(value = "/delete/{managerId}", method = RequestMethod.PUT)
    public JsonResult delete(@PathVariable("managerId") Integer managerId ){
        JsonResult<Void> result = new JsonResult<>();

        try{
            int delete = managerMapper.delete(managerId);
            result.setState(200);
            System.out.println("success");
        } catch (Exception e){
            result.setState(4000);
            result.setMessage("异常");
            System.out.println("fail");
        }
        return result;
    }

    @CrossOrigin
    //TODO 要用get吗？
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public JsonResult login(@RequestBody Manager  manager){
        JsonResult<Boolean> result = new JsonResult<>();

        try{
            boolean login = managerMapper.login(manager);
            if(login){
                result.setState(200);
                System.out.println("success");
                result.setData(true);
            } else {
//                表示处理了登陆请求，但是没有找到相应用户数据
                result.setState(600);
                result.setData(false);
            }

        } catch (Exception e){
            result.setState(4000);
            result.setMessage("异常");
            System.out.println("fail");
        }
        return result;
    }
}
