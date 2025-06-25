package com.pokors.demo.ocean;

import com.alibaba.fastjson.JSON;
import com.alibaba.ocean.rawsdk.ApiExecutor;
import com.alibaba.ocean.rawsdk.client.entity.AuthorizationToken;
import com.alibaba.ocean.rawsdk.common.SDKResult;
import com.alibaba.supplychain.param.SpSettleEscrowParam;
import com.alibaba.supplychain.param.SpSettleEscrowResult;

/**
 * Ocean SDK测试
 *
 * @author lhp
 * @since 2025/6/12 11:31
 */
public class OceanSDKTest {
    public static void main(String[] args) {

        ApiExecutor apiExecutor = new ApiExecutor("787","jTYdHYGpL7m5");
//        AuthorizationToken authorizationToken = apiExecutor.refreshToken("");
        SpSettleEscrowParam param = new SpSettleEscrowParam();
        SDKResult<SpSettleEscrowResult> result = apiExecutor.execute(param, "ac823600-ab4c-4b14-b4c0-cbad05d43715");
        System.out.println(JSON.toJSONString(result));
        SpSettleEscrowResult spSettleEscrowResult = result.getResult();
        System.out.println(JSON.toJSONString(spSettleEscrowResult));

//        String url = "http://gw.open.1688.com:80/openapi/param2/1/com.alibaba.supplychain/sp.settle.escrow/6342365?access_token=6f119bba-2976-4bcb-987c-8bccf50706c0&_aop_signature=996D322C96E2116BA0A7FCFC0C9EBEA069D4F29C";
    }
}
