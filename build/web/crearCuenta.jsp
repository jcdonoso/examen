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
        <title>Prestamista | Creación de cuenta</title>
        <style>
            h1{
                color: red;
            }
        </style>
    </head>
    <body>
        <h1>Creación de cuenta</h1>
        <form action="UserController" method="post" class="form-horizontal">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Formulario de creación de cuenta de usuario</h3>
                </div>
                <div class="panel-body">
                    <div class="col-lg-6">
                        <fieldset>
                            <legend>Tipo de usuario:  <input type="radio" name="tipo" value="1" checked> Solicitante
                                <input type="radio" name="tipo" value="2"> Prestador</legend>
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="rut">Rut:</label>
                                <div class="col-sm-10">
                                    <input type="rut" name="rut" class="form-control" id="rut" placeholder="Ingresar rut">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" >Nombre:</label>
                                <div class="col-sm-10">
                                    <input type="text" name="nombre" class="form-control" id="nombre" placeholder="Ingresar nombre">
                                </div>
                            </div>                                
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="email">Email:</label>
                                <div class="col-sm-10">
                                    <input type="text" name="email" class="form-control" id="email" placeholder="Ingresar email">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" >Contraseña:</label>
                                <div class="col-sm-10">
                                    <input type="password" name="contrasena" class="form-control" id="contrasena" placeholder="Ingresar contraseña">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" >Dinero:</label>
                                <div class="col-sm-10">
                                    <input type="text" name="dinero" class="form-control" id="dinero" placeholder="Ingresar dinero">
                                </div>
                            </div>
                            <div class="form-group">
                                <a class="control-label col-sm-2" title="Ya tengo cuenta" href="login.jsp">Ya tengo cuenta</a>
                                  
                                <div class="col-sm-10">
                                    <input type="button" value="Crear cuenta" onclick="this.form.method = 'POST';this.form.submit()"/>
                                     <!--<input type="submit" value="Crear cuenta">-->
                            </div>
                        </fieldset>
                    </div>
                </div>
            </div>
        </form>
    </body>
</html>