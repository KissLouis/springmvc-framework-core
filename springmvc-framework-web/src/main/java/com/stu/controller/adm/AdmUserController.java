package com.stu.controller.adm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stu.biz.adm.AdmUserBiz;
import com.stu.entity.adm.AdmUser;

@Controller
public class AdmUserController {

	@Autowired
	private AdmUserBiz admUserBiz;

	public AdmUserBiz getAdmUserBiz() {
		return admUserBiz;
	}

	public void setAdmUserBiz(AdmUserBiz admUserBiz) {
		this.admUserBiz = admUserBiz;
	}

	@RequestMapping("/index")
	public String gotoIndex() {
		return "index";
	}

	@RequestMapping("/list")
	@ResponseBody
	public List<AdmUser> listAdmUser() {
		return admUserBiz.listAdmUser();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/addUser")
	@ResponseBody
	public Map<String, Object> admUserDao(@RequestBody AdmUser user) {
		Map<String, Object> map = new HashMap<String, Object>();
		admUserBiz.addAdmUser(user);
		map.put("code", "200");
		return map;
	}

	@RequestMapping("/findUser")
	@ResponseBody
	public AdmUser findUser(@RequestBody AdmUser user) {
		return admUserBiz.findUser(user);
	}

}
