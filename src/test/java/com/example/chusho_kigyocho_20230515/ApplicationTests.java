package com.example.chusho_kigyocho_20230515;

import com.example.chusho_kigyocho_20230515.controller.ApplicationController;
import com.example.chusho_kigyocho_20230515.controller.NormaluserController;
import com.example.chusho_kigyocho_20230515.controller.NotificationController;
import com.example.chusho_kigyocho_20230515.entity.Application;
import com.example.chusho_kigyocho_20230515.entity.Manager;
import com.example.chusho_kigyocho_20230515.entity.Normaluser;
import com.example.chusho_kigyocho_20230515.entity.Notification;
import com.example.chusho_kigyocho_20230515.mapper.ApplicationMapper;
import com.example.chusho_kigyocho_20230515.mapper.ManagerMapper;
import com.example.chusho_kigyocho_20230515.mapper.NormaluserMapper;
import com.example.chusho_kigyocho_20230515.service.ApplicationService;
import com.example.chusho_kigyocho_20230515.service.NotificationService;
import com.example.chusho_kigyocho_20230515.util.JsonResult;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private ManagerMapper managerMapper;

    @Test
    void test20230515_1406(){
        Manager manager = new Manager();
        manager.setManagerUsername("f34f");
        manager.setManagerPassword("f34f");
        int save = managerMapper.save(manager);
        System.out.println(save);
    }

    @Test
    void test20230515_1428(){
        int delete = managerMapper.delete(7);
        System.out.println(delete);
    }

    @Test
    void test20230515_1446(){
        Manager manager = new Manager("jojo6", "jojo5pw");
        System.out.println(manager);
        int save = managerMapper.save(manager);
        System.out.println(save);
    }

    @Test
    void test20230515_1506(){
        boolean login = managerMapper.login(new Manager("jojo6", "jojo5pw"));
        System.out.println(login);
    }

    @Autowired
    private NormaluserMapper normaluserMapper;

    @Test
    void test20230515_1546(){
//        boolean login = normaluserMapper.login(new Normaluser())
        int save = normaluserMapper.save(new Normaluser("user3", "pw"));
        System.out.println(save);
    }

    @Test
    void test20230515_1840(){
        int delete = normaluserMapper.delete(1);
        System.out.println(delete);
    }

    @Test
    void test20230515_1842(){
        boolean login = normaluserMapper.login(new Normaluser("user1", "pw"));
        System.out.println(login);
    }

    @Test
    void test20230516_1736(){
        boolean login = managerMapper.login(new Manager("2", "3"));
        System.out.println(login);
    }

    @Test
    void test20230516_1737(){
        boolean login = managerMapper.login(new Manager("jojo2", "jojo2pw"));
        System.out.println(login);
    }

    @Test
    void test20230516_1918(){
        boolean login = normaluserMapper.login(new Normaluser("user4", "111111111"));
        System.out.println(login);
    }

    @Test
    void test20230516_1920(){
        boolean login = normaluserMapper.login(new Normaluser("user4", "111111112"));
        System.out.println(login);
    }

    @Autowired
    private NormaluserController normaluserController;
    @Test
    void test20230516_1924(){
        JsonResult result = normaluserController.login(new Normaluser("user4", "111111111"));
        System.out.println(result);
        System.out.println(result.getData());
        System.out.println(result.getData());
    }

    @Autowired
    private ApplicationMapper applicationMapper;

    @Test
    void test20230601_01_applicationMapper(){
//        Application application = new Application();
//        application.setAppShinseiKubun("fef");
//        application.setAppShinseiDate(new Date());
//        application.setAppKokaiyoStatus("fjwo");
//        application.setAppShinseishaKoshinDateTime(new Date());
        List<Application> all = applicationMapper.all();
        for (Application a :
                all) {
            System.out.println(a);
        }
    }

    @Autowired
//    @Qualifier("ApplicationService2")
    private ApplicationService applicationService;

    @Test
    void test20230601_02_applicationService(){
        List<Application> all = applicationService.all();
        for (Application a :
                all) {
            System.out.println(a);
        }
    }

    @Autowired
    private NotificationService notificationService;
    @Test
    void test20230605_01_notification(){
        List<Notification> notifications = notificationService.all();
        for (Notification n :
                notifications) {
            System.out.println(n);
        }
    }

    @Autowired
   private NotificationController notificationController;

    @Test
    void test20230605_02_notification(){
        JsonResult all = notificationController.all();
        List<Notification> data = (List<Notification>)all.getData();
        for (Notification n :
                data) {
            System.out.println(n);
        }
    }

    @Autowired
    private ApplicationController applicationController;

    @Test
    void test20230605_03_application(){
        JsonResult all = applicationController.all();
//        List<Application> data = (List<Application>) all.getData();
//        for (Application a :
//                data) {
//            System.out.println(a);
//        }
        System.out.println(all);
    }

}
