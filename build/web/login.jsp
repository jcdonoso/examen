<%-- 
    Document   : login
    Created on : 26-08-2019, 16:37:02
    Author     : jcarlos
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <title> Login | Financiera Prestamista</title>
        <style>
            h1{
                color: red;
            }
        </style>
    </head>
    <body>
        <%
            String mensaje = (String) session.getAttribute("mensaje");
            if (mensaje != null) {
                out.print("<h2>" + mensaje + "</h2>");
                session.setAttribute("mensaje", null);
            }
           
        %>
        <h1>Acceso a Financiera Prestamista</h1>
        <h3>Autentificación</h3>
        <div class="row">
            <div style="padding: 20px;" class="col-lg-16">
                <form action="LoginController" method="post">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h3 class="panel-title">Bienvenido</h3>
                        </div>
                        <div class="panel-body">
                            <div class="col-lg-6">
                                <fieldset>
                                    <legend>Login</legend>
                                    <div class="col-lg-6">
                                        <div class="form-group">
                                            <label>Rut: </label>
                                            <input type="text" name="rut" id="rut"  class="form-control input-sm"  placeholder="Ingresar rut" />
                                        </div>
                                    </div>
                                    <div class="col-lg-6">
                                        <div class="form-group">
                                            <label>Contraseña: </label>
                                            <input type="password" name="contrasena" id="contrasena" class="form-control input-sm" placeholder="Ingresar  contraseña" />
                                        </div>
                                    </div>
                                    <div class="col-lg-16">
                                        <div class="form-group">
                                            <!--<a title="Crear cuenta" href="crearCuenta.jsp">Crear cuenta</a>-->
                                            <a title="Crear cuenta" href="crearCuenta.jsp">Crear cuenta</a>
                                            <input type="submit" class="btn btn-success" value="Ingresar" />
                                        </div>
                                    </div>
                                    <div class="col-lg-16">
                                        <div class="form-group">
                                            <!--<input type="submit" class="btn btn-success" value="Ingresar" />-->
                                        </div>
                                    </div>
                                </fieldset>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
