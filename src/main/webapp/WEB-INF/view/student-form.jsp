<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration Form</title>
</head>
<body>

<form:form action="processForm" modelAttribute ="student">

	First Name: <form:input path="firstName" />
	<br></br>

	Last Name: <form:input path="lastName" />
	<br></br>
	
	
	Country: 
	
	<form:select path="country">
		<form:options items= "${theCountryOptions}"/>
	
	</form:select>
	
	
	<br></br>
	
	Favourite Language:
	<form:radiobuttons path="favCodingLang" items="${student.favoriteLanguageOptions}"  />
	
	<br></br>
	
	Operating Systems Familiar with:
	Linux <form:checkbox path="OSfamiliar" value="Linux" />
	MacOS <form:checkbox path="OSfamiliar" value="MacOS" />
	MS Windows <form:checkbox path="OSfamiliar" value="MS" />
	
	
	
	
	<br></br>

	<input type="submit" value="Submit" />
</form:form>

</body>
</html>