/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author EDWARD
 */
public class Usuario {
    private int id;
    private String nombre;
    private String contrasenia;
    private String dni;
    private String tipo;
    private Boolean estado;
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

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Boolean isEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    

    public Usuario() {
    }

    public Usuario(int id, String nombre, String contrasenia,String dni, String tipo,Boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.dni = dni;
        this.tipo = tipo;
        this.estado = estado;
    }
    public String[] DatostoArray()
    {
        String[] lista= new String[4];
        lista[0]=String.valueOf(id);
        lista[1]=nombre;
        lista[2]=contrasenia;
        lista[3]=tipo;
        return lista;
    }
    
    
}
