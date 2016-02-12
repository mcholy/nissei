/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author EDWARD
 */
public class Curso {
   private int idcurso;
   private String nombre;
   private String estado;

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
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

    public Curso() {
    }

    public Curso(int idcurso, String nombre) {
        this.idcurso = idcurso;
        this.nombre = nombre;
    }

    public Curso(int idcurso, String nombre, String estado) {
        this.idcurso = idcurso;
        this.nombre = nombre;
        this.estado = estado;
    }
    public String[] DatostoArray()
    {
        String[] lista= new String[3];
        lista[0]=String.valueOf(idcurso);
        lista[1]=nombre;
        lista[2]=estado;
        return lista;
    }
    
}
