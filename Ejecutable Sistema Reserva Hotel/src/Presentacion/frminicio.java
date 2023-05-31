/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package Presentacion;

/**
 *
 * @author LENOVO
 */
public class frminicio extends javax.swing.JFrame {

    /**
     * Creates new form frminicio
     */
    public frminicio() {
        initComponents();
        this.setExtendedState(frminicio.MAXIMIZED_BOTH);
        this.setTitle("Sistema de Reserva de Habitaciones y Gestion de Ventas - Hotel Paraiso");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        lblidpersona = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        lblamaterno = new javax.swing.JLabel();
        lblapaterno = new javax.swing.JLabel();
        lblacceso = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        mnusisreserva = new javax.swing.JMenu();
        mnuarchivo = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        mnureserva = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuconsultas = new javax.swing.JMenu();
        muconfiguraciones = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnuherramientas = new javax.swing.JMenu();
        mnuayuda = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        mnusalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(51, 255, 255));

        lblidpersona.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblidpersona.setForeground(new java.awt.Color(255, 255, 255));
        lblidpersona.setText("jLabel1");
        escritorio.add(lblidpersona);
        lblidpersona.setBounds(20, 20, 160, 40);

        lblnombre.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblnombre.setForeground(new java.awt.Color(255, 255, 255));
        lblnombre.setText("jLabel2");
        escritorio.add(lblnombre);
        lblnombre.setBounds(20, 50, 160, 40);

        lblamaterno.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblamaterno.setForeground(new java.awt.Color(255, 255, 255));
        lblamaterno.setText("jLabel3");
        escritorio.add(lblamaterno);
        lblamaterno.setBounds(20, 80, 160, 40);

        lblapaterno.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblapaterno.setForeground(new java.awt.Color(255, 255, 255));
        lblapaterno.setText("jLabel4");
        escritorio.add(lblapaterno);
        lblapaterno.setBounds(20, 110, 160, 40);

        lblacceso.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblacceso.setForeground(new java.awt.Color(255, 255, 255));
        lblacceso.setText("jLabel5");
        escritorio.add(lblacceso);
        lblacceso.setBounds(20, 140, 160, 40);

        mnusisreserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/inicio.png"))); // NOI18N
        mnusisreserva.setMnemonic('f');
        mnusisreserva.setText("Sisreserva");
        menuBar.add(mnusisreserva);

        mnuarchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Archivo.png"))); // NOI18N
        mnuarchivo.setMnemonic('e');
        mnuarchivo.setText("Archivo");

        cutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/habitaciones.png"))); // NOI18N
        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Habitaciones");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        mnuarchivo.add(cutMenuItem);

        copyMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        copyMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/productos.png"))); // NOI18N
        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Productos");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        mnuarchivo.add(copyMenuItem);

        menuBar.add(mnuarchivo);

        mnureserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/reserva.png"))); // NOI18N
        mnureserva.setMnemonic('h');
        mnureserva.setText("Reservas");

        contentMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        contentMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/reserva consumos.png"))); // NOI18N
        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Reservas y consumos");
        contentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentMenuItemActionPerformed(evt);
            }
        });
        mnureserva.add(contentMenuItem);

        aboutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        aboutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/clientes.png"))); // NOI18N
        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Clientes");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        mnureserva.add(aboutMenuItem);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/pagos.png"))); // NOI18N
        jMenuItem1.setText("Pagos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnureserva.add(jMenuItem1);

        menuBar.add(mnureserva);

        mnuconsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/consulta.png"))); // NOI18N
        mnuconsultas.setText("Consultas");
        menuBar.add(mnuconsultas);

        muconfiguraciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/configuraciones.png"))); // NOI18N
        muconfiguraciones.setText("Configuraciones");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/trabajadores.png"))); // NOI18N
        jMenuItem2.setText("Usuarios  y Accesos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        muconfiguraciones.add(jMenuItem2);

        menuBar.add(muconfiguraciones);

        mnuherramientas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/herramientas.png"))); // NOI18N
        mnuherramientas.setText("Herramientas");
        menuBar.add(mnuherramientas);

        mnuayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/ayuda.png"))); // NOI18N
        mnuayuda.setText("Ayuda");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("Acerca de...");
        mnuayuda.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setText("Ayuda");
        mnuayuda.add(jMenuItem4);

        menuBar.add(mnuayuda);

        mnusalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/salir.png"))); // NOI18N
        mnusalir.setText("Salir");
        mnusalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnusalirMouseClicked(evt);
            }
        });
        menuBar.add(mnusalir);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed
        // TODO add your handling code here:
        //crear objeto que haga instancia a frm habitacion
        frmhabitacion form = new frmhabitacion();
        escritorio.add(form);
        //el objeto estara alfrente
        form.toFront();
        // el objeto si esta invisisble se vuelva visible
        form.setVisible(true);
        
        
        
    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed

  // TODO add your handling code here:
        //crear objeto que haga instancia a frm habitacion
        frmproducto form = new frmproducto();
        escritorio.add(form);
        //el objeto estara alfrente
        form.toFront();
        // el objeto si esta invisisble se vuelva visible
        form.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_copyMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
         // TODO add your handling code here:
        //crear objeto que haga instancia a frm habitacion
        frmcliente form = new frmcliente();
        escritorio.add(form);
        //el objeto estara alfrente
        form.toFront();
        // el objeto si esta invisisble se vuelva visible
        form.setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
         // TODO add your handling code here:
        //crear objeto que haga instancia a frm habitacion
        frmtrabajador form = new frmtrabajador();
        escritorio.add(form);
        //el objeto estara alfrente
        form.toFront();
        // el objeto si esta invisisble se vuelva visible
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void mnusalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnusalirMouseClicked
       this.dispose();
    }//GEN-LAST:event_mnusalirMouseClicked

    private void contentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItemActionPerformed
        frmreserva form = new frmreserva();
        escritorio.add(form);
        //el objeto estara alfrente
        form.toFront();
        // el objeto si esta invisisble se vuelva visible
      
        form.setVisible(true);
        //mostrar el usuario en txttrabjador e idtrabajador
        frmreserva.txtidtrabajador.setText(lblidpersona.getText());
        frmreserva.txttrabajador.setText(lblnombre.getText()+" "+ lblamaterno.getText());
        frmreserva.idusuario= Integer.parseInt(lblidpersona.getText());
        
    }//GEN-LAST:event_contentMenuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
        frmpago form = new frmpago();
        escritorio.add(form);
        //el objeto estara alfrente
        form.toFront();
        // el objeto si esta invisisble se vuelva visible
        form.setVisible(true);
 
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(frminicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frminicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frminicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frminicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frminicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    public static javax.swing.JLabel lblacceso;
    public static javax.swing.JLabel lblamaterno;
    public static javax.swing.JLabel lblapaterno;
    public static javax.swing.JLabel lblidpersona;
    public static javax.swing.JLabel lblnombre;
    private javax.swing.JMenuBar menuBar;
    public static javax.swing.JMenu mnuarchivo;
    private javax.swing.JMenu mnuayuda;
    private javax.swing.JMenu mnuconsultas;
    private javax.swing.JMenu mnuherramientas;
    private javax.swing.JMenu mnureserva;
    private javax.swing.JMenu mnusalir;
    private javax.swing.JMenu mnusisreserva;
    public static javax.swing.JMenu muconfiguraciones;
    // End of variables declaration//GEN-END:variables

}
