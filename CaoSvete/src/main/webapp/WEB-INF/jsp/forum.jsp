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

        <style>
            .btn {


            }

            .form {
                max-width: 1300px;
            }

            blockquote{
                display:block;
                background: #fff;
                padding: 15px 20px 15px 45px;
                margin: 0 0 20px;
                position: relative;

                /*Font*/
                font-family: Georgia, serif;
                font-size: 16px;
                line-height: 1.2;
                color: #666;
                text-align: justify;

                /*Borders - (Optional)*/
                border-left: 15px solid #1ab188;
                border-right: 3px solid #1ab188;

                /*Box Shadow - (Optional)*/
                -moz-box-shadow: 2px 2px 15px #ccc;
                -webkit-box-shadow: 2px 2px 15px #ccc;
                box-shadow: 2px 2px 15px #ccc;
            }

            blockquote::before{
                content: "\201C"; /*Unicode for Left Double Quote*/

                /*Font*/
                font-family: Georgia, serif;
                font-size: 60px;
                font-weight: bold;
                color: #999;

                /*Positioning*/
                position: absolute;
                left: 10px;
                top:5px;
            }

            blockquote::after{
                /*Reset to make sure*/
                content: "";
            }

            blockquote a{
                text-decoration: none;
                background: #eee;
                cursor: pointer;
                padding: 0 3px;
                color: #c76c0c;
            }

            blockquote a:hover{
                color: #666;
            }

            blockquote em{
                font-style: italic;
            }

            .glyphicon-pencil {
                color: gray;
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
                                <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./">Početna</a></li>
                                <!--      <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./pricing/">Pricing</a></li>
                                      <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./about/">About</a></li>
                                      <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./products/">Products</a></li>
                                      <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./faq/">FAQ</a></li>
                                      <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./contact/">Contact</a></li>  -->
                                <c:if test="${pageContext.request.isUserInRole('admin') || pageContext.request.isUserInRole('user')}">
                                <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./proizvodi">Proizvodi</a></li>
                                 </c:if>
                                <c:if test="${pageContext.request.isUserInRole('admin') && !pageContext.request.isUserInRole('user')}">
                                <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./sviTipoviHib">Tipovi</a></li>
                                
                                <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./addtip">Dodaj tip</a></li>
                                <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./addProizvod">Dodaj proizvod</a></li>
                               </c:if>
                                <c:if test="${pageContext.request.isUserInRole('admin') || pageContext.request.isUserInRole('user')}">
                                <li class="nav-item"><a class="nav-item-child nav-item-hover active" href="./forum">Forum</a></li>
                               </c:if>
                                <c:if test="${pageContext.request.isUserInRole('admin') && !pageContext.request.isUserInRole('user')}">
                                <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./allnarudzbine">Narudžbine</a></li>
                                </c:if>
                                
                                <c:if test="${pageContext.request.isUserInRole('user') && !pageContext.request.isUserInRole('admin')}">
                                <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./mojakorpa"><span class="glyphicon glyphicon-shopping-cart"></span></a></li>
                                </c:if>
                              <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./reg"><span class="glyphicon glyphicon-user"></span></a></li>
                                <li class="nav-item"><a class="nav-item-child nav-item-hover " href="./login"><span class="glyphicon glyphicon-log-in"></span></a></li>

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
                <h1 class="carousel-title">Forum</h1>
                <p>Stupi u kontakt sa ostalim kupcima ili ostavi svoje mišljenje o našem radu i proizvodima.</p>
            </div>
        </div>


        <div class="form">

            <p> Dodaj komentar: <p>




                <form:form onsubmit="setTimeout(function () { window.location.reload(); }, 30)" 
                           method="POST" modelAttribute="forum">
<form:input type="hidden" id="id"  path="id"  />
                    <form:input type="hidden" id="username"  path="username" value="${username}" />

                <div class="field-wrap">
                    <form:input id="komentar" path="komentar" type="text"/> 
                </div>
                <button type="submit"  class="button button-block"/>Dodaj</button>
            <hr>   


            <c:forEach items="${komentariLista}" var="forum">
                 
                 <blockquote> <p> ${forum.username} :</p> ${forum.komentar}
                  <p align="right"><a href="<c:url value='/odgovoriNaKomentar/${forum.id}' />"><span class="glyphicon glyphicon-pencil">Odgovori</span></a></td></blockquote>
               
                  
                
        <c:forEach items="${odgovoriLista}" var="kom">
              
            <c:if test="${kom.id.id eq forum.id}">
    <!-- kom.id.id veza sa entitetom i bazom podataka, kao i u /sviproizvodi -->
                 <h4> <p>${kom.username} :</p> ${kom.odg} </h4> 
                   
                   
                  
                        </c:if>
                    </c:forEach>
      
            </c:forEach>
        </form:form>

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