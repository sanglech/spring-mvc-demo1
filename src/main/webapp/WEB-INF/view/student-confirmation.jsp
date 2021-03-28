<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Confirmation</title>
</head>
<body>

The student is confirmed ${student.firstName} ${student.lastName}

<br></br>

Country: ${student.country}
<br></br>

Favourite Lanugage: The students favourite langauge is ${student.favCodingLang}
<br></br>

Familiar OS: 
<ul>
	<c:forEach var ="iter" items ="${student.OSfamiliar }">
	<li>${iter}</li>
	
	</c:forEach>
</ul>

<br></br>
</body>
</html>