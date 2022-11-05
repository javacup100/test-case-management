package com.shopee.tcm.dao;

import com.shopee.tcm.service.entity.Project;

public interface ProjectMapper {
    int deleteByPrimaryKey(Long projectId);

    int insert(Project row);

    Project selectByPrimaryKey(Long projectId);

    int updateByPrimaryKey(Project row);
}
