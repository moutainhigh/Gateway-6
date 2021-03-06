/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.reconciliation;

import java.util.List;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class FssRedeemReconciliationResult extends ReconciliationResult {

    @NotNull
    private List<FssRedeemReconciliation> items;

    public FssRedeemReconciliationResult(String BeginDate,
                                         String EndDate,
                                         int PageNum,
                                         int PageSize,
                                         int TotalItems,
                                         List<FssRedeemReconciliation> items) {
        super(BeginDate, EndDate, PageNum, PageSize, TotalItems);
        this.items = items;
    }
}
