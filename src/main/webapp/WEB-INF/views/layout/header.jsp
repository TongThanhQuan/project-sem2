<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spt" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<spt:url value="/" var="rootPath"></spt:url>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>Focus - Bootstrap Admin Dashboard </title>
    <!-- Favicon icon -->
    <link rel="icon" type="image/png" sizes="16x16" href="${rootPath}public/images/favicon.png">
    <link rel="stylesheet" href="${rootPath}public/vendor/owl-carousel/css/owl.carousel.min.css">
    <link rel="stylesheet" href="${rootPath}public/vendor/owl-carousel/css/owl.theme.default.min.css">
    <link href="${rootPath}public/vendor/jqvmap/css/jqvmap.min.css" rel="stylesheet">
    <link href="${rootPath}public/css/style.css" rel="stylesheet">



</head>

<body>
    <div id="main-wrapper">
        <div class="nav-header">
            <a href="index.html" class="brand-logo">
                <img class="logo-abbr" src="${rootPath}public/images/logo.png" alt="">
                <img class="logo-compact" src="${rootPath}public/images/logo-text.png" alt="">
                <img class="brand-title" src="${rootPath}public/images/logo-text.png" alt="">
            </a>

            <div class="nav-control">
                <div class="hamburger">
                    <span class="line"></span><span class="line"></span><span class="line"></span>
                </div>
            </div>
        </div>
        <div class="header">
            <div class="header-content">
                <nav class="navbar navbar-expand">
                    <div class="collapse navbar-collapse justify-content-between">
                        <div class="header-left">
                            <div class="search_bar dropdown">
                                <span class="search_icon p-3 c-pointer" data-toggle="dropdown">
                                    <i class="mdi mdi-magnify"></i>
                                </span>
                                <div class="dropdown-menu p-0 m-0">
                                    <form>
                                        <input class="form-control" type="search" placeholder="Search" aria-label="Search">
                                    </form>
                                </div>
                            </div>
                        </div>

                        <ul class="navbar-nav header-right">
                            <li class="nav-item dropdown notification_dropdown">
                                <div class="dropdown-menu dropdown-menu-right">
                                    <a class="all-notification" href="#">See all notifications <i
                                            class="ti-arrow-right"></i></a>
                                </div>
                            </li>
                            <li class="nav-item dropdown header-profile">
                                <a class="nav-link" href="#" role="button" data-toggle="dropdown">
                                    <i class="mdi mdi-account"></i>
                                </a>
                                <div class="dropdown-menu dropdown-menu-right">
                                    <a href="${rootPath}public/app-profile.html" class="dropdown-item">
                                        <i class="icon-user"></i>
                                        <span class="ml-2">Profile </span>
                                    </a>
                                    <a href="${rootPath}public/page-login.html" class="dropdown-item">
                                        <i class="icon-key"></i>
                                        <span class="ml-2">Logout </span>
                                    </a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </nav>
            </div>
        </div>
        <div class="quixnav">
            <div class="quixnav-scroll">
                <ul class="metismenu" id="menu">
                    <li class="nav-label first">Main Menu</li>
                    <li><a class="has-arrow" href="${rootPath}category/list" aria-expanded="false">
                    	<span class="nav-text">Quản lý danh mục </span></a>
                    </li>
                    <li><a class="has-arrow" href="javascript:void()" aria-expanded="false">
                    	<span class="nav-text">Quản lí người dùng </span></a>
                    <li><a class="has-arrow" href="javascript:void()" aria-expanded="false">
                    	<span class="nav-text">Quản lí sản phẩm  </span></a>
                    </li>
                    <li><a class="has-arrow" href="javascript:void()" aria-expanded="false">
                    	<span class="nav-text">Quản lí đơn hàng </span></a>
                    </li>

                    <li><a href="widget-basic.html" aria-expanded="false">
                    	<span class="nav-text">Quản lí tài khoản </span></a></li>
                    	<li><a class="has-arrow" href="javascript:void()" aria-expanded="false">
                    	<span class="nav-text">Phản hồi </span></a>
                    </li>
                    <li><a class="has-arrow" href="javascript:void()" aria-expanded="false">
                    	<span class="nav-text">Quản lí tài khoản </span></a>
                    
                </ul>
            </div>
        </div>
       