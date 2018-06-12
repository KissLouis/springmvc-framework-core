package com.stu.controller.adm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stu.biz.adm.impl.IAdmUserBiz;
import com.stu.entity.adm.AdmUser;

@Controller
@RequestMapping("/")
public class AdmUserController {

	@Autowired
	private IAdmUserBiz admUserBiz;

	public IAdmUserBiz getAdmUserBiz() {
		return admUserBiz;
	}

	public void setAdmUserBiz(IAdmUserBiz admUserBiz) {
		this.admUserBiz = admUserBiz;
	}

	@RequestMapping("/list")
	@ResponseBody
	public List<AdmUser> listAdmUser() {
		return admUserBiz.listAdmUser();
	}
}
