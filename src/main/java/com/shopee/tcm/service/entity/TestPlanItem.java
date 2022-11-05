package com.shopee.tcm.service.entity;

import com.shopee.tcm.service.entity.enums.CaseExecutionStatus;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class TestPlanItem {
    @Id
    @GeneratedValue
    private long itemId;
    private long testPlanId;
    private long testCaseId;
    private CaseExecutionStatus executionStaus=CaseExecutionStatus.FAIL;
}
