package com.shopee.tcm.service.entity.enums;

public enum AutomationStatus {
    Automatable,Automating, Automated;

    public static void main(String[] args) {
        System.out.println(AutomationStatus.Automatable.name());
    }

}
