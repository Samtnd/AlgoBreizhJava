/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo1;

//import static algo1.LoginPage.PasswordToHash;
import static algo1.LoginPage.PasswordToHash;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.border.Border;
import algo1.BddAlgoBreizh;


/**
 *
 * @author ebent
 */
public class Register extends javax.swing.JFrame {
    Statement st;
    PreparedStatement pstmt;
    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        
         //center form
        this.setLocationRelativeTo(null);
        
        //Create a button group for the radiobuttons
        ButtonGroup bg = new ButtonGroup();
        bg.add(rcm);
        bg.add(rcf);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonRegister = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtciv = new javax.swing.JLabel();
        txtname = new javax.swing.JLabel();
        txtlastname = new javax.swing.JLabel();
        txtuser = new javax.swing.JLabel();
        txtpass = new javax.swing.JLabel();
        txtcpass = new javax.swing.JLabel();
        txttm = new javax.swing.JLabel();
        txttf = new javax.swing.JLabel();
        txtemail = new javax.swing.JLabel();
        rname = new javax.swing.JTextField();
        rlastname = new javax.swing.JTextField();
        ruser = new javax.swing.JTextField();
        rtm = new javax.swing.JTextField();
        rtf = new javax.swing.JTextField();
        rmail = new javax.swing.JTextField();
        rcm = new javax.swing.JRadioButton();
        rcf = new javax.swing.JRadioButton();
        rpass = new javax.swing.JPasswordField();
        rcpass = new javax.swing.JPasswordField();
        jLabel_login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("AlgoBreizh Compte Rendu");

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jButtonRegister.setBackground(new java.awt.Color(51, 51, 255));
        jButtonRegister.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonRegister.setForeground(new java.awt.Color(51, 153, 255));
        jButtonRegister.setText("Register");
        jButtonRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonRegisterMouseEntered(evt);
            }
        });
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(51, 51, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Register");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(45, 45, 45))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        txtciv.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtciv.setForeground(new java.awt.Color(255, 255, 255));
        txtciv.setText("Civility:");

        txtname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtname.setForeground(new java.awt.Color(255, 255, 255));
        txtname.setText("Name:");

        txtlastname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtlastname.setForeground(new java.awt.Color(255, 255, 255));
        txtlastname.setText("Lastname:");

        txtuser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtuser.setForeground(new java.awt.Color(255, 255, 255));
        txtuser.setText("Username:");

        txtpass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtpass.setForeground(new java.awt.Color(255, 255, 255));
        txtpass.setText("Password:");

        txtcpass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtcpass.setForeground(new java.awt.Color(255, 255, 255));
        txtcpass.setText("Confirm Password:");

        txttm.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txttm.setForeground(new java.awt.Color(255, 255, 255));
        txttm.setText("Telehone Mobile:");

        txttf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txttf.setForeground(new java.awt.Color(255, 255, 255));
        txttf.setText("Telephone Fixe:");

        txtemail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtemail.setForeground(new java.awt.Color(255, 255, 255));
        txtemail.setText("Email:");

        rname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rnameActionPerformed(evt);
            }
        });

        rtm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rtmKeyTyped(evt);
            }
        });

        rtf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rtfKeyTyped(evt);
            }
        });

        rcm.setSelected(true);
        rcm.setText("Male");
        rcm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rcmActionPerformed(evt);
            }
        });

        rcf.setText("Female");
        rcf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rcfActionPerformed(evt);
            }
        });

        jLabel_login.setForeground(new java.awt.Color(255, 153, 153));
        jLabel_login.setText(">> Already Have an Account ? Login");
        jLabel_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_loginMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtciv)
                            .addComponent(txtname)
                            .addComponent(txtlastname)
                            .addComponent(txtuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtcpass)
                            .addComponent(txttm)
                            .addComponent(txttf)
                            .addComponent(txtemail)
                            .addComponent(txtpass))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rname)
                            .addComponent(rlastname, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ruser, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rtm, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rtf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rcm)
                                .addGap(18, 18, 18)
                                .addComponent(rcf))
                            .addComponent(rpass)
                            .addComponent(rcpass))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel_login)
                .addGap(177, 177, 177))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtciv)
                    .addComponent(rcm)
                    .addComponent(rcf))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtname)
                    .addComponent(rname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtlastname)
                    .addComponent(rlastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtuser)
                    .addComponent(ruser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpass)
                    .addComponent(rpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcpass)
                    .addComponent(rcpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttm)
                    .addComponent(rtm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttf)
                    .addComponent(rtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtemail)
                    .addComponent(rmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_login)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel6)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        // TODO add your handling code here:
        String civility = "Male";
        String fname = rname.getText();
        String lastname = rlastname.getText();
        String username = ruser.getText();
        String pass1 = String.valueOf(rpass.getPassword());
        String pass2 = String.valueOf(rcpass.getPassword());
        String phone = rtm.getText();
        String fixe = rtf.getText();
        String mail = rmail.getText();
        
        
        if(rcf.isSelected()){
            civility = "Female";
        }
        
        if (verifyFields()){
  
            try{
                
                    String sql2 = "INSERT INTO `commerciaux`(`Civilite`, `Nom`, `Prenom`, `TelephoneMobile`, `TelephoneFixe`, `Email`) VALUES (?,?,?,?,?,?)";
                    BddAlgoBreizh bdd = new BddAlgoBreizh();
                    st= (Statement) bdd.conn.createStatement();
                    pstmt=(PreparedStatement) bdd.conn.prepareStatement(sql2);
                    

                    pstmt.setString(1, civility);
                    pstmt.setString(2, fname);
                    pstmt.setString(3, lastname);
                    pstmt.setString(4, phone);
                    pstmt.setString(5, fixe);
                    pstmt.setString(6, mail);
                    if(pstmt.executeUpdate() != 0){
                        JOptionPane.showMessageDialog(null, "Your Account Has Been Created");
                    }
                    else{
                         JOptionPane.showMessageDialog(null, "Error: Check Your Information");
                    }
                    //conn.close();
                    
                    rname.requestFocus();
                    
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            if(!checkUsername(username)){
                
               
                String sql = "INSERT INTO `user_login`(`name`, `username`, `password`) VALUES (?,?,?)";
                
                try{
                    
                    BddAlgoBreizh bdd = new BddAlgoBreizh();
                    st= (Statement) bdd.conn.createStatement();
                    pstmt=(PreparedStatement) bdd.conn.prepareStatement(sql);

             
                    pstmt.setString(1, fname);
                    pstmt.setString(2, username);
                    pstmt.setString(3, pass1);
                    System.out.println(PasswordToHash(pass1));
                    
                    if(pstmt.executeUpdate() != 0){
                        JOptionPane.showMessageDialog(null, "Your Account Has Been Created");
                    }
                    else{
                         JOptionPane.showMessageDialog(null, "Error: Check Your Information");
                    }
                    //conn.close();
                    
                    
                    rname.setText("");ruser.setText("");rpass.setText("");
                    rname.requestFocus();
                    
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
                
            
        }
        }

       
    }//GEN-LAST:event_jButtonRegisterActionPerformed
    
     public static String PasswordToHash(String passwordToHash) {
		String generatedPassword = null;
		try {
			// MessageDigest  MD5
			MessageDigest md = MessageDigest.getInstance("MD5");
			// Add password bytes to digest
			md.update(passwordToHash.getBytes());
			//hash en bytes
			byte[] bytes = md.digest();
			// hexadecimal conversion
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < bytes.length; i++) {
				sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16)
						.substring(1));
			}
			// hash complet en hexa
			generatedPassword = sb.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return generatedPassword;
	}
    
    private void jButtonRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegisterMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonRegisterMouseEntered

    private void rnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rnameActionPerformed

    private void rcmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rcmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rcmActionPerformed

    private void rcfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rcfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rcfActionPerformed

    private void rtmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rtmKeyTyped
        // Allows only numbers
        if(!Character.isDigit(evt.getKeyChar())){
           evt.consume();
        }
    }//GEN-LAST:event_rtmKeyTyped

    private void rtfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rtfKeyTyped
        // Allows only numbers
        if(!Character.isDigit(evt.getKeyChar())){
           evt.consume();
        }
    }//GEN-LAST:event_rtfKeyTyped

    private void jLabel_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_loginMouseEntered
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.red);
        jLabel_login.setBorder(label_border);
    }//GEN-LAST:event_jLabel_loginMouseEntered

    private void jLabel_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_loginMouseExited
        // TODO add your handling code here:
        Border label_create_accont_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.lightGray);
        jLabel_login.setBorder(label_create_accont_border);
    }//GEN-LAST:event_jLabel_loginMouseExited

    private void jLabel_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_loginMouseClicked
        // TODO add your handling code here:
        LoginPage rf = new LoginPage();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel_loginMouseClicked
    
    // create a function to verify the empty fields  
    public boolean verifyFields()
    {
        String fname = rname.getText();
        String lastname = rlastname.getText();
        String uname = ruser.getText();
        String pass1 = String.valueOf(rpass.getPassword());
        String pass2 = String.valueOf(rcpass.getPassword());
        String phone = rtm.getText();
        String fixe = rtf.getText();
        String mail = rmail.getText();
        
        
        // check empty fields
        if(fname.trim().equals("") || lastname.trim().equals("") || uname.trim().equals("") || pass1.trim().equals("") || pass2.trim().equals("") 
                || phone.trim().equals("") || fixe.trim().equals("") || mail.trim().equals("")) 
            
        {
            JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty","Empty Fields",2);
            return false;
        }
        
        // check if the two password are equals or not
        else if(!pass1.equals(pass2))
        {
           JOptionPane.showMessageDialog(null, "Password Doesn't Match","Confirm Password",2); 
           PasswordToHash(pass1).equals(rpass);
           return false;
        }
        
        // if everything is ok
        else{
            return true;
        }
    }
    
    // create a function to check if the entered username already exists in the database
    public boolean checkUsername(String username){
        
        
        ResultSet rs;
        boolean username_exist = false;
        
        String sql = "SELECT * FROM `user_login` WHERE `username` = ?";
        
        try {
            
            BddAlgoBreizh bdd = new BddAlgoBreizh();
            st= (Statement) bdd.conn.createStatement();
            pstmt=(PreparedStatement) bdd.conn.prepareStatement(sql);
    
            
            rs= pstmt.executeQuery();
            if(rs.next())
            {
                username_exist = true;
                JOptionPane.showMessageDialog(null, "This Username is Already Taken, Choose Another One", "Username Failed", 2);
            }
            
        } catch (Exception e) {
            //Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, e);
        }
        
        return username_exist;
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_login;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton rcf;
    private javax.swing.JRadioButton rcm;
    private javax.swing.JPasswordField rcpass;
    private javax.swing.JTextField rlastname;
    private javax.swing.JTextField rmail;
    private javax.swing.JTextField rname;
    private javax.swing.JPasswordField rpass;
    private javax.swing.JTextField rtf;
    private javax.swing.JTextField rtm;
    private javax.swing.JTextField ruser;
    private javax.swing.JLabel txtciv;
    private javax.swing.JLabel txtcpass;
    private javax.swing.JLabel txtemail;
    private javax.swing.JLabel txtlastname;
    private javax.swing.JLabel txtname;
    private javax.swing.JLabel txtpass;
    private javax.swing.JLabel txttf;
    private javax.swing.JLabel txttm;
    private javax.swing.JLabel txtuser;
    // End of variables declaration//GEN-END:variables
}