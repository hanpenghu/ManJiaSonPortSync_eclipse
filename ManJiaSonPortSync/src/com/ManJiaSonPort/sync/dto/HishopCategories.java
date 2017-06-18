package com.ManJiaSonPort.sync.dto;

public class HishopCategories {
    private Integer categoryid;

    private String name;

    private Integer displaysequence;

    private String metaTitle;

    private String metaDescription;

    private String metaKeywords;

    private Integer parentcategoryid;

    private Integer depth;

    private String path;

    private String rewritename;

    private String skuprefix;

    private Integer associatedproducttype;

    private String theme;

    private Boolean haschildren;

    private String icon;

    private String bigimageurl;

    private Integer tenantid;

    private String guid;

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getDisplaysequence() {
        return displaysequence;
    }

    public void setDisplaysequence(Integer displaysequence) {
        this.displaysequence = displaysequence;
    }

    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle == null ? null : metaTitle.trim();
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription == null ? null : metaDescription.trim();
    }

    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords == null ? null : metaKeywords.trim();
    }

    public Integer getParentcategoryid() {
        return parentcategoryid;
    }

    public void setParentcategoryid(Integer parentcategoryid) {
        this.parentcategoryid = parentcategoryid;
    }

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getRewritename() {
        return rewritename;
    }

    public void setRewritename(String rewritename) {
        this.rewritename = rewritename == null ? null : rewritename.trim();
    }

    public String getSkuprefix() {
        return skuprefix;
    }

    public void setSkuprefix(String skuprefix) {
        this.skuprefix = skuprefix == null ? null : skuprefix.trim();
    }

    public Integer getAssociatedproducttype() {
        return associatedproducttype;
    }

    public void setAssociatedproducttype(Integer associatedproducttype) {
        this.associatedproducttype = associatedproducttype;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme == null ? null : theme.trim();
    }

    public Boolean getHaschildren() {
        return haschildren;
    }

    public void setHaschildren(Boolean haschildren) {
        this.haschildren = haschildren;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getBigimageurl() {
        return bigimageurl;
    }

    public void setBigimageurl(String bigimageurl) {
        this.bigimageurl = bigimageurl == null ? null : bigimageurl.trim();
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