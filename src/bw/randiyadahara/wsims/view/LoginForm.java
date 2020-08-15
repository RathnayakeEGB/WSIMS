
package bw.randiyadahara.wsims.view;


import bw.randiyadahara.wsims.PermisionControler.UesrControler;
import bw.randiyadahara.wsims.model.Users;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;



public final class LoginForm extends javax.swing.JFrame {

    public LoginForm() {
        initComponents();
       
        jPanel1.setBackground(new Color(0,0,0,30));
        
      
       // LoadUserCombo();
    }


    @SuppressWarnings("unchecked")
    
 
    
    public  void getUserDetails() throws ClassNotFoundException, SQLException{
        
        String uname =txtUserName.getText() ;
        
        String user_id ="";
        String Fname=" ",userName="",customer="",cusGroup=" ",empLoyee=" " ,empAttendence=" ",empGroup=" ",service=" ",
        waterUsage=" ", pumpInfo=" ",Payment=" ",invoice =" ",report=" ",about=" ",priceList=" ",userManage=" ",createddate=" ",
        isActive=" ",discription=" ",fixcos = null,Subcomitee = null;
        
       
        Users u = new Users();
        
        
        try{
            Users user= UesrControler.getUserDetails(u, uname);
            
              
                        user_id = user.getUser_id();
                        Fname=user.getFullName();  //user Full Name Dispaly
                        userName=user.getFname();
                        isActive=user.getIsActive();
                        customer=user.getCustomer();
                        cusGroup=user.getCusGroup();
                        empGroup=user.getEmpGroup();
                        empLoyee=user.getEmpLoyee();
                        service=user.getService();
                        waterUsage=user.getWaterUsage(); 
                        empAttendence=user.getEmpAttendence();
                        Payment=user.getPayment(); 
                        invoice=user.getInvoice();
                        report=user.getReport(); 
                        about=user.getAbout();
                        pumpInfo=user.getPumpInfo();
                        priceList=user.getPriceList(); 
                        userManage=user.getUserManage();
                        Subcomitee =user.getSubcomity();
                        fixcos =user.getFixcost();
                        
           }catch(ClassNotFoundException | SQLException ex){
           
           JOptionPane.showMessageDialog(null,"Data Base Not Found");
           
           }
           
         
    
                this.dispose();
                HomeFrom hf= new HomeFrom(user_id,Fname,userName,isActive,customer,cusGroup,empGroup,empLoyee,service,waterUsage,empAttendence,Payment,invoice,report,about,pumpInfo,priceList,userManage,Subcomitee,fixcos);
              
                hf.setTitle("Home Page");
                hf.setVisible(true);
                hf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                //hf.setUndecorated(true);
        
    
    }
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lblPWchange = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblExit = new javax.swing.JLabel();
        lblBackGround = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("jButton1");

        jLabel7.setIcon(new javax.swing.ImageIcon("E:\\Download\\Genaral\\DSvvgvMUMAAvTcy.jpg")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(69, 150, 165));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(null);

        txtPassword.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPassword.setBorder(null);
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword);
        txtPassword.setBounds(110, 180, 200, 40);

        btnLogin.setBackground(new java.awt.Color(30, 192, 84));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin);
        btnLogin.setBounds(200, 240, 110, 44);

        lblPWchange.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblPWchange.setForeground(new java.awt.Color(255, 0, 102));
        lblPWchange.setText("Change Password !");
        lblPWchange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPWchangeMouseClicked(evt);
            }
        });
        jPanel1.add(lblPWchange);
        lblPWchange.setBounds(10, 350, 194, 25);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Login");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(110, 30, 150, 67);

        jLabel4.setBackground(new java.awt.Color(102, 153, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/log.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(250, 20, 90, 90);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 130, 110, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 190, 110, 20);

        txtUserName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(txtUserName);
        txtUserName.setBounds(110, 130, 200, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(280, 70, 350, 390);

        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/Exit (2).png"))); // NOI18N
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });
        getContentPane().add(lblExit);
        lblExit.setBounds(860, 10, 40, 40);

        lblBackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/LoginBackground.jpg"))); // NOI18N
        getContentPane().add(lblBackGround);
        lblBackGround.setBounds(0, 0, 910, 540);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        btnLogin.doClick();
        if(txtPassword.equals("")){
        txtPassword.setBackground(Color.WHITE);
        }
        
        
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

         String password = txtPassword.getText().toString();
         String uname =txtUserName.getText();
         Users users = new Users();
         users.setUserName(uname);
        
        int dispos =0;
        
        try {
            
            String user,pwd;
            Users u =UesrControler.getUserNamePassWord(users);  //User Controler
            user =uname;
            pwd =u.getPwd();
          //  System.gc();
            
              if(pwd!=null && user!=null){
          
                if ((user.equals(uname))&&(pwd.equals(password))){
                    
                    getUserDetails();
                    dispos++;
            
                }   
                
                if(dispos!=1){
                    txtPassword.setBackground(Color.red);
                    txtPassword.setText("");
                    JOptionPane.showMessageDialog(null, " username or password invalid !"); 
                    
                    
                }  
       
          
          }else{
                
                   // txtPassword.setText("");
                  //  txtUserName.setText("");
                    JOptionPane.showMessageDialog(null, " username or password invalid !"); 
                
                }     
               
            } catch (ClassNotFoundException | SQLException ex) {
               // JOptionPane.showMessageDialog(null,ex);
               //JOptionPane.showMessageDialog(null, "invalid username or password");
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
 
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked

       
       
        
        
    }//GEN-LAST:event_btnLoginMouseClicked

    private void lblPWchangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPWchangeMouseClicked
       
            
              Permision p =  new Permision(3,1);
              this.dispose();
              p.setVisible(true);
              p.setTitle("Chage User Password");
              p.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
              p.setResizable(false);
    }//GEN-LAST:event_lblPWchangeMouseClicked

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked

        System.exit(0);

    }//GEN-LAST:event_lblExitMouseClicked

 
  /*  void LoadUserCombo(){
    
        try{
        
            
            DBConnection instance = DBConnection.getInstance();
            Connection connection = instance.getConnection();
             Statement st =connection.createStatement();
             ResultSet rs =st.executeQuery("select username from users where isActive='Y' and deleteYes='N' order By userName" );
             
              while(rs.next()){   
                  
                     cmbUser.addItem(rs.getString(1));
                 
                }
             
                   // connection.close();
        
             }catch(Exception e){
        
            
                JOptionPane.showMessageDialog(null,e);
        
             }
        
    }
    */
    
   
  
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
      
        
         UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
              /*  try{
                    Thread.sleep(5000);
                
                }catch(Exception e){ }
                
                */
                
               
                LoginForm logF = new LoginForm();
               
                logF.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                logF.setSize(910,540);
                logF.setLocationRelativeTo(null);
                logF.setTitle("Login Page");
                logF.setVisible(true);
             
               
              
              
              //  logF.setResizable(false);
                //logF. setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
             
            
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblBackGround;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblPWchange;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
