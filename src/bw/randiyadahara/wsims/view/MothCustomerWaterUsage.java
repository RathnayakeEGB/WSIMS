
package bw.randiyadahara.wsims.view;

import bw.randiyadahara.wsims.controler.WaterConsumptionControler;
import bw.randiyadahara.wsims.model.WaterConsumption;
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


public final class MothCustomerWaterUsage extends javax.swing.JFrame {

    
    public MothCustomerWaterUsage() {
        initComponents();
        waterUseNoSet();
        viewRecords();
        rbIsActive.setSelected(true);
        
    }
int User_ID;
float oldQty;
      public MothCustomerWaterUsage(int user_id) {
        initComponents();
        this.User_ID=user_id;
        waterUseNoSet();
        viewRecords();
        rbIsActive.setSelected(true);
    } 
    
   public void waterUseNoSet(){
   
        try {
          String Cno =  WaterConsumptionControler.consumptionNo();
           txtNo.setText(Cno);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MothCustomerWaterUsage.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   }
       public void stratUnits(String crno){
   
        try {
          float stratUnite =  WaterConsumptionControler.StratUnits(crno);
           txtSunits.setText(""+stratUnite);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MothCustomerWaterUsage.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   }
    
 public void viewRecords(){
 
  try {
            ArrayList<WaterConsumption>list=WaterConsumptionControler.viewConsumptionDetails(); //userList
            DefaultTableModel dtm =(DefaultTableModel)tblconsuption.getModel();
            //Object [] row =new Object[4];
            dtm.setRowCount(0);
            for(WaterConsumption wc :list){
                
                Object[] rowData = {
                   wc.getComsuptionNo(),
                   wc.getCusRegNo(),
                   wc.getCustomerName(),
                   wc.getIsactive(),
                   wc.getmReadDate(),
                   wc.getYear(),
                   wc.getMonth(),
                   wc.getStratUnits(),
                   wc.getComsuptionUnits(),
                   wc.getEndUnits(),
                   wc.getReadBy(),
                   wc.getDescription()
                   
                        
                };
                
                dtm.addRow(rowData);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EmployeeGroup.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
 
 
 }
 
 public  String MaxWCNO (String cusNo){
 String Cusno = null;
 
        try {
            Cusno =WaterConsumptionControler.returnMaxCno(Cusno);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MothCustomerWaterUsage.class.getName()).log(Level.SEVERE, null, ex);
        }
  
 
    return Cusno;
 
 }
 
 
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rbIsActive = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtendUnits = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        Myear = new com.toedter.calendar.JYearChooser();
        mMonth = new com.toedter.calendar.JMonthChooser();
        Mdate = new com.toedter.calendar.JDateChooser();
        txtcusNo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtReadby = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtSunits = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDiscription = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        txtcNoSearch = new javax.swing.JTextField();
        txtCusnoSearch = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblconsuption = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Monthly Water Consumption", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Customer RegNo");

        txtNo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtNo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNo.setEnabled(false);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name");

        TxtName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Year");

        rbIsActive.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbIsActive.setText("  Active");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Month");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Meter Read Date");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("End Units");

        txtendUnits.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtendUnits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtendUnitsActionPerformed(evt);
            }
        });
        txtendUnits.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtendUnitsKeyPressed(evt);
            }
        });

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

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/home2.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        Myear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        mMonth.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        Mdate.setDateFormatString("yyyy-MM-dd");
        Mdate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtcusNo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtcusNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcusNoActionPerformed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("C No");

        txtReadby.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtReadby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReadbyActionPerformed(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Description");

        txtSunits.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtSunits.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtSunits.setEnabled(false);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Start Units");

        txtDiscription.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Month Consumption");

        txtQty.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtQty.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtQty.setEnabled(false);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Read By");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 15, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel14))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcusNo, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbIsActive, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtSunits)))
                            .addComponent(TxtName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Mdate, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(20, 20, 20)
                                            .addComponent(jLabel8))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Myear, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(mMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtReadby)
                                    .addComponent(txtendUnits)))
                            .addComponent(txtDiscription, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(rbIsActive, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtcusNo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13))
                            .addComponent(txtSunits, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TxtName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Myear, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtendUnits, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addComponent(Mdate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtReadby, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiscription, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Consumption Units", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("C No");

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/Search.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtcNoSearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtcNoSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcNoSearchActionPerformed(evt);
            }
        });

        txtCusnoSearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtCusnoSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCusnoSearchActionPerformed(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("CR No");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtcNoSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCusnoSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtcNoSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCusnoSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Existing Water Consumption", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel4.setToolTipText("");

        tblconsuption.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tblconsuption.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C No", "Cutomer Number", "Name", "Active", "Read Date", "Year", "Month", "Strat Units", "QTY", "End Units", "ReadBy", "Description"
            }
        ));
        tblconsuption.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblconsuptionMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblconsuption);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void txtcusNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcusNoActionPerformed

        String cusNo =txtcusNo.getText().toUpperCase();
        txtcusNo.setText(cusNo);
        try {
            String name= WaterConsumptionControler.GetCustomerName(cusNo);
           if(name .equals("No Customer")){
                TxtName.setText(name);
                 btnDelete.setEnabled(false);
                 btnSave.setEnabled(false);
                 btnUpdate.setEnabled(false);
            }else{
            
                 TxtName.setText(name);
                 btnDelete.setEnabled(true);
                 btnSave.setEnabled(true);
                 btnUpdate.setEnabled(true);
                 TxtName.setText(name);
                 stratUnits(cusNo);
            }
          
           
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(MothCustomerWaterUsage.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }//GEN-LAST:event_txtcusNoActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        if(txtcusNo.getText().trim().equals("")||TxtName.getText().trim().equals("")||txtendUnits.getText().trim().equals("")||txtReadby.getText().trim().equals("")||Mdate.getCalendar()==null){
        
            if(txtcusNo.getText().trim().equals("")){
                txtcusNo.setBackground(Color.pink);  
            }else{
             txtcusNo.setBackground(Color.white); 
            }
            if(TxtName.getText().trim().equals("")){
                TxtName.setBackground(Color.pink);  
            }else{
             TxtName.setBackground(Color.white); 
            }
             if(txtendUnits.getText().trim().equals("")){
                txtendUnits.setBackground(Color.pink);  
            }else{
             txtendUnits.setBackground(Color.white); 
            }
              if(txtReadby.getText().trim().equals("")){
                txtReadby.setBackground(Color.pink);  
            }else{
             txtReadby.setBackground(Color.white); 
            }
              if(Mdate.getCalendar()==null){
              Mdate.setBackground(Color.pink);
              }else{
              Mdate.setBackground(Color.white);
              }
              
        }else{
            
                txtcusNo.setBackground(Color.white); 
                TxtName.setBackground(Color.white);
                Mdate.setBackground(Color.white); 
                Mdate.setBackground(Color.white);
                txtReadby.setBackground(Color.white); 
                txtendUnits.setBackground(Color.white); 
                String wcno =txtNo.getText();
                String cusNo =txtcusNo.getText().toUpperCase();
                String name =TxtName.getText();
                int year =Myear.getYear();
                int month =mMonth.getMonth()+1;
                String readBy =txtReadby.getText().toUpperCase();
                float sUnite =Float.parseFloat(txtSunits.getText());
                float eUnite =Float.parseFloat(txtendUnits.getText());
                float qty;
                if(txtQty.getText().trim().equals("")){
                qty =eUnite-sUnite;
                }else{
                 qty =Float.parseFloat(txtQty.getText());
                }

                String discription = txtDiscription.getText();
                java.sql.Date date = new java.sql.Date(Mdate.getDate().getTime()); //
                Timestamp CreatedDate =new Timestamp(System.currentTimeMillis());
                int createdBy =User_ID;
                String isActive ="N",deleteYes ="N";

                if(rbIsActive.isSelected()){
                isActive ="Y";
                }
            
            WaterConsumption wc = new WaterConsumption();
            wc.setComsuptionNo(wcno);
            wc.setCreatedBY(User_ID);
            wc.setCreatedDate(CreatedDate);
            wc.setCusRegNo(cusNo);
            wc.setCustomerName(name);
            wc.setIsactive(isActive);
            wc.setDeleteYes(deleteYes);
            wc.setDescription(discription);
            wc.setStratUnits(sUnite);
            wc.setEndUnits(eUnite);
            wc.setComsuptionUnits(qty);
            wc.setReadBy(readBy);
            wc.setmReadDate(date);
            wc.setMonth(month+1);
            wc.setYear(year);
            
            
            
            
            try {
                boolean result =    WaterConsumptionControler.recordWaterUsage(wc);
                if(result){
                    JOptionPane.showMessageDialog(null, "Customer Water Used Recorded !");
                    btnClear.doClick();
                }else{
                
                    JOptionPane.showMessageDialog(null,"Error !");
                }
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null," One of ID is invalid ! ");
                txtReadby.setBackground(Color.pink);
                txtcusNo.setBackground(Color.pink); 
                Logger.getLogger(MothCustomerWaterUsage.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        
        }





    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtendUnitsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtendUnitsKeyPressed

    txtendUnits.addKeyListener(new KeyAdapter() {
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

          

        // TODO add your handling code here:
    }//GEN-LAST:event_txtendUnitsKeyPressed

    private void txtReadbyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReadbyActionPerformed
               // TODO add your handling code here:
    }//GEN-LAST:event_txtReadbyActionPerformed

    private void txtendUnitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtendUnitsActionPerformed

        float sUnite =Float.parseFloat(txtSunits.getText());
         float eUnite =Float.parseFloat(txtendUnits.getText());
         
        if(eUnite<sUnite){
            
                txtendUnits.setBackground(Color.pink);
                JOptionPane.showMessageDialog(null, "Invalid Quantity !");
                return;
            }
        
            
            float qty =eUnite-sUnite;
            txtQty.setText(String.valueOf(qty));

        
    }//GEN-LAST:event_txtendUnitsActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

            rbIsActive.setSelected(true);
            txtcusNo.setBackground(Color.white); 
            TxtName.setBackground(Color.white);
            Mdate.setBackground(Color.white); 
            Mdate.setBackground(Color.white);
            txtReadby.setBackground(Color.white); 
            txtendUnits.setBackground(Color.white); 
            viewRecords(); 
            TxtName.setText("");
            txtcusNo.setText("");
            txtDiscription.setText("");
            txtNo.setText("");
            txtcusNo.setText("");
            TxtName.setText("");
            txtSunits.setText("");
            txtendUnits.setText("");
            txtQty.setText("");
            txtcNoSearch.setText("");
            btnDelete.setEnabled(true);
            btnSave.setEnabled(true);
            btnUpdate.setEnabled(true);
          //  txtMonthSearch.setText("");
          //  txtYearSearch.setText("");
            txtcNoSearch.setText("");
            txtReadby.setText("");
            rbIsActive.setSelected(false);
            Mdate.setCalendar(null);
            //mMonth.setMonth();
            waterUseNoSet();

        

  
   
   
     
     
    }//GEN-LAST:event_btnClearActionPerformed

    private void tblconsuptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblconsuptionMouseClicked

 int i= tblconsuption.getSelectedRow();
        TableModel model =tblconsuption.getModel();
        txtNo.setText(model.getValueAt(i,0).toString());
        txtcNoSearch.setText(model.getValueAt(i,0).toString());
        txtcusNo.setText(model.getValueAt(i,1).toString());
        TxtName.setText(model.getValueAt(i,2).toString());
        String isActive=(model.getValueAt(i,3).toString().trim());
        Date tanggal = (Date) model.getValueAt(tblconsuption.getSelectedRow(), 4);
        Mdate.setDate(tanggal);
        Myear.setYear(Integer.parseInt(model.getValueAt(i, 5).toString()));
        mMonth.setMonth(Integer.parseInt(model.getValueAt(i, 6).toString())-1);
        txtSunits.setText(model.getValueAt(i,7).toString());
        txtQty.setText(model.getValueAt(i,8).toString());
        txtendUnits.setText(model.getValueAt(i,9).toString());
        txtReadby.setText(model.getValueAt(i,10).toString());
        txtDiscription.setText(model.getValueAt(i,11).toString());
        oldQty =Float.parseFloat(model.getValueAt(i,8).toString());
        if(isActive.equals("Y")){
            rbIsActive.setSelected(true);
        }else{
             rbIsActive.setSelected(false);  
        }

    }//GEN-LAST:event_tblconsuptionMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

   if(txtcusNo.getText().trim().equals("")||TxtName.getText().trim().equals("")||txtendUnits.getText().trim().equals("")||txtReadby.getText().trim().equals("")||Mdate.getCalendar()==null){
        
            if(txtcusNo.getText().trim().equals("")){
                txtcusNo.setBackground(Color.pink);  
            }else{
             txtcusNo.setBackground(Color.white); 
            }
            if(TxtName.getText().trim().equals("")){
                TxtName.setBackground(Color.pink);  
            }else{
             TxtName.setBackground(Color.white); 
            }
             if(txtendUnits.getText().trim().equals("")){
                txtendUnits.setBackground(Color.pink);  
            }else{
             txtendUnits.setBackground(Color.white); 
            }
              if(txtReadby.getText().trim().equals("")){
                txtReadby.setBackground(Color.pink);  
            }else{
             txtReadby.setBackground(Color.white); 
            }
              if(Mdate.getCalendar()==null){
              Mdate.setBackground(Color.pink);
              }else{
              Mdate.setBackground(Color.white);
              }
              
        }else{
       
              txtcusNo.setBackground(Color.white); 
              TxtName.setBackground(Color.white);
              Mdate.setBackground(Color.white); 
              Mdate.setBackground(Color.white);
              txtReadby.setBackground(Color.white); 
              txtendUnits.setBackground(Color.white); 
       
            String wcno =txtNo.getText();
            String cusNo =txtcusNo.getText().toUpperCase();
            String name =TxtName.getText();
            int year =Myear.getYear();
            int month =mMonth.getMonth();
            String readBy =txtReadby.getText().toUpperCase();
            float sUnite =Float.parseFloat(txtSunits.getText());
            float eUnite =Float.parseFloat(txtendUnits.getText());
            float qty,qtyGap;
            if(txtQty.getText().trim().equals("")){
            qty =eUnite-sUnite;
            }else{
               qty =eUnite-sUnite;
            }
             
            String discription = txtDiscription.getText();
            java.sql.Date date = new java.sql.Date(Mdate.getDate().getTime()); //
            Timestamp CreatedDate =new Timestamp(System.currentTimeMillis());
            int createdBy =User_ID;
            String isActive ="N",deleteYes ="N",condition = "A";
            
            if(rbIsActive.isSelected()){
               isActive ="Y";
            }
            
            float Qtygap =oldQty-qty;
         
        if( wcno.equals(MaxWCNO(cusNo))){
              condition ="A";
          }else {
              
              if(oldQty> qty){
           
              condition ="N";
          
              }else if(oldQty<qty){
                 condition ="P";
              }else{
             condition ="A";
             }
          }
            WaterConsumption wc = new WaterConsumption();
            wc.setComsuptionNo(wcno);
            wc.setUpdatedBY(User_ID);
            wc.setUpdatedDate(CreatedDate);
            wc.setCusRegNo(cusNo);
            wc.setCustomerName(name);
            wc.setIsactive(isActive);
            wc.setDeleteYes(deleteYes);
            wc.setDescription(discription);
            wc.setStratUnits(sUnite);
            wc.setEndUnits(eUnite);
            wc.setComsuptionUnits(qty);
            wc.setReadBy(readBy);
            wc.setmReadDate(date);
            wc.setMonth(month+1);
            wc.setYear(year);
            
           
       try {
           boolean result =WaterConsumptionControler.updateRecord(wc, Qtygap, condition);
           if(result){
               JOptionPane.showMessageDialog(null, "Updated Record !");
               btnClear.doClick();
           }
       } catch (ClassNotFoundException | SQLException ex) {
              JOptionPane.showMessageDialog(null, " Employee ID is invalid ! ");
              txtReadby.setBackground(Color.pink);
           Logger.getLogger(MothCustomerWaterUsage.class.getName()).log(Level.SEVERE, null, ex);
       }
        }




        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        String cNo =txtNo.getText(),deleteYes ="Y",condition ="N";
        String CuNo =txtcusNo.getText();
        float gapQty =Float.parseFloat(txtQty.getText());
        Timestamp updatedDate=new Timestamp(System.currentTimeMillis());
        int UpdateBy =User_ID;
        java.sql.Date date = new java.sql.Date(Mdate.getDate().getTime()); 
        WaterConsumption wc = new WaterConsumption();
        wc.setDeleteYes(deleteYes);
        wc.setUpdatedBY(UpdateBy);
        wc.setUpdatedDate(updatedDate);
        wc.setmReadDate(date);
        wc.setCusRegNo(CuNo);
        
        try {
            boolean result =WaterConsumptionControler.removeRecord(wc, cNo, gapQty);
            if(result){
                JOptionPane.showMessageDialog(null,"  Removed Water Consumption ");
                btnClear.doClick();;
            }else{
            JOptionPane.showMessageDialog(null,"Error !");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            
            Logger.getLogger(MothCustomerWaterUsage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        

        

       
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

       String cusNo  =txtCusnoSearch.getText().toUpperCase();
       String cno =txtcNoSearch.getText().toUpperCase();
       txtCusnoSearch.setText(cusNo);
       txtcNoSearch.setText(cno);
        try {
            ArrayList<WaterConsumption>list=WaterConsumptionControler.searchConsumptionDetails(cno, cusNo); //userList
            DefaultTableModel dtm =(DefaultTableModel)tblconsuption.getModel();
            //Object [] row =new Object[4];
            dtm.setRowCount(0);
            for(WaterConsumption wc :list){
                
                Object[] rowData = {
                   wc.getComsuptionNo(),
                   wc.getCusRegNo(),
                   wc.getCustomerName(),
                   wc.getIsactive(),
                   wc.getmReadDate(),
                   wc.getYear(),
                   wc.getMonth(),
                   wc.getStratUnits(),
                   wc.getComsuptionUnits(),
                   wc.getEndUnits(),
                   wc.getReadBy(),
                   wc.getDescription()
                   
                        
                };
                
                dtm.addRow(rowData);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EmployeeGroup.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
       
       
       


        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtcNoSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcNoSearchActionPerformed
         btnSearch.doClick();        // TODO add your handling code here:
    }//GEN-LAST:event_txtcNoSearchActionPerformed

    private void txtCusnoSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCusnoSearchActionPerformed
        btnSearch.doClick();         // TODO add your handling code here:
    }//GEN-LAST:event_txtCusnoSearchActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MothCustomerWaterUsage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Mdate;
    private com.toedter.calendar.JYearChooser Myear;
    private javax.swing.JTextField TxtName;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JMonthChooser mMonth;
    private javax.swing.JRadioButton rbIsActive;
    private javax.swing.JTable tblconsuption;
    private javax.swing.JTextField txtCusnoSearch;
    private javax.swing.JTextField txtDiscription;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtReadby;
    private javax.swing.JTextField txtSunits;
    private javax.swing.JTextField txtcNoSearch;
    private javax.swing.JTextField txtcusNo;
    private javax.swing.JTextField txtendUnits;
    // End of variables declaration//GEN-END:variables
}
