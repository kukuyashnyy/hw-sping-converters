<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
<%--    <input hidden name="id" value="10">--%>
    <label>First Name</label>
    <input name="firstName" placeholder="First Name" />
    <br/>
    <label>Last Name</label>
    <input name="lastName" placeholder="Last Name" />
    <br/>
    <label>Birth of Date</label>
    <input name="dateOfBirth" type="date" placeholder="First Name" />
    <br/>
    <label>Stipendia</label>
    <input type="number" name="stipendia"/>
    <br/>
    <label>Gender</label>
    <select name="gender">
        <option value="m">Male</option>
        <option value="f">Female</option>
        <option value="u">Unknown</option>
    </select>
    <br/>
    <input type="submit">
</form>

</body>
</html>
