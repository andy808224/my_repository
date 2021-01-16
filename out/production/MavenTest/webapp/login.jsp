<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/8/23
  Time: 21:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
     <div>
         <form action="<%=request.getContextPath()%>/login" method="post">
             <table>
                 <tr>
                     <td>用户名:</td>
                     <td><input type="text" name="username"></td>
                 </tr>
                 <tr>
                     <td>密码</td>
                     <td><input type="text" name="username"></td>
                 </tr>
                 <tr>
                     <td><input type="submit" value="登录"></td>
                 </tr>
             </table>
         </form>
     </div>
</body>
</html>
