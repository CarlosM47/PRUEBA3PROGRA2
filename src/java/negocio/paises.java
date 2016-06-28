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
public class paises {
     int pais_id;
     String nombre, creado_por, estado;
     
     coneccion con;
     public paises(){
     
     con = new coneccion();
     
 }

    public int getPais_id() {
        return pais_id;
    }

    public void setPais_id(int pais_id) {
        this.pais_id = pais_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCreado_por() {
        return creado_por;
    }

    public void setCreado_por(String creado_por) {
        this.creado_por = creado_por;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
   
     
    public void insertPaises(){
    
    con.setInsert("insert into paises (nombre, estado, creado_por, pais_id) values ('"+this.getNombre()+"' , 'activo' , '"+this.getCreado_por()+"' , '"+this.getPais_id()+"')            ");
    
    
    }
    
    public void deletePaises(){
        
    con.setInsert("update paises set estado = 'pasivo' where pais_id = '"+this.getPais_id()+"'                              ");    
        
    }

    public void editPaises(){

    con.setInsert("update paises set nombre = '"+this.getNombre()+"' , creado_por= '"+this.getCreado_por()+"' where pais_id = '"+this.getPais_id()+"'                                                                                    ");                             
    }











}
