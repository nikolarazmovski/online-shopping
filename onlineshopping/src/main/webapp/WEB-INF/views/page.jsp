<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!-- for reading static resources -->

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />
<c:set var="contextRoot" value="${pageContext.request.contextPath }" />
<!-- in this app the context root is the url /onlineshopping!!!!! -->

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Online shopping - ${title }</title>
<script>
	window.menu = '${title}';
</script>
<!-- Bootstrap core CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- Custom styles for this template -->
<link href="${css }/myapp.css" rel="stylesheet">
<!-- BOOTSTRAP READABLE THEME -->
<link href="${css }/bootstrap-readable-theme.css" rel="stylesheet">

</head>

<body>
	<div class="wrapper">
		<!-- Navigation -->
		<%@ include file="./shared/navbar.jsp"%>

		<div class="content">
			<!-- Loads only when user clicks Home -->
			<c:if test="${userClickHome == true }">
				<!-- Page Content Loading-->
				<%@ include file="home.jsp"%>
			</c:if>


			<!-- Loads only when user clicks About -->
			<c:if test="${userClickAbout == true }">
				<!-- Page Content Loading-->
				<%@ include file="about.jsp"%>
			</c:if>

			<!-- Loads only when user clicks Contact Us -->
			<c:if test="${userClickContact == true }">
				<!-- Page Content Loading-->
				<%@ include file="contact.jsp"%>
			</c:if>

			<!-- Loads only when user clicks View Products -->
			<c:if
				test="${userClickViewProducts == true  or userClickCategoryProducts == true  }">
				<!-- Page Content Loading-->
				<%@ include file="listProducts.jsp"%>
			</c:if>

		</div>
		<!-- FOOTER IS HERE -->

		<%@ include file="./shared/footer.jsp"%>

		<!-- Bootstrap core JavaScript -->
		<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<script
			src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

		<!--  self coded javaScript file -->
		<script src="${js }/myapp.js"></script>
	</div>
</body>

</html>