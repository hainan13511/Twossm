<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<a href="account/findAll">测试查询</a>

<h3>测试包</h3>

<form action="account/save" method="post">
    姓名：<label>
    <input type="text" name="name" />
</label><br/>
    金额：<label>
    <input type="text" name="money" />
</label><br/>
    <input type="submit" value="保存"/><br/>
</form>

</body>
</html>

