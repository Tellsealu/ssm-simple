<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改信息</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改信息</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/customer/updatecustomer" method="post">
        <input type="hidden" name="Cid" value="${customer.cid}">
        姓名：<input type="text" name="Cname" value="${customer.cname}"required><br>
        电话：<input type="text" name="phone" value="${customer.phone}"required><br>
        地址：<input type="text" name="address" value="${customer.address}"required><br>
        邮箱：<input type="text" name="email" value="${customer.email}"required><br>

        <input type="submit"  class="form-control" value="提交"/>
    </form>

</div>
</body>
</html>