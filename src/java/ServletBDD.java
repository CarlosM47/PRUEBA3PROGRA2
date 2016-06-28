

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.autor;
import negocio.ciudades;
import negocio.editoriales;
import negocio.libros;
import negocio.paises;
import negocio.usuarios;


public class ServletBDD extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           if(request.getParameter("eliminar")!=null){
               int id=Integer.parseInt(request.getParameter("eliminar"));
                 out.println("Eliminar ID:"+id);
               //CREO UN OBJETO USARIO
                autor aut=new autor();
               //ASIGNO LA ID
                aut.setAutor_id(id);
                //ELIMINO USAURIO
                aut.deleteAutor();
                //REDIRECCIONO A INDEX
                response.sendRedirect("index.jsp");
           
           }  else if(request.getParameter("guardar")!=null){
                String nombre=request.getParameter("nombre");
                String apepat=request.getParameter("apepat");
                String apemat=request.getParameter("apemat");
                String fecha_nacimiento=request.getParameter("fecha_nacimiento");
             
                autor au=new autor();
                au.setNombre(nombre);
                au.setApepat(apepat);
                au.setApemat(apemat);
                au.setFecha_nacimiento(fecha_nacimiento);
                au.insertAutor();
                
                //REDIRECCIONAR A INDEX.JSP DeSPUES DE GUARDAR
                response.sendRedirect("index.jsp");
           
           
           } else if(request.getParameter("editar")!=null){
                int autor_id=Integer.parseInt(request.getParameter("autor_id"));
                String nombre=request.getParameter("nombre");
                String apepat=request.getParameter("apepat");
                String apemat=request.getParameter("apemat");
                String fecha_nacimiento=request.getParameter("fecha_nacimiento");
                
                autor au=new autor();
                au.setAutor_id(autor_id);
                au.setNombre(nombre);
                au.setApepat(apepat);
                au.setApemat(apemat);
                au.setFecha_nacimiento(fecha_nacimiento);
               
                au.editAutor();
                 response.sendRedirect("index.jsp");
                 
             }
           
           else if (request.getParameter("eliminarEditorial")!=null){
               int id=Integer.parseInt(request.getParameter("eliminarEditorial"));
                 out.println("Eliminar ID:"+id);
               //CREO UN OBJETO USARIO
                editoriales edit=new editoriales();
               //ASIGNO LA ID
                edit.setEditorial_id(id);
                //ELIMINO USAURIO
                edit.deleteEditoriales();
                //REDIRECCIONO A INDEX
                response.sendRedirect("index.jsp");
               
               
               
           } else if(request.getParameter("guardarEditorial")!=null){ 
               String nombre=request.getParameter("nombre");
                String fecha_creacion=request.getParameter("fecha_creacion");
             
                editoriales edit=new editoriales();
                edit.setNombre(nombre);
                edit.setFecha_creacion(fecha_creacion);
               
                edit.insertEditoriales();
                //REDIRECCIONAR A INDEX.JSP DeSPUES DE GUARDAR
                response.sendRedirect("index.jsp");
               
               
           }else if(request.getParameter("editarEditorial")!=null){
               
               int editorial_id=Integer.parseInt(request.getParameter("editorial_id"));
                String nombre=request.getParameter("nombre");
                String fecha_creacion=request.getParameter("fecha_creacion");
                
                editoriales edit=new editoriales();
                edit.setEditorial_id(editorial_id);
                edit.setNombre(nombre);
                edit.setFecha_creacion(fecha_creacion);
               
                edit.editEditoriales();
                 response.sendRedirect("index.jsp");
                 
             }
               
           else if (request.getParameter("eliminarUsuario")!=null){
               int id=Integer.parseInt(request.getParameter("eliminarUsuario"));
                 out.println("Eliminar ID:"+id);
               //CREO UN OBJETO USARIO
                usuarios usu=new usuarios();
               //ASIGNO LA ID
                usu.setUsuario_id(id);
                //ELIMINO USAURIO
                usu.deleteUsuarios();
                //REDIRECCIONO A INDEX
                response.sendRedirect("index.jsp");
         
          }else if (request.getParameter("guardarUsuario")!=null){
                String usuario=request.getParameter("usuario");
                String clave=request.getParameter("clave");
                String fecha_nacimiento=request.getParameter("fecha_nacimiento");
             
                usuarios usu=new usuarios();
                
                usu.setUsuario(usuario);
                usu.setClave(clave);
                usu.setFecha_nacimiento(fecha_nacimiento);
               
                usu.insertUsuarios();
                //REDIRECCIONAR A INDEX.JSP DeSPUES DE GUARDAR
                response.sendRedirect("index.jsp");
           
           
           }  else if(request.getParameter("editarUsuario")!=null){
                int usuario_id=Integer.parseInt(request.getParameter("usuario_id"));
                String usuario=request.getParameter("usuario");
                String clave=request.getParameter("clave");
                String fecha_nacimiento=request.getParameter("fecha_nacimiento");
                
                usuarios usu=new usuarios();
              
                usu.setUsuario_id(usuario_id);
                usu.setUsuario(usuario);
                usu.setClave(clave);
                usu.setFecha_nacimiento(fecha_nacimiento);
                
                usu.editUsuarios();
                        
                
                
                
                 response.sendRedirect("index.jsp");
                 
             }
           
           else if (request.getParameter("eliminarLibro")!=null){
               int id=Integer.parseInt(request.getParameter("eliminarLibro"));
                 out.println("Eliminar ID:"+id);
               //CREO UN OBJETO USARIO
                libros lib=new libros();
               //ASIGNO LA ID
                lib.setLibro_id(id);
                //ELIMINO USAURIO
                lib.deleteLibros();
                //REDIRECCIONO A INDEX
                response.sendRedirect("index.jsp");
           }
           else if (request.getParameter("guardarLibro")!=null){
                String nombre=request.getParameter("nombre");
                String fecha_creacion=request.getParameter("fecha_creacion");
                int autor_id=Integer.parseInt(request.getParameter("autor_id"));
                int editorial_id=Integer.parseInt(request.getParameter("editorial_id"));
                String usuario=request.getParameter("usuario");
             
                libros lib=new libros();
                lib.setNombre(nombre);
                lib.setFecha_creacion(fecha_creacion);
                lib.setAutor_id(autor_id);
                lib.setEditorial_id(editorial_id);
                lib.setUsuario(usuario);
                
                
                lib.insertLibros();
                //REDIRECCIONAR A INDEX.JSP DeSPUES DE GUARDAR
                response.sendRedirect("index.jsp");
           
           
           } else if(request.getParameter("editarLibro")!=null){
                int libro_id=Integer.parseInt(request.getParameter("libro_id"));
                String nombre=request.getParameter("nombre");
                String fecha_creacion=request.getParameter("fecha_creacion");
                int autor_id=Integer.parseInt(request.getParameter("autor_id"));
                int editorial_id=Integer.parseInt(request.getParameter("editorial_id"));
                String usuario=request.getParameter("usuario");
                
                libros lib=new libros();
                lib.setLibro_id(libro_id);
                lib.setNombre(nombre);
                lib.setFecha_creacion(fecha_creacion);
                lib.setAutor_id(autor_id);
                lib.setEditorial_id(editorial_id);
                lib.setUsuario(usuario);
                
                
               
                lib.editLibros();
                 response.sendRedirect("index.jsp");
                 
             } else if (request.getParameter("eliminarPais")!=null){
               int id=Integer.parseInt(request.getParameter("eliminarPais"));
                 out.println("Eliminar ID:"+id);
               //CREO UN OBJETO USARIO
                paises pa=new paises();
               //ASIGNO LA ID
                pa.setPais_id(id);
                //ELIMINO USAURIO
                pa.deletePaises();
                //REDIRECCIONO A INDEX
                response.sendRedirect("index.jsp");
         
          }else if (request.getParameter("guardarPais")!=null){
                String nombre=request.getParameter("nombre");
                String creado_por=request.getParameter("creado_por");
               
                
             
                paises pa=new paises();
                pa.setNombre(nombre);
                pa.setCreado_por(creado_por);
                
                
                
                pa.insertPaises();
                //REDIRECCIONAR A INDEX.JSP DeSPUES DE GUARDAR
                response.sendRedirect("index.jsp");
           
           
           }else if(request.getParameter("editarPais")!=null){
               
               int pais_id=Integer.parseInt(request.getParameter("pais_id"));
                String nombre=request.getParameter("nombre");
                String creado_por=request.getParameter("creado_por");
                
                paises pa=new paises();
                pa.setPais_id(pais_id);
                pa.setNombre(nombre);
                pa.setCreado_por(creado_por);
                
               
                pa.editPaises();
                 response.sendRedirect("index.jsp");
                 
             }  else if (request.getParameter("eliminarCiudad")!=null){
               int id=Integer.parseInt(request.getParameter("eliminarCiudad"));
                 out.println("Eliminar ID:"+id);
               //CREO UN OBJETO USARIO
                ciudades ciu=new ciudades();
               //ASIGNO LA ID
                ciu.setCiudad_id(id);
                //ELIMINO USAURIO
                ciu.deleteCiudades();
                //REDIRECCIONO A INDEX
                response.sendRedirect("index.jsp");
         
          } else if (request.getParameter("guardarCiudad")!=null){
                String nombre=request.getParameter("nombre");
                String creado_por=request.getParameter("creado_por");
                int pais_id=Integer.parseInt(request.getParameter("pais_id"));
                
             
                ciudades ciu=new ciudades();
                ciu.setNombre(nombre);
                ciu.setCreado_por(creado_por);
                ciu.setPais_id(pais_id);
                
                
                ciu.insertCiudades();
                //REDIRECCIONAR A INDEX.JSP DeSPUES DE GUARDAR
                response.sendRedirect("index.jsp");
           
           
           }else if(request.getParameter("editarCiudad")!=null){
               
               int ciudad_id=Integer.parseInt(request.getParameter("ciudad_id"));
                String nombre=request.getParameter("nombre");
                String creado_por=request.getParameter("creado_por");
                int pais_id=Integer.parseInt(request.getParameter("pais_id"));
                
                ciudades ciu=new ciudades();
                ciu.setNombre(nombre);
                ciu.setCreado_por(creado_por);
                ciu.setPais_id(pais_id);
                ciu.setCiudad_id(ciudad_id);
               
                ciu.editCiudades();
                 response.sendRedirect("index.jsp");
                 
             }
        
        
        
        
        
        
        
        
        
        
        
        }
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
        }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

