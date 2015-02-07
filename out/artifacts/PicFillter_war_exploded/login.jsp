<%--
  Created by IntelliJ IDEA.
  User: xiong
  Date: 14-6-27
  Time: ����2:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0">
    <meta http-equiv="X-UA-COMPATIBLE" content="IE=edge">
    <title>图片刷选</title>
    <script type="text/javascript">
        this.path='${pageContext.request.contextPath}';
    </script>
    <script  src="script/jquery-2.1.1.min.js"></script>
    <script src="script/bootstrap.min.js"></script>
    <script  src="script/main.js"></script>
    <link href="style/main.css" rel="stylesheet"  >
    <link href="style/bootstrap.min.css" rel="stylesheet">
</head>
<body style="text-align: center">
<div class="container">
    <div class="container">
        <section class="loginBox row-fluid">
            <section class="span7 left">
                <h2>商户登录</h2>
                <p><input type="text" name="username" placeholder="用户名"/></p>
                <p><input type="text" name="password" placeholder="密码"/></p>
                <section class="row-fluid">
                    <section class="span8 lh30"><label><input type="checkbox" name="rememberme" />下次自动登录</label></section>
                    <section class="span1"><input type="button" value=" 登录 " class="btn btn-primary"></section>
                </section>
            </section>
            <section class="span5 right">
                <h2>没有帐户？</h2>
                <section>
                    <p>这里有一段文字啊，很多的文字啊，太多太多的文字了，主要可以介绍介绍注册的好处和公司或者项目概况。。。</p>

                    <p><input type="button" value=" 注册 " class="btn regBtn"></p>
                </section>
            </section>
        </section><!-- /loginBox -->
    </div> <!-- /container -->
</body>
</html>
