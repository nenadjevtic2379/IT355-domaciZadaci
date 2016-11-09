<%-- 
    Document   : prikaz
    Created on : Oct 23, 2016, 6:31:16 PM
    Author     : Korisnik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Podaci o auto-delu</h2>
        <table>
            <tr>
                <td>Naziv: </td>
                <td>${naziv}</td>
            </tr>
            <tr>
                <td>Za auto: </td>
                <td>${zaAuto}</td>
            </tr>
            <tr>
                <td>Za model: </td>
                <td>${zaModel}</td>
            </tr>
            <tr>
                <td>Cena: </td>
                <td>${cena}</td>
            </tr>
        </table>
    </body>
</html>
</body>
</html>
