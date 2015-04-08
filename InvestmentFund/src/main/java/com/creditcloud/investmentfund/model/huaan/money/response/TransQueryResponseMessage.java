/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.model.huaan.money.response;

import com.creditcloud.investmentfund.model.huaan.money.CommonResponseMessage;
import java.util.Map;
import lombok.Data;

/**
 * 定义参考 : 华安云中信通讯接口说明_new.doc <br>
 *
 * @author guohuazhang
 */
@Data
public class TransQueryResponseMessage extends CommonResponseMessage {

    private String MerchantId;//	8位	商家ID
    private String OrgMerchantDate;//	8位	原定单日期
    private String OrgOrderNo;//	12位	原定单流水号
    private String OrgHaTradeDate;//	8位	原定单华安交易日
    private String OrgTxCode;//	4位	原交易类型代码
    private String OrgTotalAmt;//	18位	原交易涉及金额
    private String OrgRetCode;//	4位	原交易返回码
    private String OrgRetMsg;//	200位	原交易返回信息
    private String RetCode;//	4位	返回码(0000为成功)
    private String RetMsg;//	200位	返回信息
    private String CommonReturn;//	200位	公共回传字段

    @Override
    public void resolveXMLPaylod() {
        String decodedXML = this.getContentXMLPayloadDecoded();
        Map<String, String> parameters = parseXMLPayload(decodedXML);

        MerchantId = parameters.get("MerchantId");
        OrgMerchantDate = parameters.get("OrgMerchantDate");
        OrgOrderNo = parameters.get("OrgOrderNo");
        OrgHaTradeDate = parameters.get("OrgHaTradeDate");
        OrgTxCode = parameters.get("OrgTxCode");
        OrgTotalAmt = parameters.get("OrgTotalAmt");
        OrgRetCode = parameters.get("OrgRetCode");
        OrgRetMsg = parameters.get("OrgRetMsg");
        RetCode = parameters.get("RetCode");
        RetMsg = parameters.get("RetMsg");
        CommonReturn = parameters.get("CommonReturn");
    }

}
