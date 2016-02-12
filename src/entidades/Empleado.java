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
public class Empleado {
    private int idempleado;
    private String nombres;
    private String apellidos;
    private String dni;
    private String sexo;
    private Date fechanac;
    private String telefono,celular,direccion,distrito,cargo,especialidad,estado;

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public Date getFechanac() {
        return fechanac;
    }

    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Empleado() {
    }

    public Empleado(int idempleado, String nombres, String apellidos, String dni, String sexo, Date fechanac, String telefono, String celular, String direccion, String distrito, String cargo, String especialidad, String estado) {
        this.idempleado = idempleado;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.sexo = sexo;
        this.fechanac = fechanac;
        this.telefono = telefono;
        this.celular = celular;
        this.direccion = direccion;
        this.distrito = distrito;
        this.cargo = cargo;
        this.especialidad = especialidad;
        this.estado = estado;
    }
    public String[] DatostoArray()
    {
        String[] lista= new String[13];
        lista[0]=String.valueOf(idempleado);
        lista[1]=nombres;
        lista[2]=apellidos;
        lista[3]=dni;
        lista[4]=sexo;
        lista[5]=Formatos.sdtfecha.format(fechanac);
        lista[6]=telefono;
        lista[7]=celular;
        lista[8]=direccion;
        lista[9]=distrito;
        lista[10]=cargo;
        lista[11]=especialidad;
        lista[12]=estado;
        return lista;
    }
    
    
    
}
