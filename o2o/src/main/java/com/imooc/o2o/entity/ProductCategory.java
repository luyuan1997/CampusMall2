package com.imooc.o2o.entity;

import java.util.Date;

public class ProductCategory {

	private Long prouctCategoryId;
	private Long shopId;
	private String productCategoryName;
	private Integer priority;
	private Date createTime;
	public Long getProuctCategoryId() {
		return prouctCategoryId;
	}
	public void setProuctCategoryId(Long prouctCategoryId) {
		this.prouctCategoryId = prouctCategoryId;
	}
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public String getProductCategoryName() {
		return productCategoryName;
	}
	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	 
}
