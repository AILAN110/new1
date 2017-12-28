package com.eviac.blog.sdao;

import java.sql.SQLException;

import com.eviac.blog.models.Client;
import com.eviac.blog.models.User;
public interface UserDao {

	    //保存图片
		public void save(User user) throws SQLException;
		
		//获取图片
		public long getCount(Client c) throws SQLException;
		
		public void saveClient(Client client) throws SQLException;
		
		public long getCount1(Client c) throws SQLException;
		
}
