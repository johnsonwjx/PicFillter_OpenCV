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
            <div class="navbar-inner">
                <form class="navbar-form text-right">
                    <input class="navbar-text" type="text" maxlength="20px;">
                </form>

            </div>
             <h1 class="page-header">图片刷选</h1>
            <div class="row">
                  <div class="span8">
                      <form class="form-horizontal">
                          <fieldset>
                              <div class="control-group">
                                  <label class="control-label" for="textarea">登陆信息</label>
                                  <div class="controls">
                                      <textarea class="input-xlarge" id="textarea" rows="3" ></textarea>
                                  </div>
                              </div>
                              <div class="form-actions">
                                  <input class="btn btn-primary" type="submit" value="确定"/>
                                  <input  class="btn" type="reset" value="重置">
                              </div>
                          </fieldset>
                      </form>
                  </div>

            </div>
        </div>
  </body>
</html>
