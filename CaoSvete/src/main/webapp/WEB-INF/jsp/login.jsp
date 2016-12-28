


<%-- 
    Document   : login
    Created on : Nov 17, 2016, 8:53:20 PM
    Author     : Korisnik
--%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>


<html lang="en" class="no-js">
    <!-- BEGIN HEAD -->
    <head>
        <meta charset="utf-8"/>
        <title>Sign-Up/Login Form</title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta content="width=device-width, initial-scale=1" name="viewport"/>
        <meta content="" name="description"/>
        <meta content="" name="author"/>

        <!-- GLOBAL MANDATORY STYLES -->
        <link href="http://fonts.googleapis.com/css?family=Hind:300,400,500,600,700" rel="stylesheet" type="text/css">
        <link href="<c:url value="/resources/vendor/simple-line-icons/simple-line-icons.min.css" />" rel="stylesheet" type="text/css"/>
        <link href="<c:url value="/resources/vendor/bootstrap/css/bootstrap.min.css" />" rel="stylesheet" type="text/css"/>

        <!-- PAGE LEVEL PLUGIN STYLES -->
        <link href="<c:url value="/resources/css/animate.css" /> "rel="stylesheet">
        <link href="<c:url value="/resources/vendor/swiper/css/swiper.min.css"/>" rel="stylesheet" type="text/css"/>

        <!-- THEME STYLES -->
        <link href="<c:url value="/resources/css/layout.min.css"/>" rel="stylesheet" type="text/css"/>

        <!-- Favicon -->
        <link rel="shortcut icon" href="favicon.ico"/>



        <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">



        <link href="<c:url value="/resources/css/login.css" />" rel="stylesheet">

    </head>
    <!-- END HEAD -->

    <!-- BODY -->
    <body onload='document.loginForm.username.focus();'>

        <!--========== HEADER ==========-->
        <header class="header navbar-fixed-top">
            <!-- Navbar -->
            <nav class="navbar" role="navigation">
                <div class="container">
                    <!-- Brand and toggle get grouped for better mobile display -->
                    <div class="menu-container">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".nav-collapse">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="toggle-icon"></span>
                        </button>

                        <!-- Logo -->
                        <div class="logo">
                            <a class="logo-wrap" href="index.html">
                                <img class="logo-img logo-img-main" src="<c:url value="/resources/img/logo.png" /> " alt="Asentus Logo">
                                <img class="logo-img logo-img-active" src="<c:url value="/resources/img/logo-dark.png"/> " alt="Asentus Logo">
                            </a>
                        </div>
                        <!-- End Logo -->
                    </div>

                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse nav-collapse">
                        <div class="menu-container">
                            <ul class="navbar-nav navbar-nav-right">
                            <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./">Početna</a></li>
                        <!--         <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./pricing/">Pricing</a></li>
                                <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./about/">About</a></li>
                                <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./products/">Products</a></li>
                                <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./faq/">FAQ</a></li>
                                <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./contact/">Contact</a></li> -->
                                <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./proizvodi">Proizvodi</a></li>
                                <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./sviTipoviHib">Tipovi</a></li>
                                <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./addtip">Dodaj tip</a></li>
                                <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./addProizvod">Dodaj proizvod</a></li>
                                <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./forum">Forum</a></li>
                                <li class="nav-item"><a class="nav-item-child nav-item-hover active" href="./login">LogIn</a></li>
                            </ul>
                        </div>
                    </div>
                    <!-- End Navbar Collapse -->
                </div>
            </nav>
            <!-- Navbar -->
        </header>
        <!--========== END HEADER ==========-->

        <!--========== PARALLAX ==========-->


        <div class="parallax-window" data-parallax="scroll" data-image-src="<c:url value="/resources/img/1920x1080/01.jpg" /> ">
            <div class="parallax-content container">
                <h1 class="carousel-title">Prijavi se</h1>
                <p>Nemaš nalog? Lako i brzo ga napravi i pristupi najvećoj kolekciji auto-delova
                    u Srbiji.</p>
            </div>
        </div>


        <div class="form">

            
            <ul class="tab-group">
                <li class="tab active"><a href="#signup">Sign Up</a></li>
                <li class="tab"><a href="#login">Log In</a></li>
            </ul>

            <div class="tab-content">
                <div id="signup">   
                    <h3> Sign Up for Free</h3>

                    <form action="/" method="post">

                        <div class="top-row">
                            <div class="field-wrap">
                                <label>
                                    First Name<span class="req">*</span>
                                </label>
                                <input type="text" required autocomplete="off" />
                            </div>

                            <div class="field-wrap">
                                <label>
                                    Last Name<span class="req">*</span>
                                </label>
                                <input type="text"required autocomplete="off"/>
                            </div>
                        </div>

                        <div class="field-wrap">
                            <label>
                                Email Address<span class="req">*</span>
                            </label>
                            <input type="email"required autocomplete="off"/>
                        </div>

                        <div class="field-wrap">
                            <label>
                                Set A Password<span class="req">*</span>
                            </label>
                            <input type="password"required autocomplete="off"/>
                        </div>

                        <button type="submit" class="button button-block"/>Get Started</button>

                    </form>

                </div>

                <div id="login">   
                    <h1>Welcome Back!</h1>

                   
                    <c:if test="${not empty error}">
                        <div class="error">${error}</div>
                    </c:if>
                    <c:if test="${not empty msg}">
                        <div class="msg">${msg}</div>
                    </c:if>

                    <form name='loginForm'
                          action="<c:url value='/j_spring_security_check'
                                 />" method='POST'>

                        <div class="field-wrap">
                            <label>
                                Username<span class="req">*</span>
                            </label>
                            <input type="text"required autocomplete="off" name="username"/>
                        </div>

                        <div class="field-wrap">
                            <label>
                                Password<span class="req">*</span>
                            </label>
                            <input type="password"required autocomplete="off" name="password"/>
                        </div>

                        <p class="forgot"><a href="#">Forgot Password?</a></p>

                        <button class="button button-block" name="submit"/>Log In</button>
                        <input type="hidden" name="${_csrf.parameterName}"
                               value="${_csrf.token}" />

                    </form>

                </div>

            </div><!-- tab-content -->

        </div> <!-- /form -->
        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>



        <script src="<c:url value="/resources/js/login.js" />"></script>	
        <!--========== END PAGE LAYOUT ==========-->

        <!--========== FOOTER ==========-->
       
        <!--========== END FOOTER ==========-->

        <!-- Back To Top -->
        <a href="javascript:void(0);" class="js-back-to-top back-to-top">Top</a>

        <!-- JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
        <!-- CORE PLUGINS -->
        <script src="<c:url value="/resources/vendor/jquery.min.js" /> " type="text/javascript"></script>
        <script src="<c:url value="/resources/vendor/jquery-migrate.min.js" /> " type="text/javascript"></script>
        <script src="<c:url value="/resources/vendor/bootstrap/js/bootstrap.min.js"/> " type="text/javascript"></script>

        <!-- PAGE LEVEL PLUGINS -->
        <script src="<c:url value="/resources/vendor/jquery.easing.js" />"type="text/javascript" ></script>
        <script src="<c:url value="/resources/vendor/jquery.back-to-top.js" />"type="text/javascript"></script>
        <script src="<c:url value="/resources/vendor/jquery.smooth-scroll.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/resources/vendor/jquery.wow.min.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/resources/vendor/jquery.parallax.min.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/resources/vendor/swiper/js/swiper.jquery.min.js" />"type="text/javascript"></script>

        <!-- PAGE LEVEL SCRIPTS -->
        <script src="<c:url value="/resources/js/layout.min.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/resources/js/components/swiper.min.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/resources/js/components/wow.min.js"/>" type="text/javascript"></script>

    </body>
    <!-- END BODY -->
</html>