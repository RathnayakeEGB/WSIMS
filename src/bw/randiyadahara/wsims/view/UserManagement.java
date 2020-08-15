
package bw.randiyadahara.wsims.view;
import bw.randiyadahara.wsims.controler.GetDateTime;
import bw.randiyadahara.wsims.PermisionControler.UserRoleManagementControler;
import bw.randiyadahara.wsims.model.UsersRolsManagement;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;




public final class UserManagement extends javax.swing.JFrame {
    Connection conn =null ;
    PreparedStatement pst =null; 
    ResultSet rs=null;
  
 
   
    public UserManagement() {
        initComponents();
        
        Show_USers();
        rbIsactive.setSelected(true);
    }
    int User_ID;
    public UserManagement(int user_id) {
        initComponents();
        this.User_ID =user_id;
        Show_USers();
        rbIsactive.setSelected(true);
    }
    

   
 public void Show_USers(){
 
     ArrayList<UsersRolsManagement>list;
        try {
            list = UserRoleManagementControler.UserRolesInfo(); //userList
             DefaultTableModel dtm =(DefaultTableModel)usersTable.getModel();
             dtm.setRowCount(0);
           //Object [] row= new Object[list.size()];
     
         for(UsersRolsManagement urm :list){
     
         Object[] rowData = {
                    urm.getUserId(),
                    urm.getFname(),
                    " ",
                   /// urm.getUserName(),
                    urm.getDiscription(),
                    urm.getCreatedBy(),
                    urm.getCreateddate(),
                    urm.getIsActive(),
                    urm.getCustomer(),
                    urm.getCusGroup(),
                    urm.getEmpGroup(),
                    urm.getEmpLoyee(),
                    urm.getService(),
                    urm.getWaterUsage(),
                    urm.getEmpAttendence(),
                    urm.getPayment(),
                    urm.getInvoice(),
                    urm.getReport(),
                    urm.getAbout(),
                    urm.getPumpInfo(),
                    urm.getPriceList(),
                    urm.getUserManage(),
                    urm.getSubCommtee(),
                    urm.getFixCost(),
                    urm.getFullName()
                        
                };
             
       
                 dtm.addRow(rowData);
            
            }    
            
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            
            JOptionPane.showMessageDialog(null, ex);
            //Logger.getLogger(UserManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    
     
    
 
 }
    

 
 
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUerName = new javax.swing.JTextField();
        txtPassWord = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        cbEmployee = new javax.swing.JCheckBox();
        cbEmpGroup = new javax.swing.JCheckBox();
        cbEmpAttendence = new javax.swing.JCheckBox();
        cbpumpInfo = new javax.swing.JCheckBox();
        cbReports = new javax.swing.JCheckBox();
        cbAbout = new javax.swing.JCheckBox();
        cbCustomer = new javax.swing.JCheckBox();
        cbService = new javax.swing.JCheckBox();
        cbPayment = new javax.swing.JCheckBox();
        cbCusGroup = new javax.swing.JCheckBox();
        cbWaterUsage = new javax.swing.JCheckBox();
        cbInvoice = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        btnNewUser = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtSearchID = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cbPriceList = new javax.swing.JCheckBox();
        cbUserManage = new javax.swing.JCheckBox();
        btnHome = new javax.swing.JButton();
        rbIsactive = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txtDiscription = new javax.swing.JTextField();
        ckCommonContoler = new javax.swing.JCheckBox();
        ckSubCommity = new javax.swing.JCheckBox();
        txtFullName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User Role Management", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("User Name");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Password");

        txtUerName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtPassWord.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("User Type");

        txtFName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        cbEmployee.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbEmployee.setText(" Employee");
        cbEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEmployeeActionPerformed(evt);
            }
        });

        cbEmpGroup.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbEmpGroup.setText(" Employee Group");

        cbEmpAttendence.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbEmpAttendence.setText(" Employee Attendance");

        cbpumpInfo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbpumpInfo.setText(" Pumped Infomation ");

        cbReports.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbReports.setText(" Reports");

        cbAbout.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbAbout.setText("  About");

        cbCustomer.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbCustomer.setText(" Customers");

        cbService.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbService.setText(" Service");

        cbPayment.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbPayment.setText(" Payment");

        cbCusGroup.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbCusGroup.setText(" Customer Group");

        cbWaterUsage.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbWaterUsage.setText(" Water Usage");
        cbWaterUsage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbWaterUsageActionPerformed(evt);
            }
        });

        cbInvoice.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbInvoice.setText("Invoice");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnNewUser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnNewUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/NewUser.png"))); // NOI18N
        btnNewUser.setText("New User");
        btnNewUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewUserMouseClicked(evt);
            }
        });
        btnNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewUserActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/RemoveUser.png"))); // NOI18N
        jButton4.setText("Remove");
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/ChangeAccess.png"))); // NOI18N
        btnUpdate.setText("Modify");
        btnUpdate.setToolTipText("");
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));
        btnUpdate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/clear48.png"))); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(btnNewUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(" "));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("User Id");

        txtSearchID.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtSearchID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchIDActionPerformed(evt);
            }
        });
        txtSearchID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchIDKeyPressed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/Search.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSearch.setPreferredSize(new java.awt.Dimension(141, 57));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearchID, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSearchID, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        cbPriceList.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbPriceList.setText(" Price List");

        cbUserManage.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbUserManage.setText(" User Manage");
        cbUserManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUserManageActionPerformed(evt);
            }
        });

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/home2.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });

        rbIsactive.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbIsactive.setText(" Is Active");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Description");

        txtDiscription.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        ckCommonContoler.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ckCommonContoler.setText("Fix  Variable");

        ckSubCommity.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ckSubCommity.setText("Sub Commitee");

        txtFullName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Full Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtUerName, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                                    .addComponent(txtFName)
                                    .addComponent(txtPassWord)
                                    .addComponent(txtDiscription)
                                    .addComponent(txtFullName, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbCustomer)
                                    .addComponent(cbService)
                                    .addComponent(cbPayment)
                                    .addComponent(cbPriceList)
                                    .addComponent(rbIsactive))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbWaterUsage)
                                    .addComponent(cbInvoice)
                                    .addComponent(ckSubCommity)
                                    .addComponent(cbCusGroup))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ckCommonContoler)
                                            .addComponent(cbEmpAttendence)
                                            .addComponent(cbReports, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbEmpGroup)
                                            .addComponent(cbpumpInfo)
                                            .addComponent(cbUserManage)))
                                    .addComponent(cbEmployee))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(581, 581, 581)
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(rbIsactive))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cbEmployee)
                    .addComponent(cbEmpGroup)
                    .addComponent(cbCustomer)
                    .addComponent(cbCusGroup))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbEmpAttendence)
                            .addComponent(cbpumpInfo)
                            .addComponent(cbService)
                            .addComponent(cbWaterUsage)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(txtUerName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cbReports)
                    .addComponent(cbAbout)
                    .addComponent(cbPayment)
                    .addComponent(cbInvoice))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbPriceList)
                                        .addComponent(cbUserManage)
                                        .addComponent(ckSubCommity)
                                        .addComponent(ckCommonContoler))
                                    .addComponent(txtDiscription, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        usersTable.setAutoCreateRowSorter(true);
        usersTable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User_ID", "Name", "User Name", "Discription", "createBy", "CreatedDate", "IsActive", "CusActive", "CusGroupActive", "EmpGroupActive", "EmpActive", "ServiceActive", "WaterUseActive", "EmpAttendenceActive", "PaymentActive", "Invoice Active", "ReportActive", "About Active", "pumpInfo", "PriceListActive", "UserManageActive", "Sub Commitee", "Fix Cost", "Full Name"
            }
        ));
        usersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(usersTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEmployeeActionPerformed
     
    }//GEN-LAST:event_cbEmployeeActionPerformed

    private void cbWaterUsageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbWaterUsageActionPerformed
      
    }//GEN-LAST:event_cbWaterUsageActionPerformed

    private void cbUserManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUserManageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbUserManageActionPerformed

    private void btnNewUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewUserMouseClicked

    }//GEN-LAST:event_btnNewUserMouseClicked

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked

      this.dispose();
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewUserActionPerformed
       
       
        // create New User Account
        
        String UserType,userName,PassWord,customer,cusGroup,empLoyee ,empAttendence,empGroup,service,FullName,
        waterUsage, pumpInfo,Payment,invoice,report,about,priceList,userManage,createddate,isActive,createdBy,discription,fixvaribale,subCommity;
        
        UserType= txtFName.getText(); //USer
        userName= txtUerName.getText();
        PassWord =txtPassWord.getText();
        discription =txtDiscription.getText();
        FullName =txtFullName.getText();
        
        
        if(cbCustomer.isSelected()==true){
            customer ="Y";

        }else{
            customer ="N";
        }
        
        if(cbCusGroup.isSelected()==true){
             cusGroup ="Y";
        }else{
            cusGroup ="N";
        }
        
        if(cbEmployee.isSelected()==true){
             empLoyee ="Y";
        }else{
             empLoyee ="N";
        }
        
        if(cbEmpGroup.isSelected()==true){
             empGroup ="Y";
        }else{
             empGroup ="N";
        }
         
        if(cbService.isSelected()==true){
             service="Y";
        }else{
             service ="N";
        }
        if(cbWaterUsage.isSelected()==true){
             waterUsage="Y";
        }else{
             waterUsage ="N";
        }
        if(cbEmpAttendence.isSelected()==true){
             empAttendence="Y";
        }else{
             empAttendence ="N";
        }
        if(cbpumpInfo.isSelected()==true){
             pumpInfo="Y";
        }else{
             pumpInfo ="N";
        }
        if(cbpumpInfo.isSelected()==true){
             pumpInfo="Y";
        }else{
            pumpInfo ="N";
        }
        if(cbPayment.isSelected()==true){
             Payment="Y";
        }else{
             Payment ="N";
        }
        
        if(cbInvoice.isSelected()==true){
             invoice="Y";
        }else{
             invoice ="N";
        }
        
        if(cbReports.isSelected()==true){
             report="Y";
        }else{
            report ="N";
        }
        
        if(cbAbout.isSelected()==true){
             about="Y";
        }else{
            about="N";
        }
        
        if(cbPriceList.isSelected()==true){
            priceList="Y";
        }else{
           priceList="N";
        }
         
        if(cbUserManage.isSelected()==true){
             userManage="Y";
        }else{
            userManage="N";
        }
        
        
         createddate = new GetDateTime().createdTime(); 
         createdBy ="1";
         
        if(rbIsactive.isSelected()==true){
            
            isActive ="Y";
        }else{
        
            isActive ="N"; 
        }
        
      if(ckSubCommity.isSelected()==true){
            
            subCommity ="Y";
        }else{
        
            subCommity ="N"; 
        }
        if(ckCommonContoler.isSelected()==true){
            
            fixvaribale ="Y";
        }else{
        
            fixvaribale ="N"; 
        }
       // int  user_id = Integer.parseInt(txtUserId.getText());
        Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
        if( (txtFName.getText().length()==0)||(txtUerName.getText().length()==0)||(txtPassWord.getText().length()==0)||txtFullName.getText().length()==0){
            
                
            
                if((txtFName.getText().length()==0)){
                    txtFName.setBackground(Color.PINK);
                }
                
                if((txtUerName.getText().length()==0)){
                     txtUerName.setBackground(Color.pink);
                   
                }
                 if((txtPassWord.getText().length()==0)){
                     txtPassWord.setBackground(Color.pink);
                     
                }
                 
                if((txtFullName.getText().length()==0)){
                     txtFullName.setBackground(Color.pink);
                    
                } 
               txtPassWord.setBackground(Color.pink);
               JOptionPane.showMessageDialog(null,"You should fill the relavant fields !");
        
        }else{
            
            txtFName.setBackground(Color.white);
            txtUerName.setBackground(Color.white);
            txtPassWord.setBackground(Color.white);
            txtFullName.setBackground(Color.white);  
            
            UsersRolsManagement urm = new UsersRolsManagement();
            urm.setAbout(about);
            urm.setIsActive(isActive);
            urm.setCusGroup(cusGroup);
            urm.setCustomer(customer);
            urm.setPayment(Payment);
            urm.setPriceList(priceList);
            urm.setPumpInfo(pumpInfo);
            urm.setInvoice(invoice);
            urm.setFname(UserType);
            urm.setDiscription(discription);
            urm.setCreatedBy(""+User_ID);
            urm.setCreateddate(""+currentTimestamp);
            urm.setEmpAttendence(empAttendence);
            urm.setEmpGroup(empGroup);
            urm.setEmpLoyee(empLoyee);
            urm.setReport(report);
           // urm.setUserId(user_id);
            urm.setUserManage(userManage);
            urm.setService(service);
            urm.setUserName(userName);
            urm.setWaterUsage(waterUsage);
            urm.setSubCommtee(subCommity);
            urm.setFixCost(fixvaribale);  
            urm.setPassWord(PassWord);
            urm.setFullName(FullName);



              try{


               boolean result =  UserRoleManagementControler.CreateUserRole(urm);

                   if(result){
                       JOptionPane.showMessageDialog(null,"created new User");
                   }else{
                       JOptionPane.showMessageDialog(null,"Error !");
                   }


                    clearTable();
                    Show_USers();
                    clearFild();

                    txtFName.setBackground(Color.white);
                    txtUerName.setBackground(Color.white);
                    txtPassWord.setBackground(Color.white);
                    txtFullName.setBackground(Color.white);
            }catch(HeadlessException | ClassNotFoundException | SQLException e){

                JOptionPane.showMessageDialog(null," Change Your Username !");
                txtUerName.setBackground(Color.pink);
                return;


            }

        
        }
        
        
      
        //Show_USers();
        
    }//GEN-LAST:event_btnNewUserActionPerformed

    private void usersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersTableMouseClicked

        txtPassWord.setEditable(false);
        txtUerName.setEditable(false);
        
        int i= usersTable.getSelectedRow();
        TableModel mode =usersTable.getModel();
        
        txtSearchID.setText(mode.getValueAt(i,0).toString());
        txtFName.setText(mode.getValueAt(i, 1).toString());
     // txtUerName.setText(mode.getValueAt(i, 2).toString());
       try { txtDiscription.setText(mode.getValueAt(i, 3).toString());}catch (Exception e){ txtDiscription.setText(""); }
        
        String Active = mode.getValueAt(i, 6).toString().trim();
        String cusActive = mode.getValueAt(i, 7).toString().trim();
        String cusGroupActive = mode.getValueAt(i, 8).toString().trim();
        String empGroupActive = mode.getValueAt(i, 9).toString().trim(); 
        String empActive = mode.getValueAt(i, 10).toString().trim();
        String serviceActive = mode.getValueAt(i, 11).toString().trim();
        String waterUseActive = mode.getValueAt(i, 12).toString().trim();
        String empAttendenceActive = mode.getValueAt(i, 13).toString().trim();
        String paymentActive = mode.getValueAt(i, 14).toString().trim();
        String invoiceActive = mode.getValueAt(i, 15).toString().trim();
        String reportActive = mode.getValueAt(i, 16).toString().trim();
        String aboutActive = mode.getValueAt(i, 17).toString().trim();
        String pumpInfo = mode.getValueAt(i, 18).toString().trim();
        String PriceListActive = mode.getValueAt(i, 19).toString().trim();
        String userManagementActive = mode.getValueAt(i, 20).toString().trim();
        String subCom = mode.getValueAt(i, 21).toString().trim();
        String commonC = mode.getValueAt(i, 22).toString().trim();
        String FullName ;
     try { FullName = mode.getValueAt(i, 23).toString().trim();}catch (Exception ex){FullName="";}
        
        txtFullName.setText(FullName);
      
        //IsActive Check
        if(Active.equals("Y")){
            rbIsactive.setSelected(true);
        }else{
             rbIsactive.setSelected(false);  
        }
        
        //Check user Has customer Create Access
        if(cusActive.equals("Y")){
            cbCustomer.setSelected(true);
        }else{
             cbCustomer.setSelected(false);  
        }
         
         //Check user Has customer Group Create Access
         
        if(cusGroupActive.equals("Y")){
            cbCusGroup.setSelected(true);
        }else{
             cbCusGroup.setSelected(false);  
        } 
          //Check user Has Employee Create Access
          
        if(empActive.equals("Y")){
            cbEmployee.setSelected(true);
        }else{
             cbEmployee.setSelected(false);  
        } 

         //Check user Has Employee Group Create Access
         if(empGroupActive.equals("Y")){
            cbEmpGroup.setSelected(true);
        }else{
             cbEmpGroup.setSelected(false);  
        } 
        
          //Check user Has Employee Attendence marks Access
        if(empAttendenceActive.equals("Y")){
            cbEmpAttendence.setSelected(true);
        }else{
             cbEmpAttendence.setSelected(false);  
        }  
        
        //Check user Has payment record Access
        if(paymentActive.equals("Y")){
            cbPayment.setSelected(true);
        }else{
             cbPayment.setSelected(false);  
        } 
          //Check user Has user Manage Access
        
        if(userManagementActive.equals("Y")){
            cbUserManage.setSelected(true);
        }else{
             cbUserManage.setSelected(false);  
        } 
         //Check user Has price list Manage Access
        if(PriceListActive.equals("Y")){
            cbPriceList.setSelected(true);
        }else{
             cbPriceList.setSelected(false);  
        } 
        
        //Check user Has price list Manage Access
        if(aboutActive.equals("Y")){
            cbAbout.setSelected(true);
        }else{
             cbAbout.setSelected(false);  
        }
         //Check user invoic Manage Access
        if(invoiceActive.equals("Y")){
            cbInvoice.setSelected(true);
        }else{
             cbInvoice.setSelected(false);  
        }
        
         //Check user Has reports Access
        if(reportActive.equals("Y")){
            cbReports.setSelected(true);
        }else{
             cbReports.setSelected(false);  
        }
        
        if(serviceActive.equals("Y")){
            cbService.setSelected(true);
        }else{
             cbService.setSelected(false);  
        }
        
        
         if(waterUseActive.equals("Y")){
            cbWaterUsage.setSelected(true);
        }else{
             cbWaterUsage.setSelected(false);  
        }
          
        if(pumpInfo.equals("Y")){
            cbpumpInfo.setSelected(true);
        }else{
             cbpumpInfo.setSelected(false);  
        }
        
        if(pumpInfo.equals("Y")){
            cbpumpInfo.setSelected(true);
        }else{
             cbpumpInfo.setSelected(false);  
        }
    
        if(subCom.equals("Y")){
            ckSubCommity.setSelected(true);
        }else{
             ckSubCommity.setSelected(false);  
        }
        
        if(commonC.equals("Y")){
            ckCommonContoler.setSelected(true);
        }else{
             ckCommonContoler.setSelected(false);  
        }
        
    }//GEN-LAST:event_usersTableMouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
    
        // change user Accecess Levels
        
        int  user_id = Integer.parseInt(txtSearchID.getText());
        String userType,userName,PassWord,customer,cusGroup,empLoyee ,empAttendence,empGroup,service,fullName,
               waterUsage, pumpInfo,Payment,invoice,report,about,priceList,userManage,createddate,
               isActive,createdBy,discription,fixvaribale,subCommity;
        
        
        fullName =txtFullName.getText();
        userType= txtFName.getText();
        userName= txtUerName.getText();
        PassWord =txtPassWord.getText();
        discription =txtDiscription.getText();
        Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
        if(cbCustomer.isSelected()==true){
            customer ="Y";

        }else{
            customer ="N";
        }
        
        if(cbCusGroup.isSelected()==true){
             cusGroup ="Y";
        }else{
            cusGroup ="N";
        }
        
        if(cbEmployee.isSelected()==true){
             empLoyee ="Y";
        }else{
             empLoyee ="N";
        }
        
        if(cbEmpGroup.isSelected()==true){
             empGroup ="Y";
        }else{
             empGroup ="N";
        }
         
        if(cbService.isSelected()==true){
             service="Y";
        }else{
             service ="N";
        }
        if(cbWaterUsage.isSelected()==true){
             waterUsage="Y";
        }else{
             waterUsage ="N";
        }
        if(cbEmpAttendence.isSelected()==true){
             empAttendence="Y";
        }else{
             empAttendence ="N";
        }
        if(cbpumpInfo.isSelected()==true){
             pumpInfo="Y";
        }else{
             pumpInfo ="N";
        }
        if(cbpumpInfo.isSelected()==true){
             pumpInfo="Y";
        }else{
            pumpInfo ="N";
        }
        if(cbPayment.isSelected()==true){
             Payment="Y";
        }else{
             Payment ="N";
        }
        
        if(cbInvoice.isSelected()==true){
             invoice="Y";
        }else{
             invoice ="N";
        }
        
        if(cbReports.isSelected()==true){
             report="Y";
        }else{
            report ="N";
        }
        
        if(cbAbout.isSelected()==true){
             about="Y";
        }else{
            about="N";
        }
        
        if(cbPriceList.isSelected()==true){
            priceList="Y";
        }else{
           priceList="N";
        }
         
        if(cbUserManage.isSelected()==true){
             userManage="Y";
        }else{
            userManage="N";
        }
         
        if(rbIsactive.isSelected()==true){
            
            isActive ="Y";
        }else{
        
            isActive ="N"; 
        }
        
        if(ckSubCommity.isSelected()==true){
            
            subCommity ="Y";
        }else{
        
            subCommity ="N"; 
        }
        if(ckCommonContoler.isSelected()==true){
            
            fixvaribale ="Y";
        }else{
        
            fixvaribale ="N"; 
        }
        
       
        UsersRolsManagement urm = new UsersRolsManagement();
        urm.setAbout(about);
        urm.setIsActive(isActive);
        urm.setCusGroup(cusGroup);
        urm.setCustomer(customer);
        urm.setPayment(Payment);
        urm.setPriceList(priceList);
        urm.setPumpInfo(pumpInfo);
        urm.setInvoice(invoice);
        urm.setFname(userType);
        urm.setDiscription(discription);
        urm.setCreatedBy(User_ID+"");
        urm.setCreateddate(""+currentTimestamp);
        urm.setEmpAttendence(empAttendence);
        urm.setEmpGroup(empGroup);
        urm.setEmpLoyee(empLoyee);
        urm.setReport(report);
        urm.setUserId(user_id);
        urm.setUserManage(userManage);
        urm.setService(service);
        urm.setUserName(userName);
        urm.setWaterUsage(waterUsage);
        urm.setSubCommtee(subCommity);
        urm.setFixCost(fixvaribale);
        urm.setFullName(fullName);
        
        try {
            boolean result =UserRoleManagementControler.UpdateUserRole(urm);
              if(result){
              JOptionPane.showMessageDialog(null,"User Roles Changed !");
               Show_USers();
               clearFild();
              } else{
              JOptionPane.showMessageDialog(null,"Error!");
              } 
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        



        
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        UsersRolsManagement urm =new UsersRolsManagement();
        urm.setUserId(Integer.parseInt(txtSearchID.getText()));
        
        try {
            
            boolean result =UserRoleManagementControler.UserRemove(urm);
            
         if(result){
             
             JOptionPane.showMessageDialog(null,"  Romoved  !");
         
         }  else{
         
         JOptionPane.showMessageDialog(null,"Error Remove Fail !");
         } 
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         
       
        Show_USers();
        clearFild();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Show_USers();
        clearFild();

        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       
        
        int id =Integer.parseInt(txtSearchID.getText());
        
         ArrayList<UsersRolsManagement>list;
        try {
            list = UserRoleManagementControler.UserRolesSearch(id); //userList
             DefaultTableModel dtm =(DefaultTableModel)usersTable.getModel();
             dtm.setRowCount(0);
           //Object [] row= new Object[list.size()];
     
         for(UsersRolsManagement urm :list){
     
         Object[] rowData = {
                    urm.getUserId(),
                    urm.getFname(),
                    "",
                   /// urm.getUserName(),
                    urm.getDiscription(),
                    urm.getCreatedBy(),
                    urm.getCreateddate(),
                    urm.getIsActive(),
                    urm.getCustomer(),
                    urm.getCusGroup(),
                    urm.getEmpGroup(),
                    urm.getEmpLoyee(),
                    urm.getService(),
                    urm.getWaterUsage(),
                    urm.getEmpAttendence(),
                    urm.getPayment(),
                    urm.getInvoice(),
                    urm.getReport(),
                    urm.getAbout(),
                    urm.getPumpInfo(),
                    urm.getPriceList(),
                    urm.getUserManage(),
                    urm.getSubCommtee(),
                    urm.getFixCost(),
                    urm.getFullName()
                        
                };
             
       
                 dtm.addRow(rowData);
            
            }    
            
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            
            JOptionPane.showMessageDialog(null, ex);
            //Logger.getLogger(UserManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchIDKeyPressed
        
         txtSearchID.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent eve) {
                String AllowedData="0123456789";
                char enter = eve.getKeyChar();
                int count=0;
                
                if (!AllowedData.contains(String.valueOf(enter))||count>1) {
                    eve.consume();
                }
            }       
        });
        
        
    }//GEN-LAST:event_txtSearchIDKeyPressed

    private void txtSearchIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchIDActionPerformed
       btnSearch.doClick();
    }//GEN-LAST:event_txtSearchIDActionPerformed

    
public void clearTable()
{
       DefaultTableModel dm = (DefaultTableModel)usersTable. getModel();
       int rowCount = dm.getRowCount();
       //Remove rows one by one from the end of the table
       for (int i = rowCount - 1; i >= 0; i--) {
       dm.removeRow(i);
    }
}
    
public void clearFild(){
            rbIsactive.setSelected(true);
            txtSearchID.setText("");
            txtFName.setText("");
            txtDiscription.setText("");
            txtPassWord.setText("");
            txtUerName.setText("");
            txtFullName.setText("");
            rbIsactive.setSelected(false);
            cbCusGroup.setSelected(false);
            cbCustomer.setSelected(false);
            cbService.setSelected(false);
            cbpumpInfo.setSelected(false);
            cbPayment.setSelected(false);
            cbInvoice.setSelected(false);
            cbAbout.setSelected(false);
            cbPriceList.setSelected(false);
            cbpumpInfo.setSelected(false);
            cbEmpAttendence.setSelected(false);
            cbWaterUsage.setSelected(false);
            cbEmployee.setSelected(false);
            cbEmpGroup.setSelected(false);
            cbReports.setSelected(false);
            cbUserManage.setSelected(false);
            txtPassWord.setEditable(true);
            txtUerName.setEditable(true);
            ckCommonContoler.setSelected(false);
            ckSubCommity.setSelected(false);
             txtFName.setBackground(Color.white);
            txtUerName.setBackground(Color.white);
            txtPassWord.setBackground(Color.white);
            txtFullName.setBackground(Color.white);
            txtFName.setBackground(Color.white);
            txtUerName.setBackground(Color.white);
            txtPassWord.setBackground(Color.white);
            txtFullName.setBackground(Color.white);

}  


    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnNewUser;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox cbAbout;
    private javax.swing.JCheckBox cbCusGroup;
    private javax.swing.JCheckBox cbCustomer;
    private javax.swing.JCheckBox cbEmpAttendence;
    private javax.swing.JCheckBox cbEmpGroup;
    private javax.swing.JCheckBox cbEmployee;
    private javax.swing.JCheckBox cbInvoice;
    private javax.swing.JCheckBox cbPayment;
    private javax.swing.JCheckBox cbPriceList;
    private javax.swing.JCheckBox cbReports;
    private javax.swing.JCheckBox cbService;
    private javax.swing.JCheckBox cbUserManage;
    private javax.swing.JCheckBox cbWaterUsage;
    private javax.swing.JCheckBox cbpumpInfo;
    private javax.swing.JCheckBox ckCommonContoler;
    private javax.swing.JCheckBox ckSubCommity;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbIsactive;
    private javax.swing.JTextField txtDiscription;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtPassWord;
    private javax.swing.JTextField txtSearchID;
    private javax.swing.JTextField txtUerName;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}
