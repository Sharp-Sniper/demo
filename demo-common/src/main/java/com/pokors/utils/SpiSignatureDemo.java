package com.pokors.utils;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lhp
 * @since 2024/2/20 17:56
 */
public class SpiSignatureDemo {
    public static void main(String[] args) {
        String signingKey = null; // SP应用的密钥（不区分环境）
        String _aop_signature = null;
        String fixPath = null;
        Map<String, Object> parameters = new HashMap<>();

        // 注意get和post请求签名/验签的区别

        // get请求
//        _aop_signature="A7BA1DE17B4E7F0A037DE409FE8B48403DC6BDF2";
//        fixPath = "/aliwholesale/open/api/customer-back-tuning/query/associate-by-keyword";
//        parameters.put("keyword", "阿里巴巴");

        // post请求，且未指定contentType或指定了contentType/json或text/plain
        // 1688网关生成的签名，参数相同时，fixPath不同，生成的签名也不同
//        _aop_signature="43B5ACC018CE4C901AA0D58DDC29466C0CED5DC3";
        // 截取自域名后路径包含“/”，验签时fixPath需要与1688网关签名时使用的fixPath保持一致
        // 如给1688的测环境url是“https://1688crm2-test.tangees.com/api/v1/aliwholesale/open/api/customer/addFormBuyer”
        // 那么1688签名时使用的fixPath是“/api/v1/aliwholesale/open/api/customer/addFormBuyer”；
        // 给1688的正式环境url是”https://crm1688.tungee.com/aliwholesale/open/api/customer/addFormBuyer“
        // 那么1688签名时使用的fixPath是”/aliwholesale/open/api/customer/addFormBuyer“
//        fixPath = "/aliwholesale/open/api/customer/addFormBuyer";

//        parameters.put("_aop_body", "{\"buyerOpenUid\":\"BBBhT8G4U1zZvP6MfEuK6u_Gw\",\"contactName\":\"联系人1\",\"contactPhone\":\"13758163022\",\"customerBizScene\":\"open_customer\",\"customerName\":\"spi迁移客户\",\"customerRemark\":\"spi迁移\",\"customerType\":\"corp\",\"memberId\":\"b2b-1624961198\",\"operatorOpenUid\":\"BBB0mJ-FvfauHikVSngT3nCTA\"}");

//        signingKey = "#ccVg$_9B1";
//        _aop_signature = "AA08300F496AD89A2F3FB19F1780EFACCA4BBF4E";
//        fixPath = "/collection/push";
//        parameters.put("_aop_body", "{\"offerIds\":\"[\\\"922292084354\\\", \\\"874782188746\\\", \\\"898790279008\\\"]\",\"channel\":\"tiktok\",\"appkey\":\"9560890\",\"shopCodes\":\"[\\\"7496200803694381289\\\"]\"}");
//
//        byte[] sign = SignatureUtil.hmacSha1(fixPath, parameters, signingKey);
//        String aopSignature = SignatureUtil.encodeHexStr(sign);
//        System.out.println(aopSignature);
//
//        // 判断是否相同
//        boolean result = Objects.equals(_aop_signature, aopSignature);
//        System.out.println(result);
        String str = "{\"chargeWeight\":\"11.100\",\"deliveryTotalFee\":\"45.45\",\"nextTotalFee\":\"35.75\",\"chargeType\":\"by_weight\",\"firstTotalFee\":\"9.7\",\"chargeVolume\":\"0.086400\",\"firstWeightUnit\":\"1.0\",\"firstWeightPrice\":\"9.7\",\"isBubble\":\"false\",\"bufferedFirstWeightPrice\":\"9.7\",\"originTotalFee\":\"45.45\",\"totalFee\":\"45.45\",\"nextWeightUnit\":\"1.0\",\"nextWeightPrice\":\"3.25\",\"refundId\":\"TQ217751018523039374\"}";
        OfficialDeliveryOrderInfo.FeatureDTO featureDTO = JSON.parseObject(str, OfficialDeliveryOrderInfo.FeatureDTO.class);
        System.out.println(featureDTO);
    }
}
