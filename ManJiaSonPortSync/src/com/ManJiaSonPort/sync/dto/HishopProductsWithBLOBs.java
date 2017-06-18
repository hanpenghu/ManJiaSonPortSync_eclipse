package com.ManJiaSonPort.sync.dto;

public class HishopProductsWithBLOBs extends HishopProducts {
    private String description;

    private String mobbiledescription;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getMobbiledescription() {
        return mobbiledescription;
    }

    public void setMobbiledescription(String mobbiledescription) {
        this.mobbiledescription = mobbiledescription == null ? null : mobbiledescription.trim();
    }
}