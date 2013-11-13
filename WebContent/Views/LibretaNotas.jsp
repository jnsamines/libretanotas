<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="com.jonathansamines.libretanotas.data.models.Libreta" %>
<%@ page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Libreta de Notas</title>
	</head>
	<body>
		<header>
			<h1>Libreta de Notas</h1>
		</header>
		
		<section id="application-workspace">
			<section id="inner-workspace">
				
				<nav id="libreta">
					<ul>
						<% for( Libreta libreta : (ArrayList<Libreta>)request.getAttribute("libretas")){ %>
							<li>
								<strong><%= libreta.getCodigoLibreta() %></strong><br>
								<span><%= libreta.getNombreLibreta() %></span><br>
								<span><%= libreta.getDescripcion() %></span>
							</li>
						<%} %>
					</ul>
				</nav>
			</section>
		</section>
		
	</body>
</html>
