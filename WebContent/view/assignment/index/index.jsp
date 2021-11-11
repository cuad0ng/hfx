<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:url var="url" value="/view/assignment/index"></c:url>
<c:url var="urlAss" value="/view/assignment"></c:url>
<!DOCTYPE html>
<html lang="vi-VN">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>GROUP 10 | Học lập trình web cùng cô Mai Anh Thơ</title>
    <link rel="stylesheet" href="${url}/css/index.css">
</head>

<body>
    <section>
        <header>
            <a href="#" class="logo">GROUP 10</a>
            <div class="toggle" onclick="toggleMenu();"><img src="${url}/images/menu.png"></div>
            <ul class="navigation">
                <li><a href="https://github.com/cuad0ng/web-programming-group10" style="--i: 1;">Source Code</a></li>
                <li><a href="#" style="--i: 2;">Members</a></li>
                <li><a href="#" style="--i: 3;">Activities</a></li>
                <li><a href="#" style="--i: 4;">Projects</a></li>
                <li><a href="#" style="--i: 5;">More</a></li>
            </ul>
        </header>
        <div class="container">
            <div class="box" style="--i: 3;">
                <div class="imgBx">
                    <a href="${urlAss}/email/index.jsp"><img src="${url}/images/img1.jpg"></a>
                </div>
            </div>
            <div class="box" style="--i: 4;">
                <div class="imgBx">
                    <a href="index-email.jsp"><img src="${url}/images/img2.jpg"></a>
                </div>
            </div>
            <div class="box" style="--i: 5;">
                <div class="imgBx">
                    <a href="loadProducts"><img src="${url}/images/img3.jpg"></a>
                </div>
            </div>
            <div class="box" style="--i: 6;">
                <div class="imgBx">
                    <a href="https://download-group-10.herokuapp.com"><img src="${url}/images/img4.jpg"></a>
                </div>
            </div>
            <div class="box" style="--i: 7;">
                <div class="imgBx">
                    <a href="index-project.html"><img src="${url}/images/img5.jpg"></a>
                </div>
            </div>
        </div>

        <div class="footer">
            <ul class="sci">
                <li><a href="https://www.facebook.com/" style="--i: 9">Facebook</a></li>
                <li><a href="https://twitter.com/" style="--i: 8">Twitter</a></li>
                <li><a href="https://www.instagram.com/" style="--i: 7">Instagram</a></li>
            </ul>
            <p class="copyrightText">© Group 10 | 2021</p>
        </div>
    </section>

    <script src="${url}/js/index.js"></script>
    
</body>

</html>