<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>NAONNA 경기장예약 매칭 사이트 </title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link href="naonna_main.css" rel="stylesheet" type="text/css">
  <style>
  </style>
<meta charset="UTF-8">
</head>
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="50">

<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#myPage">Input NAONNALogo</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#myPage">대관신청</a></li>
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">매칭 신청
          <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">매칭 검색/등록</a></li>
            <li><a href="#">용병 모집/등록</a></li>
          </ul>
        </li>
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">팀 관리
          <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">팀 검색/생성</a></li>
            <li><a href="#">용병 모집/등록</a></li>
          </ul>
        </li>
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">고객센터
          <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">공지사항</a></li>
            <li><a href="#">FAQ</a></li>
            <li><a href="#">QnA</a></li>
          </ul>
        </li>
        <li><a href="#tour">자유게시판</a></li>
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">관리메뉴
          <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">회원관리</a></li>
            <li><a href="#">경기장 등록</a></li>
          </ul>
        </li>
      </ul>
    </div>
  </div>
</nav>
<div class="container-content">
  <div class="side-profile col-sm-4">
      <div class="card">
        <img src="a1.jpg" alt="John" style="width:100%">
        <h1>User Name</h1><br>
        <a href="#"><p>My page</p></a>
        <a href="#"><p>My team</p></a>
        <a href="#"><p>Matching</p></a>
        <a href="#"><p>Booking</p></a>
        <a href="#"><p>My page</p></a>
        <a href="#"><p>My page</p></a>
        <button>Login / LogOut</button>
      </div>
  </div>
<div class="main col-sm-8"><br>
    <div class="divBoard">
      <div class="conBoard">
        <img src="a2.jpg" alt="John">
      </div>
      <div class="conBoard">
          <img src="a2.jpg" alt="John">
      </div>
    </div>
    <div class="divBoard">
      <div class="conBoard">
        <img src="a2.jpg" alt="John">
      </div>
      <div class="conBoard">
        <img src="a2.jpg" alt="John">
      </div>
    </div>
  </div>
</div>


</body>
</html>