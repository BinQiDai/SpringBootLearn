<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta charset="utf-8">
    <title>Title</title>
  </head>
  <body>
    <form action="some/register" method="post">
      姓名：<input type="text" name="name">
      年龄：<input type="text" name="age">
      <input type="submit" value="注册">
    </form>
    <hr>

    <form action="some/find" method="post">
        年龄上限：<input type="text" name="age"> <br>
        <input type="submit" value="查询">
    </form>
    <hr>
    <a href="some/count">查询学生总人数</a>
  </body>
</html>
