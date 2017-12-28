package com.eviac.blog.sdao;

import java.sql.SQLException;

import org.junit.Test;


import com.eviac.blog.models.Client;
import com.eviac.blog.models.User;



public class UserDaoImpl extends AllDao<User> implements UserDao{

	@Override
	public void save(User user) throws SQLException{
		// TODO Auto-generated method stub
		String sql="insert into user.message(mes) values(?)";
			update(sql,user.getMes());
		
	}

	@Override
	public long getCount(Client c) throws SQLException {
		// TODO Auto-generated method stub
		
		String sql="select count(*) from user.login where name=? and password=?";		
		return getForValue(sql, c.getName(),c.getPassword());

	}
	
	@Override
	public long getCount1(Client c) throws SQLException {
		// TODO Auto-generated method stub
		
		String sql="select count(*) from user.login where name=?";		
		return getForValue(sql, c.getName());

	}
	
	@Override
	public void saveClient(Client client) throws SQLException {
		// TODO Auto-generated method stub
		if(getCount1(client)!=0){
			return;
		}
		String sql="insert into user.login(name,password) values(?,?)";
		update(sql,client.getName(),client.getPassword());
	}
	

	@Test
	public void get(){
		UserDao a=new UserDaoImpl();
		User user=new User();
//		user.setIdmessage(1);
		user.setMes("cgjhdg");
		try {
			a.save(user);
			System.out.println(user.getMes());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void t(){
		UserDao u=new UserDaoImpl();
		Client c=new Client();
		c.setName("la");
		c.setPassword("123");
		System.out.println(c);
		long i=0;
		try {
			i = u.getCount(c);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(i);
	}

	
}
