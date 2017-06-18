package com.ManJiaSonPort.sync.dto;

import java.util.ArrayList;
import java.util.List;

public class HishopCategoriesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HishopCategoriesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCategoryidIsNull() {
            addCriterion("CategoryId is null");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNotNull() {
            addCriterion("CategoryId is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryidEqualTo(Integer value) {
            addCriterion("CategoryId =", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotEqualTo(Integer value) {
            addCriterion("CategoryId <>", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThan(Integer value) {
            addCriterion("CategoryId >", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CategoryId >=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThan(Integer value) {
            addCriterion("CategoryId <", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("CategoryId <=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidIn(List<Integer> values) {
            addCriterion("CategoryId in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotIn(List<Integer> values) {
            addCriterion("CategoryId not in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidBetween(Integer value1, Integer value2) {
            addCriterion("CategoryId between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("CategoryId not between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDisplaysequenceIsNull() {
            addCriterion("DisplaySequence is null");
            return (Criteria) this;
        }

        public Criteria andDisplaysequenceIsNotNull() {
            addCriterion("DisplaySequence is not null");
            return (Criteria) this;
        }

        public Criteria andDisplaysequenceEqualTo(Integer value) {
            addCriterion("DisplaySequence =", value, "displaysequence");
            return (Criteria) this;
        }

        public Criteria andDisplaysequenceNotEqualTo(Integer value) {
            addCriterion("DisplaySequence <>", value, "displaysequence");
            return (Criteria) this;
        }

        public Criteria andDisplaysequenceGreaterThan(Integer value) {
            addCriterion("DisplaySequence >", value, "displaysequence");
            return (Criteria) this;
        }

        public Criteria andDisplaysequenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("DisplaySequence >=", value, "displaysequence");
            return (Criteria) this;
        }

        public Criteria andDisplaysequenceLessThan(Integer value) {
            addCriterion("DisplaySequence <", value, "displaysequence");
            return (Criteria) this;
        }

        public Criteria andDisplaysequenceLessThanOrEqualTo(Integer value) {
            addCriterion("DisplaySequence <=", value, "displaysequence");
            return (Criteria) this;
        }

        public Criteria andDisplaysequenceIn(List<Integer> values) {
            addCriterion("DisplaySequence in", values, "displaysequence");
            return (Criteria) this;
        }

        public Criteria andDisplaysequenceNotIn(List<Integer> values) {
            addCriterion("DisplaySequence not in", values, "displaysequence");
            return (Criteria) this;
        }

        public Criteria andDisplaysequenceBetween(Integer value1, Integer value2) {
            addCriterion("DisplaySequence between", value1, value2, "displaysequence");
            return (Criteria) this;
        }

        public Criteria andDisplaysequenceNotBetween(Integer value1, Integer value2) {
            addCriterion("DisplaySequence not between", value1, value2, "displaysequence");
            return (Criteria) this;
        }

        public Criteria andMetaTitleIsNull() {
            addCriterion("Meta_Title is null");
            return (Criteria) this;
        }

        public Criteria andMetaTitleIsNotNull() {
            addCriterion("Meta_Title is not null");
            return (Criteria) this;
        }

        public Criteria andMetaTitleEqualTo(String value) {
            addCriterion("Meta_Title =", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleNotEqualTo(String value) {
            addCriterion("Meta_Title <>", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleGreaterThan(String value) {
            addCriterion("Meta_Title >", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Meta_Title >=", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleLessThan(String value) {
            addCriterion("Meta_Title <", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleLessThanOrEqualTo(String value) {
            addCriterion("Meta_Title <=", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleLike(String value) {
            addCriterion("Meta_Title like", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleNotLike(String value) {
            addCriterion("Meta_Title not like", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleIn(List<String> values) {
            addCriterion("Meta_Title in", values, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleNotIn(List<String> values) {
            addCriterion("Meta_Title not in", values, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleBetween(String value1, String value2) {
            addCriterion("Meta_Title between", value1, value2, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleNotBetween(String value1, String value2) {
            addCriterion("Meta_Title not between", value1, value2, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionIsNull() {
            addCriterion("Meta_Description is null");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionIsNotNull() {
            addCriterion("Meta_Description is not null");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionEqualTo(String value) {
            addCriterion("Meta_Description =", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionNotEqualTo(String value) {
            addCriterion("Meta_Description <>", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionGreaterThan(String value) {
            addCriterion("Meta_Description >", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Meta_Description >=", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionLessThan(String value) {
            addCriterion("Meta_Description <", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionLessThanOrEqualTo(String value) {
            addCriterion("Meta_Description <=", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionLike(String value) {
            addCriterion("Meta_Description like", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionNotLike(String value) {
            addCriterion("Meta_Description not like", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionIn(List<String> values) {
            addCriterion("Meta_Description in", values, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionNotIn(List<String> values) {
            addCriterion("Meta_Description not in", values, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionBetween(String value1, String value2) {
            addCriterion("Meta_Description between", value1, value2, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionNotBetween(String value1, String value2) {
            addCriterion("Meta_Description not between", value1, value2, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsIsNull() {
            addCriterion("Meta_Keywords is null");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsIsNotNull() {
            addCriterion("Meta_Keywords is not null");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsEqualTo(String value) {
            addCriterion("Meta_Keywords =", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsNotEqualTo(String value) {
            addCriterion("Meta_Keywords <>", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsGreaterThan(String value) {
            addCriterion("Meta_Keywords >", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("Meta_Keywords >=", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsLessThan(String value) {
            addCriterion("Meta_Keywords <", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsLessThanOrEqualTo(String value) {
            addCriterion("Meta_Keywords <=", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsLike(String value) {
            addCriterion("Meta_Keywords like", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsNotLike(String value) {
            addCriterion("Meta_Keywords not like", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsIn(List<String> values) {
            addCriterion("Meta_Keywords in", values, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsNotIn(List<String> values) {
            addCriterion("Meta_Keywords not in", values, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsBetween(String value1, String value2) {
            addCriterion("Meta_Keywords between", value1, value2, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsNotBetween(String value1, String value2) {
            addCriterion("Meta_Keywords not between", value1, value2, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andParentcategoryidIsNull() {
            addCriterion("ParentCategoryId is null");
            return (Criteria) this;
        }

        public Criteria andParentcategoryidIsNotNull() {
            addCriterion("ParentCategoryId is not null");
            return (Criteria) this;
        }

        public Criteria andParentcategoryidEqualTo(Integer value) {
            addCriterion("ParentCategoryId =", value, "parentcategoryid");
            return (Criteria) this;
        }

        public Criteria andParentcategoryidNotEqualTo(Integer value) {
            addCriterion("ParentCategoryId <>", value, "parentcategoryid");
            return (Criteria) this;
        }

        public Criteria andParentcategoryidGreaterThan(Integer value) {
            addCriterion("ParentCategoryId >", value, "parentcategoryid");
            return (Criteria) this;
        }

        public Criteria andParentcategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ParentCategoryId >=", value, "parentcategoryid");
            return (Criteria) this;
        }

        public Criteria andParentcategoryidLessThan(Integer value) {
            addCriterion("ParentCategoryId <", value, "parentcategoryid");
            return (Criteria) this;
        }

        public Criteria andParentcategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("ParentCategoryId <=", value, "parentcategoryid");
            return (Criteria) this;
        }

        public Criteria andParentcategoryidIn(List<Integer> values) {
            addCriterion("ParentCategoryId in", values, "parentcategoryid");
            return (Criteria) this;
        }

        public Criteria andParentcategoryidNotIn(List<Integer> values) {
            addCriterion("ParentCategoryId not in", values, "parentcategoryid");
            return (Criteria) this;
        }

        public Criteria andParentcategoryidBetween(Integer value1, Integer value2) {
            addCriterion("ParentCategoryId between", value1, value2, "parentcategoryid");
            return (Criteria) this;
        }

        public Criteria andParentcategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("ParentCategoryId not between", value1, value2, "parentcategoryid");
            return (Criteria) this;
        }

        public Criteria andDepthIsNull() {
            addCriterion("Depth is null");
            return (Criteria) this;
        }

        public Criteria andDepthIsNotNull() {
            addCriterion("Depth is not null");
            return (Criteria) this;
        }

        public Criteria andDepthEqualTo(Integer value) {
            addCriterion("Depth =", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthNotEqualTo(Integer value) {
            addCriterion("Depth <>", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthGreaterThan(Integer value) {
            addCriterion("Depth >", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthGreaterThanOrEqualTo(Integer value) {
            addCriterion("Depth >=", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthLessThan(Integer value) {
            addCriterion("Depth <", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthLessThanOrEqualTo(Integer value) {
            addCriterion("Depth <=", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthIn(List<Integer> values) {
            addCriterion("Depth in", values, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthNotIn(List<Integer> values) {
            addCriterion("Depth not in", values, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthBetween(Integer value1, Integer value2) {
            addCriterion("Depth between", value1, value2, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthNotBetween(Integer value1, Integer value2) {
            addCriterion("Depth not between", value1, value2, "depth");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("Path is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("Path is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("Path =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("Path <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("Path >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("Path >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("Path <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("Path <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("Path like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("Path not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("Path in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("Path not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("Path between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("Path not between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andRewritenameIsNull() {
            addCriterion("RewriteName is null");
            return (Criteria) this;
        }

        public Criteria andRewritenameIsNotNull() {
            addCriterion("RewriteName is not null");
            return (Criteria) this;
        }

        public Criteria andRewritenameEqualTo(String value) {
            addCriterion("RewriteName =", value, "rewritename");
            return (Criteria) this;
        }

        public Criteria andRewritenameNotEqualTo(String value) {
            addCriterion("RewriteName <>", value, "rewritename");
            return (Criteria) this;
        }

        public Criteria andRewritenameGreaterThan(String value) {
            addCriterion("RewriteName >", value, "rewritename");
            return (Criteria) this;
        }

        public Criteria andRewritenameGreaterThanOrEqualTo(String value) {
            addCriterion("RewriteName >=", value, "rewritename");
            return (Criteria) this;
        }

        public Criteria andRewritenameLessThan(String value) {
            addCriterion("RewriteName <", value, "rewritename");
            return (Criteria) this;
        }

        public Criteria andRewritenameLessThanOrEqualTo(String value) {
            addCriterion("RewriteName <=", value, "rewritename");
            return (Criteria) this;
        }

        public Criteria andRewritenameLike(String value) {
            addCriterion("RewriteName like", value, "rewritename");
            return (Criteria) this;
        }

        public Criteria andRewritenameNotLike(String value) {
            addCriterion("RewriteName not like", value, "rewritename");
            return (Criteria) this;
        }

        public Criteria andRewritenameIn(List<String> values) {
            addCriterion("RewriteName in", values, "rewritename");
            return (Criteria) this;
        }

        public Criteria andRewritenameNotIn(List<String> values) {
            addCriterion("RewriteName not in", values, "rewritename");
            return (Criteria) this;
        }

        public Criteria andRewritenameBetween(String value1, String value2) {
            addCriterion("RewriteName between", value1, value2, "rewritename");
            return (Criteria) this;
        }

        public Criteria andRewritenameNotBetween(String value1, String value2) {
            addCriterion("RewriteName not between", value1, value2, "rewritename");
            return (Criteria) this;
        }

        public Criteria andSkuprefixIsNull() {
            addCriterion("SKUPrefix is null");
            return (Criteria) this;
        }

        public Criteria andSkuprefixIsNotNull() {
            addCriterion("SKUPrefix is not null");
            return (Criteria) this;
        }

        public Criteria andSkuprefixEqualTo(String value) {
            addCriterion("SKUPrefix =", value, "skuprefix");
            return (Criteria) this;
        }

        public Criteria andSkuprefixNotEqualTo(String value) {
            addCriterion("SKUPrefix <>", value, "skuprefix");
            return (Criteria) this;
        }

        public Criteria andSkuprefixGreaterThan(String value) {
            addCriterion("SKUPrefix >", value, "skuprefix");
            return (Criteria) this;
        }

        public Criteria andSkuprefixGreaterThanOrEqualTo(String value) {
            addCriterion("SKUPrefix >=", value, "skuprefix");
            return (Criteria) this;
        }

        public Criteria andSkuprefixLessThan(String value) {
            addCriterion("SKUPrefix <", value, "skuprefix");
            return (Criteria) this;
        }

        public Criteria andSkuprefixLessThanOrEqualTo(String value) {
            addCriterion("SKUPrefix <=", value, "skuprefix");
            return (Criteria) this;
        }

        public Criteria andSkuprefixLike(String value) {
            addCriterion("SKUPrefix like", value, "skuprefix");
            return (Criteria) this;
        }

        public Criteria andSkuprefixNotLike(String value) {
            addCriterion("SKUPrefix not like", value, "skuprefix");
            return (Criteria) this;
        }

        public Criteria andSkuprefixIn(List<String> values) {
            addCriterion("SKUPrefix in", values, "skuprefix");
            return (Criteria) this;
        }

        public Criteria andSkuprefixNotIn(List<String> values) {
            addCriterion("SKUPrefix not in", values, "skuprefix");
            return (Criteria) this;
        }

        public Criteria andSkuprefixBetween(String value1, String value2) {
            addCriterion("SKUPrefix between", value1, value2, "skuprefix");
            return (Criteria) this;
        }

        public Criteria andSkuprefixNotBetween(String value1, String value2) {
            addCriterion("SKUPrefix not between", value1, value2, "skuprefix");
            return (Criteria) this;
        }

        public Criteria andAssociatedproducttypeIsNull() {
            addCriterion("AssociatedProductType is null");
            return (Criteria) this;
        }

        public Criteria andAssociatedproducttypeIsNotNull() {
            addCriterion("AssociatedProductType is not null");
            return (Criteria) this;
        }

        public Criteria andAssociatedproducttypeEqualTo(Integer value) {
            addCriterion("AssociatedProductType =", value, "associatedproducttype");
            return (Criteria) this;
        }

        public Criteria andAssociatedproducttypeNotEqualTo(Integer value) {
            addCriterion("AssociatedProductType <>", value, "associatedproducttype");
            return (Criteria) this;
        }

        public Criteria andAssociatedproducttypeGreaterThan(Integer value) {
            addCriterion("AssociatedProductType >", value, "associatedproducttype");
            return (Criteria) this;
        }

        public Criteria andAssociatedproducttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("AssociatedProductType >=", value, "associatedproducttype");
            return (Criteria) this;
        }

        public Criteria andAssociatedproducttypeLessThan(Integer value) {
            addCriterion("AssociatedProductType <", value, "associatedproducttype");
            return (Criteria) this;
        }

        public Criteria andAssociatedproducttypeLessThanOrEqualTo(Integer value) {
            addCriterion("AssociatedProductType <=", value, "associatedproducttype");
            return (Criteria) this;
        }

        public Criteria andAssociatedproducttypeIn(List<Integer> values) {
            addCriterion("AssociatedProductType in", values, "associatedproducttype");
            return (Criteria) this;
        }

        public Criteria andAssociatedproducttypeNotIn(List<Integer> values) {
            addCriterion("AssociatedProductType not in", values, "associatedproducttype");
            return (Criteria) this;
        }

        public Criteria andAssociatedproducttypeBetween(Integer value1, Integer value2) {
            addCriterion("AssociatedProductType between", value1, value2, "associatedproducttype");
            return (Criteria) this;
        }

        public Criteria andAssociatedproducttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("AssociatedProductType not between", value1, value2, "associatedproducttype");
            return (Criteria) this;
        }

        public Criteria andThemeIsNull() {
            addCriterion("Theme is null");
            return (Criteria) this;
        }

        public Criteria andThemeIsNotNull() {
            addCriterion("Theme is not null");
            return (Criteria) this;
        }

        public Criteria andThemeEqualTo(String value) {
            addCriterion("Theme =", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotEqualTo(String value) {
            addCriterion("Theme <>", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeGreaterThan(String value) {
            addCriterion("Theme >", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeGreaterThanOrEqualTo(String value) {
            addCriterion("Theme >=", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLessThan(String value) {
            addCriterion("Theme <", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLessThanOrEqualTo(String value) {
            addCriterion("Theme <=", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLike(String value) {
            addCriterion("Theme like", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotLike(String value) {
            addCriterion("Theme not like", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeIn(List<String> values) {
            addCriterion("Theme in", values, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotIn(List<String> values) {
            addCriterion("Theme not in", values, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeBetween(String value1, String value2) {
            addCriterion("Theme between", value1, value2, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotBetween(String value1, String value2) {
            addCriterion("Theme not between", value1, value2, "theme");
            return (Criteria) this;
        }

        public Criteria andHaschildrenIsNull() {
            addCriterion("HasChildren is null");
            return (Criteria) this;
        }

        public Criteria andHaschildrenIsNotNull() {
            addCriterion("HasChildren is not null");
            return (Criteria) this;
        }

        public Criteria andHaschildrenEqualTo(Boolean value) {
            addCriterion("HasChildren =", value, "haschildren");
            return (Criteria) this;
        }

        public Criteria andHaschildrenNotEqualTo(Boolean value) {
            addCriterion("HasChildren <>", value, "haschildren");
            return (Criteria) this;
        }

        public Criteria andHaschildrenGreaterThan(Boolean value) {
            addCriterion("HasChildren >", value, "haschildren");
            return (Criteria) this;
        }

        public Criteria andHaschildrenGreaterThanOrEqualTo(Boolean value) {
            addCriterion("HasChildren >=", value, "haschildren");
            return (Criteria) this;
        }

        public Criteria andHaschildrenLessThan(Boolean value) {
            addCriterion("HasChildren <", value, "haschildren");
            return (Criteria) this;
        }

        public Criteria andHaschildrenLessThanOrEqualTo(Boolean value) {
            addCriterion("HasChildren <=", value, "haschildren");
            return (Criteria) this;
        }

        public Criteria andHaschildrenIn(List<Boolean> values) {
            addCriterion("HasChildren in", values, "haschildren");
            return (Criteria) this;
        }

        public Criteria andHaschildrenNotIn(List<Boolean> values) {
            addCriterion("HasChildren not in", values, "haschildren");
            return (Criteria) this;
        }

        public Criteria andHaschildrenBetween(Boolean value1, Boolean value2) {
            addCriterion("HasChildren between", value1, value2, "haschildren");
            return (Criteria) this;
        }

        public Criteria andHaschildrenNotBetween(Boolean value1, Boolean value2) {
            addCriterion("HasChildren not between", value1, value2, "haschildren");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("Icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("Icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("Icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("Icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("Icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("Icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("Icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("Icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("Icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("Icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("Icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("Icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("Icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("Icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andBigimageurlIsNull() {
            addCriterion("BigImageUrl is null");
            return (Criteria) this;
        }

        public Criteria andBigimageurlIsNotNull() {
            addCriterion("BigImageUrl is not null");
            return (Criteria) this;
        }

        public Criteria andBigimageurlEqualTo(String value) {
            addCriterion("BigImageUrl =", value, "bigimageurl");
            return (Criteria) this;
        }

        public Criteria andBigimageurlNotEqualTo(String value) {
            addCriterion("BigImageUrl <>", value, "bigimageurl");
            return (Criteria) this;
        }

        public Criteria andBigimageurlGreaterThan(String value) {
            addCriterion("BigImageUrl >", value, "bigimageurl");
            return (Criteria) this;
        }

        public Criteria andBigimageurlGreaterThanOrEqualTo(String value) {
            addCriterion("BigImageUrl >=", value, "bigimageurl");
            return (Criteria) this;
        }

        public Criteria andBigimageurlLessThan(String value) {
            addCriterion("BigImageUrl <", value, "bigimageurl");
            return (Criteria) this;
        }

        public Criteria andBigimageurlLessThanOrEqualTo(String value) {
            addCriterion("BigImageUrl <=", value, "bigimageurl");
            return (Criteria) this;
        }

        public Criteria andBigimageurlLike(String value) {
            addCriterion("BigImageUrl like", value, "bigimageurl");
            return (Criteria) this;
        }

        public Criteria andBigimageurlNotLike(String value) {
            addCriterion("BigImageUrl not like", value, "bigimageurl");
            return (Criteria) this;
        }

        public Criteria andBigimageurlIn(List<String> values) {
            addCriterion("BigImageUrl in", values, "bigimageurl");
            return (Criteria) this;
        }

        public Criteria andBigimageurlNotIn(List<String> values) {
            addCriterion("BigImageUrl not in", values, "bigimageurl");
            return (Criteria) this;
        }

        public Criteria andBigimageurlBetween(String value1, String value2) {
            addCriterion("BigImageUrl between", value1, value2, "bigimageurl");
            return (Criteria) this;
        }

        public Criteria andBigimageurlNotBetween(String value1, String value2) {
            addCriterion("BigImageUrl not between", value1, value2, "bigimageurl");
            return (Criteria) this;
        }

        public Criteria andTenantidIsNull() {
            addCriterion("TenantID is null");
            return (Criteria) this;
        }

        public Criteria andTenantidIsNotNull() {
            addCriterion("TenantID is not null");
            return (Criteria) this;
        }

        public Criteria andTenantidEqualTo(Integer value) {
            addCriterion("TenantID =", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidNotEqualTo(Integer value) {
            addCriterion("TenantID <>", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidGreaterThan(Integer value) {
            addCriterion("TenantID >", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TenantID >=", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidLessThan(Integer value) {
            addCriterion("TenantID <", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidLessThanOrEqualTo(Integer value) {
            addCriterion("TenantID <=", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidIn(List<Integer> values) {
            addCriterion("TenantID in", values, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidNotIn(List<Integer> values) {
            addCriterion("TenantID not in", values, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidBetween(Integer value1, Integer value2) {
            addCriterion("TenantID between", value1, value2, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidNotBetween(Integer value1, Integer value2) {
            addCriterion("TenantID not between", value1, value2, "tenantid");
            return (Criteria) this;
        }

        public Criteria andGuidIsNull() {
            addCriterion("guid is null");
            return (Criteria) this;
        }

        public Criteria andGuidIsNotNull() {
            addCriterion("guid is not null");
            return (Criteria) this;
        }

        public Criteria andGuidEqualTo(String value) {
            addCriterion("guid =", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotEqualTo(String value) {
            addCriterion("guid <>", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidGreaterThan(String value) {
            addCriterion("guid >", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidGreaterThanOrEqualTo(String value) {
            addCriterion("guid >=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLessThan(String value) {
            addCriterion("guid <", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLessThanOrEqualTo(String value) {
            addCriterion("guid <=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLike(String value) {
            addCriterion("guid like", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotLike(String value) {
            addCriterion("guid not like", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidIn(List<String> values) {
            addCriterion("guid in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotIn(List<String> values) {
            addCriterion("guid not in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidBetween(String value1, String value2) {
            addCriterion("guid between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotBetween(String value1, String value2) {
            addCriterion("guid not between", value1, value2, "guid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}