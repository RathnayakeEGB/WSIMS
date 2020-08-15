
package bw.randiyadahara.wsims.view;

import bw.randiyadahara.wsims.controler.PumpedInfoControler;
import bw.randiyadahara.wsims.controler.WaterPumpedSecodControler;
import bw.randiyadahara.wsims.model.PumpedInfo;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public final class WaterPumped extends javax.swing.JFrame {

    
    public WaterPumped() {
        initComponents();
        getPumpedLineNo();
        gettotalPumped();
        getAllPumpedRecord();
        rbIsActive.setSelected(true);
    }
   int User_ID;
   float Lqty;
    
     public WaterPumped(int User_ID) {
        initComponents();
        getPumpedLineNo();
        this.User_ID=User_ID;
        gettotalPumped();
        getAllPumpedRecord();
        rbIsActive.setSelected(true);
    }
     
     public String checkDate(java.sql.Date date){
     
         String dateYes =null;
        try {
          dateYes=  WaterPumpedSecodControler.getMaxRecordDate(date);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(WaterPumped.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     return  dateYes;
     
     }
   

  public  void  getPumpedLineNo(){
        try {
            String Pno =PumpedInfoControler.getPumpedLineNo();
            txtPno.setText(Pno);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(WaterPumped.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
    
    public  void  gettotalPumped(){
        try {
           float total=PumpedInfoControler.totalPumpedWaterUinits();
            txtSamount.setText(""+total);
        } catch (ClassNotFoundException | SQLException ex) {
            
            JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(WaterPumped.class.getName()).log(Level.SEVERE, null, ex);
        }
  } 
    
    public void getAllPumpedRecord(){
    
      try {
            ArrayList<PumpedInfo> allWaterPumpedRecord =PumpedInfoControler.viewAllPumpedInFro();
            
            DefaultTableModel dtm = (DefaultTableModel) tblpumped.getModel(); // Load Value Into Gride 
            dtm.setRowCount(0);      
            for (PumpedInfo info : allWaterPumpedRecord) {
                
                Object[] rowData = {
                   info.getPno(),
                   info.getYear(),
                   info.getPumpDate(),
                   info.getStartUnits(),
                   info.getQuntity(),
                   info.getEndUnite(),
                   info.getIsActive(),
                   info.getDiscription(),
                };
                
                dtm.addRow(rowData);    

            }    
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEndAmount = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        rbIsActive = new javax.swing.JRadioButton();
        btnHome = new javax.swing.JButton();
        txtSamount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPno = new javax.swing.JTextField();
        Pdate = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        pYear = new com.toedter.calendar.JYearChooser();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblpumped = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        txtsearchID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        sDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))), "Water Pumped Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14)))); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Pump No");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("End Units");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Description");

        txtEndAmount.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtEndAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEndAmountKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEndAmountKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEndAmountKeyTyped(evt);
            }
        });

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

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/clear48.png"))); // NOI18N
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        rbIsActive.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbIsActive.setText("  Active");

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/home2.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        txtSamount.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtSamount.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtSamount.setEnabled(false);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Start Amount");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Year");

        txtPno.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtPno.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtPno.setEnabled(false);

        Pdate.setDateFormatString("yyyy-MM-dd");
        Pdate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Date");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtPno, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(pYear, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                            .addComponent(txtSamount))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbIsActive, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(Pdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEndAmount)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPno, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pYear, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSamount, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbIsActive)
                            .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Pdate, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEndAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Existing Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tblpumped.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tblpumped.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pump ID", "Year", "Date", "Start Amount", "Qty", "End Amount", "Is Active", "Description"
            }
        ));
        tblpumped.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblpumpedMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblpumped);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Pump Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        txtsearchID.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtsearchID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchIDActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Pump No");

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/Search.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Date");

        sDate.setDateFormatString("yyyy-MM-dd");
        sDate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtsearchID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtsearchID, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(sDate, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
    
          this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void txtsearchIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchIDActionPerformed
            btnSearch.doClick();
    }//GEN-LAST:event_txtsearchIDActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        String Pno=null;
        int Year=0;
        java.sql.Date date=null;
         
        if(!txtsearchID.getText().trim().equals("")){
           Pno=txtsearchID.getText().toUpperCase(); 
           txtsearchID.setText(Pno);
        }
        
        if(sDate.getCalendar() != null){
          date = new java.sql.Date(sDate.getDate().getTime());  
        } 
        
        try {
            ArrayList<PumpedInfo> infomation =  WaterPumpedSecodControler.SearchPumpedInFro(Pno, Year, date);
             DefaultTableModel dtm = (DefaultTableModel) tblpumped.getModel();
            dtm.setRowCount(0);      
            for (PumpedInfo info : infomation) {
                
                Object[] rowData = {
                   info.getPno(),
                   info.getYear(),
                   info.getPumpDate(),
                   info.getStartUnits(),
                   info.getQuntity(),
                   info.getEndUnite(),
                   info.getIsActive(),
                   info.getDiscription(),
                };
                
                dtm.addRow(rowData);    

            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(WaterPumped.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        if(txtEndAmount.getText().trim().equals("")||Pdate.getDate() == null){
        
            JOptionPane.showMessageDialog(null,"You Should Fill All Relevent Field !");
                if(txtEndAmount.getText().trim().equals("")){
                    txtEndAmount.setBackground(Color.pink);
                }else{
                     txtEndAmount.setBackground(Color.white);  
                }
                if(Pdate.getDate() == null) {
                Pdate.setBackground(Color.PINK);
                }else{
                Pdate.setBackground(Color.white);
                }
        }else{
        
            
            
            Timestamp createdDate = new Timestamp(System.currentTimeMillis());
            int createdBy =User_ID;
            String deleteYes ="N",isActive;
            float stratUnite =Float.parseFloat(txtSamount.getText());
            float endUnites =Float.parseFloat(txtEndAmount.getText());
            float qty =endUnites-stratUnite;
            String pNo =txtPno.getText();
            java.sql.Date date = new java.sql.Date(Pdate.getDate().getTime());
            int year =pYear.getYear();
            String Discription =txtDescription.getText();
            
            if(rbIsActive.isSelected()){
                isActive ="Y";
            }else{
                isActive ="N";
            }
          
            if(endUnites <stratUnite){
                
                JOptionPane.showMessageDialog(null,"Invalid Quanty !");
                txtEndAmount.setBackground(Color.pink);
                return; 
            }
            
            
            if(checkDate(date).equals("Y")){
            
                JOptionPane.showMessageDialog(null,"Invalid date !");
               return;
            
            }
            
            
            
            
            
            
            PumpedInfo pi = new PumpedInfo();
            pi.setCreatedBy(User_ID);
            pi.setCratedDate(createdDate);
            pi.setDate(date);
            pi.setQuntity(qty);
            pi.setDiscription(Discription);
            pi.setDeleteYes(deleteYes);
            pi.setIsActive(isActive);
            pi.setYear(year);
            pi.setStartUnits(stratUnite);
            pi.setEndUnite(endUnites);
            pi.setPno(pNo);
            try {
                boolean result =PumpedInfoControler.recordPumpedInfo(pi);
                if(result){
                btnClear.doClick();
                JOptionPane.showMessageDialog(null,"Water Pumped Information Recorded !");
                }else{JOptionPane.showMessageDialog(null,"Error !");}
                
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(WaterPumped.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtEndAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEndAmountKeyTyped
  
            txtEndAmount.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent eve) {
                String AllowedData="0123456789.";
                char enter = eve.getKeyChar();
                int count=0;
                if(eve.getKeyChar()=='.'){
                count++;
                }
                
                if (!AllowedData.contains(String.valueOf(enter))||count>1) {
                    eve.consume();
                }
            }       
        });
        
    }//GEN-LAST:event_txtEndAmountKeyTyped

    private void txtEndAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEndAmountKeyReleased
       
        
    }//GEN-LAST:event_txtEndAmountKeyReleased

    private void txtEndAmountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEndAmountKeyPressed
      
    }//GEN-LAST:event_txtEndAmountKeyPressed

    private void tblpumpedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpumpedMouseClicked

        int i= tblpumped.getSelectedRow();
        TableModel model =tblpumped.getModel();
        txtPno.setText(model.getValueAt(i,0).toString());
        txtsearchID.setText(model.getValueAt(i,0).toString());
        pYear.setYear(Integer.parseInt(model.getValueAt(i, 1).toString()));
        Date tanggal = (Date) model.getValueAt(tblpumped.getSelectedRow(), 2);
        Pdate.setDate(tanggal);
        txtSamount.setText(model.getValueAt(i,3).toString());
        txtEndAmount.setText(model.getValueAt(i,5).toString());
        Lqty=Float.parseFloat(model.getValueAt(i,4).toString());
        String isActive=(model.getValueAt(i,6).toString().trim());
        txtDescription.setText(model.getValueAt(i,7).toString());
        
        if(isActive.equals("Y")){
            rbIsActive.setSelected(true);
        }else{
             rbIsActive.setSelected(false);  
        }

    }//GEN-LAST:event_tblpumpedMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

      if(txtEndAmount.getText().trim().equals("")||Pdate.getDate() == null){
        
            JOptionPane.showMessageDialog(null,"Fill All Relevent Field !");
                if(txtEndAmount.getText().trim().equals("")){
                    txtEndAmount.setBackground(Color.pink);
                }else{
                     txtEndAmount.setBackground(Color.white);  
                }
                if(Pdate.getDate() == null) {
                Pdate.setBackground(Color.PINK);
                }else{
                Pdate.setBackground(Color.white);
                }
        }else{
        
            
            Timestamp updateddDate = new Timestamp(System.currentTimeMillis());
            int UpdatedBy =User_ID;
            String deleteYes ="N",isActive;
            float stratUnite =Float.parseFloat(txtSamount.getText());
            float endUnites =Float.parseFloat(txtEndAmount.getText());
            float qty =endUnites-stratUnite,gapQty = 0,sGAp = 0,Egap = 0,noGap;
            String pNo =txtPno.getText();
            java.sql.Date date = new java.sql.Date(Pdate.getDate().getTime());
            int year =pYear.getYear();
            String Discription =txtDescription.getText();
            String condition = null;
            
            if(rbIsActive.isSelected()){
                isActive ="Y";
            }else{
                isActive ="N";
            }
            
            java.sql.Date MaxDate = null;
            
          try {
               MaxDate =PumpedInfoControler.returnDate();
              
          } catch (ClassNotFoundException | SQLException ex) {
              Logger.getLogger(WaterPumped.class.getName()).log(Level.SEVERE, null, ex);
          }
          
          
          if(MaxDate.equals(date)){
           
              condition ="N";
              gapQty=Lqty-qty;
              Egap=gapQty;
              sGAp=gapQty;
          
          }else{
          
                if(Lqty>qty){

                        gapQty=Lqty-qty;
                        Egap=gapQty;
                        sGAp=gapQty;
                      if(MaxDate==date){
                        condition ="R";
                      }else{
                        condition ="R";
                      }



                  }else if(Lqty<qty){

                       gapQty=qty-Lqty;
                       Egap=gapQty;
                       sGAp=gapQty;
                      if(MaxDate==date){
                        condition ="R";
                      }else{
                      condition ="P";
                      }
                  }else{

                       condition="N";
                       gapQty=0;
                       Egap=0;
                       sGAp=gapQty;

                      if(MaxDate==date){
                        condition ="N";
                      }else{
                      condition ="N";
                      }

                  }
          
          }
          
            
            noGap =Lqty-qty;
            
            PumpedInfo pi = new PumpedInfo();
            pi.setUpdatedBy(User_ID);
            pi.setUpdatedDate(updateddDate);
            pi.setDate(date);
            pi.setQuntity(noGap);
            pi.setAmount(qty);
            pi.setDiscription(Discription);
            pi.setDeleteYes(deleteYes);
            pi.setIsActive(isActive);
            pi.setYear(year);
            pi.setStartUnits(stratUnite);
            pi.setEndUnite(endUnites);
            pi.setPno(pNo);
            pi.setsGap(sGAp);
            pi.setEgap(Egap);
            pi.setQtyGap(gapQty);
            
           
            if(endUnites <stratUnite){
                
                JOptionPane.showMessageDialog(null,"Invalid Quanty !");
                txtEndAmount.setBackground(Color.pink);
                return; 
            }else{
                txtEndAmount.setBackground(Color.white);
            
            }
            
            try {
                boolean result =PumpedInfoControler.UpdatePumpedInfo(pi, condition);
                if(result){
                JOptionPane.showMessageDialog(null,"Updated Record !");
                  btnClear.doClick();
                }else{JOptionPane.showMessageDialog(null,"Error !");}
                
            } catch (ClassNotFoundException | SQLException ex) {
                 JOptionPane.showMessageDialog(null,ex);
                Logger.getLogger(WaterPumped.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
         Timestamp updateddDate = new Timestamp(System.currentTimeMillis());
            int UpdatedBy =User_ID;
            String deleteYes ="Y";
            float stratUnite =Float.parseFloat(txtSamount.getText());
            float endUnites =Float.parseFloat(txtEndAmount.getText());
            float qty =endUnites-stratUnite,gapQty = 0,sGAp = 0,Egap = 0,noGap;
            String pNo =txtPno.getText();
            java.sql.Date date = new java.sql.Date(Pdate.getDate().getTime());
            int year =pYear.getYear();
            String Discription =txtDescription.getText();
            String condition = null;
            
           PumpedInfo pi = new PumpedInfo();
            pi.setUpdatedBy(User_ID);
            pi.setUpdatedDate(updateddDate);
            pi.setDate(date);
            pi.setQuntity(qty);
            pi.setDiscription(Discription);
            pi.setDeleteYes(deleteYes);
            pi.setYear(year);
            pi.setStartUnits(stratUnite);
            pi.setEndUnite(endUnites);
            pi.setPno(pNo);
            pi.setsGap(sGAp);
            pi.setEgap(Egap);
            pi.setQtyGap(gapQty);
            
            
        try {
            boolean result =WaterPumpedSecodControler.deleteWaterPumpedInfo(pi);
            
            if(result){
            JOptionPane.showMessageDialog(null,"Record Removed !");
            btnClear.doClick();
            }else{
            JOptionPane.showMessageDialog(null,"Error !");
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
            Logger.getLogger(WaterPumped.class.getName()).log(Level.SEVERE, null, ex);
        }
            
           
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
       
        txtEndAmount.setBackground(Color.white);
        txtDescription.setText("");
        txtEndAmount.setText("");
        txtPno.setText("");
     //   txtSearchYear.setText("");
        txtsearchID.setText("");
        rbIsActive.setSelected(false);
        Pdate.setCalendar(null);
        pYear.setYear(2018);
        txtSamount.setText("");
        sDate.setDate(null);
        
        getAllPumpedRecord();
        getPumpedLineNo();
        gettotalPumped();
        




    }//GEN-LAST:event_btnClearActionPerformed


    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WaterPumped().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Pdate;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JYearChooser pYear;
    private javax.swing.JRadioButton rbIsActive;
    private com.toedter.calendar.JDateChooser sDate;
    private javax.swing.JTable tblpumped;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtEndAmount;
    private javax.swing.JTextField txtPno;
    private javax.swing.JTextField txtSamount;
    private javax.swing.JTextField txtsearchID;
    // End of variables declaration//GEN-END:variables
}
