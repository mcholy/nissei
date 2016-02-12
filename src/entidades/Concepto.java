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
public class Concepto {
    private int idconcepto;
    private String nombre;
    private Date fechavencimiento;
    private float precio;
    private String estado;

    public int getIdconcepto() {
        return idconcepto;
    }

    public void setIdconcepto(int idconcepto) {
        this.idconcepto = idconcepto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechavencimiento() {
        return fechavencimiento;
    }

    public void setFechavencimiento(Date fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Concepto() {
    }

    public Concepto(int idconcepto, String nombre, Date fechavencimiento, float precio, String estado) {
        this.idconcepto = idconcepto;
        this.nombre = nombre;
        this.fechavencimiento = fechavencimiento;
        this.precio = precio;
        this.estado = estado;
    }
    public String[] DatostoArray()
    {
        String[] lista= new String[5];
        lista[0]=String.valueOf(idconcepto);
        lista[1]=nombre;
        lista[2]=Formatos.sdtfecha.format(fechavencimiento);
        lista[3]=String.valueOf(precio);
        lista[4]=estado;
        return lista;
    }
    
}
