<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>客户列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>
<h1>客户列表</h1>


<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small> 客户列表-所有客户列表</small>
                </h1>
            </div>


            <div class="row">
                <div class="col-md-4 column">
                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/customer/toaddcustomer">增加客户</a>
                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/customer/allcustomer">显示全部</a>

                </div>
                <div class="col-md-8 column">
                    <form class="form-inline" action="${pageContext.request.contextPath}/customer/query" method="post" style="folat:right">
                        <span style="color: #ff0000;font-weight: bold">${error}</span>

                        <input type="text" name="queryname"  placeholder="输入客户名称">
                        <input type="submit" value="查询" class="btn btn-primary">
                    </form>
                </div>
            </div>
        </div>
    </div>




    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead></thead>
                <tr>
                    <th>序号</th>
                    <th>客户姓名</th>
                    <th>联系方式</th>
                    <th>邮箱</th>
                    <th>地址</th>
                    <th>操作</th>

                </tr>
                <tbody>
                <c:forEach var="customer" items="${list}">
                    <tr>
                        <td>${customer.cid}</td>
                        <td>${customer.cname}</td>
                        <td>${customer.phone}</td>
                        <td>${customer.email}</td>
                        <td>${customer.address}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/customer/toupdatecustomer?id=${customer.cid}">更改</a> |
                            <a href="${pageContext.request.contextPath}/customer/delete/?id=${customer.cid}">删除</a>

                        </td>

                    </tr>
                </c:forEach>

                </tbody>

            </table>

        </div>
    </div>

</div>


</body>
</html>
