<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>新增客户</title>
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
                    <small>新增客户</small>
                </h1>
            </div>


        </div>
    </div>
    <form action="${pageContext.request.contextPath}/customer/addcustomer" method="post">
       <div class="form-gorup" >
           <label>姓名：</label>
           <input type="text" name="Cname" class="form-control" required>
       </div>
        <div class="form-gorup" >
            <label>邮箱：</label>
            <input type="text" name="email" class="form-control"required>
        </div>
        <div class="form-gorup" >
        <label>电话：</label>
        <input type="text" name="phone" class="form-control"required>
    </div>
        <div class="form-gorup" >
        <label>地址：</label>
        <input type="text" name="address" class="form-control"required>
    </div>

<div class="form-group">




        <input type="submit" class="form-control" value="添加">
</div>
    </form>

</div>

</body>
</html>
