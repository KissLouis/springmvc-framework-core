package com.stu.dao.adm;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.stu.entity.adm.AdmUser;

public interface IAdmUserDao {

	/**
	 * 
	 * Description:
	 * 
	 * @return
	 * @Note
	 * @Author: Louis
	 * @Date: 2018年6月12日 下午4:50:54
	 */
	public List<AdmUser> listAdmUser();

	/**
	 * 
	 * Description:
	 * 
	 * @param user
	 * @Note
	 * @Author: Louis
	 * @Date: 2018年6月13日 下午3:20:37
	 */
	public void addAdmUser(@Param("user") AdmUser user);

	/**
	 * 
	 * Description:
	 * 
	 * @param user
	 * @return
	 * @Note
	 * @Author: Louis
	 * @Date: 2018年6月13日 下午3:20:24
	 */
	public AdmUser findUser(@Param("user") AdmUser user);

}
