package com.shopee.tcm.dao;

import com.shopee.tcm.service.entity.TestPlan;
import org.springframework.stereotype.Repository;

@Repository
public interface TestPlanMapper {
    int deleteByPrimaryKey(Long planId);
    int insert(TestPlan row);
    TestPlan selectByPrimaryKey(Long planId);
    int updateByPrimaryKey(TestPlan row);
}
