/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author EDWARD
 */
public class Distrito {
private int id;
   private String nombre;
   private boolean estado;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
   

    
    public Distrito() {
    }

    public Distrito(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Distrito(int id, String nombre,boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
    }
    public String[] DatostoArray()
    {
        String[] lista= new String[3];
        lista[0]=String.valueOf(id);
        lista[1]=nombre;
        return lista;
    }
    
}
