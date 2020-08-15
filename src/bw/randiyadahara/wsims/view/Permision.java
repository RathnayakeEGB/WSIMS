
package bw.randiyadahara.wsims.view;

import bw.randiyadahara.wsims.PermisionControler.UesrControler;
import bw.randiyadahara.wsims.dbConnection.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Permision extends javax.swing.JFrame {

  int logPageNumber,userId;
  
  public Permision(){
  initComponents();
  
  }
  
    public Permision(int logPageNumber,int use_id ) {
        initComponents();
        
        this.logPageNumber=logPageNumber;
        this.userId=use_id;
        
       // LoadUserCombo();
        
    }

  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnPermision = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnCencel = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("User Name");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Password");

        txtPassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnPermision.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnPermision.setText("Permission");
        btnPermision.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPermisionMouseClicked(evt);
            }
        });
        btnPermision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPermisionActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/Protection.png"))); // NOI18N

        btnCencel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCencel.setText("Cancel");
        btnCencel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCencelMouseClicked(evt);
            }
        });
        btnCencel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCencelActionPerformed(evt);
            }
        });

        txtUserName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                            .addComponent(txtUserName)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(277, Short.MAX_VALUE)
                        .addComponent(btnCencel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnPermision)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCencel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPermision, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCencelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCencelMouseClicked
        if(logPageNumber==3){
        
            this.dispose();
                LoginForm logF = new LoginForm();
               
                logF.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                logF.setSize(910,540);
                logF.setLocationRelativeTo(null);
                logF.setTitle("Login Page");
                logF.setVisible(true);
             ;

          
            
        }else{
        
            this.dispose();
        }
        
      
        
    }//GEN-LAST:event_btnCencelMouseClicked

    private void btnPermisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPermisionActionPerformed

        
    }//GEN-LAST:event_btnPermisionActionPerformed

    private void btnPermisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPermisionMouseClicked

        
        
            
         try {
            
          
          // Connection con  = DriverManager.getConnection("jdbc:postgresql://localhost:5432/WSIMS","Admin","1234");
            DBConnection instance = DBConnection.getInstance();
            Connection connection = instance.getConnection(); 
            
           
            Statement st =connection.createStatement();
            ResultSet rs =st.executeQuery("select username,password from users where isactive= 'Y' and DeleteYes='N' " );
            
            String user =txtUserName.getText();
            String pwd =txtPassword.getText().toString().trim();
            
            String password = "";
            String uname = " ";
             
           int dispos =0;
            while (rs.next()){
            
                 uname=rs.getString("username").trim();
                 password=rs.getString("password").trim();
                
                
                 if ((user.equals(uname))&&(pwd.equals(password))){
            
                    if(logPageNumber==1){
                    
                        this.dispose();
                            
                        UserManagement userManage= new UserManagement(userId);
                        userManage.setVisible(true);
                        userManage.setTitle("User Management");
                        userManage.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                       // userManage.setUndecorated(true);

                    this.dispose();
                        
                        }else if(logPageNumber==2){
                    
                            this.dispose();
                            
                            CustomerGroupPriceMetrix  cpm = new CustomerGroupPriceMetrix(userId);
                            cpm.setVisible(true);
                            cpm.setTitle("Price List");
                            cpm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                          //  cpm.setUndecorated(true);
                        }else{
                        
                            
                            String UserId = UesrControler.getUserId(txtUserName.getText().toString());
                            
                            int id =Integer.parseInt(UserId.trim());
                            
                            this.dispose();
                            PassWordChange cpc =new PassWordChange(uname,id);
                            cpc.setResizable(false);
                            cpc.setVisible(true);
                            cpc.setTitle("Password Change");
                            cpc.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                          //  cpc.setUndecorated(true);
                            
                            
                        
                        }
                     
                  
                   dispos++;
            
                }
               
            }
            
          if(dispos!=1){
          
            JOptionPane.showMessageDialog(null, "User name or password invalid !");
          
          } 
           
            
        } catch (SQLException ex) {
           // Logger.getLogger(LoginFrom.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(rootPane,"No DataBase");
        } catch (ClassNotFoundException ex) {
          Logger.getLogger(Permision.class.getName()).log(Level.SEVERE, null, ex);
      }
        
        
    }//GEN-LAST:event_btnPermisionMouseClicked

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        btnPermision.doClick();
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnCencelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCencelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCencelActionPerformed

    
     /* void LoadUserCombo(){
    
        try{
        
            String Quary =" " ;
            
            if(logPageNumber==1||logPageNumber==2) {
            
            Quary ="select username from users where usermanageActive in ('Y') and isactive='Y' and DeleteYes='N' order by username" ;
            
            } else{
            
            Quary ="select username from users where isActive='Y' and DeleteYes='N' order by username " ;
            
            }
            
             Connection con  = DriverManager.getConnection("jdbc:postgresql://localhost:5432/WSIMS","Admin","1234");
               // DBConnection instance = DBConnection.getInstance();
               // Connection connection = instance.getConnection();
             
             Statement st =con.createStatement();
             ResultSet rs =st.executeQuery(Quary);
             
              while(rs.next()){                            
                 txtUserName.addItem(rs.getString(1));
             }
             
              con.close();
             
             
        
             }catch(Exception e){
        
            
            JOptionPane.showMessageDialog(null,e);
        
             }
        
    }*/
    
    
    
    
    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                
                Permision p=   new Permision();
                p.setVisible(true);
                p.setTitle("Permision");
                p.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                p.setResizable(false);
             //   p. setUndecorated(true);
               
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCencel;
    private javax.swing.JButton btnPermision;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
