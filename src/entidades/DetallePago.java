/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author EDWARD
 */
public class DetallePago {
    private int idpago,idconcepto;

    public int getIdpago() {
        return idpago;
    }

    public void setIdpago(int idpago) {
        this.idpago = idpago;
    }

    public int getIdconcepto() {
        return idconcepto;
    }

    public void setIdconcepto(int idconcepto) {
        this.idconcepto = idconcepto;
    }

    public DetallePago() {
    }

    public DetallePago(int idpago, int idconcepto) {
        this.idpago = idpago;
        this.idconcepto = idconcepto;
    }
    
}
