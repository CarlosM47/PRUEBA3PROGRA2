<%@page import="acceso.coneccion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Starter Template for Bootstrap</title>

 
    <link href="../template/css/bootstrap.min.css" rel="stylesheet">

    
    <link href="../../assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="starter-template.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Project name</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="#">Home</a></li>
            <li><a href="#about">About</a></li>
            <li><a href="#contact">Contact</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <div class="container">
        <br><br><br>   
        <div class="row">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <h3 class="panel-title">Lista de Usuarios</h3>
                    </div>
                    <div class="panel-body">
                        <br>
                          <form method="post" action="index.jsp">
            Buscar por Nombre:<input type="text" name="buscarPais" ><input type="submit" value="Buscar">
                        </form><br><br>
                        
                        
                        
                        <a href="insert.jsp" class="btn btn-primary">AGREGAR EDITORIAL</a>
                        <br><br><br>
            <table class="table table-condensed table-hover table-bordered">
                            <thead>
                                <th>ID</th>
                                <th>Nombre</th>
                                <th>Creado Por</th>
                                <th>Opciones</th>
                            </thead>            
                        
                        
      
<%
                coneccion con = new coneccion();
                 if (request.getParameter("buscarPais") != null) {
                    if (request.getParameter("buscarPais").isEmpty()) {
                        con.setConsult("select * from paises where estado='activo'");
                    } else {
                        String nombre = request.getParameter("buscarPais");
                        con.setConsult("select * from paises where nombre like '%"+nombre+"%' and estado='activo'");
                    }
                }else{
                    con.setConsult("select * from paises where estado='activo'");
                }
          








%>
          
            
                            
                            
                            
                            
                            
                            
                            
                            
                            <% while (con.getResult().next()) { %>
            <tr>
                <%
                    out.println("<td>" + con.getResult().getString("pais_id") + "</td>");
                    out.println("<td>" + con.getResult().getString("nombre") + "</td>");
                    out.println("<td>" + con.getResult().getString("creado_por") + "</td>");
                   
                    out.println("<td>" + "<a href='../ServletBDD?eliminarPais=" + con.getResult().getString("pais_id") + "' class='btn btn-danger' >Eliminar</a>" + "</td>");
                    out.println("<td>" + "<a href='edit.jsp?pais_id=" + con.getResult().getString("pais_id") + "' class='btn btn-primary'>Editar</a>" + "</td>");
%>

            </tr>
            <% }%>
   
            </table>
                    </div>
            </div>
            </div>
    </div>
    
    
    
    
    
    
    
    
    
    </div><!-- /.container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="../template/js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>