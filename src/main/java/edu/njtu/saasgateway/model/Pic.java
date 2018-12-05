package edu.njtu.saasgateway.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Pic {
	private static final String ADDR  = "saaswork.oss-cn-beijing.aliyuncs.com/";
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long picId;
	private Long userId;
	private String preName;
	private String preUrl;
	private String preTime;
	private String laterName;
	private String laterUrl;
	private String laterTime;
	
	public Pic() {
		super();
	}
	public Pic(Long userId,String preName) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.sss");
		this.userId = userId;
		this.preName = preName;
		this.preUrl = ADDR + preName;
		this.preTime = format.format(new Date());
	}
	
	public Long getPicId() {
		return picId;
	}
	public void setPicId(Long picId) {
		this.picId = picId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getPreName() {
		return preName;
	}
	public void setPreName(String preName) {
		this.preName = preName;
	}
	public String getPreUrl() {
		return preUrl;
	}
	public void setPreUrl(String preUrl) {
		this.preUrl = preUrl;
	}
	public String getPreTime() {
		return preTime;
	}
	public void setPreTime(String preTime) {
		this.preTime = preTime;
	}
	public String getLaterName() {
		return laterName;
	}
	public void setLaterName(String laterName) {
		this.laterName = laterName;
	}
	public String getLaterUrl() {
		return laterUrl;
	}
	public void setLaterUrl(String laterUrl) {
		this.laterUrl = laterUrl;
	}
	public String getLaterTime() {
		return laterTime;
	}
	public void setLaterTime(String laterTime) {
		this.laterTime = laterTime;
	}
	@Override
	public String toString() {
		return "Pic [picId=" + picId + ", userId=" + userId + ", preName=" + preName + ", preUrl=" + preUrl
				+ ", preTime=" + preTime + ", laterName=" + laterName + ", laterUrl=" + laterUrl + ", laterTime="
				+ laterTime + "]";
	}
	
	
	
	
}
