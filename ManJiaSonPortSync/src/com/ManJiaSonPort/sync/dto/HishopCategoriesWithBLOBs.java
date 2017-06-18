package com.ManJiaSonPort.sync.dto;

public class HishopCategoriesWithBLOBs extends HishopCategories {
    private String notes1;

    private String notes2;

    private String notes3;

    private String notes4;

    private String notes5;

    public String getNotes1() {
        return notes1;
    }

    public void setNotes1(String notes1) {
        this.notes1 = notes1 == null ? null : notes1.trim();
    }

    public String getNotes2() {
        return notes2;
    }

    public void setNotes2(String notes2) {
        this.notes2 = notes2 == null ? null : notes2.trim();
    }

    public String getNotes3() {
        return notes3;
    }

    public void setNotes3(String notes3) {
        this.notes3 = notes3 == null ? null : notes3.trim();
    }

    public String getNotes4() {
        return notes4;
    }

    public void setNotes4(String notes4) {
        this.notes4 = notes4 == null ? null : notes4.trim();
    }

    public String getNotes5() {
        return notes5;
    }

    public void setNotes5(String notes5) {
        this.notes5 = notes5 == null ? null : notes5.trim();
    }
}