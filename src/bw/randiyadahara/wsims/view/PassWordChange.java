
package bw.randiyadahara.wsims.view;

import bw.randiyadahara.wsims.dbConnection.DBConnection;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class PassWordChange extends javax.swing.JFrame {

    Connection conn =null ;
    PreparedStatement pst =null; 
    ResultSet rs=null;
    
    public PassWordChange() {
        initComponents();
    }
int User_ID;
     public PassWordChange(String userName,int ID){
         
       initComponents();   
     
     txtUserName.setText(userName);
     this.User_ID=ID;
    // txtUserName.setEditable(false);
     }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblUserName = new javax.swing.JLabel();
        lblEnterPassWord = new javax.swing.JLabel();
        lblReEnterPassword = new javax.swing.JLabel();
        txtNpw = new javax.swing.JPasswordField();
        txtRePw = new javax.swing.JPasswordField();
        txtUserName = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnRefreash = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        lblKey = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2), "Change Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        lblUserName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUserName.setText("User Name");

        lblEnterPassWord.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblEnterPassWord.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEnterPassWord.setText("New Password");

        lblReEnterPassword.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblReEnterPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblReEnterPassword.setText("Re-Enter the Password");

        txtNpw.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        txtRePw.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        txtUserName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        btnUpdate.setBackground(new java.awt.Color(204, 204, 255));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/UpdatePw.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });

        btnRefreash.setBackground(new java.awt.Color(204, 204, 255));
        btnRefreash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/Refresh.png"))); // NOI18N
        btnRefreash.setText("Re-Set");
        btnRefreash.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnRefreash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefreashMouseClicked(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/PWchange.png"))); // NOI18N

        lblExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/Back.png"))); // NOI18N
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });

        lblKey.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/Key.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtUserName))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblEnterPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNpw))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblReEnterPassword)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btnRefreash, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(txtRePw, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblKey)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblExit))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblKey, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEnterPassWord)
                            .addComponent(txtNpw, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRePw, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(lblReEnterPassword))))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRefreash, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        
        
        
                 LoginForm logF = new LoginForm();
               
                logF.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                logF.setSize(910,540);
                logF.setLocationRelativeTo(null);
                logF.setTitle("Login Page");
                logF.setVisible(true);
       this.dispose();
        
    }//GEN-LAST:event_lblExitMouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked

       if( Arrays.equals(txtNpw.getPassword(),txtRePw.getPassword())&& txtNpw.getText().length()!=0 && txtRePw.getText().length()!=0 ) {
       
           
           String resetPassword= txtRePw.getText();
           String userName= txtUserName.getText();
           
            
           try {
           
  
                DBConnection instance = DBConnection.getInstance();
                Connection connection = instance.getConnection();
                
               // Statement st =conn.createStatement(); 

                String pWupdate="Update users set username=?, password=? where user_id =? " ;
                pst = connection.prepareStatement(pWupdate);
                
                pst.setString(1,userName);
                pst.setString(2,resetPassword);      
                pst.setInt(3,User_ID);  
              
                pst.executeUpdate();
              
                btnRefreash.doClick();
                JOptionPane.showMessageDialog(null," PassWord changed ");
                
                
           }catch(HeadlessException | ClassNotFoundException | SQLException e){
           
               // JOptionPane.showMessageDialog(null,"Change Your Username !");
                txtUserName.setBackground(Color.pink); 
                return;
           
           
           
           
           
           }
           
             txtNpw.setBackground(Color.white);
             txtRePw.setBackground(Color.white);
           
       }else{
            txtNpw.setText("");
            txtRePw.setText("");
            txtNpw.setBackground(Color.pink);
            txtRePw.setBackground(Color.pink);
            //txtUserName.setBackground(Color.pink);
            JOptionPane.showMessageDialog(null," password not matches ! ");
       
         
       }
        

    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnRefreashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreashMouseClicked

            txtNpw.setText("");
            txtRePw.setText("");
            txtNpw.setBackground(Color.white);
            txtRePw.setBackground(Color.white);
            txtUserName.setBackground(Color.white);
       
    }//GEN-LAST:event_btnRefreashMouseClicked

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PassWordChange().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefreash;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEnterPassWord;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblKey;
    private javax.swing.JLabel lblReEnterPassword;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPasswordField txtNpw;
    private javax.swing.JPasswordField txtRePw;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
