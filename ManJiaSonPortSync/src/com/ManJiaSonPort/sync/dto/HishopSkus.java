package com.ManJiaSonPort.sync.dto;

import java.math.BigDecimal;

public class HishopSkus {
    private String skuid;

    private Integer productid;

    private String sku;

    private BigDecimal weight;

    private Integer stock;

    private Integer warningstock;

    private BigDecimal costprice;

    private BigDecimal saleprice;

    private Integer freezestock;

    private Integer tenantid;

    private String guid;

    public String getSkuid() {
        return skuid;
    }

    public void setSkuid(String skuid) {
        this.skuid = skuid == null ? null : skuid.trim();
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getWarningstock() {
        return warningstock;
    }

    public void setWarningstock(Integer warningstock) {
        this.warningstock = warningstock;
    }

    public BigDecimal getCostprice() {
        return costprice;
    }

    public void setCostprice(BigDecimal costprice) {
        this.costprice = costprice;
    }

    public BigDecimal getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(BigDecimal saleprice) {
        this.saleprice = saleprice;
    }

    public Integer getFreezestock() {
        return freezestock;
    }

    public void setFreezestock(Integer freezestock) {
        this.freezestock = freezestock;
    }

    public Integer getTenantid() {
        return tenantid;
    }

    public void setTenantid(Integer tenantid) {
        this.tenantid = tenantid;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid == null ? null : guid.trim();
    }
}