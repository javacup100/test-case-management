package com.shopee.tcm.service.entity;

import com.shopee.tcm.service.entity.enums.PlanStatus;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Component
public class TestPlan {
    @Id
    @GeneratedValue
    private long planId;
    private String planName;
    private String jiraLinks;
    private String executor;
    private String bugList;
    private String itemIdList;
    private PlanStatus status;
    private String createdBy;
    private LocalDateTime createdTime;
    private String updatedBy;
    private LocalDateTime updatedTime;
    private LocalDate startDate;
    private LocalDate endDate;
    private String remark;
    private String mmChannel;
    private String stalkGroup;
}
