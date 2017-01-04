package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.User;
import com.demo.dao.UserDao;

/** 
* @ClassName: LoginServiceImpl 
* @Description: TODO
* @author xuechen
* @date 2017年1月3日 上午11:06:14 
*  
*/
@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private UserDao userDao;

	/* (non-Javadoc)
	 * @see com.demo.service.LoginService#login()
	 */
	@Override
	public boolean login(String userName, String passWord) {
		User user = userDao.selectByUserName(userName);
		System.out.println(user.getPassword());
		if(userName != null && userName.equals("admin")) {
			return true;
		}else {
			return false;
		}
	}

}
