<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
		<div class="hero-unit">
			<h1>Home</h1>
		
			<p>
				<spring:message code="message.welcome"/>
			</p>
			<p><a class="btn btn-primary btn-large" href="http://geowarin.wordpress.com"><spring:message code="message.home.learnMore"/></a></p>
			
		</div>
		
		<div class="row-fluid">
			<div class="span8">
			
				<div id="message" class="alert alert-info">
					<spring:message code="message.home.instructions"/>
				</div>
			
				<form:form id="form" method="post" modelAttribute="formDTO">
			
					<spring:message code="message.typeMessage" var="typeMessage" />
				  	<form:input cssClass="input-block-level" path="messageFromUser" placeholder="${typeMessage}" autocomplete="off" />
			 		
					<form:errors path="messageFromUser" cssClass="alert alert-error" element="div"  />
					
		  			<c:if test="${not empty message}">
						<div id="message" class="alert alert-success">
							<spring:message code="message.youWrote" arguments="${message}" htmlEscape="true" />
						</div>	
					</c:if>
					
				  	<button type="submit" class="btn">Submit</button>
					
				</form:form>
			</div>
		</div>
</body>
</html>