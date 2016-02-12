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
public class ListaMatricula {
    private int idmatricula;
    private int idalumno;
    private String nombres,nivel,seccion;
    private Date fechanac;
    private String nomapoderado;

    public int getIdmatricula() {
        return idmatricula;
    }

    public void setIdmatricula(int idmatricula) {
        this.idmatricula = idmatricula;
    }

    public int getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(int idalumno) {
        this.idalumno = idalumno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public Date getFechanac() {
        return fechanac;
    }

    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }

    public String getNomapoderado() {
        return nomapoderado;
    }

    public void setNomapoderado(String nomapoderado) {
        this.nomapoderado = nomapoderado;
    }

    public ListaMatricula() {
    }
    
    public ListaMatricula(int idmatricula, int idalumno, String nombres, String nivel, String seccion, Date fechanac, String nomapoderado) {
        this.idmatricula = idmatricula;
        this.idalumno = idalumno;
        this.nombres = nombres;
        this.nivel = nivel;
        this.seccion = seccion;
        this.fechanac = fechanac;
        this.nomapoderado = nomapoderado;
    }
    public String[] DatostoArray()
    {
        String[] aux= new String[7];
        aux[0]=String.valueOf(idmatricula);
        aux[1]=String.valueOf(idalumno);
        aux[2]=nombres;
        aux[3]=nivel;
        aux[4]=seccion;
        aux[5]=Formatos.sdtfecha.format(fechanac);
        aux[6]=nomapoderado;
        return aux;
    }
    
}
