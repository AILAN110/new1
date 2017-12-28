<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登 录</title>
<style type="text/css">
 *{
     margin: 0;
     padding: 0;
   }
   
   span{
     width:auto;
     height: 180px;
     font-size: 30px;
     color: #fff;
   }
   

  #login{
    width: 560px;
    height: 280px;
    margin: 20px auto;
    background: #f5f7ea;
  }

  .text{
     font-size: 18px;
     color: black;
     margin: 16px 30px 16px 90px; 
  }
  
  .logintext{
     font-size: 26px;
     color: black;
  }
  
  input{
     width: 240px;
     height: 24px;
     margin: 10px 0;
     line-height: 24px;
  }
  
  select {
	width: 160px;
	height: 24px;
	margin: 10px 0; 
  }
  
  #first{
     margin: 80px 0 0 0;
  }
  
  #res{
     width: 120px;
     height: 40px; 
     margin: 20px 0 30px 80px;
  }
  
  #loginsubmit{
     width: 120px;
     height: 40px;
     margin: 20px 0 30px 80px;
  }
  font{
     display:block;
     width: 560px;
     text-align: center;
  }
</style>
</head>
<body>
<div id="login">
 <form action="UserServlet" method="post" >     
    <fieldset>
      <legend><span class="logintext">登 录 入 口</span></legend>
                   <span class="text">账号：</span><input type="text" value=""  name="name" id="first"/><br />
                   <span class="text">密码：</span><input type="password" value="" name="password" id="two"/><br />
                   <input type="submit" value="登 录" id="loginsubmit" />&nbsp;&nbsp;<input type="button" value="注 册" id="res" onclick="out1()" />
    </fieldset>
 </form>
 </div>
 <script type="text/javascript">
  function out1() {
		var one = $("input[name='name']").val();
		alert(one);
		var two = $("input[name='password']").val();
		alert(one);
		//location.href="http://localhost:8989/RESTfulWS/rest/UserInfoService/aaa";
		location.href="http://localhost:8989/RESTfulWS1/rest/UserInfoService/age/"+one+"&"+two;
	}
  </script>
</body>
</html>