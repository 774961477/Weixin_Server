package com.whayer.wx.order.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.whayer.wx.coupon.vo.Coupon;
import com.whayer.wx.login.vo.User;
import com.whayer.wx.product.vo.Product;
import com.whayer.wx.vouchers.vo.Voucher;

/**
 * 订单
 * @author duyu
 *
 */
public class Order implements Serializable{

	private static final long serialVersionUID = 8755264381998274388L;
	
	private String id;            //订单id
	private String userId;        //订单所属用户id
	private String productIdList; //订单商品id(以','逗号分隔, 这是一个冗余字段, 有一个order_products表)
	private String couponId;      //优惠卷id(优惠卷只能一张)
	private String vouchersId;    //代金劵(可以无限张, 使用逗号分隔id)
	private String examineeId;    //体检人id
	private BigDecimal amount= new BigDecimal(0);    //总金额
	private Integer state = 0;        //订单状态(0:未付款, 1:已付款 2:已结算 3:已取消)
	private Boolean isInvoice = false;    //是否需要发票(0: 无需发票1:需要发票)
	private Date createTime;      //创建时间
	
	private List<Product> products = new ArrayList<>();  //订单的产品列表
	
	/**
	 * 2017-07-30 du
	 * 卡劵已对接微信卡劵,自己的劵已不使用,暂时保留不会影响业务
	 * 增加卡劵code字段
	 */
	private String cardCodeList;         //多张卡劵以逗号分割
	
	private List<Voucher> vouchers = new ArrayList<>();  //订单的代金劵列表
	private Coupon coupon;           //订单的优惠卷(限一个)
	private Examinee examinee;       //订单的体检人
	private User user;               //订单所属用户
	private String detectionboxId;   //检测盒id
	
	//2017-06-20
	private String recipientName;    //订单发票收件人姓名
	private String recipientPhone;   //订单发票收件人手机号
	private String recipientAddress; //订单发票收件人地址
	private String invoiceHeader;    //订单发票抬头
	
	public Order(){
		
	}

	public String getCardCodeList() {
		return cardCodeList;
	}

	public void setCardCodeList(String cardCodeList) {
		this.cardCodeList = cardCodeList;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProductIdList() {
		return productIdList;
	}
	public void setProductIdList(String productIdList) {
		this.productIdList = productIdList;
	}
	public String getCouponId() {
		return couponId;
	}
	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}
	public String getVouchersId() {
		return vouchersId;
	}
	public void setVouchersId(String vouchersId) {
		this.vouchersId = vouchersId;
	}
	public String getExamineeId() {
		return examineeId;
	}
	public void setExamineeId(String examineeId) {
		this.examineeId = examineeId;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Boolean getIsInvoice() {
		return isInvoice;
	}
	public void setIsInvoice(Boolean isInvoice) {
		this.isInvoice = isInvoice;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public List<Voucher> getVouchers() {
		return vouchers;
	}
	public void setVouchers(List<Voucher> vouchers) {
		this.vouchers = vouchers;
	}
	public Coupon getCoupon() {
		return coupon;
	}
	public void setCoupon(Coupon coupon) {
		this.coupon = coupon;
	}
	public Examinee getExaminee() {
		return examinee;
	}
	public void setExaminee(Examinee examinee) {
		this.examinee = examinee;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getDetectionboxId() {
		return detectionboxId;
	}
	public void setDetectionboxId(String detectionboxId) {
		this.detectionboxId = detectionboxId;
	}
	public String getRecipientName() {
		return recipientName;
	}
	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}
	public String getRecipientPhone() {
		return recipientPhone;
	}
	public void setRecipientPhone(String recipientPhone) {
		this.recipientPhone = recipientPhone;
	}
	public String getRecipientAddress() {
		return recipientAddress;
	}
	public void setRecipientAddress(String recipientAddress) {
		this.recipientAddress = recipientAddress;
	}
	public String getInvoiceHeader() {
		return invoiceHeader;
	}
	public void setInvoiceHeader(String invoiceHeader) {
		this.invoiceHeader = invoiceHeader;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", userId=" + userId + ", productIdList=" + productIdList + ", couponId=" + couponId
				+ ", vouchersId=" + vouchersId + ", examineeId=" + examineeId + ", amount=" + amount + ", state="
				+ state + ", isInvoice=" + isInvoice + ", createTime=" + createTime + ", products=" + products
				+ ", cardCodeList=" + cardCodeList + ", vouchers=" + vouchers + ", coupon=" + coupon + ", examinee="
				+ examinee + ", user=" + user + ", detectionboxId=" + detectionboxId + ", recipientName="
				+ recipientName + ", recipientPhone=" + recipientPhone + ", recipientAddress=" + recipientAddress
				+ ", invoiceHeader=" + invoiceHeader + "]";
	}
}
