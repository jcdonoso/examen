
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<%
    // resive la sesion
    HttpSession sesionOk = request.getSession();
    //si la sesion no existe redirecciona al index
    if (sesionOk.getAttribute("email") == null) {
        response.sendRedirect("index.jsp");
    }
    String usuario = (String) sesionOk.getAttribute("email");
%>

<h1>hola usuario <%= usuario%> bienvenido</h1>

<form action="ListUsers" method="get">
<input type="submit" value="Listar">
</form>
<form action="Logout" method="get">
    <input type="submit" value="cerrar sesion">
</form>
</body>
</html>
