
package bw.randiyadahara.wsims.view;

import bw.randiyadahara.wsims.controler.EmployeeAttendenceControler;
import bw.randiyadahara.wsims.model.EmployeesAttendence;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;



public final class EmployeeAttendence extends javax.swing.JFrame {

   
    public EmployeeAttendence() {
        initComponents();
       viewAttendenceRecord();
       attendenceNo();
         rbIsactive.setSelected(false);
    }

    int UserID ;
   public EmployeeAttendence(int UserID) {
        initComponents();
        this.UserID=UserID;
        viewAttendenceRecord();
        attendenceNo();
        rbIsactive.setSelected(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rbIsactive = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtEmpId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dcDate = new com.toedter.calendar.JDateChooser();
        mcMonth = new com.toedter.calendar.JMonthChooser();
        ycYear = new com.toedter.calendar.JYearChooser();
        txtAttenID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAttendence = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        txtSearchID = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        sDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14)), "Attendance Record", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Attendence No");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Month");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Status");

        rbIsactive.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbIsactive.setText(" Active");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Description");

        txtEmpId.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtEmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpIdActionPerformed(evt);
            }
        });
        txtEmpId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmpIdKeyPressed(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtStatus.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtDescription.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/Save48.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/Update48.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/delete48.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/Update48.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
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
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Date");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Year");

        dcDate.setDateFormatString("yyyy-MM-dd");
        dcDate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        mcMonth.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtAttenID.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtAttenID.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtAttenID.setEnabled(false);
        txtAttenID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAttenIDActionPerformed(evt);
            }
        });
        txtAttenID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAttenIDKeyPressed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Employee ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ycYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mcMonth, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dcDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtStatus)))
                            .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtAttenID)
                                    .addComponent(txtEmpId, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                                .addGap(130, 130, 130)
                                .addComponent(rbIsactive, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAttenID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbIsactive))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dcDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ycYear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mcMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14)), "Existing Attendance ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tblAttendence.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tblAttendence.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Record ID", "Employee ID", "Name", "Active", "Year", "Month", "Date", "Status", "Description"
            }
        ));
        tblAttendence.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAttendenceMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAttendence);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14)), "Search Attendance ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        txtSearchID.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtSearchID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchIDActionPerformed(evt);
            }
        });

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("EMP ID");

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/Search.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel3.setText("Date");

        sDate.setDateFormatString("yyyy-MM-dd");
        sDate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearchID, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sDate, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearchID, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sDate, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void attendenceNo(){
    
        try {
            String attenNo =EmployeeAttendenceControler.getAttendenceID();
            txtAttenID.setText(attenNo);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EmployeeAttendence.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    
    }
    
    
    
    public  void viewAttendenceRecord(){
    
    try {
            ArrayList<EmployeesAttendence> allAttendence =EmployeeAttendenceControler.getAllAttendenceRecord();
            
            DefaultTableModel dtm = (DefaultTableModel) tblAttendence.getModel();
            dtm.setRowCount(0);      
            for (EmployeesAttendence ea : allAttendence) {
                
                Object[] rowData = {
                   ea.getaID(),
                   ea.getEmpNo(),
                   ea.getfName(),
                   ea.getIsActive(),
                   ea.getYear(),
                   ea.getMonth(),
                   ea.getDate(),
                   ea.getStatus(),
                   ea.getDiscription()
                        
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

    private void txtSearchIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchIDActionPerformed
        btnSearch.doClick();
    }//GEN-LAST:event_txtSearchIDActionPerformed

    private void txtEmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpIdActionPerformed
     
        
        String empNo =txtEmpId.getText().toUpperCase();
        EmployeesAttendence ea = new EmployeesAttendence();
        ea.setEmpNo(empNo);
        txtEmpId .setText(empNo);
        
        try {
             EmployeesAttendence employeesAttendence = EmployeeAttendenceControler.getEmployeeName(ea);
             txtName.setText(employeesAttendence.getfName());
            
            if(null==employeesAttendence.getIsActive()){
            rbIsactive.setSelected(false);
            
            }else switch (employeesAttendence.getIsActive()) {
                case "Y":
                    rbIsactive.setSelected(true);
                    btnDelete.setEnabled(true);
                    btnSave.setEnabled(true);
                    btnUpdate.setEnabled(true);
                    break;
                default:
                    rbIsactive.setSelected(false);
                    btnDelete.setEnabled(false);
                    btnSave.setEnabled(false);
                    btnUpdate.setEnabled(false);
                    break;
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EmployeeAttendence.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }//GEN-LAST:event_txtEmpIdActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        if(txtStatus.getText().equals("")||txtEmpId.getText().equals("")||txtName.getText().equals("")||dcDate.getDate() == null){
        
            if(txtEmpId.getText().equals("")){
            txtEmpId.setBackground(Color.pink);
            }else{txtEmpId.setBackground(Color.white);}
            
            if(txtName.getText().equals("")){
            txtName.setBackground(Color.pink);
            }else{txtName.setBackground(Color.white);}
            
            if(txtStatus.getText().equals("")){
            txtStatus.setBackground(Color.pink);
            }else{txtStatus.setBackground(Color.white);}
            
           if(dcDate.getCalendar()==null){ 
              dcDate.setBackground(Color.pink); 
            }else{dcDate.setBackground(Color.white);}
           
            JOptionPane.showMessageDialog(null,"You should Fill All Relevent Fields !");
        
        }else{
        
                String empNo =txtEmpId.getText().toUpperCase().trim();
                String isActive ;
                if(rbIsactive.isSelected()){
                isActive="Y";
                }else{ isActive ="N";}
                java.sql.Date date = new java.sql.Date(dcDate.getDate().getTime()); //get Only date from JdateChoocer
                int year =ycYear.getYear();
                int month =mcMonth.getMonth()+1;
                String status =txtStatus.getText();
                String discription =txtDescription.getText();
                String deleteYes ="N";
                java.sql.Date createdDate =new java.sql.Date(System.currentTimeMillis());
                int createdBy =UserID;
                float hours =7;
                String attendenceNo =txtAttenID.getText();

                EmployeesAttendence ea =new EmployeesAttendence();
                ea.setDate(date);
                ea.setIsActive(isActive);
                ea.setDeleteYes(deleteYes);
                ea.setDiscription(discription);
                ea.setHours(hours);
                ea.setMonth(""+month);
                ea.setYear(""+year);
                ea.setEmpNo(empNo);
                ea.setCreateBy(UserID);
                ea.setStatus(status);
                ea.setCreatedDate(createdDate);
                ea.setaID(attendenceNo);
                try {
                        boolean result =EmployeeAttendenceControler.RecordEmployeeAttendece(ea);
                        viewAttendenceRecord();
                        btnClear.doClick();
                    if(result){
                            JOptionPane.showMessageDialog(null,"Recorded Attendence ! ");
                            btnClear.doClick();
                    }else{
                           JOptionPane.showMessageDialog(null,"Error ! ");
                    }

                } catch (ClassNotFoundException | SQLException ex) {
                        JOptionPane.showMessageDialog(null,"Clear The Existing Field ");
                        Logger.getLogger(EmployeeAttendence.class.getName()).log(Level.SEVERE, null, ex);
                }

                }
          
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
   
        
       if(txtStatus.getText().equals("")||txtEmpId.getText().equals("")||txtName.getText().equals("")||dcDate.getDate() == null){
        
            if(txtEmpId.getText().equals("")){
            txtEmpId.setBackground(Color.pink);
            }else{txtEmpId.setBackground(Color.white);}
            
            if(txtName.getText().equals("")){
            txtName.setBackground(Color.pink);
            }else{txtName.setBackground(Color.white);}
            
            if(txtStatus.getText().equals("")){
            txtStatus.setBackground(Color.pink);
            }else{txtStatus.setBackground(Color.white);}
            
           if(dcDate.getCalendar()==null){ 
              dcDate.setBackground(Color.pink); 
            }else{dcDate.setBackground(Color.white);}
           
            JOptionPane.showMessageDialog(null,"Fill All Relevent Fild");
        
        }else{
        String attendenceNo =txtAttenID.getText();
        String empNo =txtEmpId.getText().toUpperCase().trim();
        String isActive ;
        if(rbIsactive.isSelected()){
        isActive="Y";
        }else{ isActive ="N";}
        java.sql.Date date = new java.sql.Date(dcDate.getDate().getTime()); //get Only date from JdateChoocer
        int year =ycYear.getYear();
        int month =mcMonth.getMonth()+1;
        String status =txtStatus.getText();
        String discription =txtDescription.getText();
        String deleteYes ="N";
        java.sql.Date UdatedDate =new java.sql.Date(System.currentTimeMillis());
        int updatedBy =UserID;
        float hours =7;
        
      
       
        
        EmployeesAttendence ea =new EmployeesAttendence();
        ea.setDate(date);
        ea.setIsActive(isActive);
        ea.setDeleteYes(deleteYes);
        ea.setDiscription(discription);
        ea.setHours(hours);
        ea.setMonth(""+month);
        ea.setYear(""+year);
        ea.setEmpNo(empNo);
        ea.setUpdatedBy(UserID);
        ea.setStatus(status);
        ea.setUpdateddate(UdatedDate);
        ea.setaID(attendenceNo);
        
        try {
            boolean result =EmployeeAttendenceControler.updateAttendenceDetails(ea);
            viewAttendenceRecord();
            btnClear.doClick();
            if(result){
                JOptionPane.showMessageDialog(null,"Updated Record ! ");
            }else{
                JOptionPane.showMessageDialog(null,"Error ! ");
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error ! ");
            Logger.getLogger(EmployeeAttendence.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        } 
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

     
        sDate.setCalendar(null);
        viewAttendenceRecord();
        txtEmpId.setText("");
        txtDescription.setText("");
        txtName.setText("");
        txtSearchID.setText("");
        txtStatus.setText("");
        dcDate.setCalendar(null);
        sDate.setCalendar(null);
        rbIsactive.setSelected(true);
        rbIsactive.setSelected(true);
        btnDelete.setEnabled(true);
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(true);
        attendenceNo();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtEmpIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpIdKeyPressed

//txtEmpId.dispatchEvent(evt);
        
    }//GEN-LAST:event_txtEmpIdKeyPressed

    private void tblAttendenceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAttendenceMouseClicked

  int i= tblAttendence.getSelectedRow();
        TableModel model =tblAttendence.getModel();
        txtAttenID.setText(model.getValueAt(i,0).toString());
        txtEmpId.setText(model.getValueAt(i,1).toString());
        txtSearchID.setText(model.getValueAt(i, 1).toString());
        txtName.setText(model.getValueAt(i,2).toString());
        String isActive=(model.getValueAt(i,3).toString());
        ycYear.setYear(Integer.parseInt(model.getValueAt(i,4).toString()) );
     //   ycYearSearch.setYear(Integer.parseInt(model.getValueAt(i,4).toString()));
        mcMonth.setMonth(Integer.parseInt(model.getValueAt(i,5).toString())-1 );
      //  sMonth.setMonth(Integer.parseInt(model.getValueAt(i,5).toString())-1 );
        Date tanggal = (Date) model.getValueAt(tblAttendence.getSelectedRow(), 6);
        dcDate.setDate(tanggal);
        //sDate.setDate(tanggal);
        txtStatus.setText(model.getValueAt(i,7).toString());
        txtDescription.setText(model.getValueAt(i, 8).toString());
        if(isActive.equals("Y")){
            rbIsactive.setSelected(true);
        }else{
             rbIsactive.setSelected(false);  
        }
    }//GEN-LAST:event_tblAttendenceMouseClicked

    private void txtAttenIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAttenIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAttenIDActionPerformed

    private void txtAttenIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAttenIDKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAttenIDKeyPressed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        java.sql.Date UdatedDate =new java.sql.Date(System.currentTimeMillis());
        String aID =txtAttenID.getText().toUpperCase().trim();
        String empNo =txtEmpId.getText();
        EmployeesAttendence ea = new EmployeesAttendence();
        ea.setDeleteYes("Y");
        ea.setUpdateddate(UdatedDate);
        ea.setUpdatedBy(UserID);
        ea.setEmpNo(empNo);
        ea.setaID(aID);
                
        try {
            boolean result = EmployeeAttendenceControler.deleteAttendenceDetails(ea);
            viewAttendenceRecord();
            btnClear.doClick();
            if(result){
            JOptionPane.showMessageDialog(null,"Attendance Record Deleted !");
            }else{
            JOptionPane.showMessageDialog(null,"Error !");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            
          //  JOptionPane.showMessageDialog(null,ex);
            Logger.getLogger(EmployeeAttendence.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        
        

        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

         ArrayList<EmployeesAttendence> allAttendence = null ;
        
           if(sDate.getCalendar()==null){
            
            String empNo =txtSearchID.getText().toUpperCase();
            txtSearchID.setText(empNo);
             try {
                 allAttendence=EmployeeAttendenceControler.SearchAttendence(empNo);
                 
             } catch (ClassNotFoundException | SQLException ex) {
                 Logger.getLogger(EmployeeAttendence.class.getName()).log(Level.SEVERE, null, ex);
             }
            
        
        }else if(! txtSearchID.getText().trim().equals("") &&sDate.getCalendar()!=null){
        
                String empNo =txtSearchID.getText().toUpperCase();
                txtSearchID.setText(empNo);
                java.sql.Date date = new java.sql.Date(sDate.getDate().getTime());
       
             try {
                 allAttendence=EmployeeAttendenceControler.SearchAttendence(empNo,date);
             } catch (ClassNotFoundException | SQLException ex) {
                 Logger.getLogger(EmployeeAttendence.class.getName()).log(Level.SEVERE, null, ex);
             } 
        
        }else if( txtSearchID.getText().trim().equals("") && sDate.getCalendar()!=null){
             
             java.sql.Date date = new java.sql.Date(sDate.getDate().getTime());
             try {
                 allAttendence =EmployeeAttendenceControler.SearchAttendence(date);
             } catch (ClassNotFoundException | SQLException ex) {
                 Logger.getLogger(EmployeeAttendence.class.getName()).log(Level.SEVERE, null, ex);
             }
        
        }else{
        
            return;
        }
        
        
        
        //allAttendence =EmployeeAttendenceControler.SearchAttendence(empNo);
        DefaultTableModel dtm = (DefaultTableModel) tblAttendence.getModel();
        dtm.setRowCount(0);
        for (EmployeesAttendence ea : allAttendence) {
            
            Object[] rowData = {
                ea.getaID(),
                ea.getEmpNo(),
                ea.getfName(),
                ea.getIsActive(),
                ea.getYear(),
                ea.getMonth(),
                ea.getDate(),
                ea.getStatus(),
                ea.getDiscription()
                    
            };
            
            dtm.addRow(rowData);
            
        }   
        
        
        
        
        
    }//GEN-LAST:event_btnSearchActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeAttendence().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private com.toedter.calendar.JDateChooser dcDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JMonthChooser mcMonth;
    private javax.swing.JRadioButton rbIsactive;
    private com.toedter.calendar.JDateChooser sDate;
    private javax.swing.JTable tblAttendence;
    private javax.swing.JTextField txtAttenID;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtEmpId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearchID;
    private javax.swing.JTextField txtStatus;
    private com.toedter.calendar.JYearChooser ycYear;
    // End of variables declaration//GEN-END:variables
}
