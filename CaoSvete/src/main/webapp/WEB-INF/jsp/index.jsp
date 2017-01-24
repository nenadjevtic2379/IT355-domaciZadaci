<%-- 
    Document   : index
    Created on : Nov 17, 2016, 8:53:03 PM
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
        <title>Metronic "Asentus" Frontend Freebie</title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta content="width=device-width, initial-scale=1" name="viewport"/>
        <meta content="" name="description"/>
        <meta content="" name="author"/>

        <!-- GLOBAL MANDATORY STYLES -->
        <link href="http://fonts.googleapis.com/css?family=Hind:300,400,500,600,700" rel="stylesheet" type="text/css">
        <link href="<c:url value="/resources/vendor/simple-line-icons/simple-line-icons.min.css"/>" rel="stylesheet" type="text/css"/>
              <link href="<c:url value="/resources/vendor/bootstrap/css/bootstrap.min.css" />" rel="stylesheet"  type="text/css"/>

        <!-- PAGE LEVEL PLUGIN STYLES -->
        <link href="<c:url value="/resources/css/animate.css" /> "rel="stylesheet">
        <link href="<c:url value="/resources/vendor/swiper/css/swiper.min.css" />" rel="stylesheet" type="text/css"/>

        <!-- THEME STYLES -->
        <link href="<c:url value="/resources/css/layout.min.css" /> " rel="stylesheet" type="text/css"/>

        <!-- Favicon -->
        <link rel="shortcut icon" href="favicon.ico"/>
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
                                <img class="logo-img logo-img-main" src="<c:url value="/resources/img/logo.png" />" alt="Asentus Logo">
                                <img class="logo-img logo-img-active" src="<c:url value="/resources/img/logo-dark.png" />" alt="Asentus Logo">
                            </a>
                        </div>
                        <!-- End Logo -->
                    </div>

                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse nav-collapse">
                        <div class="menu-container">
                            <ul class="navbar-nav navbar-nav-right">
                                
                                 <c:if test="${pageContext.request.userPrincipal.name != null}">
		
                    <li class="nav-item"><a class="nav-item-child nav-item"><span class="glyphicon glyphicon-user ">${pageContext.request.userPrincipal.name}</span></a></li>			 
		
	                  </c:if>
                                
                                <li class="nav-item"><a class="nav-item-child nav-item-hover active" href="./">Početna</a></li>
                                
                                <!--      <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./pricing/">Pricing</a></li>
                                      <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./about/">About</a></li>
                                      <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./products/">Products</a></li>
                                      <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./faq/">FAQ</a></li>
                                      <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./contact/">Contact</a></li>  -->
                               
                                 <c:if test="${pageContext.request.isUserInRole('admin') || pageContext.request.isUserInRole('user')}">
                                <li class="nav-item"><a class="nav-item-child nav-item-hover"  href="<c:url value="/proizvodi"/>">Proizvodi</a></li>
                                 </c:if>
                                <c:if test="${pageContext.request.isUserInRole('admin') && !pageContext.request.isUserInRole('user')}">
                                <li class="nav-item"><a class="nav-item-child nav-item-hover" href="<c:url value="/sviTipoviHib"/>">Tipovi</a></li>
                                
                                <li class="nav-item"><a class="nav-item-child nav-item-hover" href="<c:url value="/addtip"/>">DodajT</a></li>
                                <li class="nav-item"><a class="nav-item-child nav-item-hover" href="<c:url value="/addProizvod"/>">DodajP</a></li>
                               </c:if>
                                <c:if test="${pageContext.request.isUserInRole('admin') || pageContext.request.isUserInRole('user')}">
                                <li class="nav-item"><a class="nav-item-child nav-item-hover" href="<c:url value="/forum"/>">Forum</a></li>
                               </c:if>
                                <c:if test="${pageContext.request.isUserInRole('admin') && !pageContext.request.isUserInRole('user')}">
                                <li class="nav-item"><a class="nav-item-child nav-item-hover" href="<c:url value="/allnarudzbine"/>">Narudžbine</a></li>
                                <li class="nav-item"><a class="nav-item-child nav-item-hover" href="<c:url value="/info"/>">Korisnici</a></li>
                                <li class="nav-item"><a class="nav-item-child nav-item-hover" href="<c:url value="/poruke"/>">Poruke</a></li>
                                </c:if>
                                
                                <c:if test="${pageContext.request.isUserInRole('user') && !pageContext.request.isUserInRole('admin')}">
                                <li class="nav-item"><a class="nav-item-child nav-item-hover" href="<c:url value="/mojakorpa"/>"><span class="glyphicon glyphicon-shopping-cart"></span></a></li>
                                </c:if>
                               <c:if test="${!pageContext.request.isUserInRole('user') && !pageContext.request.isUserInRole('admin')}">
                             <li class="nav-item"><a class="nav-item-child nav-item-hover" href="./reg"><span class="glyphicon glyphicon-user"></span></a></li>
                                <li class="nav-item"><a class="nav-item-child nav-item-hover " href="./login"><span class="glyphicon glyphicon-log-in"></span></a></li>
                                </c:if>

                                <c:if test="${pageContext.request.isUserInRole('user') || pageContext.request.isUserInRole('admin')}">
        <li class="nav-item"><a href="javascript:formSubmit()" class="nav-item-child nav-item-hover"><span class="glyphicon glyphicon-log-out"></span></a></li>                        
                                </c:if>
                            </ul>
                        </div>
                    </div>
                    <!-- End Navbar Collapse -->
                </div>
            </nav>
            <!-- Navbar -->
        </header>
        <!--========== END HEADER ==========-->

        <!--========== SLIDER ==========-->
        
        <c:url value="/j_spring_security_logout" var="logoutUrl" />
	<form action="${logoutUrl}" method="post" id="logoutForm">
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
	</form>
	<script>
		function formSubmit() {
			document.getElementById("logoutForm").submit();
		}
	</script>

	
        
        
        
        <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
            <div class="container">
                <!-- Indicators -->
                <ol class="carousel-indicators">
                    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                </ol>
            </div>

            <!-- Wrapper for slides -->
            <div class="carousel-inner" role="listbox">
                <div class="item active">
                    <img class="img-responsive" src="<c:url value="/resources/img/1920x1080/01.jpg"/>" alt="Slider Image">
                    <div class="container">
                        <div class="carousel-centered">
                            <div class="margin-b-40">
                                <h1 class="carousel-title">Dobrodošli!</h1>
                                
                                <p> Najveća baza auto-delova u Srbiji. <br/> Ukoliko niste prijavljeni i nemate nalog, lako to možete učiniti. </p>
                            </div>
                            <c:if test="${!pageContext.request.isUserInRole('admin') && !pageContext.request.isUserInRole('user')}">
                            <a href="<c:url value="/reg"/>" class="btn-theme btn-theme-sm btn-white-brd text-uppercase">Registracija</a>
                                </c:if>
                        </div>
                    </div>
                </div>
                <div class="item">
                    <img class="img-responsive" src="<c:url value="/resources/img/1920x1080/02.jpg"/>" alt="Slider Image">
                    <div class="container">
                        <div class="carousel-centered">
                            <div class="margin-b-40">
                                <h2 class="carousel-title">Uverite se u kvalitet naših proizvoda</h2>
                                <p>Prijava na naš sistem se besplatna i uvek će biti.<br/>Ukoliko imate problem, kontaktirajte naš admin tim.</p>
                            </div>
                            <c:if test="${!pageContext.request.isUserInRole('admin') && !pageContext.request.isUserInRole('user')}">
                            <a href="<c:url value="/login"/>" class="btn-theme btn-theme-sm btn-white-brd text-uppercase">Prijavi se</a>
                            </c:if>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!--========== SLIDER ==========-->

        <!--========== PAGE LAYOUT ==========-->
        

        <!-- Latest Products -->
        <div class="content-lg container">
          
        </div>
       
        <div class="container">

        <hr class="featurette-divider">

        <!-- First Featurette -->
        <div class="featurette" id="about">
            <img class="featurette-image img-circle img-responsive pull-right" src="http://freedesignfile.com/upload/2016/03/Auto-parts-maintenance-vector-template.jpg">
            <h2 class="featurette-heading">Najjkvalitetniji auto-delovi
                
            </h2>
            <p class="lead">Najveća online baza auto-delova u Srbiji. Lako i brzo pronađite željeni deo, napravite narudžbinu, a na nama je sve ostalo.</p>
        </div>

        <hr class="featurette-divider">

        <!-- Second Featurette -->
        <div class="featurette" id="services">
            <img class="featurette-image img-circle img-responsive pull-left" src="http://www.gfxtr.com/uploads/posts/2015-09/1441811082_vector-basket-with-car-spares-.jpg">
            <h2 class="featurette-heading">Najbrža isporuka delova
               
            </h2>
            <p class="lead">Napravite nalog na našem sajtu za samo par trenutaka sa ispravnim podacima o sebi, a naša kurirska služba će vam u najkraćem roku dostaviti deo na vašu kućnu adresu.</p>
        </div>

        <hr class="featurette-divider">

        <!-- Third Featurette -->
        <div class="featurette" id="contact">
            <img class="featurette-image img-circle img-responsive pull-right" src="http://www.ukretailrecruitment.com/wp-content/uploads/2010/09/commercial.jpg">
            <h2 class="featurette-heading">Zaštita potrošača
                
            </h2>
            <p class="lead">Za svaki neispravan auto-deo , ili auto-deo oštećen prilikom dostave, svakom našem kupcu je omogućena reklamacija. Ostavite žalbu na našem forumu, ili nas kontaktirajte na naš telefon, a mi ćemo rešiti problem što je brže moguće.</p>
        </div>

        <hr class="featurette-divider">



    </div>
            
         
        <!-- End Promo Section -->

        <!-- Work -->
        <div class="bg-color-sky-light overflow-h">
            <div class="content-lg container">
                <div class="row margin-b-40">
                    
                </div>
                <!--// end row -->

                <!-- Masonry Grid -->
                
        </div>
        <!-- End Work -->
        <!--========== END PAGE LAYOUT ==========-->

        <!--========== FOOTER ==========-->
        <footer class="footer">
            <!-- Links -->
            
            <div class="footer-seperator">
                
                <div class="content-lg container">
                   
                    <div class="row">
                        
                        <div class="col-sm-2 sm-margin-b-50">
                            <!-- List -->
                         <!--   <ul class="list-unstyled footer-list">
                                <li class="footer-list-item"><a class="footer-list-link" href="#">Home</a></li>
                                <li class="footer-list-item"><a class="footer-list-link" href="#">About</a></li>
                                <li class="footer-list-item"><a class="footer-list-link" href="#">Products</a></li>
                                <li class="footer-list-item"><a class="footer-list-link" href="#">Pricing</a></li>
                                <li class="footer-list-item"><a class="footer-list-link" href="#">Clients</a></li>
                                <li class="footer-list-item"><a class="footer-list-link" href="#">Careers</a></li>
                                <li class="footer-list-item"><a class="footer-list-link" href="#">Contact</a></li>
                                <li class="footer-list-item"><a class="footer-list-link" href="#">Terms</a></li>
                            </ul> -->
                            <!-- End List -->
                        </div>
                        <div class="col-sm-4 sm-margin-b-30">
                            <!-- List -->
                            <ul class="list-unstyled footer-list">
                                <li class="footer-list-item"><a class="footer-list-link" href="https://twitter.com/auto_delovi">Twitter</a></li>
                                <li class="footer-list-item"><a class="footer-list-link" href="https://www.facebook.com/auto.delovi.org/">Facebook</a></li>
                                <li class="footer-list-item"><a class="footer-list-link" href="https://www.instagram.com/ebautoshop/">Instagram</a></li>
                                <li class="footer-list-item"><a class="footer-list-link" href="https://www.youtube.com/watch?v=1nUEPsc2grU">YouTube</a></li>
                            </ul>
                            <!-- End List -->
                        </div>
                        
                        
                        <div class="col-sm-5 sm-margin-b-30">
                            
                       <form:form onsubmit="setTimeout(function () { window.location.reload(); }, 30)" method="POST"  modelAttribute="kontakt">
                            <h2 class="color-white">Imate problem ili pitanje?</h2>
                            <p>Kontaktirajte naš admin tim i očekujte odgovor ili poziv od nas</p>
                            <p>u najkraćem mogućem roku</p>
                            
                            <form:input id="ime" path="ime" type="text" class="form-control footer-input margin-b-20" placeholder="Ime i prezime" />
                            <form:input id="email" path="email" type="email" class="form-control footer-input margin-b-20" placeholder="Email" />
                            <form:input id="telefon" path="telefon" type="text" class="form-control footer-input margin-b-20" placeholder="Telefon" />
                                <form:textarea type="text" id="poruka" path="poruka" class="form-control footer-input margin-b-30" rows="6" placeholder="Poruka"/>
                           
                                
                               <button type="submit" class="btn-theme btn-theme-sm btn-base-bg text-uppercase">Pošalji</button>
                       </form:form>
                        </div>
                            
                    </div>
                    <!--// end row -->
                    
                </div>
                             
            </div>
                           
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
        <a href="<c:url value="/resources/javascript:void(0);" />" class="js-back-to-top back-to-top">Top</a>

        <!-- JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
        <!-- CORE PLUGINS -->
        <script src="<c:url value="/resources/vendor/jquery.min.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/resources/vendor/jquery-migrate.min.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/resources/vendor/bootstrap/js/bootstrap.min.js"/>" type="text/javascript"></script>

        <!-- PAGE LEVEL PLUGINS -->
        <script src="<c:url value="/resources/vendor/jquery.easing.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/resources/vendor/jquery.back-to-top.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/resources/vendor/jquery.smooth-scroll.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/resources/vendor/jquery.wow.min.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/resources/vendor/swiper/js/swiper.jquery.min.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/resources/vendor/masonry/jquery.masonry.pkgd.min.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/resources/vendor/masonry/imagesloaded.pkgd.min.js"/>" type="text/javascript"></script>

        <!-- PAGE LEVEL SCRIPTS -->
        <script src="<c:url value="/resources/js/layout.min.js"/>" type="text/javascript"></script>
            <script src="<c:url value="/resources/js/components/wow.min.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/resources/js/components/swiper.min.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/resources/js/components/masonry.min.js"/>" type="text/javascript"></script>

    </body>
    <!-- END BODY -->
</html>
