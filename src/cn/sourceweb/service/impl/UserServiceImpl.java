package cn.sourceweb.service.impl;

import java.util.List;

import cn.sourceweb.po.User;
import cn.sourceweb.po.UserDAO;
import cn.sourceweb.service.UserService;




public class UserServiceImpl implements UserService {

	private UserDAO userDAO;
	public UserDAO getUserDAO(){return userDAO;}
	public void setUserDAO(UserDAO userDAO){this.userDAO = userDAO;}
	public User getUserByuserName(String username) {
		User user = null;
		List list = userDAO.findByUsername(username);
		if(list.size()>0)user = (User)list.get(0);
		return user;
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub

	}

}
