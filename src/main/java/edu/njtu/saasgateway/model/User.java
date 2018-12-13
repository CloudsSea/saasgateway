package edu.njtu.saasgateway.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
    @ApiModelProperty("用户名")
	private String userName;
    @ApiModelProperty("密码")
	private String token;
    @ApiModelProperty("注册时间")
	private String createTime;
    @ApiModelProperty("备注")
	private String remarks;
	public User() {
		super();
	}
	
	public User(String userName, String token) {
		// TODO Auto-generated constructor stub
		this.userName = userName;
		this.token = token;
	}
	public User(Long userId,String userName,String token,String createTime,String remarks) {
		this.userId = userId;
		this.userName = userName;
		this.token = token;
		this.createTime = createTime;
		this.remarks = remarks;
	}
	public User(long userId, String userName, String token) {
		// TODO Auto-generated constructor stub
		this.userId = userId;
		this.userName = userName;
		this.token = token;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", token=" + token + ", createTime=" + createTime
				+ ", remarks=" + remarks + "]";
	}
	
	
	
	
}
