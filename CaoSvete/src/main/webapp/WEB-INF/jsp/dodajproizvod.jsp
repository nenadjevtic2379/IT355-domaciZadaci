
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

        <style>
            
.form-control{   
 font-size: 22px;
  display: block;
  width: 100%;
  height: 100%;
  padding: 5px 10px;
  background: none;
  background-image: none;
  border: 1px solid #a0b3b0;
  color: #ffffff;
  border-radius: 0;
  -webkit-transition: border-color .25s ease, box-shadow .25s ease;
  transition: border-color .25s ease, box-shadow .25s ease;
}
 .form-control:focus {
  outline: 0;
  border-color: #1ab188;
}

        </style>
                            
        
    </head>
    <!-- END HEAD -->

    <!-- BODY -->
    <body>

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
                            <!--    <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./index/">Home</a></li>
                                <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./pricing/">Pricing</a></li>
                                <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./about/">About</a></li>
                                <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./products/">Products</a></li>
                                <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./faq/">FAQ</a></li>
                                <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./contact/">Contact</a></li>  -->
                                <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./proizvodi">Proizvodi</a></li>
                                <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./tipovi">Tipovi</a></li>
                                <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./addtip">Dodaj tip</a></li>
                                <li class="nav-item"><a class="nav-item-child nav-item-hover active" href="./add">Dodaj proizvod</a></li>
                                <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./login">LogIn</a></li>

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
                <h1 class="carousel-title">Dodaj proizvod</h1>
                <p>Strana za administratore sajta</p>
            </div>
        </div>


        <div class="form">




            <div class="tab-content">
                <div id="signup">   
                    <h3>Dodavanje</h3>


                    <form:form method="POST" modelAttribute="proizvod"> 

                        <div class="field-wrap">
                            <label for="id_tip" path="id_tip"></label>
                            <form:select path="id_tip" class="form-control" ng-selected="Yes" >
                                <c:forEach items="${id_tip}" var="id_tip">
                                    <form:option value="${id_tip.id}">${id_tip.naziv}</form:option>

                                </c:forEach>
                            </form:select>
                        </div>

                        



                        <div class="field-wrap">
                            <label>
                                Vrsta:<span class="req">*</span>
                            </label>
                            <form:input id="vrsta" path="vrsta" type="text" autocomplete="off"/>
                        </div>

                        <div class="field-wrap">
                            <label>
                                Za auto:<span class="req">*</span>
                            </label>
                            <form:input id="zaauto" path="zaauto" type="text" autocomplete="off"/>
                        </div>

                        <div class="field-wrap">
                            <label>
                                Cena:<span class="req">*</span>
                            </label>
                            <form:input id="cena" path="cena" type="number" autocomplete="off"/>
                        </div>

                        <div class="field-wrap">
                            <label>
                                Proizvodnja:<span class="req">*</span>
                            </label>
                            <form:input type="number" id="proizvodnja" path="proizvodnja" autocomplete="off"/>
                        </div>



                        <button type="submit" class="button button-block"/>Dodaj</button>

                    </form:form>

                </div>

                <div id="login">   
                </div>

            </div><!-- tab-content -->

        </div> <!-- /form -->


        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

        <script src="<c:url value="/resources/js/login.js" />"></script>	
        <!--========== END PAGE LAYOUT ==========-->

        <!--========== FOOTER ==========-->
        <footer class="footer">
            <!-- Links -->

            <!-- End Links -->

            <!-- Copyright -->
            <div class="content container">
                <div class="row">
                    <div class="col-xs-6">
                        <img class="footer-logo" src="<c:url value="/resources/img/logo.png"/>" alt="Asentus Logo">
                    </div>
                    <div class="col-xs-6 text-right">
                        <p class="margin-b-0"><a class="color-base fweight-700" href="http://keenthemes.com/preview/asentus/">Asentus</a> Theme Powered by: <a class="color-base fweight-700" href="http://www.keenthemes.com/">KeenThemes.com</a></p>
                    </div>
                </div>
                <!--// end row -->
            </div>
            <!-- End Copyright -->
        </footer>
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