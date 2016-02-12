/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.sql.Date;
import java.util.LinkedList;

/**
 *
 * @author EDWARD
 */
public class Pago {
    private int idpago,idmatricula;
    private Date fecha;
    private String hora;
    private float total;
    private LinkedList<DetallePago> Lista;

    public int getIdpago() {
        return idpago;
    }

    public void setIdpago(int idpago) {
        this.idpago = idpago;
    }

    public int getIdmatricula() {
        return idmatricula;
    }

    public void setIdmatricula(int idmatricula) {
        this.idmatricula = idmatricula;
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

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Pago() {
    }

    public LinkedList<DetallePago> getLista() {
        return Lista;
    }

    public void setLista(LinkedList<DetallePago> Lista) {
        this.Lista = Lista;
    }

    public Pago(int idpago, int idmatricula, Date fecha, String hora, float total) {
        this.idpago = idpago;
        this.idmatricula = idmatricula;
        this.fecha = fecha;
        this.hora = hora;
        this.total = total;
    }

    public Pago(int idpago, int idmatricula, Date fecha, String hora, float total, LinkedList<DetallePago> Lista) {
        this.idpago = idpago;
        this.idmatricula = idmatricula;
        this.fecha = fecha;
        this.hora = hora;
        this.total = total;
        this.Lista = Lista;
    }
    
    
}
