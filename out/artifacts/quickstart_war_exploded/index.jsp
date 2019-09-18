<%--
  Created by IntelliJ IDEA.
  User: 沈鑫
  Date: 2019/9/12
  Time: 9:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
  </head>
  <body>
 <h2>首页</h2>
 <h2>欢迎您： <%=request.getAttribute("username")%></h2>
  <a href="person.jsp">个人主页</a>
  </body>
</html>
