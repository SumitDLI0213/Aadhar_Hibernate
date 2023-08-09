<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>

		<%

                    session = request.getSession();



                    String s2 = (String) session.getAttribute("name");

                    out.println(s2);

                    String s3 = (String) session.getAttribute("address");

                    out.println(s3);

                    String s4 = (String) session.getAttribute("city");

                    out.println(s3);

                %>

	</h1>
</body>
</html>