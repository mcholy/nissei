/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sisnisei;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author XmN
 */
public class Sisnisei {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            //modelo
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            Ingreso f = new Ingreso();
            //que aparezca maximizado
            f.setLocationRelativeTo(null);
            f.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
}