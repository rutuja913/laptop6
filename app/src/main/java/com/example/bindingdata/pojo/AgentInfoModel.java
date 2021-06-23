package com.example.bindingdata.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class AgentInfoModel implements Serializable {
    @SerializedName("deliveredQuantityOfCans")
    @Expose
    private double deliveredQuantityOfCans;
    @SerializedName("subscriptionRecurringDetailsExceptionId")
    @Expose
    private long subscriptionRecurringDetailsExceptionId;
    @SerializedName("deliverdQuantity")
    @Expose
    private double deliverdQuantity;
    @SerializedName("deliveryTime")
    @Expose
    private String deliveryTime;
    @SerializedName("unitName")
    @Expose
    private String unitName;
    @SerializedName("productId")
    @Expose
    private long productId;
    @SerializedName("shopAgentName")
    @Expose
    private String shopAgentName;
    @SerializedName("shopCustomerId")
    @Expose
    private long shopCustomerId;
    @SerializedName("subscriptionRecurringDetailsId")
    @Expose
    private long subscriptionRecurringDetailsId;
    @SerializedName("orderQuantity")
    @Expose
    private double orderQuantity;
    @SerializedName("customerName")
    @Expose
    private String customerName;
    @SerializedName("productName")
    @Expose
    private String productName;
    @SerializedName("requiredQty")
    @Expose
    private double requiredQty;
    @SerializedName("profileId")
    @Expose
    private long profileId;
    @SerializedName("shopAgentId")
    @Expose
    private long shopAgentId;

    public AgentInfoModel(double deliveredQuantityOfCans, long subscriptionRecurringDetailsExceptionId, double deliverdQuantity, String deliveryTime, String unitName, long productId, String shopAgentName, long shopCustomerId, long subscriptionRecurringDetailsId, double orderQuantity, String customerName, String productName, double requiredQty, long profileId, long shopAgentId) {
        this.deliveredQuantityOfCans = deliveredQuantityOfCans;
        this.subscriptionRecurringDetailsExceptionId = subscriptionRecurringDetailsExceptionId;
        this.deliverdQuantity = deliverdQuantity;
        this.deliveryTime = deliveryTime;
        this.unitName = unitName;
        this.productId = productId;
        this.shopAgentName = shopAgentName;
        this.shopCustomerId = shopCustomerId;
        this.subscriptionRecurringDetailsId = subscriptionRecurringDetailsId;
        this.orderQuantity = orderQuantity;
        this.customerName = customerName;
        this.productName = productName;
        this.requiredQty = requiredQty;
        this.profileId = profileId;
        this.shopAgentId = shopAgentId;
    }

    public double getDeliveredQuantityOfCans() {
        return deliveredQuantityOfCans;
    }

    public void setDeliveredQuantityOfCans(double deliveredQuantityOfCans) {
        this.deliveredQuantityOfCans = deliveredQuantityOfCans;
    }

    public long getSubscriptionRecurringDetailsExceptionId() {
        return subscriptionRecurringDetailsExceptionId;
    }

    public void setSubscriptionRecurringDetailsExceptionId(long subscriptionRecurringDetailsExceptionId) {
        this.subscriptionRecurringDetailsExceptionId = subscriptionRecurringDetailsExceptionId;
    }

    public double getDeliverdQuantity() {
        return deliverdQuantity;
    }

    public void setDeliverdQuantity(double deliverdQuantity) {
        this.deliverdQuantity = deliverdQuantity;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getShopAgentName() {
        return shopAgentName;
    }

    public void setShopAgentName(String shopAgentName) {
        this.shopAgentName = shopAgentName;
    }

    public long getShopCustomerId() {
        return shopCustomerId;
    }

    public void setShopCustomerId(long shopCustomerId) {
        this.shopCustomerId = shopCustomerId;
    }

    public long getSubscriptionRecurringDetailsId() {
        return subscriptionRecurringDetailsId;
    }

    public void setSubscriptionRecurringDetailsId(long subscriptionRecurringDetailsId) {
        this.subscriptionRecurringDetailsId = subscriptionRecurringDetailsId;
    }

    public double getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(double orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getRequiredQty() {
        return requiredQty;
    }

    public void setRequiredQty(double requiredQty) {
        this.requiredQty = requiredQty;
    }

    public long getProfileId() {
        return profileId;
    }

    public void setProfileId(long profileId) {
        this.profileId = profileId;
    }

    public long getShopAgentId() {
        return shopAgentId;
    }

    public void setShopAgentId(long shopAgentId) {
        this.shopAgentId = shopAgentId;
    }
}
