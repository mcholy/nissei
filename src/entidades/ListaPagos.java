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
public class ListaPagos {
    private String nombres,dni,nivel,concepto;
    private Date fecha;

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ListaPagos() {
    }

    public ListaPagos(String nombres, String dni, String nivel, String concepto, Date fecha) {
        this.nombres = nombres;
        this.dni = dni;
        this.nivel = nivel;
        this.concepto = concepto;
        this.fecha = fecha;
    }
   public String[] DatostoArray()
    {
        String[] lista= new String[5];
        lista[0]=nombres;
        lista[1]=dni;
        lista[2]=nivel;
        lista[3]=concepto;
        lista[4]=Formatos.sdtfecha.format(fecha);
        return lista;
    } 
}
