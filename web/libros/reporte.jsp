
<%@page import="java.io.File"%>
<%@page import="acceso.conreportes" %>
<%@page import="net.sf.jasperreports.engine.*" %>
<%@page import="java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Editoriales</title>
    </head>
    <body>
        <%
            try {
                conreportes cn= new conreportes();
                File reportFile = new File(application.getRealPath("/PruebaJavaWeb/reportes/editoriales.jasper"));
                byte[] bytes = JasperRunManager.runReportToPdf(reportFile.getPath(), null, cn.getConexion());
                response.setContentType("application/pdf");
                response.setContentLength(bytes.length);
                ServletOutputStream outputStream=response.getOutputStream();
                outputStream.write(bytes,0,bytes.length);
                outputStream.flush();
                outputStream.close();
            } catch (Exception ex) {
                out.println("ERROR DE CONEXION ");
            }
        %>
    </body>
</html>
