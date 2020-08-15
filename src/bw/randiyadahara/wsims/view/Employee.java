
package bw.randiyadahara.wsims.view;

import bw.randiyadahara.wsims.controler.EmployeeControler;
import bw.randiyadahara.wsims.controler.GetDateTime;
import bw.randiyadahara.wsims.model.EmployeesGroup;
import bw.randiyadahara.wsims.model.Employeses;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public final class Employee extends javax.swing.JFrame {

    public Employee() {
    initComponents();
    getEmpNO();
    loadJobTitle();
    ButtonGroup b= new ButtonGroup();
    b.add(rbMale);
    b.add(rbFemale);
    b.getSelection();
    viewEmployees();
    rbisActive.setSelected(true);
   
    }

    int user_Id;
    PreparedStatement pst =null;
    
    
    public Employee(int user_id){ //constructor override
    this.user_Id =user_id;
    initComponents();
    loadJobTitle();
    ButtonGroup b= new ButtonGroup();
    b.add(rbMale);
    b.add(rbFemale);
    viewEmployees();
    getEmpNO();
      rbisActive.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtEmpId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtNic = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtPhone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rbFemale = new javax.swing.JRadioButton();
        rbMale = new javax.swing.JRadioButton();
        jTextField6 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rbisActive = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cmbJobtitle = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        txtCalander = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        empTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Info Management", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Employee ID");

        txtEmpId.setEditable(false);
        txtEmpId.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Full Name");

        txtFullName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Address");

        txtAddress.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("NIC");

        TxtNic.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TxtNic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNicKeyPressed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("TelePhone");

        TxtPhone.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TxtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtPhoneKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtPhoneKeyTyped(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Register Date");

        rbFemale.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbFemale.setText("Female");

        rbMale.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbMale.setText("Male");

        jTextField6.setText("jTextField6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbMale)
                        .addGap(44, 44, 44)
                        .addComponent(rbFemale))
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMale)
                    .addComponent(rbFemale))
                .addGap(18, 18, 18)
                .addComponent(jTextField6)
                .addContainerGap())
        );

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Gender");

        rbisActive.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbisActive.setText("Active");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/home2.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Job Title");

        jLabel10.setText("Description");

        txtDescription.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtCalander.setBackground(new java.awt.Color(0, 0, 153));
        txtCalander.setForeground(new java.awt.Color(0, 204, 204));
        txtCalander.setAutoscrolls(true);
        txtCalander.setDateFormatString("yyyy-MM-dd");
        txtCalander.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtCalander.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtNic)
                            .addComponent(TxtPhone)
                            .addComponent(cmbJobtitle, 0, 205, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescription)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtCalander, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAddress)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                                .addComponent(rbisActive, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtFullName, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbisActive)
                            .addComponent(jLabel8)))
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TxtNic, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCalander, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TxtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbJobtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)))))
                .addGap(34, 34, 34)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Info Management", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        empTable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        empTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EMP ID", "Full Name", "Active", "Address", "NIC", "Phone", "Reg Date", "Gender", "Job title", "Description"
            }
        ));
        empTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(empTable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Info Management", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Employee ID");

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/Search.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
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
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void loadJobTitle(){
    
        try {
            ArrayList<EmployeesGroup> JopTitle =EmployeeControler.getJobTitle();
             for (EmployeesGroup eg : JopTitle){
             cmbJobtitle.addItem(eg.getTitle());
             } 
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    
    public  String  getJobNumber(){
        String emproup=null;
        String jobTitle=cmbJobtitle.getSelectedItem().toString();
        try {
          emproup=  EmployeeControler.getJobNo(jobTitle);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return emproup;
    }
    
    public void getEmpNO(){
    
         String empNo =null; 
     
        try { 
           empNo= EmployeeControler.getEmpNo();
           txtEmpId.setText(empNo);  
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
    
    
    public void viewEmployees(){
    
      try {
            ArrayList<Employeses> allEmployee=EmployeeControler.viewCustomerAll();
            
            DefaultTableModel dtm = (DefaultTableModel) empTable.getModel();
            dtm.setRowCount(0);      
            for (Employeses employeses : allEmployee) {
                
                Object[] rowData = {
                    employeses.getEmpNo(),
                    employeses.getName(),
                    employeses.getIsactive(),
                    employeses.getAddress(),
                    employeses.getInc(),
                    employeses.getTele(),
                    employeses.getCreatedDate(),
                    employeses.getGender(),
                    employeses.getDeleteYes(),
                    employeses.getDiscription(),  
                        
                };
                
                dtm.addRow(rowData);    

            }    
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
    
    
    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
     
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        btnSearch.doClick();
        
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
   if(txtFullName.getText().equals("")||TxtNic.getText().equals("")||TxtPhone.getText().equals("")||txtCalander.getDate()==null||txtAddress.getText().equals("")){
   
            
            if(TxtNic.getText().equals("")){   TxtNic.setBackground(Color.PINK);
            }else{
            TxtNic.setBackground(Color.white);
            }
            if(TxtPhone.getText().equals("")){
              TxtPhone.setBackground(Color.PINK);
            }else{
            TxtPhone.setBackground(Color.white);
            }
            if(txtFullName.getText().equals("")){
              txtFullName.setBackground(Color.PINK);
            }else{
            txtFullName.setBackground(Color.white);
            }
            if(txtAddress.getText().equals("")){
              txtAddress.setBackground(Color.PINK);
            }  else{
            txtAddress.setBackground(Color.white);
            }
        
            JOptionPane.showMessageDialog(null,"You should Fill Relevent Fild");
   }else{
           int user =user_Id;
           String fName =txtFullName.getText();
           String adddress =txtAddress.getText();
           String nic =TxtNic.getText();
           String jobtitleNo =getJobNumber();
           int teleNo =Integer.parseInt(TxtPhone.getText());
           String regDate;
           String empNo=txtEmpId.getText(); //get employee number
           String discription =txtDescription.getText();
           String deleteYes ="N";
           String gender="";
           String isactive;
           Timestamp createDate= new GetDateTime().CurrentDateTime();
           int cratedBy =user_Id;
           
           
           
           if(txtCalander.getDate()==null){
               
               JOptionPane.showMessageDialog(null,"Please Selecte Register data");
               txtCalander.setBackground(Color.red);
           }else{
               SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
               regDate =date.format(txtCalander.getDate());
           }
           
           if(rbisActive.isSelected()){
               
               isactive="Y";
               
           }else{
               
               isactive="N";
           }
           
           if(rbFemale.isSelected()){
               
               gender="F";
           }else if(rbMale.isSelected()){
               
               gender="M";
               
           }
           
           
            if(TxtPhone.getText().length()!=10){
            
                JOptionPane.showMessageDialog(null, "Invalid Phone Number !");
                TxtPhone.setBackground(Color.pink);
                return;
            }else{
            
                 TxtPhone.setBackground(Color.white);
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
           
           
           
           
           
           
           
           
           Employeses e = new Employeses ();
           e.setAddress(adddress);
           e.setCreatedDate(createDate);
           e.setCreatedby(user_Id);
           e.setDeleteYes(deleteYes);
           e.setDiscription(discription);
           e.setEmpNo(empNo);
           e.setGender(gender);
           e.setInc(nic);
           e.setIsactive(isactive);
           e.setJobid(1);
           e.setJobno(jobtitleNo);
           e.setName(fName);
           e.setTele(teleNo);
           e.setUpdateBy(user_Id);
           e.setUpdateDate(createDate);
           
           
    try {
           
           boolean rst =EmployeeControler.addEmployee(e);
           
           if(rst){  JOptionPane.showMessageDialog(null,"   Created New Employee  ");
           viewEmployees();
           TxtNic.setBackground(Color.WHITE);
           TxtPhone.setBackground(Color.WHITE);
           txtFullName.setBackground(Color.WHITE);
           txtAddress.setBackground(Color.white);
           
           btnClear.doClick();
               
           }else{
           
            JOptionPane.showMessageDialog(null,"error");
           }
           
       } catch (SQLException | ClassNotFoundException ex) {
          // JOptionPane.showMessageDialog(null,ex);
           Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
       }
                
           
   }
   
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
     
        TxtNic.setBackground(Color.white);
        txtAddress.setBackground(Color.white);
        txtFullName.setBackground(Color.white);
        txtFullName.setBackground(Color.white);
        TxtPhone.setBackground(Color.white);
        cmbJobtitle.removeAllItems();
        TxtNic.setText("");
        txtAddress.setText("");
        txtCalander.setCalendar(null);
        txtFullName.setText("");
        rbFemale.setSelected(false);
        rbMale.setSelected(false);
        rbisActive.setSelected(true);
        txtDescription.setText("");
        TxtPhone.setText("");
        txtSearch.setText("");
        loadJobTitle();
        getEmpNO();
        viewEmployees();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        if(txtFullName.getText().equals("")||TxtNic.getText().equals("")||TxtPhone.getText().equals("")||txtCalander.getDate()==null||txtAddress.getText().equals("")){
   
            
            if(TxtNic.getText().equals("")){   TxtNic.setBackground(Color.PINK);
            }else{
            TxtNic.setBackground(Color.white);
            }
            if(TxtPhone.getText().equals("")){
              TxtPhone.setBackground(Color.PINK);
            }else{
            TxtPhone.setBackground(Color.white);
            }
            if(txtFullName.getText().equals("")){
              txtFullName.setBackground(Color.PINK);
            }else{
            txtFullName.setBackground(Color.white);
            }
            if(txtAddress.getText().equals("")){
              txtAddress.setBackground(Color.PINK);
            }  else{
            txtAddress.setBackground(Color.white);
            }
            JOptionPane.showMessageDialog(null,"You should fill the relavent field  !");
            
             
   }else{
           int user =user_Id;
           String fName =txtFullName.getText();
           String adddress =txtAddress.getText();
           String nic =TxtNic.getText();
           String jobtitleNo =getJobNumber();
           int teleNo =Integer.parseInt(TxtPhone.getText());
           String regDate;
           String empNo=txtEmpId.getText(); //get employee number
           String discription =txtDescription.getText();
           String deleteYes ="N";
           String gender="";
           String isactive;
           Timestamp updatedDate= new GetDateTime().CurrentDateTime();
           int cratedBy =user_Id;
           if(txtCalander.getDate()==null){
               JOptionPane.showMessageDialog(null,"Please Selecte Register data");
               txtCalander.setBackground(Color.red);
           }else{
               SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
               regDate =date.format(txtCalander.getDate());
           }
           
           if(rbisActive.isSelected()){
               isactive="Y";   
           }else{
               isactive="N";
               
           }
           if(rbFemale.isSelected()){   
               gender="F";
           }else if(rbMale.isSelected()){
               gender="M";
           }
           
           
           
            if(TxtPhone.getText().length()!=10){
            
                JOptionPane.showMessageDialog(null, "Invalid Phone Number !");
                TxtPhone.setBackground(Color.pink);
                return;
            }else{
            
                 TxtPhone.setBackground(Color.white);
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
           
           
           
           
           
           
           Employeses e = new Employeses ();
           e.setAddress(adddress);
           e.setCreatedby(user_Id);
           e.setDeleteYes(deleteYes);
           e.setDiscription(discription);
           e.setEmpNo(empNo);
           e.setGender(gender);
           e.setInc(nic);
           e.setIsactive(isactive);
           e.setJobno(getJobNumber());
           e.setName(fName);
           e.setTele(teleNo);
           e.setUpdateBy(user_Id);
           e.setUpdateDate(updatedDate);  
    try {
           
           boolean rst =EmployeeControler.updateEmployeeDetails(e);
           
           if(rst){  
               
           JOptionPane.showMessageDialog(null,"Updated Employee Details  ");
           viewEmployees();
           TxtNic.setBackground(Color.WHITE);
           TxtPhone.setBackground(Color.WHITE);
           txtFullName.setBackground(Color.WHITE);
           txtAddress.setBackground(Color.white);
           btnClear.doClick();
               
           }else{
           
            JOptionPane.showMessageDialog(null,"Error !");
           }
           
       } catch (SQLException | ClassNotFoundException ex) {
          // JOptionPane.showMessageDialog(null,ex);
           Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
       }
                
           
     }
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
 
        Employeses e = new Employeses();
        e.setDeleteYes("Y");
        e.setEmpNo(txtEmpId.getText());
        
        try {
            
            boolean result =  EmployeeControler.removeEmployee(e);
            
            if(result){
                JOptionPane.showMessageDialog(null,"Removed The Employee !");
                viewEmployees();
                btnClear.doClick();
            }else{
            
             JOptionPane.showMessageDialog(null,"Error !");
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void empTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empTableMouseClicked

        cmbJobtitle.removeAllItems();
        int i= empTable.getSelectedRow();
        TableModel model =empTable.getModel();
        
        TxtNic.setBackground(Color.white);
        txtFullName.setBackground(Color.white);
        txtAddress.setBackground(Color.white);
        TxtPhone.setBackground(Color.white);

        txtEmpId.setText(model.getValueAt(i,0).toString());
        txtSearch.setText(model.getValueAt(i, 0).toString());
        txtFullName.setText(model.getValueAt(i,1).toString());
        String isActive=(model.getValueAt(i,2).toString());
        txtAddress.setText(model.getValueAt(i,3).toString());
        TxtNic.setText(model.getValueAt(i,4).toString());
        TxtPhone.setText(model.getValueAt(i,5).toString());
        Date tanggal = (Date) model.getValueAt(empTable.getSelectedRow(), 6);
        txtCalander.setDate(tanggal);
        String gender =(model.getValueAt(i,7).toString());
        cmbJobtitle.removeAllItems();
        cmbJobtitle.addItem(model.getValueAt(i,8).toString());
        txtDescription .setText(model.getValueAt(i,9).toString());
        
        if(isActive.equals("Y")){
            rbisActive.setSelected(true);
        }else{
             rbisActive.setSelected(false);  
        }
        if(gender.equals("M")){
        rbMale.setSelected(true);
        }else{
         rbFemale.setSelected(true);
        } 
      
        loadJobTitle();
    }//GEN-LAST:event_empTableMouseClicked

    private void TxtPhoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPhoneKeyPressed

          TxtPhone.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            if (TxtPhone.getText().length() >= 10 ) // limit to 3 characters
                e.consume();
        }
    });   
    }//GEN-LAST:event_TxtPhoneKeyPressed

    private void TxtPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPhoneKeyTyped
        
        TxtPhone.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    char vChar = e.getKeyChar();
                    if (!(Character.isDigit(vChar)
                            || (vChar == KeyEvent.VK_BACK_SPACE)
                            || (vChar == KeyEvent.VK_DELETE))) {
                        e.consume();
                    }
                }
            });
        
    }//GEN-LAST:event_TxtPhoneKeyTyped

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
    }); 
        
    }//GEN-LAST:event_TxtNicKeyPressed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

      String empNo =txtSearch.getText().toUpperCase().trim();
      
      
       try {
            ArrayList<Employeses> allEmployee=EmployeeControler.SearchCustomerAll(empNo);
            
            DefaultTableModel dtm = (DefaultTableModel) empTable.getModel();
            dtm.setRowCount(0);      
            for (Employeses employeses : allEmployee) {
                
                Object[] rowData = {
                    employeses.getEmpNo(),
                    employeses.getName(),
                    employeses.getIsactive(),
                    employeses.getAddress(),
                    employeses.getInc(),
                    employeses.getTele(),
                    employeses.getCreatedDate(),
                    employeses.getGender(),
                    employeses.getDeleteYes(),
                    employeses.getDiscription(),  
                        
                };
                
                dtm.addRow(rowData);
                
                txtEmpId.setText(employeses.getEmpNo());
                txtFullName.setText(employeses.getName());
                txtAddress.setText(employeses.getAddress());
                TxtNic.setText(employeses.getInc());
                TxtPhone.setText(""+employeses.getTele());
                txtCalander.setDate(employeses.getCreatedDate());
                txtDescription.setText( employeses.getDiscription());
                
                if(employeses.getGender().equals("M")){
                rbMale.setSelected(true);
                }else{
                rbFemale.setSelected(true);
                }
                
                if(employeses.getIsactive().equals("Y")){
                rbisActive.setSelected(true);
                }else{
                rbisActive.setSelected(false);
                }
              cmbJobtitle.removeAllItems();
              cmbJobtitle.addItem(employeses.getDeleteYes());
              loadJobTitle();
            }    
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        } 



        
    }//GEN-LAST:event_btnSearchActionPerformed

    
    
    
   
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
                 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtNic;
    private javax.swing.JTextField TxtPhone;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JComboBox<String> cmbJobtitle;
    private javax.swing.JTable empTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JRadioButton rbisActive;
    private javax.swing.JTextField txtAddress;
    private com.toedter.calendar.JDateChooser txtCalander;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtEmpId;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
