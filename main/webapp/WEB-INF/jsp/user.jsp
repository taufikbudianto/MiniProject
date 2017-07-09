<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    jsp d<%@ include file="../layout/mytaglib.jsp" %>
    
<body>
	<table class="table table-bordered table-striped table-hover">
		<thead>
			<tr>User name</tr>
		</thead>
		<tbody>
			<c:forEach items="${varUser}" var="user">
				<tr>
					<td>
						<a href='<spring:url value="/user/${user.id}"></spring:url>'>${user.name}</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>