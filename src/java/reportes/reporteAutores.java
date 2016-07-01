/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportes;

import acceso.coneccion;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.context.FacesContext;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;

/**
 *
 * @author Alnak
 */
public class reporteAutores {
    
    public void reporteAutores() throws  Exception {
        
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root", "yagami47");
            
       
            JasperReport reporte = (JasperReport) JRLoader.loadObject("C:\\Users\\Alnak\\Documents\\NetBeansProjects\\PruebaJavaWeb\\Autores2.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, null, conexion);
            
            JRExporter exporter = new JRPdfExporter();
            
            exporter.setParameter(JRExporterParameter.JASPER_PRINT,jasperPrint);
            exporter.setParameter(JRExporterParameter.OUTPUT_FILE,new java.io.File("reportePDF.pdf"));
            exporter.exportReport();
      
        
        
   
    
    
    }
}
