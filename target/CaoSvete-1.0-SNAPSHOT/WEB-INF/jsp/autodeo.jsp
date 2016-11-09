<%-- 
    Document   : autodeo
    Created on : Oct 23, 2016, 6:35:25 PM
    Author     : Korisnik
--%>

<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h2>Unesite informacije o auto-delu</h2>
<form:form method="POST" action="/CaoSvete/addDeo" commandName="autodeo"> <!-- addDeo,autodeo metode iz kontrolera
                                                                          -->
                                                                          
    <table>
        
        
         <tr>
            <td><form:label path="naziv"><spring:message
                        code="name"/></form:label></td>
               
                <td><form:input path="naziv" /></td>
        </tr>
        <tr>
            <td><form:label path="zaAuto"><spring:message
                        code="forCar"/></form:label></td>
            <td><form:input path="zaAuto" /></td>
        </tr>
        <tr>
            <td><form:label path="zaModel"><spring:message
                        code="forModel"/></form:label></td>
            <td><form:input path="zaModel" /></td>
        </tr>
        
         <tr>
            <td><form:label path="cena"><spring:message
                        code="price"/></form:label></td>
            <td><form:input path="cena" /></td>
        </tr>
        
        
        
        
        <tr>
            <td colspan="2">
                <input type="submit" value="Pošalji"/>
            </td>
        </tr>
    </table>
</form:form>
