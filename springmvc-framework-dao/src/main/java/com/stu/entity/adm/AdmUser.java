package com.stu.entity.adm;

import java.util.Date;

public class AdmUser {

	public Integer userId;
	public String userImg;
	public String userName;
	public String passWord;
	public String userPhone;
	public Date creationDate;
	public Integer userState;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserImg() {
		return userImg;
	}

	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Integer getUserState() {
		return userState;
	}

	public void setUserState(Integer userState) {
		this.userState = userState;
	}

	@Override
	public String toString() {
		return "AdmUser [userId=" + userId + ", userImg=" + userImg
				+ ", userName=" + userName + ", passWord=" + passWord
				+ ", userPhone=" + userPhone + ", creationDate=" + creationDate
				+ ", userState=" + userState + "]";
	}

}
