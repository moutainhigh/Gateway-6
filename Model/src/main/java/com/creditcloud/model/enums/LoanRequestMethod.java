/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums;

/**
 * 
 * @author rooseek
 */
public enum LoanRequestMethod implements BaseEnum {

    //按月付息到期还本	MonthlyInterest
    //等额本息			EqualInstallment
    //等额本金			EqualPrincipal	（这个可能不需要）
    //一次性还本付息		BulletRepayment
    MonthlyInterest("按月付息到期还本"),
    EqualInstallment("按月等额本息"),
    BulletRepayment("一次性还本付息");

    private final String key;

    private LoanRequestMethod(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public String toString(){
        return key;
    }
}
