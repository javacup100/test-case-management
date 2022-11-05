package com.shopee.tcm.service;

import com.shopee.tcm.service.entity.TestPlan;

public interface TestPlanService {
    TestPlan getPlan(long planId);
    int insertPlan(TestPlan plan);
    int deletePlan(long planId);
}
