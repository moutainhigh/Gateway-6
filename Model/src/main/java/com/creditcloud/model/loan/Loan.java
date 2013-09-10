/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constant.LoanConstant;
import com.creditcloud.model.enums.loan.LoanStatus;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import java.util.Date;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 *
 * @author sobranie
 */
public class Loan extends BaseObject implements Investable{

    /**
     * UUID
     */
    @Id
    private final String id;

    @Min(1)
    private final int ordinal;

    @Min(LoanConstant.MIN_LOAN_AMOUNT)
    @Max(LoanConstant.MAX_LOAN_AMOUNT)
    private final int amount;

    @NotNull
    private final Duration duration;

    @Min(LoanConstant.MIN_LOAN_TIME_OUT)
    @Max(LoanConstant.MAX_LOAN_TIME_OUT)
    private final int timeout;

    @NotNull
    private final LoanRequest loanRequest;

    /**
     * 开启投标时间
     */
    private final Date timeOpen;

    /**
     * 满标时间
     */
    private Date timeFinished;

    /**
     * 有无抵押
     */
    private final boolean mortgaged;

    /**
     *投标数
     */
    private  int bidNumber;
    
    @NotNull
    private LoanStatus status;

    public Loan(String id,
                int ordinal,
                int amount,
                Duration duration,
                int timeout,
                LoanStatus status,
                LoanRequest loanRequest,
                Date timeOpen,
                Date timeFinished,
                boolean mortgaged,
                int bidNumber) {
        this.id = id;
        this.ordinal = ordinal;
        this.amount = amount;
        this.duration = duration;
        this.timeout = timeout;
        this.status = status;
        this.loanRequest = loanRequest;
        this.timeOpen = timeOpen;
        this.timeFinished = timeFinished;
        this.mortgaged = mortgaged;
        this.bidNumber = bidNumber;
    }

    @Override
    public String getId() {
        return id;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public int getAmount() {
        return amount;
    }

    public int getTimeout() {
        return timeout;
    }

    public LoanStatus getStatus() {
        return status;
    }

    public void setStatus(LoanStatus status) {
        this.status = status;
    }

    public LoanRequest getLoanRequest() {
        return loanRequest;
    }

    public Date getTimeOpen() {
        return timeOpen;
    }

    public Date getTimeFinished() {
        return timeFinished;
    }

    public void setTimeFinished(Date timeFinished) {
        this.timeFinished = timeFinished;
    }

    @Override
    public Duration getDuration() {
        return duration;
    }

    public boolean isMortgaged() {
        return mortgaged;
    }

    public int getBidNumber() {
        return bidNumber;
    }

    public void setBidNumber(int bidNumber) {
        this.bidNumber = bidNumber;
    }

    @Override
    public int getRate() {
        return loanRequest.getRate();
    }

    @Override
    public RepaymentMethod getMethod() {
        return loanRequest.getMethod();
    }
}