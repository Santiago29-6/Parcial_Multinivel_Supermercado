/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Santiago
 */
public class Formulario extends javax.swing.JFrame implements Runnable{
    Thread hilo;
    int a=20;
    public Formulario() {
        initComponents();
        hilo = new Thread(this);
        hilo.start();
    }

    public JComboBox<String> getBoxItemUsuario() {
        return BoxItemUsuario;
    }

    public JLabel getTitulo() {
        return Titulo;
    }

    public void setTitulo(JLabel Titulo) {
        this.Titulo = Titulo;
    }

    public void setBoxItemUsuario(JComboBox<String> BoxItemUsuario) {
        this.BoxItemUsuario = BoxItemUsuario;
    }

    public JButton getBtnIngresar() {
        return BtnIngresar;
    }

    public void setBtnIngresar(JButton BtnIngresar) {
        this.BtnIngresar = BtnIngresar;
    }

    public JPasswordField getTxtContrasena() {
        return TxtContrasena;
    }

    public void setTxtContrasena(JPasswordField TxtContrasena) {
        this.TxtContrasena = TxtContrasena;
    }

    public JTextField getTxtUsuario() {
        return TxtUsuario;
    }

    public JPanel getEscritorio() {
        return Escritorio;
    }

    public void setEscritorio(JPanel Escritorio) {
        this.Escritorio = Escritorio;
    }

    public void setTxtUsuario(JTextField TxtUsuario) {
        this.TxtUsuario = TxtUsuario;
    }
    public void ErrorDatos(){
        JOptionPane.showMessageDialog(null,"Usuario o Clave incorrectos");
    }
    public int Exito(){
        int tem;
        tem=JOptionPane.showConfirmDialog(this, "¿Desea crear un PDF con los registos de ventas?","Confirme:",JOptionPane.YES_NO_OPTION);
        return tem;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tablero = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        Escritorio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JTextField();
        BoxItemUsuario = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        TxtContrasena = new javax.swing.JPasswordField();
        BtnIngresar = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 287, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        Tablero.addTab("Cajero", jPanel1);

        jLabel1.setText("Usuario:");

        TxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUsuarioActionPerformed(evt);
            }
        });

        BoxItemUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Secretaria", " " }));

        jLabel2.setText("Contraseña:");

        BtnIngresar.setText("Ingresar");

        Titulo.setText("Ingreso solo administrativos");

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(BoxItemUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(BtnIngresar))
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(TxtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(Titulo)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TxtUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BoxItemUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BtnIngresar)
                .addGap(22, 22, 22))
        );

        Tablero.addTab("Administrador", Escritorio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tablero)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tablero)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    public void run() {
        int incremento = 10;
        while(true){
            this.Titulo.setBounds(a, 20, 150, 22);
            if(a<5){
                incremento+=10;
            }
            if(a>250){
                incremento-=10;
            }
            try {
                hilo.sleep(300);
            } catch (InterruptedException ex) {
                Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
            }
            a = a+ incremento;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxItemUsuario;
    private javax.swing.JButton BtnIngresar;
    private javax.swing.JPanel Escritorio;
    private javax.swing.JTabbedPane Tablero;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPasswordField TxtContrasena;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
