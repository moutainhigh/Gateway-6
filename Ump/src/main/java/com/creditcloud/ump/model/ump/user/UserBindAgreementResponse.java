/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.user;

import com.creditcloud.ump.model.ump.base.BaseResponse;
import com.creditcloud.ump.model.ump.enums.CmdIdRspType;
import lombok.Data;
import lombok.ToString;

/**
 *
 * @author kdliu
 */
@Data
@ToString(callSuper=true)
public class UserBindAgreementResponse extends BaseResponse{
    
    private String user_id;

    public UserBindAgreementResponse() {
        super(CmdIdRspType.MER_BIND_AGREEMENT_RSP);
    }

    public UserBindAgreementResponse(String sign_type, String sign, String mer_id, String version, String ret_code, String ret_msg, String user_id) {
        super(CmdIdRspType.MER_BIND_AGREEMENT_RSP, sign_type, sign, mer_id, version, ret_code, ret_msg);
        this.user_id = user_id;
    }
}
