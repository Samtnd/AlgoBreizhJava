package algo1;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.*;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import algo1.BddAlgoBreizh;




/**
 *
 * @author ebent
 */
public class AjouterRDV extends javax.swing.JFrame {
    
    Statement st;
    PreparedStatement pstmt;

    /**
     * Creates new form AjouterRDV
     */
    public AjouterRDV() {
        initComponents();
        table_update();
        //Connect();
        
    }
    
    Connection conn;
    PreparedStatement pst;
    
    //public void Connect(){
        //try {
            
            //Class.forName("com.mysql.jdbc.Driver");
            //?autoReconnect=true&useSSL=false
        //} catch (ClassNotFoundException e) {
           
        //} catch (Exception e) {
           
        //}   
    //}
    
    private void table_update(){
        int c;
        try{ 
                String sql=("select * from clients");
                BddAlgoBreizh bdd = new BddAlgoBreizh();
                st= (Statement) bdd.conn.createStatement();
                pstmt=(PreparedStatement) bdd.conn.prepareStatement(sql);
                
                
                ResultSet rs= pstmt.executeQuery();
                com.mysql.jdbc.ResultSetMetaData Rss = (com.mysql.jdbc.ResultSetMetaData) rs.getMetaData();
                c= Rss.getColumnCount();
                
                DefaultTableModel tm=(DefaultTableModel)viewClient.getModel();
                tm.setRowCount(0);
                while(rs.next()){
                Object o[]={rs.getInt("idClient"),rs.getString("Nom"),rs.getString("Prenom")};
                tm.addRow(o);
                }
                 }catch(Exception e){
                     JOptionPane.showMessageDialog(null,e);
                 }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateTimeFormatterBuilder1 = new java.time.format.DateTimeFormatterBuilder();
        dateTimeFormatterBuilder2 = new java.time.format.DateTimeFormatterBuilder();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txtsemaine = new javax.swing.JLabel();
        txtname = new javax.swing.JLabel();
        txtdate = new javax.swing.JLabel();
        txtlieu = new javax.swing.JLabel();
        txtcomment = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        acomment = new javax.swing.JTextArea();
        asem = new javax.swing.JTextField();
        aname = new javax.swing.JTextField();
        alastname = new javax.swing.JTextField();
        alieu = new javax.swing.JTextField();
        adate = new com.toedter.calendar.JDateChooser();
        txtlastname = new javax.swing.JLabel();
        txtnamesearch = new javax.swing.JLabel();
        searchname = new javax.swing.JTextField();
        txtlastnsearch = new javax.swing.JLabel();
        searchlastn = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewClient = new javax.swing.JTable();
        txtidCommerc = new javax.swing.JLabel();
        acommerc = new javax.swing.JTextField();
        txtidClient = new javax.swing.JLabel();
        aidClient = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Ajouter un rendez-vous");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setForeground(new java.awt.Color(51, 153, 255));
        jButton1.setText("Retour");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtsemaine.setText("Semaine:");

        txtname.setText("Nom:");

        txtdate.setText("Date:");

        txtlieu.setText("Lieu:");

        txtcomment.setText("Commentaire:");

        acomment.setColumns(20);
        acomment.setRows(5);
        jScrollPane1.setViewportView(acomment);

        asem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asemActionPerformed(evt);
            }
        });

        aname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anameActionPerformed(evt);
            }
        });

        txtlastname.setText("Pr??nom:");

        txtnamesearch.setText("Nom:");

        txtlastnsearch.setText("Pr??nom:");

        searchlastn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchlastnActionPerformed(evt);
            }
        });

        jButton2.setText("Prendre rendez-vous");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Rechercher");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        viewClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N??Client", "Nom", "Pr??nom"
            }
        ));
        viewClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewClientMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(viewClient);

        txtidCommerc.setText("idCommercial:");

        acommerc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acommercActionPerformed(evt);
            }
        });

        txtidClient.setText("N?? Client:");

        aidClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aidClientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtname)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtcomment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtsemaine, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtlastname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtlieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtidCommerc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtidClient))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(asem)
                                    .addComponent(aname)
                                    .addComponent(alastname, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                    .addComponent(alieu)
                                    .addComponent(adate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(acommerc)
                                    .addComponent(aidClient))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtnamesearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchname, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtlastnsearch)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchlastn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidClient)
                    .addComponent(aidClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidCommerc)
                    .addComponent(acommerc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsemaine)
                    .addComponent(asem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnamesearch)
                    .addComponent(searchname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtlastnsearch)
                    .addComponent(searchlastn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtname)
                            .addComponent(aname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtlastname)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtdate)
                            .addComponent(adate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtlieu)
                            .addComponent(alieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcomment)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(310, 310, 310))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        welcome obj = new welcome();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void asemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asemActionPerformed

    private void anameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anameActionPerformed

    private void searchlastnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchlastnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchlastnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String sem = asem.getText();
        String name = aname.getText();
        String lastname = alastname.getText();
        String lieu = alieu.getText();
        String des = acomment.getText();
        String idCommer = acommerc.getText();
        String client = aidClient.getText();
        
        
       SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
       String startd = date_format.format(adate.getDate());
        
       
        try {
            if(asem.getText().length()!=0 && aname.getText().length()!=0 && alastname.getText().length()!=0 && alieu.getText().length()!=0 && acomment.getText().length()!=0 && 
                    adate.getDate() != null ){
                
                String sql ="INSERT INTO visites_rdv (semaine,nom,prenom,date,lieu,commentaire,idCommercial,idClient) VALUES (?,?,?,?,?,?,?,?)";
                BddAlgoBreizh bdd = new BddAlgoBreizh();
                st= (Statement) bdd.conn.createStatement();
                pstmt=(PreparedStatement) bdd.conn.prepareStatement(sql);
                
                
                pstmt.setString(1, sem);
                pstmt.setString(2, name);
                pstmt.setString(3, lastname);
                pstmt.setString(4, startd);
                pstmt.setString(5, lieu);
                pstmt.setString(6, des);
                pstmt.setString(7, idCommer);
                pstmt.setString(8, client);
                



                pstmt.executeUpdate();

                
                    JOptionPane.showMessageDialog(this, "Le rendez-vous a ??t?? ajout?? avec succ??s!");
                    //AjouterRDV();
            

                }
            else
                {
                    JOptionPane.showMessageDialog(this, "Tous les champs doivent ??tre complet??!");
                }
            
            asem.requestFocus();

        } catch (Exception e) {
            //Logger.getLogger(AjouterRDV.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String numClient = aidClient.getText();
        String srname = searchname.getText();
        String srlastname = searchlastn.getText();
        String sql="SELECT * FROM `clients` WHERE `idClient` = ? AND `nom` = ? AND `prenom` = ?";
        
        if(srname.trim().equals("nom")){
            JOptionPane.showMessageDialog(null, "Saisissez un nom", "Le champ est vide", 2);
        }
        
        else if(srlastname.trim().equals("prenom"))
        {
            JOptionPane.showMessageDialog(null, "Saisissez un pr??nom", "Le champ est vide", 2); 
        }
        else{
            try{
                
                BddAlgoBreizh bdd = new BddAlgoBreizh();
                st= (Statement) bdd.conn.createStatement();
                pstmt=(PreparedStatement) bdd.conn.prepareStatement(sql);
                
                ResultSet rs= pstmt.executeQuery();
                DefaultTableModel tm=(DefaultTableModel)viewClient.getModel();
                tm.setRowCount(0);
                while(rs.next()){
                Object o[]={rs.getInt("idClient"),rs.getString("Nom"),rs.getString("Prenom")};
                tm.addRow(o);
                //table_update();
                }
                 }catch(Exception e){
                     JOptionPane.showMessageDialog(null,e);
        }
        }
        

    }//GEN-LAST:event_jButton3ActionPerformed

    private void viewClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewClientMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tm=(DefaultTableModel)viewClient.getModel();
        int selectedIndex = viewClient.getSelectedRow();
        
        aname.setText(tm.getValueAt(selectedIndex, 1).toString());
        alastname.setText(tm.getValueAt(selectedIndex, 2).toString());
        aidClient.setText(tm.getValueAt(selectedIndex, 3).toString());
    }//GEN-LAST:event_viewClientMouseClicked

    private void acommercActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acommercActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acommercActionPerformed

    private void aidClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aidClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aidClientActionPerformed

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
            java.util.logging.Logger.getLogger(AjouterRDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjouterRDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjouterRDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjouterRDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjouterRDV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea acomment;
    private javax.swing.JTextField acommerc;
    private com.toedter.calendar.JDateChooser adate;
    private javax.swing.JTextField aidClient;
    private javax.swing.JTextField alastname;
    private javax.swing.JTextField alieu;
    private javax.swing.JTextField aname;
    private javax.swing.JTextField asem;
    private java.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1;
    private java.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField searchlastn;
    private javax.swing.JTextField searchname;
    private javax.swing.JLabel txtcomment;
    private javax.swing.JLabel txtdate;
    private javax.swing.JLabel txtidClient;
    private javax.swing.JLabel txtidCommerc;
    private javax.swing.JLabel txtlastname;
    private javax.swing.JLabel txtlastnsearch;
    private javax.swing.JLabel txtlieu;
    private javax.swing.JLabel txtname;
    private javax.swing.JLabel txtnamesearch;
    private javax.swing.JLabel txtsemaine;
    private javax.swing.JTable viewClient;
    // End of variables declaration//GEN-END:variables
}
