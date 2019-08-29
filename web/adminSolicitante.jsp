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
        <title>Prestamista | Solicitante</title>
        <style>
            h1{
                color: red;
            }
        </style>
    </head>
    <body>
        <h1>Bienvenido solicitante</h1>
        <form action="adminSolicitanteController" method="get" class="form-horizontal">
            <div class="panel-group">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Información de tu cuenta</h3>
                    </div>
                    <div class="panel-body">
                        <div class="col-lg-6">
                            <fieldset>
                                <div class="form-group">
                                    <legend class="control-label col-sm-2">Nombre:  </legend>
                                    <div class="col-sm-10">
                                        <label class="form-control">JUAN CARLOS</label>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <legend class="control-label col-sm-2">Necesitas:  </legend>
                                    <div class="col-sm-10">
                                        <label class="form-control">100000</label>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <legend class="control-label col-sm-2">Prestamos:  </legend>
                                    <div class="col-sm-10">
                                        <label class="form-control">20000</label>
                                    </div>
                                </div> 
                                <div class="form-group">
                                    <a class="control-label col-sm-2" title="Salir" href="login.jsp">Salir</a>
                                </div>
                            </fieldset>
                        </div>
                    </div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Lista de prestamistas que te han prestado dinero</h3>
                    </div>
                    <div class="panel-body">
                        <div class="col-lg-6">
                            <fieldset>

                            </fieldset>
                        </div>
                    </div>
                </div>
            </div>
        </form>
    </body>
</html>