package com.shopee.tcm;

import com.shopee.tcm.service.entity.TestPlan;
import com.shopee.tcm.service.serviceimpl.TestPlanServiceImpl;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;


//@ActiveProfiles("test")
//@MybatisTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@SpringBootTest
class TcmApplicationTests {
    @Autowired
    private TestPlan testPlan;
    @Autowired
    private TestPlanServiceImpl testPlanService;
    @Test
    void contextLoads() {
        System.out.println("hello world");
        testPlan.setBugList("12345");
//        testPlan.setPlanId(123456l);
        testPlan.setExecutor("zaiqiang2");
        testPlan.setRemark("hello");
        testPlanService.insertPlan(testPlan);
//        System.out.println(testPlanService.getPlan(123456l).toString());
    }

}
