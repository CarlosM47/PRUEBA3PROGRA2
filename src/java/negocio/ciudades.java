
package negocio;

import acceso.coneccion;

public class ciudades {
    
    int ciudad_id, pais_id;
    String nombre, estado, creado_por;
    
    coneccion con;
    
    public ciudades(){
     
     con = new coneccion();
     
 }

    public int getCiudad_id() {
        return ciudad_id;
    }

    public void setCiudad_id(int ciudad_id) {
        this.ciudad_id = ciudad_id;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCreado_por() {
        return creado_por;
    }

    public void setCreado_por(String creado_por) {
        this.creado_por = creado_por;
    }
    
     public void insertCiudades(){
    
    con.setInsert("insert into ciudades (nombre, estado, creado_por, pais_id) values ('"+this.getNombre()+"', 'activo' , '"+this.getCreado_por()+"' , '"+this.getPais_id()+"')           ");
    
    
    }
    
    public void deleteCiudades(){
        
    con.setInsert("update ciudades set estado= 'pasivo' where ciudad_id = '"+this.getCiudad_id()+"'                              ");    
        
    }

    public void editCiudades(){

    con.setInsert("update ciudades set nombre= '"+this.getNombre()+"' , creado_por= '"+this.getCreado_por()+"' , pais_id = '"+this.getPais_id()+"' where ciudad_id = '"+this.getCiudad_id()+"'                                                                                  ");                             
    }















}
