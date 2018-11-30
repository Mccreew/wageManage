<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName()
            + ":" + request.getServerPort() + path + "/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width">
    <!-- UIkit CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.23/css/uikit.min.css"/>

    <!-- UIkit JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.23/js/uikit.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-rc.23/js/uikit-icons.min.js"></script>
    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.3.1.min.js"></script>
    <link rel="stylesheet" href="${basePath}/css/index.css">
    <script rel="script" src="${basePath}/js/vue.js"></script>
    <title>个人</title>
</head>
<body>
<div class="uk-flex uk-flex-center" style="margin-top: 120px">
    <div class="uk-card uk-card-default uk-card-body uk-width-1-2@m">
        <table class="uk-table">
            <thead>
            <tr>
                <th>编号</th>
                <th>名字</th>
                <th>密码</th>
                <th>薪资</th>
                <th>职位</th>
            </tr>
            </thead>

            <tbody>

            <tr>
                <td>${person.id}</td>
                <td>${person.name}</td>
                <td>${person.pass}</td>
                <td>${person.salary}</td>
                <td>${person.placeName}</td>
            </tr>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
