package com.sansan.mappers;

import java.util.List;
import java.util.Map;

import com.sansan.dao.User;

public interface UserMapper {

	List<User> getUserInfoByUserID(int i);
	
	/**
	 * 根据用户密码查找用户密码
	 * @param userName
	 * @return
	 */
	String getUserPassWord(String userName);
	
	/**
	 * 查找用户ID
	 * @param userName
	 * @return
	 */
	User getUserID(String userName);
	
	/**
	 * 添加用户
	 * @param map
	 * @return
	 */
	int insertUser(Map<String, String> map);
	
	/**
	 * 获取select框用户
	 * @return
	 */
	List<User> getAllUser();
	
	/**
	 * 获取用户列表信息
	 * @return
	 */
	List<User> getListAdmins(Map<String,Object> map);
	
	/**
	 * 获取用户总数量
	 * @return
	 */
	int getCountAdmins();
	
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	int insertAdmin(User user);

	/**
	 * 编辑用户信息
	 * @param user
	 * @return
	 */
	int updateUserInfo(User user);

	/**
	 * delUserInfo
	 * @param userID
	 * @return
	 */
	int delUserInfo(int userID);
}
