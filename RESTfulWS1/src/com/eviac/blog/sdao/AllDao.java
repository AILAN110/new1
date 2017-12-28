package com.eviac.blog.sdao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;


public class AllDao<T> {
	private Class<T> clazz;
	private QueryRunner queryRunner=new QueryRunner();

	@SuppressWarnings("unchecked")
	public AllDao() {
		Type type=getClass().getGenericSuperclass();
		if(type instanceof ParameterizedType){
			ParameterizedType pt=(ParameterizedType)type;
			
			Type[] t=pt.getActualTypeArguments();
			
			if(t[0] instanceof Class){
				clazz=(Class<T>)t[0];
			}
		}
	}

	public List<T> getForList(String sql,Object...objects) throws SQLException{
		Connection con=null;
		try{
		con=DaoToot.getConnect();
		return queryRunner.query(con,sql,new BeanListHandler<>(clazz),objects);
		}catch(SQLException e){
			throw new SQLException();
		}finally{
			DaoToot.release(con);
		}
		}
	
	@SuppressWarnings("unchecked")
	public <E> E getForValue(String sql,Object...objects) throws SQLException{
		Connection con=null;
		try{
		con=DaoToot.getConnect();
		return (E)queryRunner.query(con, sql,new ScalarHandler(),objects);
		}catch(SQLException e){
			throw new SQLException();
		}finally{
			DaoToot.release(con);
		}
	}
	
	public T get(String sql,Object...objects) throws SQLException{
		Connection con=null;
		try{
			con=DaoToot.getConnect();
			return queryRunner.query(con, sql, new BeanHandler<>(clazz),objects);	
		}catch(SQLException e){
			throw new SQLException();
		}finally{
			DaoToot.release(con);
		}
		
	}
	
	public void update(String sql,Object...objects) throws SQLException {
		Connection con=null;
		try{
			con=DaoToot.getConnect();
//			System.out.println(con);
			queryRunner.update(con, sql, objects);//@@@@@@@@@@@@@@@
//			System.out.println("2");
		}catch(SQLException e){
			throw new SQLException();
		}finally{
			
		}
	}
}
