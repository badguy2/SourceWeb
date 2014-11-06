package cn.sourceweb.dao;

import java.util.List;

import cn.sourceweb.po.User;


public interface IUserDAO {

	public abstract void save(User transientInstance);

	public abstract List findByUsername(Object username);

}