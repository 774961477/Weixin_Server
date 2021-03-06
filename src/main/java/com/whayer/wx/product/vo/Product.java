package com.whayer.wx.product.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Product implements Serializable{

	private static final long serialVersionUID = 4115547525003132617L;
	
	private String id;
	private String categoryId;//产品分类id
	private String name;     //产品名
	private String imgUrl;   //产品图片相对路径
	private BigDecimal price;//产品价格
	private String description;//产品描述
	private Date createTime;   //创建时间
	
	private Boolean isOff;   //是否下架
	
	public Product(){
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Boolean getIsOff() {
		return isOff;
	}
	public void setIsOff(Boolean isOff) {
		this.isOff = isOff;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", categoryId=" + categoryId + ", name=" + name + ", imgUrl=" + imgUrl + ", price="
				+ price + ", description=" + description + ", createTime=" + createTime + ", isOff=" + isOff + "]";
	}
	
}
