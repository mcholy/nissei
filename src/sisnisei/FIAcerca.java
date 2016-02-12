/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sisnisei;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
/**
 *
 * @author EDWARD
 */
public class FIAcerca extends javax.swing.JInternalFrame {

    /**
     * Creates new form FIAcerca
     */
    public FIAcerca() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Acerca de...");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Sistema de matriculas y control de pagos desarrollado por");

        jLabel2.setText("Edward Rojas Alfaro");

        jLabel3.setText("Celular: 978512583");

        jLabel4.setText("Correo: fake_51@hotmail.com");

        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("Canal de Youtube");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        
    }//GEN-LAST:event_formInternalFrameOpened

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        try {
            Runtime.getRuntime().exec( "rundll32 url.dll,FileProtocolHandler https://www.youtube.com/user/fakegod71" );
        } catch (IOException ex) {
            Logger.getLogger(FIAcerca.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        this.setCursor(Cursor.getPredefinedCursor( Cursor.HAND_CURSOR ));
    }//GEN-LAST:event_jLabel5MouseEntered

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
class JLabelLink extends JLabel{

    private String text="";
    private String TextLink=null;
    private URI uri;

    public JLabelLink(){
        super();
        this.setCursor(Cursor.getPredefinedCursor( Cursor.HAND_CURSOR ));
        this.setPreferredSize( new Dimension(34,14) );
        this.setVisible(true);
        //Eventos del raton sobre el JLabel
        addMouseListener(new MouseAdapter() {
            @Override
                public void mouseClicked(MouseEvent e) {
                    Abrir_URL(uri);
                }
            @Override
                public void mouseEntered(MouseEvent e) {
                    setText(text,false);
                }
            @Override
                public void mouseExited(MouseEvent e) {
                    setText(text,true); repaint();
                }
        });

    }

    /**
 * Coloca la dirección web
 */
    public void setLink( String link )
    {        
        try {
            uri = new URI(link);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    /**
 * Coloca el texto que contiene el enlace web
 */
    public void setTextLink( String texto )
    {
        this.TextLink = texto;
    }

    /**
 * Se sobreescribe metodo
 */
    @Override
    public void setText( String value ){                
        setText(  value ,false );
    }

    /**
 * Retorna el texto sin las etiquetas HTML
 */
    public String getTextSinFormato(){
        return text;
    }

    /**
 * Da formato al texto para añadir las etiquetas HTML necesarias
 */
    private void setText(String text, boolean inout){
        //Estilo CSS
        String css = "<style type='text/css'>"
                + ".link {text-decoration: none;font-weight: bold;color:#000000;}"
                + ".link_hover{color:rgb(255,0,0);text-decoration:underline;}"
                + "</style>";

        //estilo css segun el mouse este dentro o fuera
        String clase = (inout)? "link":"link_hover";
        //forma el texto HTML
        String html_text = (TextLink!=null)?text.replace(TextLink, "<span class='"+clase+"' >" +TextLink + "</span>"):text;        
        //coloca al padre
        super.setText("<html>"+ css +"<span>"+ html_text + "<span/></html>");

        this.text = text;
    }

    /**
 * Abre enlace web en el navegador
 */
    private void Abrir_URL(URI uri) {
      if (Desktop.isDesktopSupported()) {
          Desktop desktop = Desktop.getDesktop();
          try {
             desktop.browse(uri);
          } catch (IOException e) {
             System.err.println("Error: No se pudo abrir el enlace" + e.getMessage() );
          }
      } else {
          System.err.println("Error: Error de compatibilidad en la plataforma actual. No se puede abrir enlaces web.");
      }
    }

}
