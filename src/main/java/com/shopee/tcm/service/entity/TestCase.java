package com.shopee.tcm.service.entity;

import com.shopee.tcm.service.entity.enums.AutomationStatus;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
public class TestCase {
    @Id
    @GeneratedValue
    private long caseId;
    private long suiteId;
    @Column(name = "description")
    private String desc;
    private String category;
    private String preconditions;
    private String steps;
    private String expectedResult;
    private int priority;
    private String remarks;
    private String tags;
    private AutomationStatus automationStatus;
    private String automationId;
    private int version;
    private String createdBy;
    private LocalDateTime createdTime;
    private String updatedBy;
    private LocalDateTime updatedTime;
}
