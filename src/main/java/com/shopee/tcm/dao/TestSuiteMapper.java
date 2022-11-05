package com.shopee.tcm.dao;

import com.shopee.tcm.service.entity.TestSuite;

public interface TestSuiteMapper {
    int deleteByPrimaryKey(Long suiteId);

    int insert(TestSuite row);

    int insertSelective(TestSuite row);

    TestSuite selectByPrimaryKey(Long suiteId);

    int updateByPrimaryKeySelective(TestSuite row);

    int updateByPrimaryKey(TestSuite row);
}