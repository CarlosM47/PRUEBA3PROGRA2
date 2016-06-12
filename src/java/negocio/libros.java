/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import acceso.coneccion;

/**
 *
 * @author Alnak
 */
public class libros {
    
 int libro_id ,  autor_id, editorial_id;
 String nombre, estado, usuario, fecha_creacion;
 
 coneccion con;
 
 public libros(){
     
     con = new coneccion();
     
 }

    public int getLibro_id() {
        return libro_id;
    }

    public void setLibro_id(int libro_id) {
        this.libro_id = libro_id;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public int getAutor_id() {
        return autor_id;
    }

    public void setAutor_id(int autor_id) {
        this.autor_id = autor_id;
    }

    public int getEditorial_id() {
        return editorial_id;
    }

    public void setEditorial_id(int editorial_id) {
        this.editorial_id = editorial_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void insertLibros(){
    
    con.setInsert(" insert into libros (nombre, fecha_creacion, estado, autor_id, editorial_id, usuario) values ('"+this.getNombre()+"' , '"+this.getFecha_creacion()+"' , 'activo' , '"+this.getAutor_id()+"' , '"+this.getEditorial_id()+"' , '" +this.getUsuario()+"')                        ");
    
    
    }
    
    public void deleteLibros(){
        
    con.setInsert(" update libros set estado = 'pasivo' where libro_id = '"+this.getLibro_id()+"'                 ");    
        
    }
    
    public void editLibros(){
        
        
    con.setInsert (" update libros set nombre = '"+this.getNombre()+"' , fecha_creacion= '"+this.getFecha_creacion()+"' ,  autor_id= '"+this.getAutor_id()+"' , editorial_id= '"+this.getEditorial_id()+"', usuario = '"+this.getUsuario()+"' where libro_id = '"+this.getLibro_id()+"'                                                                                   ");    
        
        
    }
    
    
    
}
