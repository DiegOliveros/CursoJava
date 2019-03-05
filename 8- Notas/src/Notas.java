
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author natog
 */
public class Notas extends javax.swing.JFrame {

    DefaultTableModel model;
    ListSelectionModel selectionModel;

    /**
     * Creates new form Notas
     */
    public Notas() {
        initComponents();
        this.setTitle("Notas");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        temaTF = new javax.swing.JTextField();
        valorTF = new javax.swing.JTextField();
        calificacionTF = new javax.swing.JTextField();
        fechaTF = new com.toedter.calendar.JDateChooser();
        agregarBTN = new javax.swing.JButton();
        borrarBTN = new javax.swing.JButton();
        actualizarBTN = new javax.swing.JButton();
        calcularBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Tema", "Valor %", "Calificacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Fecha");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Tema");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Valor %");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Calificacion");

        temaTF.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        temaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temaTFActionPerformed(evt);
            }
        });

        valorTF.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        calificacionTF.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        fechaTF.setDateFormatString("dd/MM/yyyy");
        fechaTF.setDoubleBuffered(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(temaTF, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(fechaTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calificacionTF, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(valorTF))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)
                        .addComponent(valorTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fechaTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(temaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calificacionTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        agregarBTN.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        agregarBTN.setText("Agregar");
        agregarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBTNActionPerformed(evt);
            }
        });

        borrarBTN.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        borrarBTN.setText("Borrar");
        borrarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarBTNActionPerformed(evt);
            }
        });

        actualizarBTN.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        actualizarBTN.setText("Actualizar");
        actualizarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarBTNActionPerformed(evt);
            }
        });

        calcularBTN.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        calcularBTN.setText("Calcular");
        calcularBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(agregarBTN)
                        .addGap(18, 18, 18)
                        .addComponent(actualizarBTN)
                        .addGap(18, 18, 18)
                        .addComponent(borrarBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(calcularBTN))
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarBTN)
                    .addComponent(actualizarBTN)
                    .addComponent(borrarBTN)
                    .addComponent(calcularBTN))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void temaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temaTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_temaTFActionPerformed

    private void actualizarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarBTNActionPerformed
        model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRow() != -1) {
            if (camposLlenos()) {
                if (notasCompletas() - Integer.parseInt(model.getValueAt(jTable1.getSelectedRow(), 2).toString()) + Integer.parseInt(valorTF.getText()) <= 100) {
                    model.setValueAt(new SimpleDateFormat("dd-MM-yyyy").format(fechaTF.getDate()), jTable1.getSelectedRow(), 0);
                    model.setValueAt(temaTF.getText(), jTable1.getSelectedRow(), 1);
                    model.setValueAt(Integer.parseInt(valorTF.getText()), jTable1.getSelectedRow(), 2);
                    model.setValueAt(Double.parseDouble(calificacionTF.getText()), jTable1.getSelectedRow(), 3);
                } else {
                    JOptionPane.showMessageDialog(null, "Se excederá el 100% de valor de las notas", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor llene correctamente los campos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_actualizarBTNActionPerformed

    private void agregarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBTNActionPerformed
        model = (DefaultTableModel) jTable1.getModel();
        if (camposLlenos()) {
            if (notasCompletas() + Integer.parseInt(valorTF.getText()) <= 100) {
                model.insertRow(model.getRowCount(), new Object[]{new SimpleDateFormat("dd-MM-yyyy").format(fechaTF.getDate()), temaTF.getText(), Integer.parseInt(valorTF.getText()), Double.parseDouble(calificacionTF.getText())});
                fechaTF.setDate(new Date());
                temaTF.setText("");
                valorTF.setText("");
                calificacionTF.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Se excederá el 100% de valor de las notas", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor llene correctamente los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_agregarBTNActionPerformed

    private void calcularBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularBTNActionPerformed
        if (notasCompletas() < 100) {
            JOptionPane.showMessageDialog(null, "Aún no se completa el 100% de Notas", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            calcularFinal();
        }
    }//GEN-LAST:event_calcularBTNActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        model = (DefaultTableModel) jTable1.getModel();

        if (jTable1.getSelectedRow() != -1) {
            try {
                fechaTF.setDate(new SimpleDateFormat("dd-MM-yyyy").parse(model.getValueAt(jTable1.getSelectedRow(), 0).toString()));
            } catch (ParseException ex) {
                Logger.getLogger(Notas.class.getName()).log(Level.SEVERE, null, ex);
            }
            temaTF.setText(model.getValueAt(jTable1.getSelectedRow(), 1).toString());
            valorTF.setText(model.getValueAt(jTable1.getSelectedRow(), 2).toString());
            calificacionTF.setText(model.getValueAt(jTable1.getSelectedRow(), 3).toString());
        } else {
            fechaTF.setDate(new Date());
            temaTF.setText("");
            valorTF.setText("");
            calificacionTF.setText("");
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void borrarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarBTNActionPerformed
        if (jTable1.getSelectedRow() != -1) {
            model = (DefaultTableModel) jTable1.getModel();
            model.removeRow(jTable1.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_borrarBTNActionPerformed

    public int notasCompletas() {
        model = (DefaultTableModel) jTable1.getModel();
        int suma = 0;
        for (int i = 0; i < model.getRowCount(); i++) {
            suma += Integer.parseInt(model.getValueAt(i, 2).toString());
        }
        return suma;
    }

    public boolean camposLlenos() {
        try {
            new SimpleDateFormat("dd-MM-yyyy").format(fechaTF.getDate());
        } catch (Exception e) {
            return false;
        }
        if (temaTF.getText().equals("")) {
            return false;
        }
        try {
            Integer.parseInt(valorTF.getText());
        } catch (NumberFormatException e) {
            return false;
        }
        try {
            Double.parseDouble(calificacionTF.getText());
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public void calcularFinal() {
        double nota = 0;
        for (int i = 0; i < model.getRowCount(); i++) {
            nota += Double.parseDouble(model.getValueAt(i, 3).toString()) * (Double.parseDouble(model.getValueAt(i, 2).toString()) / 100.0);
        }
        JOptionPane.showMessageDialog(null, "Su Nota Final es: " + nota);
    }

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
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarBTN;
    private javax.swing.JButton agregarBTN;
    private javax.swing.JButton borrarBTN;
    private javax.swing.JButton calcularBTN;
    private javax.swing.JTextField calificacionTF;
    private com.toedter.calendar.JDateChooser fechaTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField temaTF;
    private javax.swing.JTextField valorTF;
    // End of variables declaration//GEN-END:variables
}