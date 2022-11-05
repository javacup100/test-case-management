package com.shopee.tcm.service.serviceimpl;

import com.shopee.tcm.dao.TestPlanMapper;
import com.shopee.tcm.service.entity.TestPlan;
import com.shopee.tcm.service.TestPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
public class TestPlanServiceImpl implements TestPlanService {
    @Autowired
    private TestPlanMapper testPlanMapper;

    @Override
    public TestPlan getPlan(long planId) {
        return testPlanMapper.selectByPrimaryKey(planId);
    }

    @Override
    @Transactional
    public int insertPlan(TestPlan plan) {
        return testPlanMapper.insert(plan);
    }

    @Override
    @Transactional
    public int deletePlan(long planId) {
        return testPlanMapper.deleteByPrimaryKey(planId);
    }
}
