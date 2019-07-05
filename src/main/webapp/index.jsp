<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <title>Sistema de turismo</title>
    <link href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/resources/css/sticky-footer-navbar.css" rel="stylesheet">
  </head>

  <body>

	<jsp:include page="/resources/templates/navbar.jsp" />

    <!-- Begin page content -->
    <div class="container">
      <div class="page-header">
        <h1 style="color:black;">P�gina inicial da empresa Kougati inovando com voc�</h1>
      </div>
      <p class="lead" style="color: black;">Sistema turistico para voc�.</p>
      <p style="color: black;">Kougati - <a href="https://youtube.com/MineDutyPlayer123" style="color: black;" target="_blank">youtube.com/Kougati</a></p>
    </div>

	<jsp:include page="/resources/templates/rodape.jsp"></jsp:include>

    <!-- Core JS -->
    <script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
    <script src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
  </body>
</html>