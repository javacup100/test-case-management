package com.shopee.tcm.service.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class TestSuite {
    @Id
    @GeneratedValue
    private long suiteId;
    private long parentId;
    private String suiteName;
    private String qaList;
    private String jiraLinks;
    private String prdLinks;
    private String tdLinks;
    private String caseIdList;
    private String createdBy;
    private LocalDateTime createdTime;
    private String updatedBy;
    private LocalDateTime updatedTime;
}
