package com.shopee.tcm.dao;

import com.shopee.tcm.service.entity.TestPlanItem;

public interface TestPlanItemMapper {
    int deleteByPrimaryKey(Long itemId);

    int insert(TestPlanItem row);

    int insertSelective(TestPlanItem row);

    TestPlanItem selectByPrimaryKey(Long itemId);

    int updateByPrimaryKeySelective(TestPlanItem row);

    int updateByPrimaryKey(TestPlanItem row);
}