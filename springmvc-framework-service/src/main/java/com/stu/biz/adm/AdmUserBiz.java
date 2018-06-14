package com.stu.biz.adm;

import java.util.List;

import com.stu.entity.adm.AdmUser;

public interface AdmUserBiz {

	public List<AdmUser> listAdmUser();

	public void addAdmUser(AdmUser user);
	
	public AdmUser findUser(AdmUser user);
}
