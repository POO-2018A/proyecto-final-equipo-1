/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;



import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author ESFOT
 */
public class VentanaInicial extends javax.swing.JFrame {

    /**
     * Creates new form VentanaInicial
     * 
     */
    ArrayList<Object> listaJugadores = new ArrayList<>();
    Controlador controller = new Controlador();
    public VentanaInicial() {
        initComponents();
        // Centering on screen...
        setSize(691,407); 
        listaJugadores=controller.extraerObjetos("jugadores.dat");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIrRegistoJugadores = new javax.swing.JButton();
        btnIrSeleccionJugadores = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnIrRegistoJugadores.setText("Registro Jugadores");
        btnIrRegistoJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrRegistoJugadoresActionPerformed(evt);
            }
        });
        getContentPane().add(btnIrRegistoJugadores);
        btnIrRegistoJugadores.setBounds(280, 70, 144, 83);

        btnIrSeleccionJugadores.setText("Seleccion Jugadores");
        btnIrSeleccionJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrSeleccionJugadoresActionPerformed(evt);
            }
        });
        getContentPane().add(btnIrSeleccionJugadores);
        btnIrSeleccionJugadores.setBounds(280, 240, 140, 84);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 690, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIrSeleccionJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrSeleccionJugadoresActionPerformed
        // TODO add your handling code here:
        if(listaJugadores.size()>1){
            PanelPersonajes jugar= new PanelPersonajes();
            jugar.setVisible(true);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"Debe registrar al menos 2 jugadores");
        }
        
        
    }//GEN-LAST:event_btnIrSeleccionJugadoresActionPerformed

    private void btnIrRegistoJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrRegistoJugadoresActionPerformed
        // TODO add your handling code here:
      
            
        Juego registro= new Juego();
            registro.setVisible(true);
            this.dispose();
        
        
    }//GEN-LAST:event_btnIrRegistoJugadoresActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
  
    {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicial().setVisible(true);
               
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIrRegistoJugadores;
    private javax.swing.JButton btnIrSeleccionJugadores;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    void setVisible(int i, int i0) {
        
        
        throw new UnsupportedOperationException("Not supported yet."); 
        
        

    }
}
