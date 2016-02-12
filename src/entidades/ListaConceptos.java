/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author EDWARD
 */
public class ListaConceptos {
    private int idconcepto;
    private String nombre;
    private float importe;

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

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public ListaConceptos() {
    }

    public ListaConceptos(int idconcepto, String nombre, float importe) {
        this.idconcepto = idconcepto;
        this.nombre = nombre;
        this.importe = importe;
    }
    
    public String[] DatostoArray()
    {
        String[] lista= new String[3];
        lista[0]=String.valueOf(idconcepto);
        lista[1]=nombre;
        lista[2]=Formatos.dfreales.format(importe);
        return lista;
    }
}
