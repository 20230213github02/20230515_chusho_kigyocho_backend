package com.example.chusho_kigyocho_20230515;

import com.example.chusho_kigyocho_20230515.entity.Manager;
import com.example.chusho_kigyocho_20230515.entity.Normaluser;
import com.example.chusho_kigyocho_20230515.mapper.ManagerMapper;
import com.example.chusho_kigyocho_20230515.mapper.NormaluserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
        int save = normaluserMapper.save(new Normaluser("user2", "pw"));
        System.out.println(save);
    }
}
