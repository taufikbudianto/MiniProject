<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<input type="text" name="search" id="search" />
	name : ${user.name}
	
	<c:forEach items="${user.blogs}" var="blog">
		name : ${blog.name} <br/>
		url : ${blog.url} <br/>
		
		
		<c:forEach items="${blog.items}" var="item">
			<p>
				link : ${item.link}<br/>
				published : ${item.publishedDate}<br/>
			</p>
		</c:forEach>
		
	</c:forEach>
</body>

<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.3.min.js">
</script>
<script type="text/javascript">
	$(document).ready(function(){
	 	element = $('#search');
	 	element.on('keyup', function(){
	 		data = element.val();
	 		$.ajax({
	 			type:'GET',
	 			header:{
	 				Accept: "application/json; charset=utf-8",
	 				"Content-Type":"application/json; charset=utf-8",
	 			},
	 			url:'${pageContext.request.contextPath}/ajax/'+data,
	 			success:function(data){
	 				console.log(data);
	 				nama = data.name;
	 				email = data.email;
	 				alert(nama);
	 				alert(email)
	 			},
	 			dataType: 'json'
	 		});
	 	});
	});
</script>
</html>