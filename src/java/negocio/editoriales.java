
package negocio;

import acceso.coneccion;

public class editoriales {
    
    int editorial_id; 
    String nombre, estado, fecha_creacion;
    
    coneccion con;
    
    public editoriales(){
        
        con = new coneccion();
        
        
    }

    public int getEditorial_id() {
        return editorial_id;
    }

    public void setEditorial_id(int editorial_id) {
        this.editorial_id = editorial_id;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
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

    public void insertEditoriales(){
    
    con.setInsert(" insert into editoriales (nombre, fecha_creacion, estado) values ('"+this.getNombre()+"' , '"+this.getFecha_creacion()+"' , 'activo')                                        ");
    
    
    }
    
    public void deleteEditoriales(){
        
    con.setInsert(" update editoriales set estado = 'pasivo' where editorial_id = '"+this.getEditorial_id()+"'       ");    
        
    }

    public void editEditoriales(){
        
        
    con.setInsert(" update editoriales set nombre = '"+this.getNombre()+"' , fecha_creacion= '"+this.getFecha_creacion()+"' where editorial_id = '" +this.getEditorial_id()+"'                         ");    
        
        
    }


}
