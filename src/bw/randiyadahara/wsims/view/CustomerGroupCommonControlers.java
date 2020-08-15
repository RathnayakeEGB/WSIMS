
package bw.randiyadahara.wsims.view;

import bw.randiyadahara.wsims.controler.CustomerControler;
import bw.randiyadahara.wsims.controler.FixCostControler;
import bw.randiyadahara.wsims.model.Customer;
import bw.randiyadahara.wsims.model.FixCost;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public final class CustomerGroupCommonControlers extends javax.swing.JFrame {

   
    public CustomerGroupCommonControlers() {
        initComponents();
        setFixCostNo();
         setCusGroupName();
         viewAllRecord();
    }
    int User_ID;
public CustomerGroupCommonControlers(int user_Id) {
        initComponents();
        this.User_ID =user_Id;
        setFixCostNo();
        setCusGroupName();
        viewAllRecord();
    }

public  void setFixCostNo(){
        try {
         String No = FixCostControler .getFixCostNo();
         txtFno.setText(No);     
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerGroupCommonControlers.class.getName()).log(Level.SEVERE, null, ex);
        }
}

    public void setCusGroupName(){
      
        try {
            ArrayList<Customer> groupName =CustomerControler.getCustomerGroup();
             for (Customer c : groupName){
             cmbCusGroup.addItem(c.getCustomerGroupName());
             } 
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      }
    
  public String CustomerGroupNo(String name){
String cusGroupNo = null ;
        try {
          cusGroupNo=  FixCostControler.getCustomerGroupNo(name);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerGroupPriceMetrix.class.getName()).log(Level.SEVERE, null, ex);
        }

return cusGroupNo;

}
    public String CusGroupNo(String name){
String cusGroupNo = null ;
        try {
          cusGroupNo=  FixCostControler.getCusGroupNo(name);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerGroupPriceMetrix.class.getName()).log(Level.SEVERE, null, ex);
        }

return cusGroupNo;

}
  
  
  
  public  void viewAllRecord(){
  
   try {
            ArrayList<FixCost> allrecord =FixCostControler.getAllRecord(); //userList
            DefaultTableModel dtm =(DefaultTableModel)tblFixCost.getModel();
            //Object [] row =new Object[4];
            dtm.setRowCount(0);
            for(FixCost f :allrecord){
                
                Object[] rowData = {
                   f.getFixCNo(),
                   f.getIsActive(),
                   f.getName(),
                   f.getCusGroupNo(),
                   f.getFixCost(),
                   f.getDueDate(),
                   f.getLineCutMonth(),
                   f.getLateChageRate(),
                   f.getConnctionRenue(),
                   f.getDiscription()
                        
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
        txtName = new javax.swing.JTextField();
        txtFno = new javax.swing.JTextField();
        cmbCusGroup = new javax.swing.JComboBox<>();
        rbIscative = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        txtFixCost = new javax.swing.JTextField();
        txtDiscription = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDueDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        txtLinecut = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtLateChage = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtRenuePrice = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFixCost = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Invoice FixCost Set", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14)))); // NOI18N

        txtName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtFno.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtFno.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFno.setEnabled(false);

        cmbCusGroup.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        rbIscative.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbIscative.setText("IS Active");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/home2.png"))); // NOI18N
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtFixCost.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtFixCost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFixCostKeyPressed(evt);
            }
        });

        txtDiscription.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("FixCost No");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("CusGroup");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Payment Due Date");

        txtDueDate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtDueDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDueDateKeyPressed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Reconnection Price");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Fix Cost");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        txtLinecut.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtLinecut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLinecutKeyPressed(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Discription");

        txtLateChage.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtLateChage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLateChageKeyPressed(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Late Chages Price");

        txtRenuePrice.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtRenuePrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRenuePriceKeyPressed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Line Cut Month");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(640, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                    .addComponent(txtFixCost, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFno, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rbIscative)
                                            .addComponent(cmbCusGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtLinecut, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRenuePrice))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDiscription, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtLateChage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(rbIscative))
                        .addGap(19, 19, 19)
                        .addComponent(cmbCusGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLateChage, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtLinecut, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFno, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFixCost, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDiscription, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRenuePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search FixCost", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14)))); // NOI18N

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("FIxCost No");

        txtSearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/Search.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch)
                .addGap(9, 9, 9))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "All FixCost Record", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14)))); // NOI18N

        tblFixCost.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tblFixCost.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FixCost NO", "Is Active", "Name", "CustomerGroup", "Fix Cost", "Due Date", "Line Cut Month", "Late Chage", "Connection Rnue Price", "Discription"
            }
        ));
        tblFixCost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFixCostMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblFixCost);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        if (txtName.getText().trim().equals("")||txtDueDate.getText().trim().equals("")||txtFixCost.getText().trim().equals("")||txtLateChage.getText().trim().equals("")||txtLinecut.getText().trim().equals("")||txtRenuePrice.getText().trim().equals("")){
        
            if(txtName.getText().trim().equals("")){
                 txtName.setBackground(Color.pink);
            }else{
                 txtName.setBackground(Color.white);  
            }
            
            if(txtDueDate.getText().trim().equals("")){
                txtDueDate.setBackground(Color.pink);
            }else{
                 txtDueDate.setBackground(Color.pink);  
            }
             
            if(txtFixCost.getText().trim().equals("")){
                txtFixCost.setBackground(Color.pink);
            }else{
               txtFixCost.setBackground(Color.pink); 
            }
            
             if(txtLateChage.getText().trim().equals("")){
                txtLateChage.setBackground(Color.pink);
            }else{
                 txtLateChage.setBackground(Color.pink);  
            }
             
            if(txtLinecut.getText().trim().equals("")){
                txtLinecut.setBackground(Color.pink);
            }else{
               txtLinecut.setBackground(Color.pink); 
            }
            if(txtRenuePrice.getText().trim().equals("")){
                txtRenuePrice.setBackground(Color.pink);
            }else{
               txtRenuePrice.setBackground(Color.pink); 
            }
            
            
            
            JOptionPane.showMessageDialog(null, "Fill All Relevent Line ! ");
        }else{
  
            
            
            
            String fixCno =txtFno.getText();
            String name =txtName.getText();
            int dueDate =Integer.parseInt(txtDueDate.getText());
            float Price =Float.parseFloat(txtFixCost.getText());
            String cusGroupNo =CustomerGroupNo(cmbCusGroup.getSelectedItem().toString());
            String discription =txtDiscription.getText();
            Timestamp CreatedDate =new Timestamp(System.currentTimeMillis());
            int CreatedBy=User_ID;
            String isActive ="N",deleteYes ="N";
            if(rbIscative.isSelected()){
                isActive ="Y";
            }
            int lineCutMonth =Integer.parseInt(txtLinecut.getText());
            float lateChage =Float.parseFloat(txtLateChage.getText());
            float renuePrice =Float.parseFloat(txtRenuePrice.getText());
            
    if(cusGroupNo.equals(CusGroupNo(cusGroupNo)))  {
    
        JOptionPane.showMessageDialog(null, "You Don't Need Create It Again It Allready In The System !");
        
        return;
        
    }   else{
            
            FixCost fc =new FixCost();
            fc.setCreatedBy(CreatedBy);
            fc.setCreatedDate(CreatedDate);
            fc.setDeleteYes(deleteYes);
            fc.setDiscription(discription);
            fc.setDueDate(dueDate);
            fc.setFixCNo(fixCno);
            fc.setFixCost(Price);
            fc.setIsActive(isActive);
            fc.setName(name);
            fc.setLateChageRate(lateChage);
            fc.setLineCutMonth(lineCutMonth);
            fc.setCusGroupNo(cusGroupNo);
            fc.setConnctionRenue(renuePrice);
            
            try {
             boolean result =   FixCostControler.createNewRecord(fc);
                if(result){
                    JOptionPane.showMessageDialog(null, "Created New Record ! ");
                     btnClear.doClick();
                }else{
                   JOptionPane.showMessageDialog(null, " Error ! ");
                    btnClear.doClick();
                }
             
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(CustomerGroupCommonControlers.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);
            }
            
            
            
        }
        
        
        } 
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtFixCostKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFixCostKeyPressed

        txtFixCost.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent eve) {
                String AllowedData="0123456789.";
                char enter = eve.getKeyChar();
                int count=0;
                if(eve.getKeyChar()=='.'){
                    count++;
                } else {
                }
                
                if (!AllowedData.contains(String.valueOf(enter))||count>1) {
                    eve.consume();
                }
            }       
        });
      
        
        
    }//GEN-LAST:event_txtFixCostKeyPressed

    private void txtDueDateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDueDateKeyPressed
          txtDueDate.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent eve) {
                String AllowedData="0123456789";
                char enter = eve.getKeyChar();
                int count=0;
                if(eve.getKeyChar()=='V'||eve.getKeyChar()=='v'){
                count++;
                }
                
                if (!AllowedData.contains(String.valueOf(enter))||count>1) {
                    eve.consume();
                }
            }       
        });        // TODO add your handling code here:
    }//GEN-LAST:event_txtDueDateKeyPressed

    private void txtLinecutKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLinecutKeyPressed
 txtLinecut.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent eve) {
                String AllowedData="0123456789";
                char enter = eve.getKeyChar();
                int count=0;
                if(eve.getKeyChar()=='.'){
                    count++;
                } else {
                }
                
                if (!AllowedData.contains(String.valueOf(enter))||count>1) {
                    eve.consume();
                }
            }       
        });        // TODO add your handling code here:
    }//GEN-LAST:event_txtLinecutKeyPressed

    private void txtLateChageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLateChageKeyPressed
 txtLateChage.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent eve) {
                String AllowedData="0123456789.";
                char enter = eve.getKeyChar();
                int count=0;
                if(eve.getKeyChar()=='.'){
                    count++;
                } else {
                }
                
                if (!AllowedData.contains(String.valueOf(enter))||count>1) {
                    eve.consume();
                }
            }       
        });         // TODO add your handling code here:
    }//GEN-LAST:event_txtLateChageKeyPressed

    private void txtRenuePriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRenuePriceKeyPressed
            txtRenuePrice.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent eve) {
                String AllowedData="0123456789.";
                char enter = eve.getKeyChar();
                int count=0;
                if(eve.getKeyChar()=='.'){
                    count++;
                } else {
                }
                
                if (!AllowedData.contains(String.valueOf(enter))||count>1) {
                    eve.consume();
                }
            }       
        });        // TODO add your handling code here:
    }//GEN-LAST:event_txtRenuePriceKeyPressed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        if (txtName.getText().trim().equals("")||txtDueDate.getText().trim().equals("")||txtFixCost.getText().trim().equals("")||txtLateChage.getText().trim().equals("")||txtLinecut.getText().trim().equals("")||txtRenuePrice.getText().trim().equals("")){
        
            if(txtName.getText().trim().equals("")){
                 txtName.setBackground(Color.pink);
            }else{
                 txtName.setBackground(Color.white);  
            }
            
            if(txtDueDate.getText().trim().equals("")){
                txtDueDate.setBackground(Color.pink);
            }else{
                 txtDueDate.setBackground(Color.pink);  
            }
             
            if(txtFixCost.getText().trim().equals("")){
                txtFixCost.setBackground(Color.pink);
            }else{
               txtFixCost.setBackground(Color.pink); 
            }
            
             if(txtLateChage.getText().trim().equals("")){
                txtLateChage.setBackground(Color.pink);
            }else{
                 txtLateChage.setBackground(Color.pink);  
            }
             
            if(txtLinecut.getText().trim().equals("")){
                txtLinecut.setBackground(Color.pink);
            }else{
               txtLinecut.setBackground(Color.pink); 
            }
            if(txtRenuePrice.getText().trim().equals("")){
                txtRenuePrice.setBackground(Color.pink);
            }else{
               txtRenuePrice.setBackground(Color.pink); 
            }
            
            
            
            JOptionPane.showMessageDialog(null, "Fill All Relevent Line ! ");
        }else{
        
            String fixCno =txtFno.getText();
            String name =txtName.getText();
            int dueDate =Integer.parseInt(txtDueDate.getText());
            float Price =Float.parseFloat(txtFixCost.getText());
            String cusGroupNo =CustomerGroupNo(cmbCusGroup.getSelectedItem().toString());
            String discription =txtDiscription.getText();
            Timestamp CreatedDate =new Timestamp(System.currentTimeMillis());
            int CreatedBy=User_ID;
            String isActive ="N",deleteYes ="N";
            if(rbIscative.isSelected()){
                isActive ="Y";
            }
            int lineCutMonth =Integer.parseInt(txtLinecut.getText());
            float lateChage =Float.parseFloat(txtLateChage.getText());
            float renuePrice =Float.parseFloat(txtRenuePrice.getText());
            
            
            FixCost fc =new FixCost();
            fc.setUpdatedBy(CreatedBy);
            fc.setUpdateDate(CreatedDate);
            fc.setDeleteYes(deleteYes);
            fc.setDiscription(discription);
            fc.setDueDate(dueDate);
            fc.setFixCNo(fixCno);
            fc.setFixCost(Price);
            fc.setIsActive(isActive);
            fc.setName(name);
            fc.setLateChageRate(lateChage);
            fc.setLineCutMonth(lineCutMonth);
            fc.setCusGroupNo(cusGroupNo);
            fc.setConnctionRenue(renuePrice);
            
            try {
             boolean result =   FixCostControler.updateNewRecord(fc);
                if(result){
                    JOptionPane.showMessageDialog(null, "Updated  Record ! ");
                    btnClear.doClick();
                }else{
                   JOptionPane.showMessageDialog(null, " Error ! ");
                    btnClear.doClick();
                }
             
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(CustomerGroupCommonControlers.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);
            }
            
            
            
        } 
      
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblFixCostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFixCostMouseClicked

        int i= tblFixCost.getSelectedRow();
        TableModel model =tblFixCost.getModel();
        txtFno.setText(model.getValueAt(i,0).toString());
        txtSearch.setText(model.getValueAt(i,0).toString());
        String isActive =model.getValueAt(i,1).toString();
        txtName.setText(model.getValueAt(i,2).toString());
        String GroupName = model.getValueAt(i,3).toString();
        cmbCusGroup.removeAllItems();
        cmbCusGroup.addItem(GroupName);
        setCusGroupName();
        txtFixCost.setText(model.getValueAt(i,4).toString());
        txtDueDate.setText(model.getValueAt(i,5).toString());
        txtLinecut.setText(model.getValueAt(i,6).toString());
        txtLateChage.setText(model.getValueAt(i,7).toString());
        txtRenuePrice.setText(model.getValueAt(i,8).toString());
        txtDiscription.setText(model.getValueAt(i,9).toString());
        if(isActive.equals("Y")){
            rbIscative.setSelected(true);
        }else{
             rbIscative.setSelected(false);  
        }

            //setCusGroupName();

        
    }//GEN-LAST:event_tblFixCostMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        txtDiscription.setText("");
        txtDueDate.setText("");
        txtFixCost.setText("");
        txtFno.setText("");
        txtLateChage.setText("");
        txtLinecut.setText("");
        txtName.setText("");
        txtRenuePrice.setText("");
        txtSearch.setText("");
        cmbCusGroup.removeAllItems();
         setFixCostNo();
         setCusGroupName();
         viewAllRecord();

        
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
     
            Timestamp CreatedDate =new Timestamp(System.currentTimeMillis());
            int CreatedBy=User_ID;
            String isActive ="N",deleteYes ="N";
            String fixCno =txtFno.getText();
            
            FixCost fc =new FixCost();    
            fc.setUpdatedBy(CreatedBy);
            fc.setUpdateDate(CreatedDate);
            fc.setDeleteYes(deleteYes);
            fc.setFixCNo(fixCno);
            
          try {
             boolean result =   FixCostControler.deleteNewRecord(fc);
                if(result){
                    JOptionPane.showMessageDialog(null, "Deleted Record ! ");
                    btnClear.doClick();
                }else{
                   JOptionPane.showMessageDialog(null, " Error ! ");
                    btnClear.doClick();
                }
             
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(CustomerGroupCommonControlers.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);
            }
               

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
      String No=  txtSearch.getText().trim().toUpperCase();
      txtSearch.setText(No);
      
        
    try {
            ArrayList<FixCost> searchRecord =FixCostControler.searchRecord(No); //userList
            DefaultTableModel dtm =(DefaultTableModel)tblFixCost.getModel();
            //Object [] row =new Object[4];
            dtm.setRowCount(0);
            for(FixCost f :searchRecord){
                
                Object[] rowData = {
                   f.getFixCNo(),
                   f.getIsActive(),
                   f.getName(),
                   f.getCusGroupNo(),
                   f.getFixCost(),
                   f.getDueDate(),
                   f.getLineCutMonth(),
                   f.getLateChageRate(),
                   f.getConnctionRenue(),
                   f.getDiscription()
                        
                };
                
        txtFno.setText(f.getFixCNo());
        String isActive =f.getIsActive();
        txtName.setText(f.getName());
        String GroupName = f.getCusGroupNo();
        cmbCusGroup.removeAllItems();
        cmbCusGroup.addItem(GroupName);
        setCusGroupName();
        txtFixCost.setText(""+f.getFixCost());
        txtDueDate.setText(""+f.getDueDate());
        txtLinecut.setText(""+ f.getLineCutMonth());
        txtLateChage.setText(""+f.getLateChageRate());
        txtRenuePrice.setText(""+f.getConnctionRenue());
        txtDiscription.setText( f.getDiscription());
        if(isActive.equals("Y")){
            rbIscative.setSelected(true);
        }else{
             rbIscative.setSelected(false);  
        }
             dtm.addRow(rowData);
                
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EmployeeGroup.class.getName()).log(Level.SEVERE, null, ex);
        }
  


        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        btnSearch.doClick();     
    }//GEN-LAST:event_txtSearchActionPerformed

   
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerGroupCommonControlers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbCusGroup;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbIscative;
    private javax.swing.JTable tblFixCost;
    private javax.swing.JTextField txtDiscription;
    private javax.swing.JTextField txtDueDate;
    private javax.swing.JTextField txtFixCost;
    private javax.swing.JTextField txtFno;
    private javax.swing.JTextField txtLateChage;
    private javax.swing.JTextField txtLinecut;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRenuePrice;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
