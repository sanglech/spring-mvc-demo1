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
	
	Java <form:radiobutton path="favCodingLang" value="Java"/>
	PHP <form:radiobutton path="favCodingLang" value="PHP"/>
	Python <form:radiobutton path="favCodingLang" value="Python"/>
	C++ <form:radiobutton path="favCodingLang" value="C++"/>
	<br></br>

	<input type="submit" value="Submit" />
</form:form>

</body>
</html>