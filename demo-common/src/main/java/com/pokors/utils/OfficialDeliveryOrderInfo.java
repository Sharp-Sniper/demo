package com.pokors.utils;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public class OfficialDeliveryOrderInfo implements Serializable {
    private static final long serialVersionUID = 835512944621307912L;
    private Long id;
    private Long userId;
    private String orderId;
    private String bizId;
    private String bizType;
    private Date gmtModified;
    private String status;
    private String mailNo;
    private String outBizId;
    private String logisticsStatus;
    private String solutionCode;
    private String refundId;
    private String gmtAcceptStart;
    private String gmtAcceptEnd;
    private String dateStr;
    private String lastTraceDetail;
    private String lastTraceStatusName;
    private String lastTraceStatus;
    private OfficialPayRecordDTO payRecordDTO;
    private Boolean signOfficial;
    private Map<String, String> features;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMailNo() {
        return mailNo;
    }

    public void setMailNo(String mailNo) {
        this.mailNo = mailNo;
    }

    public String getOutBizId() {
        return outBizId;
    }

    public void setOutBizId(String outBizId) {
        this.outBizId = outBizId;
    }

    public String getLogisticsStatus() {
        return logisticsStatus;
    }

    public void setLogisticsStatus(String logisticsStatus) {
        this.logisticsStatus = logisticsStatus;
    }

    public String getSolutionCode() {
        return solutionCode;
    }

    public void setSolutionCode(String solutionCode) {
        this.solutionCode = solutionCode;
    }

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public String getGmtAcceptStart() {
        return gmtAcceptStart;
    }

    public void setGmtAcceptStart(String gmtAcceptStart) {
        this.gmtAcceptStart = gmtAcceptStart;
    }

    public String getGmtAcceptEnd() {
        return gmtAcceptEnd;
    }

    public void setGmtAcceptEnd(String gmtAcceptEnd) {
        this.gmtAcceptEnd = gmtAcceptEnd;
    }

    public String getDateStr() {
        return dateStr;
    }

    public void setDateStr(String dateStr) {
        this.dateStr = dateStr;
    }

    public String getLastTraceDetail() {
        return lastTraceDetail;
    }

    public void setLastTraceDetail(String lastTraceDetail) {
        this.lastTraceDetail = lastTraceDetail;
    }

    public String getLastTraceStatusName() {
        return lastTraceStatusName;
    }

    public void setLastTraceStatusName(String lastTraceStatusName) {
        this.lastTraceStatusName = lastTraceStatusName;
    }

    public String getLastTraceStatus() {
        return lastTraceStatus;
    }

    public void setLastTraceStatus(String lastTraceStatus) {
        this.lastTraceStatus = lastTraceStatus;
    }

    public OfficialPayRecordDTO getPayRecordDTO() {
        return payRecordDTO;
    }

    public void setPayRecordDTO(OfficialPayRecordDTO payRecordDTO) {
        this.payRecordDTO = payRecordDTO;
    }

    public Boolean getSignOfficial() {
        return signOfficial;
    }

    public void setSignOfficial(Boolean signOfficial) {
        this.signOfficial = signOfficial;
    }

    public Map<String, String> getFeatures() {
        return features;
    }

    public void setFeatures(Map<String, String> features) {
        this.features = features;
    }

    @Override
    public String toString() {
        return "OfficialDeliveryOrderInfo{" +
                "id=" + id +
                ", userId=" + userId +
                ", orderId='" + orderId + '\'' +
                ", bizId='" + bizId + '\'' +
                ", bizType='" + bizType + '\'' +
                ", gmtModified=" + gmtModified +
                ", status='" + status + '\'' +
                ", mailNo='" + mailNo + '\'' +
                ", outBizId='" + outBizId + '\'' +
                ", logisticsStatus='" + logisticsStatus + '\'' +
                ", solutionCode='" + solutionCode + '\'' +
                ", refundId='" + refundId + '\'' +
                ", gmtAcceptStart='" + gmtAcceptStart + '\'' +
                ", gmtAcceptEnd='" + gmtAcceptEnd + '\'' +
                ", dateStr='" + dateStr + '\'' +
                ", lastTraceDetail='" + lastTraceDetail + '\'' +
                ", lastTraceStatusName='" + lastTraceStatusName + '\'' +
                ", lastTraceStatus='" + lastTraceStatus + '\'' +
                ", payRecordDTO=" + payRecordDTO +
                ", signOfficial=" + signOfficial +
                ", features=" + features +
                '}';
    }

    public static class OfficialPayRecordDTO implements Serializable {
        private static final long serialVersionUID = -7457182292597420245L;
        private Long id;
        private Long userId;
        private Date gmtCreate;
        private Date gmtModified;
        private String bizId;
        private String bizType;
        private String payType;
        private Long amount;
        private String payChannel;
        private String outBizId;
        private String status;
        private String failReason;
        private FeatureDTO features;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getUserId() {
            return userId;
        }

        public void setUserId(Long userId) {
            this.userId = userId;
        }

        public Date getGmtCreate() {
            return gmtCreate;
        }

        public void setGmtCreate(Date gmtCreate) {
            this.gmtCreate = gmtCreate;
        }

        public Date getGmtModified() {
            return gmtModified;
        }

        public void setGmtModified(Date gmtModified) {
            this.gmtModified = gmtModified;
        }

        public String getBizId() {
            return bizId;
        }

        public void setBizId(String bizId) {
            this.bizId = bizId;
        }

        public String getBizType() {
            return bizType;
        }

        public void setBizType(String bizType) {
            this.bizType = bizType;
        }

        public String getPayType() {
            return payType;
        }

        public void setPayType(String payType) {
            this.payType = payType;
        }

        public Long getAmount() {
            return amount;
        }

        public void setAmount(Long amount) {
            this.amount = amount;
        }

        public String getPayChannel() {
            return payChannel;
        }

        public void setPayChannel(String payChannel) {
            this.payChannel = payChannel;
        }

        public String getOutBizId() {
            return outBizId;
        }

        public void setOutBizId(String outBizId) {
            this.outBizId = outBizId;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getFailReason() {
            return failReason;
        }

        public void setFailReason(String failReason) {
            this.failReason = failReason;
        }

        public FeatureDTO getFeatures() {
            return features;
        }

        public void setFeatures(FeatureDTO features) {
            this.features = features;
        }

        @Override
        public String toString() {
            return "OfficialPayRecordDTO{" +
                    "id=" + id +
                    ", userId=" + userId +
                    ", gmtCreate=" + gmtCreate +
                    ", gmtModified=" + gmtModified +
                    ", bizId='" + bizId + '\'' +
                    ", bizType='" + bizType + '\'' +
                    ", payType='" + payType + '\'' +
                    ", amount=" + amount +
                    ", payChannel='" + payChannel + '\'' +
                    ", outBizId='" + outBizId + '\'' +
                    ", status='" + status + '\'' +
                    ", failReason='" + failReason + '\'' +
                    ", features=" + features +
                    '}';
        }
    }

    public static class FeatureDTO implements Serializable {
        private static final long serialVersionUID = -8489327408754075965L;

        private String firstWeightUnit;
        private String firstWeightPrice;
        private String bufferedFirstWeightPrice;
        private String nextWeightUnit;
        private String nextWeightPrice;
        private String fromOverAreaFee;
        private String toOverAreaFee;
        private String overDistanceFee;
        private String deliveryTotalFee;
        private String nextTotalFee;
        private String firstTotalFee;
        private String totalFee;
        private String chargeType;
        private String chargeWeight;
        private String chargeVolume;
        private String bubbleWeight;
        private String isBubble;
        private String originTotalFee;
        private String refundId;
        private String couponId;
        private String couponFee;
        private String couponUsedFee;
        private String couponName;
        private String couponDesc;
        private String couponSource;
        private String vasList;
        private String mailNo;
        private String settlementList;
        private String orderSourceType;

        public String getFirstWeightUnit() {
            return firstWeightUnit;
        }

        public void setFirstWeightUnit(String firstWeightUnit) {
            this.firstWeightUnit = firstWeightUnit;
        }

        public String getFirstWeightPrice() {
            return firstWeightPrice;
        }

        public void setFirstWeightPrice(String firstWeightPrice) {
            this.firstWeightPrice = firstWeightPrice;
        }

        public String getBufferedFirstWeightPrice() {
            return bufferedFirstWeightPrice;
        }

        public void setBufferedFirstWeightPrice(String bufferedFirstWeightPrice) {
            this.bufferedFirstWeightPrice = bufferedFirstWeightPrice;
        }

        public String getNextWeightUnit() {
            return nextWeightUnit;
        }

        public void setNextWeightUnit(String nextWeightUnit) {
            this.nextWeightUnit = nextWeightUnit;
        }

        public String getNextWeightPrice() {
            return nextWeightPrice;
        }

        public void setNextWeightPrice(String nextWeightPrice) {
            this.nextWeightPrice = nextWeightPrice;
        }

        public String getFromOverAreaFee() {
            return fromOverAreaFee;
        }

        public void setFromOverAreaFee(String fromOverAreaFee) {
            this.fromOverAreaFee = fromOverAreaFee;
        }

        public String getToOverAreaFee() {
            return toOverAreaFee;
        }

        public void setToOverAreaFee(String toOverAreaFee) {
            this.toOverAreaFee = toOverAreaFee;
        }

        public String getOverDistanceFee() {
            return overDistanceFee;
        }

        public void setOverDistanceFee(String overDistanceFee) {
            this.overDistanceFee = overDistanceFee;
        }

        public String getDeliveryTotalFee() {
            return deliveryTotalFee;
        }

        public void setDeliveryTotalFee(String deliveryTotalFee) {
            this.deliveryTotalFee = deliveryTotalFee;
        }

        public String getNextTotalFee() {
            return nextTotalFee;
        }

        public void setNextTotalFee(String nextTotalFee) {
            this.nextTotalFee = nextTotalFee;
        }

        public String getFirstTotalFee() {
            return firstTotalFee;
        }

        public void setFirstTotalFee(String firstTotalFee) {
            this.firstTotalFee = firstTotalFee;
        }

        public String getTotalFee() {
            return totalFee;
        }

        public void setTotalFee(String totalFee) {
            this.totalFee = totalFee;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public String getChargeWeight() {
            return chargeWeight;
        }

        public void setChargeWeight(String chargeWeight) {
            this.chargeWeight = chargeWeight;
        }

        public String getChargeVolume() {
            return chargeVolume;
        }

        public void setChargeVolume(String chargeVolume) {
            this.chargeVolume = chargeVolume;
        }

        public String getBubbleWeight() {
            return bubbleWeight;
        }

        public void setBubbleWeight(String bubbleWeight) {
            this.bubbleWeight = bubbleWeight;
        }

        public String getIsBubble() {
            return isBubble;
        }

        public void setIsBubble(String isBubble) {
            this.isBubble = isBubble;
        }

        public String getOriginTotalFee() {
            return originTotalFee;
        }

        public void setOriginTotalFee(String originTotalFee) {
            this.originTotalFee = originTotalFee;
        }

        public String getRefundId() {
            return refundId;
        }

        public void setRefundId(String refundId) {
            this.refundId = refundId;
        }

        public String getCouponId() {
            return couponId;
        }

        public void setCouponId(String couponId) {
            this.couponId = couponId;
        }

        public String getCouponFee() {
            return couponFee;
        }

        public void setCouponFee(String couponFee) {
            this.couponFee = couponFee;
        }

        public String getCouponUsedFee() {
            return couponUsedFee;
        }

        public void setCouponUsedFee(String couponUsedFee) {
            this.couponUsedFee = couponUsedFee;
        }

        public String getCouponName() {
            return couponName;
        }

        public void setCouponName(String couponName) {
            this.couponName = couponName;
        }

        public String getCouponDesc() {
            return couponDesc;
        }

        public void setCouponDesc(String couponDesc) {
            this.couponDesc = couponDesc;
        }

        public String getCouponSource() {
            return couponSource;
        }

        public void setCouponSource(String couponSource) {
            this.couponSource = couponSource;
        }

        public String getVasList() {
            return vasList;
        }

        public void setVasList(String vasList) {
            this.vasList = vasList;
        }

        public String getMailNo() {
            return mailNo;
        }

        public void setMailNo(String mailNo) {
            this.mailNo = mailNo;
        }

        public String getSettlementList() {
            return settlementList;
        }

        public void setSettlementList(String settlementList) {
            this.settlementList = settlementList;
        }

        public String getOrderSourceType() {
            return orderSourceType;
        }

        public void setOrderSourceType(String orderSourceType) {
            this.orderSourceType = orderSourceType;
        }

        @Override
        public String toString() {
            return "FeatureDTO{" +
                    "firstWeightUnit='" + firstWeightUnit + '\'' +
                    ", firstWeightPrice='" + firstWeightPrice + '\'' +
                    ", bufferedFirstWeightPrice='" + bufferedFirstWeightPrice + '\'' +
                    ", nextWeightUnit='" + nextWeightUnit + '\'' +
                    ", nextWeightPrice='" + nextWeightPrice + '\'' +
                    ", fromOverAreaFee='" + fromOverAreaFee + '\'' +
                    ", toOverAreaFee='" + toOverAreaFee + '\'' +
                    ", overDistanceFee='" + overDistanceFee + '\'' +
                    ", deliveryTotalFee='" + deliveryTotalFee + '\'' +
                    ", nextTotalFee='" + nextTotalFee + '\'' +
                    ", firstTotalFee='" + firstTotalFee + '\'' +
                    ", totalFee='" + totalFee + '\'' +
                    ", chargeType='" + chargeType + '\'' +
                    ", chargeWeight='" + chargeWeight + '\'' +
                    ", chargeVolume='" + chargeVolume + '\'' +
                    ", bubbleWeight='" + bubbleWeight + '\'' +
                    ", isBubble='" + isBubble + '\'' +
                    ", originTotalFee='" + originTotalFee + '\'' +
                    ", refundId='" + refundId + '\'' +
                    ", couponId='" + couponId + '\'' +
                    ", couponFee='" + couponFee + '\'' +
                    ", couponUsedFee='" + couponUsedFee + '\'' +
                    ", couponName='" + couponName + '\'' +
                    ", couponDesc='" + couponDesc + '\'' +
                    ", couponSource='" + couponSource + '\'' +
                    ", vasList='" + vasList + '\'' +
                    ", mailNo='" + mailNo + '\'' +
                    ", settlementList='" + settlementList + '\'' +
                    ", orderSourceType='" + orderSourceType + '\'' +
                    '}';
        }
    }
}
