package com.eviac.blog.restws;
import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.eviac.blog.models.Client;
import com.eviac.blog.models.User;
import com.eviac.blog.sdao.UserDao;
import com.eviac.blog.sdao.UserDaoImpl;

 
/**
* 
* @author pavithra
* 
*/
 
// ����@Path��������Ĳ��·���� 
// ָ������Դ���ṩ�����URI·����
@Path("UserInfoService")
public class UserInfo {
 
// @GET��ʾ�����ᴦ��HTTP GET����
@GET
// ����@Path��������Ĳ��·����ָ������Դ���ṩ�����URI·����
@Path("/name/{i}")
// @Produces��������Դ�෽�������ɵ�ý�����͡�
@Produces(MediaType.TEXT_XML)
// @PathParam��@Path����ı��ʽע��URI����ֵ��
public void userName(@PathParam("i") String i) {
 
String name = i;
User user=new User();
user.setMes(name);
UserDao udi=new UserDaoImpl();
try {
	udi.save(user);
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//return "<User>" + "<Name>" + name + "</Name>" + "</User>";
//return  name;
}
 
//@GET��ʾ�����ᴦ��HTTP GET����
@GET
//����@Path��������Ĳ��·����ָ������Դ���ṩ�����URI·����
@Path("/name1/{text}")
//@Produces��������Դ�෽�������ɵ�ý�����͡�
@Produces(MediaType.TEXT_XML)
//@PathParam��@Path����ı��ʽע��URI����ֵ��
public void login(@PathParam("text") String text) {

String n = text;
User user=new User();
user.setMes(n);
UserDao udi=new UserDaoImpl();
try {
	udi.save(user);
} catch (SQLException e) {
	e.printStackTrace();
}
//return;
}

@GET
@Path("/age/{j}&{k}") 
@Produces(MediaType.TEXT_XML)
public void userAge(@PathParam("j") String j , @PathParam("k") String k) {
 
String name=j;
String password=k;
Client client=new Client();
client.setName(name);
client.setPassword(password);
UserDao udi=new UserDaoImpl();
try {
	udi.saveClient(client);
} catch (SQLException e) {
	e.printStackTrace();
}
//return "<User>" + "<Name>" + name + "</Name>" +"<password>" + password + "</password>" + "</User>";
}

}
