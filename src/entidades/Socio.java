/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.sql.Date;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author EDWARD
 */
public class Socio {
    private int id,iddistrito;
    private String nombre;
    private String apellido;
    private String dni;
    private boolean sexo,estado;
    private Date fechanacimientoimiento;
    private String tipoapoderado, nombreapoderado,telefono,celular,direccion;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIddistrito() {
        return iddistrito;
    }

    public void setIddistrito(int iddistrito) {
        this.iddistrito = iddistrito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Date getFechanacimiento() {
        return fechanacimientoimiento;
    }

    public void setFechanacimiento(Date fechanacimientoimiento) {
        this.fechanacimientoimiento = fechanacimientoimiento;
    }

    public String getTipoapoderado() {
        return tipoapoderado;
    }

    public void setTipoapoderado(String tipoapoderado) {
        this.tipoapoderado = tipoapoderado;
    }

    public String getNombreapoderado() {
        return nombreapoderado;
    }

    public void setNombreapoderado(String nombreapoderado) {
        this.nombreapoderado = nombreapoderado;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
   

   
  

    public Socio() {
    }

 
    public Socio(int id, int iddistrito, String nombre, String apellido, String dni, Boolean sexo, Date fechanacimiento, String tipoapoderado, String nombreapoderado, String telefono, String celular, String direccion, Boolean estado) {
        this.id = id;
        this.iddistrito = iddistrito;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sexo = sexo;
        this.fechanacimientoimiento = fechanacimiento;
        this.tipoapoderado = tipoapoderado; 
        this.nombreapoderado = nombreapoderado;
        this.telefono = telefono;
        this.celular = celular;
        this.direccion = direccion;
        this.estado = estado;
    }
    public String[] DatostoArray()
    {
        String[] lista= new String[11];
        lista[0]=String.valueOf(id);
        lista[1]=nombre;
        lista[2]=apellido;
        lista[3]=dni;
        lista[4]=sexo?"Masculino":"Femenino";
        lista[5]=Formatos.sdtfecha.format(fechanacimientoimiento);
        lista[6]=tipoapoderado;
        lista[7]=nombreapoderado;
        lista[8]=telefono;
        lista[9]=celular;
        lista[10]=direccion;
          return lista;
    }
    
    
    
}
