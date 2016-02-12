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
public class Matricula {
    private int idmatricula,idalumno,idnivel;
    private String periodo,seccion;
    private Date fecha;
    private String hora;

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

    public int getIdnivel() {
        return idnivel;
    }

    public void setIdnivel(int idnivel) {
        this.idnivel = idnivel;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Matricula() {
    }

    public Matricula(int idmatricula, int idalumno, int idnivel, String periodo, String seccion, Date fecha, String hora) {
        this.idmatricula = idmatricula;
        this.idalumno = idalumno;
        this.idnivel = idnivel;
        this.periodo = periodo;
        this.seccion = seccion;
        this.fecha = fecha;
        this.hora = hora;
    }
    
    
}
