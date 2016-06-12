import acceso.coneccion;
import java.io.*;  
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.*;  
import javax.servlet.http.*;  
  
public class ServletLogin extends HttpServlet  {
    
protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// get request parameters for userID and password
		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");
		
                coneccion con = new coneccion();
                con.setConsult("select usuario, clave from usuarios where estado='activo'");
      
    try {
        while (con.getResult().next()){
            
            if(user.equals(con.getResult().getString("usuario")) && pwd.equals("clave") ){
                
                 HttpSession session=request.getSession();  
                 session.setAttribute("name",user);  
                  response.sendRedirect("main.jsp");
                
            }
            
       
        
        
        
        }
   
    
    
    
    
    
    
    } catch (SQLException ex) {
        Logger.getLogger(ServletLogin.class.getName()).log(Level.SEVERE, null, ex);
    }
                
             
           
                
                
                
                
                
                
                
                
                
                
                
                
                
             
	}
}
      