/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.LinkedList;

/**
 *
 * @author EDWARD
 */
public class Nivel {
    private int IdNivel,tutor,cotutor;
    private String grado,orden,nomtutor,nomcotutor;
    private int nrovacantes;
    private String estado;
    public int getIdNivel() {
        return IdNivel;
    }

    public void setIdNivel(int IdNivel) {
        this.IdNivel = IdNivel;
    }

    public int getTutor() {
        return tutor;
    }

    public void setTutor(int tutor) {
        this.tutor = tutor;
    }

    public int getCotutor() {
        return cotutor;
    }

    public void setCotutor(int cotutor) {
        this.cotutor = cotutor;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public int getNrovacantes() {
        return nrovacantes;
    }

    public void setNrovacantes(int nrovacantes) {
        this.nrovacantes = nrovacantes;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    public Nivel() {
    }

    public String getNomtutor() {
        return nomtutor;
    }

    public void setNomtutor(String nomtutor) {
        this.nomtutor = nomtutor;
    }

    public String getNomcotutor() {
        return nomcotutor;
    }

    public void setNomcotutor(String nomcotutor) {
        this.nomcotutor = nomcotutor;
    }

    public Nivel(String grado) {
        this.grado = grado;
    }

    public Nivel(int IdNivel, String grado) {
        this.IdNivel = IdNivel;
        this.grado = grado;
    }
    
    public Nivel(int IdNivel, int tutor, int cotutor, String grado, String orden, int nrovacantes, String estado) {
        this.IdNivel = IdNivel;
        this.tutor = tutor;
        this.cotutor = cotutor;
        this.grado = grado;
        this.orden = orden;
        this.nrovacantes = nrovacantes;
        this.estado = estado;
    }

    public Nivel(int IdNivel, int tutor, String nomtutor, String grado, String orden, int nrovacantes, String estado) {
        this.IdNivel = IdNivel;
        this.tutor = tutor;
        this.grado = grado;
        this.orden = orden;
        this.nomtutor = nomtutor;
        this.nrovacantes = nrovacantes;
        this.estado = estado;
    }
    
    public String[] DatostoArray()
    {
        String[] lista= new String[7];
        lista[0]=String.valueOf(IdNivel);
        lista[1]=String.valueOf(tutor);
        lista[2]=nomtutor;
//        lista[3]=String.valueOf(cotutor);
//        lista[4]=nomcotutor;
        lista[3]=grado;
        lista[4]=orden;
        lista[5]=String.valueOf(nrovacantes);
        lista[6]=estado;
        return lista;
    }
    
}
