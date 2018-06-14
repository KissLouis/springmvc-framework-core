package com.stu.biz.adm.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.stu.biz.adm.AdmUserBiz;
import com.stu.dao.adm.IAdmUserDao;
import com.stu.entity.adm.AdmUser;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class IAdmUserBiz implements AdmUserBiz {

	@Autowired
	private IAdmUserDao admUserDao;

	public IAdmUserDao getAdmUserDao() {
		return admUserDao;
	}

	public void setAdmUserDao(IAdmUserDao admUserDao) {
		this.admUserDao = admUserDao;
	}

	@Override
	public List<AdmUser> listAdmUser() {
		// TODO Auto-generated method stub
		return admUserDao.listAdmUser();
	}

	@Override
	public void addAdmUser(AdmUser user) {
		// TODO Auto-generated method stub
		admUserDao.addAdmUser(user);
	}

	@Override
	public AdmUser findUser(AdmUser user) {
		// TODO Auto-generated method stub
		return admUserDao.findUser(user);
	}

}
