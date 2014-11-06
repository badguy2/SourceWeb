package cn.sourceweb.service;
import cn.sourceweb.po.User;

public interface UserService {
	public User getUserByuserName(String username);
	public void addUser(User user);

}
