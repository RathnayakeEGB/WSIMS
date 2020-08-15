
package bw.randiyadahara.wsims.view;

import bw.randiyadahara.wsims.controler.CustomerControler;
import bw.randiyadahara.wsims.controler.CustomerGroupControler;
import bw.randiyadahara.wsims.controler.SubCommiteeControler;
import bw.randiyadahara.wsims.model.Customer;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public final class Customers extends javax.swing.JFrame {

   
    public Customers() {
        initComponents();
        setCustomerNo();
        setSubComiteeName();
        setGroupName();
        ButtonGroup b= new ButtonGroup();
        b.add(rbMale);
        b.add(rbFemale);
        ViewCustomers();
        rbIsActive.setSelected(true);
    }
    
    private int User_ID;
    String ImageParth;
      public Customers(int User_ID) {
        initComponents();
        this.User_ID=User_ID;
        setCustomerNo();
        setSubComiteeName();
        setGroupName();
        ButtonGroup b= new ButtonGroup();
        b.add(rbMale);
        b.add(rbFemale);
        ViewCustomers();
         rbIsActive.setSelected(true);
    }
      
      public void setCustomerNo(){
      
        try {
            String cusNo = CustomerControler.customerNo();
            txtCusNo.setText(cusNo);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Customers.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      }
      
    public void setSubComiteeName(){
      
        try {
            ArrayList<Customer> subComName =CustomerControler.getSubCommitiesNames();
             for (Customer c : subComName){
             cmbSubcom.addItem(c.getSubCommiteName());
             } 
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      }   
      
    public void setGroupName(){
      
        try {
            ArrayList<Customer> groupName =CustomerControler.getCustomerGroup();
             for (Customer c : groupName){
             cmbCusGroup.addItem(c.getCustomerGroupName());
             } 
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      }    
      
    public ImageIcon setImageSize(String parth,byte [] image){
       lblImage.setIcon(null);
        ImageIcon cusImage = null;
        
        if(parth!=null){
            cusImage =new ImageIcon(parth);
        }else{
        cusImage =new ImageIcon(image);
        }
       Image ci = cusImage.getImage();
      // Image im =ci.getScaledInstance(lblImage.getHeight(),lblImage.getHeight(),lblImage.getWidth());
      Image im =ci.getScaledInstance(225,290,250);
       ImageIcon imageIcon = new ImageIcon(im);
       return imageIcon;
    }
    
     
    public String getSubCommiteeNo(String name){
    String subComNo=null;
        try {
             subComNo=SubCommiteeControler.getSubComNo(name);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Customers.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return  subComNo;
    
    }
     public String getGroupNo(String name){
    String cusGroupNo=null;
        try {
             cusGroupNo=CustomerGroupControler.getCustomerGroupNo(name);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Customers.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex);
        }
    
    return  cusGroupNo;
    
    }
     
       public  void ViewCustomers(){
    
       try {
            ArrayList<Customer>list=CustomerControler.viewAllCustomers(); //userList
            DefaultTableModel dtm =(DefaultTableModel)tblCustomers.getModel();
            //Object [] row =new Object[4];
            dtm.setRowCount(0);
            for(Customer c :list){
                
                Object[] rowData = {
                   c.getCusNo(),
                   c.getIsactive(),
                   c.getOpBalance(),
                   c.getNameWI(),
                   c.getName(),
                   c.getGender(),
                   c.getAddress(),
                   c.getNic(),
                   c.getPhone(),
                   c.getRegDate(),
                   c.getSubCommiteName(),
                   c.getGroupNo(),
                   c.getDiscription()
                        
                };
                
                dtm.addRow(rowData);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EmployeeGroup.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCusNo = new javax.swing.JTextField();
        txtNWI = new javax.swing.JTextField();
        TxtAddress = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rbIsActive = new javax.swing.JRadioButton();
        lblImage = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbCusGroup = new javax.swing.JComboBox<>();
        btnBrows = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        btnHome = new javax.swing.JButton();
        dChoocer = new com.toedter.calendar.JDateChooser();
        txtFullName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbSubcom = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        TxtNic = new javax.swing.JTextField();
        rbFemale = new javax.swing.JRadioButton();
        rbMale = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnSearch1 = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomers = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(1038, 483));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Customer Number");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Full Name");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Address");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("NIC");

        txtCusNo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtCusNo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCusNo.setEnabled(false);

        txtNWI.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        TxtAddress.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtPhone.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPhoneKeyPressed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Register Date");

        rbIsActive.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbIsActive.setText("Active");

        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setAutoscrolls(true);
        lblImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblImage.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        lblImage.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Customer Group");

        cmbCusGroup.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmbCusGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCusGroupActionPerformed(evt);
            }
        });

        btnBrows.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/Brows.png"))); // NOI18N
        btnBrows.setText("Brows");
        btnBrows.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBrows.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBrows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowsActionPerformed(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Sub Commitee");

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/Update48.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/Save48.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/delete48.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/clear48.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Description");

        txtDescription.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/home2.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        dChoocer.setDateFormatString("yyyy-MM-dd");
        dChoocer.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtFullName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Name With Initial");

        cmbSubcom.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Phone");

        TxtNic.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TxtNic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNicActionPerformed(evt);
            }
        });
        TxtNic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNicKeyPressed(evt);
            }
        });

        rbFemale.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbFemale.setText(" Female");
        rbFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemaleActionPerformed(evt);
            }
        });

        rbMale.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbMale.setText(" Male");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Gender");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFullName)
                            .addComponent(txtNWI)
                            .addComponent(TxtAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDescription)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(cmbCusGroup, javax.swing.GroupLayout.Alignment.LEADING, 0, 234, Short.MAX_VALUE)
                                                .addComponent(TxtNic, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(dChoocer, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cmbSubcom, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(30, 30, 30)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(rbMale, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(rbFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 2, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCusNo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbIsActive, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btnBrows))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCusNo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbIsActive)))
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNWI, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbMale)
                            .addComponent(rbFemale)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TxtNic, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(dChoocer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCusGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(cmbSubcom, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrows, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Customer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Customer Number");

        btnSearch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/Search.png"))); // NOI18N
        btnSearch1.setText("Search");
        btnSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch1ActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnSearch1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Existing Customers", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel4.setToolTipText("");

        tblCustomers.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tblCustomers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cus No", "Active", "Open Balance", "NWI", "Full Name", "Gender", "Addres", "NIC", "Phone", "Reg Date", "SubCommitee", "Cus Group", "Description"
            }
        ));
        tblCustomers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCustomers);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCusGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCusGroupActionPerformed
        
    }//GEN-LAST:event_cmbCusGroupActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
    
      this.dispose();
      
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtCusNo.setBackground(Color.white);
        txtPhone.setBackground(Color.white);
        TxtAddress.setBackground(Color.white);
        txtNWI.setBackground(Color.white);
        txtFullName.setBackground(Color.white);
        TxtNic.setBackground(Color.white);
        txtPhone.setBackground(Color.white);
        txtSearch.setBackground(Color.white);
        cmbCusGroup.removeAllItems();
        cmbSubcom.removeAllItems();
        dChoocer.setCalendar(null);
        lblImage.setIcon(null);
        TxtAddress.setText("");
        TxtNic.setText("");
        txtCusNo.setText("");
        txtDescription.setText("");
        txtFullName.setText("");
        txtNWI.setText("");
        txtSearch.setText("");
        txtPhone.setText("");
        setSubComiteeName();
        setGroupName();
        setCustomerNo();
        ViewCustomers();
        rbFemale.setSelected(false);
        rbMale.setSelected(false);
         rbIsActive.setSelected(true);
    }//GEN-LAST:event_btnClearActionPerformed

    private void TxtNicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNicActionPerformed

    private void btnBrowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowsActionPerformed
      lblImage.setText(null);
      lblImage.setIcon(null);
       JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new File(System.getProperty("user.home")));
        // parth = null;
                
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.images","jpg","png");
        fc.addChoosableFileFilter(filter);
        
        int result = fc.showSaveDialog(null);
        
        if(result ==JFileChooser.APPROVE_OPTION ){
        
            File selectedFile =fc.getSelectedFile();
           String parth =selectedFile.getAbsolutePath();
            ImageParth=parth;
          lblImage.setIcon(setImageSize(parth,null));
        //    lblImage.set
           //JOptionPane.showMessageDialog(null, parth);
       
         }else{
        
        lblImage.setText("NO Image !");
        } 
     
     
    
       
    }//GEN-LAST:event_btnBrowsActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        if(txtFullName.getText().trim().equals("")||TxtAddress.getText().trim().equals("")||TxtNic.getText().trim().equals("")||txtNWI.getText().trim().equals("")||txtPhone.getText().trim().equals("")||dChoocer.getDate() == null){
           JOptionPane.showMessageDialog(null,"Fill All Relevent Fields !");
            
            if(txtFullName.getText().trim().equals("")){
                txtFullName.setBackground(Color.pink);
            }else{
                txtFullName.setBackground(Color.white);
            }
            if(TxtAddress.getText().trim().equals("")){
               TxtAddress.setBackground(Color.pink);
            }else{
               TxtAddress.setBackground(Color.white);
            }
            if(TxtNic.getText().trim().equals("")){
                 TxtNic.setBackground(Color.pink);
            }else{
                 TxtNic.setBackground(Color.white);
                 if(TxtNic.getText().length()==10 ||TxtNic.getText().length()==12){
                     TxtNic.setBackground(Color.white);
                 }else{
                     TxtNic.setText("Invalid Nic");
                 }
                 
            }
            if(txtNWI.getText().trim().equals("")){
                 txtNWI.setBackground(Color.pink);
            }else{
                 txtNWI.setBackground(Color.white);
            }
             if(txtPhone.getText().trim().equals("")){
                 txtPhone.setBackground(Color.pink);
            }else{
                 txtPhone.setBackground(Color.white);
            }
            if(dChoocer.getCalendar() == null){
                 dChoocer.setBackground(Color.pink);
            }else{
                 dChoocer.setBackground(Color.white);
            }
            
        }else{
        
            String fname =txtFullName.getText();
            String nWiName= txtNWI.getText();
            String address =TxtAddress.getText();
            String phone =txtPhone.getText();
            String nic =TxtNic.getText();
            java.sql.Date Regdate = new java.sql.Date(dChoocer.getDate().getTime());
            String subComNo =getSubCommiteeNo(cmbSubcom.getSelectedItem().toString());
            String cusGroupNo =getGroupNo(cmbCusGroup.getSelectedItem().toString());
            String discription =txtDescription.getText(),isActive="N",deleteYes ="N";
            String CusNo =txtCusNo.getText(); 
            Timestamp CreatedDate =new Timestamp(System.currentTimeMillis());
            int createdBy =User_ID;
            String url =ImageParth,gen;
            if(url == null){
            url ="No Image";
            }else{
            url =ImageParth;
            }
            if(rbFemale.isSelected()){
                  gen ="F";
            }else{gen ="M";}
            
            
            if(rbIsActive.isSelected()){
            isActive="Y";
            }
            
            
            
            
            if(txtPhone.getText().length()!=10){
            
                JOptionPane.showMessageDialog(null, "Invalid Phone Number !");
                txtPhone.setBackground(Color.pink);
                return;
            }else{
            
                 txtPhone.setBackground(Color.white);
            }
            
            
            if(TxtNic.getText().length()<10){
            
                JOptionPane.showMessageDialog(null, "Invalid NIC Number !");
                TxtNic.setBackground(Color.pink);
                return;
            }else if(TxtNic.getText().length()<12){
                
                if(TxtNic.getText().length()==11){
                    
                     JOptionPane.showMessageDialog(null, "Invalid NIC Number !");
                     TxtNic.setBackground(Color.pink);
                    return;
                }
                
            
                 TxtNic.setBackground(Color.white);
            } 
            
             TxtNic.setBackground(Color.white);
            
            
            Customer c = new Customer();
            c.setName(fname);
            c.setNameWI(nWiName);
            c.setAddress(address);
            c.setPhone(phone);
            c.setNic(nic);
            c.setRegDate(Regdate);
            c.setSubCno(subComNo);
            c.setGroupNo(cusGroupNo);
            c.setDiscription(discription);
            c.setDeleteYes(deleteYes);
            c.setIsactive(isActive);
            c.setCusNo(CusNo);
            c.setGender(gen);
            c.setCreatedDate(CreatedDate);
            c.setCreatedby(createdBy);
            c.setUrl(url);
            c.setOpBalance(0.0f);
          //  c.setUserimage(url.getBytes());
            
            try {
               boolean result = CustomerControler.createNewCustomerAccount(c);
               if(result){
                   JOptionPane.showMessageDialog(null,"Created Customer Account !");
                   btnClear.doClick();
                    }else{JOptionPane.showMessageDialog(null,"Error !");}
               
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null,ex);
                Logger.getLogger(Customers.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtPhoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyPressed


            txtPhone.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent eve) {
                String AllowedData="0123456789";
                char enter = eve.getKeyChar();
                int count=0;
                if(eve.getKeyChar()=='-'){
                count++;
                }
                
                if (!AllowedData.contains(String.valueOf(enter))||count>1) {
                    eve.consume();
                }
            }       
        });

      
            
         txtPhone.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            if (txtPhone.getText().length() >= 10 ) // limit to 3 characters
                e.consume();
        }
    });
            
            
    }//GEN-LAST:event_txtPhoneKeyPressed

    private void TxtNicKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNicKeyPressed
     TxtNic.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent eve) {
                String AllowedData="0123456789Vv";
                char enter = eve.getKeyChar();
                int count=0;
                if(eve.getKeyChar()=='V'||eve.getKeyChar()=='v'){
                count++;
                }
                
                if (!AllowedData.contains(String.valueOf(enter))||count>1) {
                    eve.consume();
                }
            }       
        });

      
            
         TxtNic.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            if (TxtNic.getText().length() >= 12 ) // limit to 3 characters
                e.consume();
        }
    });        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNicKeyPressed

    private void rbFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFemaleActionPerformed

    private void tblCustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomersMouseClicked

        lblImage.setIcon(null);
        lblImage.setText(null);
        
        int i= tblCustomers.getSelectedRow();
        TableModel model =tblCustomers.getModel();
        txtCusNo.setText(model.getValueAt(i,0).toString());
        txtSearch.setText(model.getValueAt(i,0).toString());
        String isActive =model.getValueAt(i,1).toString();
        float openB = Float.parseFloat( model.getValueAt(i, 2).toString());
        txtNWI.setText(model.getValueAt(i,3).toString());
        txtFullName.setText(model.getValueAt(i,4).toString());
        String gen=model.getValueAt(i,5).toString();
        TxtAddress.setText(model.getValueAt(i,6).toString());
        TxtNic.setText(model.getValueAt(i,7).toString());
        txtPhone.setText(model.getValueAt(i,8).toString());
        Date tanggal = (Date) model.getValueAt(tblCustomers.getSelectedRow(), 9);
        dChoocer.setDate(tanggal);
        cmbCusGroup.removeAllItems();
        cmbSubcom.removeAllItems();
        cmbSubcom.addItem(model.getValueAt(i,10).toString());
        cmbCusGroup.addItem(model.getValueAt(i,11).toString());
        txtDescription.setText(model.getValueAt(i, 12).toString());
        if(isActive.equals("Y")){
            rbIsActive.setSelected(true);
        }else{
             rbIsActive.setSelected(false);  
        }

        if(gen.equals("Male")){
        rbMale.setSelected(true);
        }else{rbFemale.setSelected(true);}
        
        setSubComiteeName();
        setGroupName();
        String parth = null;
        try {
             parth=CustomerControler.getImageUrl(model.getValueAt(i, 0).toString());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Customers.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        if (!new File(parth).exists()){
        lblImage.setText(" NO Image !");
        
        }else{
        lblImage.setIcon(setImageSize(parth, null));
        }
                                                
       
        
    }//GEN-LAST:event_tblCustomersMouseClicked

    private void btnSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch1ActionPerformed


        String cusNo =txtSearch.getText().toUpperCase();
        txtSearch.setText(cusNo);
         try {
            ArrayList<Customer>list=CustomerControler.searchCustomer(cusNo); //userList
            DefaultTableModel dtm =(DefaultTableModel)tblCustomers.getModel();
            //Object [] row =new Object[4];
            dtm.setRowCount(0);
            for(Customer c :list){
                
                Object[] rowData = {
                   c.getCusNo(),
                   c.getIsactive(),
                   c.getOpBalance(),
                   c.getNameWI(),
                   c.getName(),
                   c.getGender(),
                   c.getAddress(),
                   c.getNic(),
                   c.getPhone(),
                   c.getRegDate(),
                   c.getSubCommiteName(),
                   c.getGroupNo(),
                   c.getDiscription()
                        
                };
               
                lblImage.setIcon(null);
                dtm.addRow(rowData);
                 txtCusNo.setText(c.getCusNo());
               //txtSearch.setText(model.getValueAt(i,0).toString());
                String isActive =c.getIsactive();
                float openB = c.getOpBalance();
                txtNWI.setText(c.getNameWI());
                txtFullName.setText(c.getName());
                String gen=c.getGender();
                TxtAddress.setText(c.getAddress());
                TxtNic.setText(c.getNic());
                txtPhone.setText(c.getPhone());
                Date tanggal =c.getRegDate();
                dChoocer.setDate(tanggal);
                cmbCusGroup.removeAllItems();
                cmbSubcom.removeAllItems();
                cmbSubcom.addItem(c.getSubCommiteName());
                cmbCusGroup.addItem(c.getGroupNo());
                txtDescription.setText(c.getDiscription());
                if(isActive.equals("Y")){
                    rbIsActive.setSelected(true);
                }else{
                     rbIsActive.setSelected(false);  
                }

                if(gen.equals("Male")){
                rbMale.setSelected(true);
                }else{rbFemale.setSelected(true);}

                setSubComiteeName();
                setGroupName();
                String parth = null;
                try {
                     parth=CustomerControler.getImageUrl(cusNo);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(Customers.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (!new File(parth).exists()){
                lblImage.setText(" NO Image !");

                }else{
                lblImage.setIcon(setImageSize(parth, null));
                }

                    }
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(EmployeeGroup.class.getName()).log(Level.SEVERE, null, ex);
                }
        



    }//GEN-LAST:event_btnSearch1ActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
            btnSearch1.doClick();        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

if(txtFullName.getText().trim().equals("")||TxtAddress.getText().trim().equals("")||TxtNic.getText().trim().equals("")||txtNWI.getText().trim().equals("")||txtPhone.getText().trim().equals("")||dChoocer.getDate() == null){
           JOptionPane.showMessageDialog(null,"Fill All Relevent Fields !");
            
            if(txtFullName.getText().trim().equals("")){
                txtFullName.setBackground(Color.pink);
            }else{
                txtFullName.setBackground(Color.white);
            }
            if(TxtAddress.getText().trim().equals("")){
               TxtAddress.setBackground(Color.pink);
            }else{
               TxtAddress.setBackground(Color.white);
            }
            if(TxtNic.getText().trim().equals("")){
                 TxtNic.setBackground(Color.pink);
            }else{
                 TxtNic.setBackground(Color.white);
                 if(TxtNic.getText().length()==10 ||TxtNic.getText().length()==12){
                     TxtNic.setBackground(Color.white);
                 }else{
                     TxtNic.setText("Invalid Nic");
                 }
                 
            }
            if(txtNWI.getText().trim().equals("")){
                 txtNWI.setBackground(Color.pink);
            }else{
                 txtNWI.setBackground(Color.white);
            }
             if(txtPhone.getText().trim().equals("")){
                 txtPhone.setBackground(Color.pink);
            }else{
                 txtPhone.setBackground(Color.white);
            }
            if(dChoocer.getCalendar() == null){
                 dChoocer.setBackground(Color.pink);
            }else{
                 dChoocer.setBackground(Color.white);
            }
            
        }else{
        
            String fname =txtFullName.getText();
            String nWiName= txtNWI.getText();
            String address =TxtAddress.getText();
            String phone =txtPhone.getText();
            String nic =TxtNic.getText();
            java.sql.Date Regdate = new java.sql.Date(dChoocer.getDate().getTime());
            String subComNo =getSubCommiteeNo(cmbSubcom.getSelectedItem().toString());
            String cusGroupNo =getGroupNo(cmbCusGroup.getSelectedItem().toString());
            String discription =txtDescription.getText(),isActive="N",deleteYes ="N";
            String CusNo =txtCusNo.getText(); 
            Timestamp UpdatedDate =new Timestamp(System.currentTimeMillis());
            int UpdateBy =User_ID;
            String url =ImageParth,gen;
            if(url == null){
            url ="No Image";
            }else{
            url =ImageParth;
            }
            if(rbFemale.isSelected()){
                  gen ="F";
            }else{gen ="M";}
            
            
            if(rbIsActive.isSelected()){
            isActive="Y";
            }
            
            
             if(txtPhone.getText().length()!=10){
            
                JOptionPane.showMessageDialog(null, "Invalid Phone Number !");
                txtPhone.setBackground(Color.pink);
                return;
            }else{
            
                 txtPhone.setBackground(Color.white);
            }
            
            
            if(TxtNic.getText().length()<10){
            
                JOptionPane.showMessageDialog(null, "Invalid NIC Number !");
                TxtNic.setBackground(Color.pink);
                return;
            }else if(TxtNic.getText().length()<12){
                
                if(TxtNic.getText().length()==11){
                    
                     JOptionPane.showMessageDialog(null, "Invalid NIC Number !");
                     TxtNic.setBackground(Color.pink);
                    return;
                }
                
            
                 TxtNic.setBackground(Color.white);
            } 
            
             TxtNic.setBackground(Color.white);
            
            
            
            
            
            Customer c = new Customer();
            c.setName(fname);
            c.setNameWI(nWiName);
            c.setAddress(address);
            c.setPhone(phone);
            c.setNic(nic);
            c.setRegDate(Regdate);
            c.setSubCno(subComNo);
            c.setGroupNo(cusGroupNo);
            c.setDiscription(discription);
            c.setDeleteYes(deleteYes);
            c.setIsactive(isActive);
            c.setCusNo(CusNo);
            c.setGender(gen);
            c.setUpdateDate(UpdatedDate);
            c.setUpdateBy(UpdateBy);
            c.setUrl(url);
            c.setOpBalance(0.0f);
          //  c.setUserimage(url.getBytes());
            
            try {
               boolean result = CustomerControler.updateCustomerAccount(c);
               if(result){
                   JOptionPane.showMessageDialog(null,"Updated Customer Details !");
                   btnClear.doClick();
                    }else{JOptionPane.showMessageDialog(null,"Error !");}
               
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null,ex);
                Logger.getLogger(Customers.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }





        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        String cusNo =txtCusNo.getText();
        Customer c =new Customer();
        c.setCusNo(cusNo);
        c.setDeleteYes("Y");
        
        try {
          boolean result =  CustomerControler.RemoveCustomerAccount(c);
          if(result){
                JOptionPane.showMessageDialog(null,"Removed Customer Account !");
                btnClear.doClick();
          }else{
                JOptionPane.showMessageDialog(null,"Error !");
                btnClear.doClick();
          }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Customers.class.getName()).log(Level.SEVERE, null, ex);
        }
        


    }//GEN-LAST:event_btnDeleteActionPerformed
 
    
    
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
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Customers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtAddress;
    private javax.swing.JTextField TxtNic;
    private javax.swing.JButton btnBrows;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbCusGroup;
    private javax.swing.JComboBox<String> cmbSubcom;
    private com.toedter.calendar.JDateChooser dChoocer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbIsActive;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTable tblCustomers;
    private javax.swing.JTextField txtCusNo;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtNWI;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
