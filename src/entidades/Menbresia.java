/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.sql.Date;

/**
 *
 * @author EDWARD
 */
public class Menbresia {
    private int id;
    private String nombre,descripcion;
    private float inicial,mensualidad;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getInicial() {
        return inicial;
    }

    public void setInicial(float inicial) {
        this.inicial = inicial;
    }

    public float getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(float mensualidad) {
        this.mensualidad = mensualidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    

    public Menbresia() {
    }

    public Menbresia(int id, String nombre, float inicial,float mensualidad, String descripcion, boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.inicial = inicial;
        this.mensualidad = mensualidad;
        this.descripcion = descripcion;
        this.estado = estado;
    }
    public String[] DatostoArray()
    {
        String[] lista= new String[5];
        lista[0]=String.valueOf(id);
        lista[1]=nombre;
        lista[2]=String.valueOf(inicial);
        lista[3]=String.valueOf(mensualidad);
        lista[4]=descripcion;
        return lista;
    }
    
}
