
package bw.randiyadahara.wsims.view;
import bw.randiyadahara.wsims.controler.CustomerControler;
import bw.randiyadahara.wsims.controler.CustomerGroupUsageMatrixPriceListCotroler;
import bw.randiyadahara.wsims.controler.UsageMatrixPriceListControler;
import bw.randiyadahara.wsims.model.Customer;
import bw.randiyadahara.wsims.model.CustomerGroupmatrixPriceList;
import bw.randiyadahara.wsims.model.UsageMatrixPriceList;
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

public final class CustomerGroupPriceMetrix extends javax.swing.JFrame {

   
    public CustomerGroupPriceMetrix() {
        initComponents();
        setLineNo();
        setListNo();
        setGroupName();
        loadCustomerGroupPriceList();
    }
    int User_ID;
public CustomerGroupPriceMetrix(int User_id) {
        initComponents();
        this.User_ID =User_id;
        setLineNo();
        setListNo();
        setGroupName();
        loadCustomerGroupPriceList();
    }

public  String LineNoSet (String lineNo){

      String lNo =lineNo; 
      int numberPart;
      String TxtPart;
            TxtPart =lNo.substring(0,3);
            numberPart =Integer.parseInt(lNo.substring(3));
            numberPart++;
            lNo=TxtPart+numberPart;
            
          return lNo;

}

public String CustomerGroupNo(String name){
String cusGroupNo = null ;
        try {
          cusGroupNo=  UsageMatrixPriceListControler.getCustomerGroupNo(name);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerGroupPriceMetrix.class.getName()).log(Level.SEVERE, null, ex);
        }

return cusGroupNo;

}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPriceListNumber = new javax.swing.JTextField();
        rbIsActiveM = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnClearList = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtDiscription = new javax.swing.JTextField();
        btnHome1 = new javax.swing.JButton();
        txtPLname = new javax.swing.JTextField();
        cmbGroup = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPriceListName = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        txtSearchList = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtToUnits = new javax.swing.JTextField();
        txtRate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtLineNo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtFromUnits = new javax.swing.JTextField();
        rbisActiveLine = new javax.swing.JRadioButton();
        jPanel9 = new javax.swing.JPanel();
        btnUpdate1 = new javax.swing.JButton();
        btnSave1 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        txtPriceListNoLine = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtnameLine = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        txtLineSearch = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnSearchListLines = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLine = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Existing Price Level"));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 748, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 331, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Assign Price Level ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel3.setToolTipText("");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Price List Number");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Customer Group Name");

        txtPriceListNumber.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtPriceListNumber.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtPriceListNumber.setEnabled(false);

        rbIsActiveM.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbIsActiveM.setText("  Active");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Price List Name");

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/delete48.png"))); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnClearList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/clear48.png"))); // NOI18N
        btnClearList.setText("Clear");
        btnClearList.setActionCommand("CLEAR");
        btnClearList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClearList, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearList, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Description");

        txtDiscription.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtDiscription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiscriptionActionPerformed(evt);
            }
        });

        btnHome1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/home2.png"))); // NOI18N
        btnHome1.setText("Home");
        btnHome1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHome1MouseClicked(evt);
            }
        });

        txtPLname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        cmbGroup.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPriceListNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                    .addComponent(txtPLname))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(rbIsActiveM, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnHome1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cmbGroup, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(txtDiscription)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPriceListNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(rbIsActiveM)
                        .addComponent(btnHome1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPLname, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cmbGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiscription, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Existing customer Group Prices"));

        tblPriceListName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tblPriceListName.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Price List Number", "PriceList Name", "Cus Group Name", "Active", "Description"
            }
        ));
        tblPriceListName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPriceListNameMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPriceListName);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));

        txtSearchList.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtSearchList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchListActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Price List Number");

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/Search.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSearchList)
                .addGap(18, 18, 18)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchList, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("CutomerGroup", jPanel1);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Price Levels ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("From Uinits");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("To Units");

        txtToUnits.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtToUnits.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtToUnitsKeyPressed(evt);
            }
        });

        txtRate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRateKeyPressed(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Name");

        txtLineNo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtLineNo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtLineNo.setEnabled(false);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Rate for Unit");

        txtFromUnits.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtFromUnits.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFromUnitsKeyPressed(evt);
            }
        });

        rbisActiveLine.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbisActiveLine.setText(" Active");

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnUpdate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/UpdateListItem.png"))); // NOI18N
        btnUpdate1.setText("Update");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        btnSave1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/AddListItem.png"))); // NOI18N
        btnSave1.setText("Add");
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/RemoveListItem.png"))); // NOI18N
        btnDelete.setText("Rmove");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/ClearList.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUpdate1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/home2.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });

        txtPriceListNoLine.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtPriceListNoLine.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtPriceListNoLine.setEnabled(false);
        txtPriceListNoLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceListNoLineActionPerformed(evt);
            }
        });

        jLabel13.setText("Price List Number");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Line No");

        txtnameLine.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addGap(13, 13, 13)
                                    .addComponent(jLabel13))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(5, 5, 5)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRate)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                            .addComponent(txtFromUnits, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(33, 33, 33)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                            .addComponent(txtLineNo, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtPriceListNoLine, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(rbisActiveLine, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtnameLine)
                                    .addComponent(txtToUnits)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbisActiveLine)
                            .addComponent(jLabel13)))
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPriceListNoLine, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLineNo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtnameLine, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtToUnits, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtFromUnits, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRate, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Price Levels ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        txtLineSearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtLineSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLineSearchActionPerformed(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Price List No");

        btnSearchListLines.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/Search.png"))); // NOI18N
        btnSearchListLines.setText("Search");
        btnSearchListLines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchListLinesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLineSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnSearchListLines, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSearchListLines, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtLineSearch)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Price Levels ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tblLine.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tblLine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Price List No", "Is Active", "Line No", "Name", "From Units", "To Units", "Unit Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblLine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLineMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblLine);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Price Set", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public  void setLineNo(){
    
        try {
          String lineNo =  CustomerGroupUsageMatrixPriceListCotroler.getLineNo();
          txtLineNo.setText(lineNo);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerGroupPriceMetrix.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    public void setGroupName(){
      
        try {
            ArrayList<Customer> groupName =CustomerControler.getCustomerGroup();
             for (Customer c : groupName){
             cmbGroup.addItem(c.getCustomerGroupName());
             } 
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      } 
    
    
     public  void setListNo(){
    
        try {
          String listNo =  UsageMatrixPriceListControler.getPriceListNo();
          txtPriceListNoLine.setText(listNo);
          txtPriceListNumber.setText(listNo);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerGroupPriceMetrix.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    } 
     
        public  String MaxListNo(){
          String listNo = null;
        try {
          listNo =  UsageMatrixPriceListControler.getPriceListNo();
          
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerGroupPriceMetrix.class.getName()).log(Level.SEVERE, null, ex);
        }
       return listNo;
    }
     
      private int isAlreadyExists(String lineNo) {

        DefaultTableModel dtm = (DefaultTableModel) tblLine.getModel();

        for (int i = 0; i < dtm.getRowCount(); i++) {
            String code = (String) dtm.getValueAt(i, 2);
            if (code.equals(lineNo)) {
                return i;
            }
        }

        return -1;

    }
      
      public void loadCustomerGroupPriceList(){
      
      
       try {
            ArrayList<UsageMatrixPriceList> allUsageMatrixPriceList =UsageMatrixPriceListControler.viewAllPriceList(); //userList
            DefaultTableModel dtm =(DefaultTableModel)tblPriceListName.getModel();
            //Object [] row =new Object[4];
            dtm.setRowCount(0);
            for(UsageMatrixPriceList l :allUsageMatrixPriceList){
                
                Object[] rowData = {
                   l.getUmextrixPriceLNo(),
                   l.getName(),
                   l.getDeteteYes(),
                   l.getIsactive(),
                   l.getDiscription()
                        
                };
                
                dtm.addRow(rowData);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EmployeeGroup.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      
      
      }
      
      public void getPriceListOfCustomerGroup (String PriceListNo){
      
       try {
            ArrayList<CustomerGroupmatrixPriceList> list =CustomerGroupUsageMatrixPriceListCotroler.GetGroupPriceList(PriceListNo); //userList
            DefaultTableModel dtm =(DefaultTableModel)tblLine.getModel();
            //Object [] row =new Object[4];
            dtm.setRowCount(0);
            for(CustomerGroupmatrixPriceList l :list){
                
                Object[] rowData = {
                   l.getMextrixPriceListNo(),
                   l.getIsActive(),
                   l.getLineNo(),
                   l.getName(),
                   l.getFromUnits(),
                   l.getToUnits(),
                   l.getRate()
                        
                        
                };
                
                dtm.addRow(rowData);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EmployeeGroup.class.getName()).log(Level.SEVERE, null, ex);
        }
          
          
      
      }
      
   public  String checkLineNo(String lineNo){
   String LineNo = null;
        try {
             LineNo =CustomerGroupUsageMatrixPriceListCotroler.checkLineNo(lineNo);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerGroupPriceMetrix.class.getName()).log(Level.SEVERE, null, ex);
        }
      return LineNo ;
   }
   
  public  String cusGroupNo(String groupno){
   String No = null;
        try {
             No =CustomerGroupUsageMatrixPriceListCotroler.getCusGroupNo(groupno);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerGroupPriceMetrix.class.getName()).log(Level.SEVERE, null, ex);
        }
      return No ;
   }
   
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
    
        if(txtPLname.getText().trim().equals("")){   
        txtPLname.setBackground(Color.pink);     
        }else{
        txtPLname.setBackground(Color.white);
        String cusGroupno =CustomerGroupNo(cmbGroup.getSelectedItem().toString());
        String PLno =txtPriceListNumber.getText();
        String name =txtPLname.getText();
        String discription =txtDiscription.getText();
        String isActive ="N",deleteYes ="N";
        Timestamp CreatedDate =new Timestamp(System.currentTimeMillis());
        int CreateBy =User_ID;
        
        if(rbIsActiveM.isSelected()){
        isActive ="Y";
        }
        
        if(cusGroupno.equals(cusGroupNo(cusGroupno))){
        
            JOptionPane.showMessageDialog(null,"Price List AllReady In The System !");
            return;
        }else{
        
        UsageMatrixPriceList umpl  = new UsageMatrixPriceList();
        umpl.setCreatedDate(CreatedDate);
        umpl.setCreatedby(User_ID);
        umpl.setDeteteYes(deleteYes);
        umpl.setDiscription(discription);
        umpl.setIsactive(isActive);
        umpl.setName(name);
        umpl.setUmextrixPriceLNo(PLno);
        
        
         ArrayList<CustomerGroupmatrixPriceList> PriceListDetails= new ArrayList<>();
        DefaultTableModel dtm = (DefaultTableModel) tblLine.getModel();
        for (int i = 0; i < dtm.getRowCount(); i++) {
            String priceListNo = (String) dtm.getValueAt(i, 0);
            String isActiveLine = (String)dtm.getValueAt(i, 1);
            String LineNo = (String) dtm.getValueAt(i,2 );
            String Linename =(String) dtm.getValueAt(i,3 );
            int Funits = (int) dtm.getValueAt(i, 4);
            int Tounits = (int) dtm.getValueAt(i, 5);
            float rate =  (float)dtm.getValueAt(i, 6);
            CustomerGroupmatrixPriceList cgpl = new  CustomerGroupmatrixPriceList();
            cgpl.setDeleteYes("N");
            cgpl.setIsActive(isActiveLine);
            cgpl.setFromUnits(Funits);
            cgpl.setToUnits(Tounits);
            cgpl.setGroupNo(cusGroupno);
            cgpl.setLineNo(LineNo);
            cgpl.setMextrixPriceListNo(priceListNo);
            cgpl.setRate(rate);
            cgpl.setName(name);
            
            
            PriceListDetails.add(cgpl);
        }
        
        
            try {
             boolean result =   UsageMatrixPriceListControler.addNewPriceList(umpl, PriceListDetails);
             if(result){
             JOptionPane.showMessageDialog(null,"Created New Customer Group Price List !");
             btnClearList.doClick();
             
             } else{
             JOptionPane.showMessageDialog(null, "Error ! ");
              btnClearList.doClick();
             }  
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(CustomerGroupPriceMetrix.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,ex);
            }
        }

   
      }
       

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed


        if(txtPLname.getText().trim().equals("")){   
             txtPLname.setBackground(Color.pink);     
        }else{
        txtPLname.setBackground(Color.white);
        String cusGroupno =CustomerGroupNo(cmbGroup.getSelectedItem().toString());
        String PLno =txtPriceListNumber.getText();
        String name =txtPLname.getText();
        String discription =txtDiscription.getText();
        String isActive ="N",deleteYes ="N";
        Timestamp updatedDate =new Timestamp(System.currentTimeMillis());
        int updatedBy =User_ID;
        
        if(rbIsActiveM.isSelected()){
        isActive ="Y";
        }
        
        UsageMatrixPriceList umpl  = new UsageMatrixPriceList();
        umpl.setUpdateDate(updatedDate);
        umpl.setUpdateBy(updatedBy);
        umpl.setDeteteYes(deleteYes);
        umpl.setDiscription(discription);
        umpl.setIsactive(isActive);
        umpl.setName(name);
        umpl.setUmextrixPriceLNo(PLno);
        
        
         ArrayList<CustomerGroupmatrixPriceList> PriceListDetails= new ArrayList<>();
        DefaultTableModel dtm = (DefaultTableModel) tblLine.getModel();
        for (int i = 0; i < dtm.getRowCount(); i++) {
            String priceListNo = (String) dtm.getValueAt(i, 0);
            String isActiveLine = (String)dtm.getValueAt(i, 1);
            String LineNo = (String) dtm.getValueAt(i,2 );
            String Linename =(String) dtm.getValueAt(i,3 );
            int Funits = (int) dtm.getValueAt(i, 4);
            int Tounits = (int) dtm.getValueAt(i, 5);
            float rate =  (float)dtm.getValueAt(i, 6);
            
            CustomerGroupmatrixPriceList cgpl = new  CustomerGroupmatrixPriceList();
            cgpl.setDeleteYes("N");
            cgpl.setIsActive(isActiveLine);
            cgpl.setFromUnits(Funits);
            cgpl.setToUnits(Tounits);
            cgpl.setGroupNo(cusGroupno);
            cgpl.setLineNo(LineNo);
            cgpl.setMextrixPriceListNo(priceListNo);
            cgpl.setRate(rate);
            cgpl.setName(Linename);
            
            
            PriceListDetails.add(cgpl);
        }
        
        
            try {
             boolean result = UsageMatrixPriceListControler.updatePriceList(umpl, PriceListDetails);
             if(result){
             JOptionPane.showMessageDialog(null,"Updated Customer Group Price List Details !");
             btnClearList.doClick();
             }   else{
              JOptionPane.showMessageDialog(null, "Error ! ");
              btnClearList.doClick();
             }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(CustomerGroupPriceMetrix.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,ex);
            }
        
        
         
        }



        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtDiscriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiscriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiscriptionActionPerformed

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed

        if(checkLineNo(txtLineNo.getText()).equals("NO") && !MaxListNo().equals(txtPriceListNoLine.getText()) ){
            
        DefaultTableModel model = (DefaultTableModel) tblLine.getModel();
     
        if(txtToUnits.getText().trim().equals("")||txtRate.getText().trim().equals("")||txtFromUnits.getText().trim().equals("")){
        
         if(txtToUnits.getText().trim().equals("")){
             txtToUnits.setBackground(Color.pink);
         }else{
           txtToUnits.setBackground(Color.white);
         }
         
         if(txtRate.getText().trim().equals("")){
             txtRate.setBackground(Color.pink);
         }else{
             txtRate.setBackground(Color.white);
         }
         
         if(txtFromUnits.getText().trim().equals("")){
             txtFromUnits.setBackground(Color.pink);
         }else{
             txtFromUnits.setBackground(Color.white);
         }
         
         
     }else{
         
         String name =txtnameLine.getText();
         String lineNo =txtLineNo.getText();
         String PriceLno=txtPriceListNoLine.getText();
         int fromUnite =Integer.parseInt(txtFromUnits.getText());
         int toUnite =Integer.parseInt(txtToUnits.getText());
         float rate =Float.parseFloat(txtRate.getText());
         String isActive ="N";
            if(rbisActiveLine.isSelected()){
                isActive ="Y"; 
             }
         
         
        if(fromUnite>toUnite){
             txtToUnits.setBackground(Color.pink);
              JOptionPane.showMessageDialog(null,"Invalid Units !"); 
             return;
         }else{
             txtToUnits.setBackground(Color.white);
         }
         
         
         
         
         CustomerGroupmatrixPriceList cgpl = new CustomerGroupmatrixPriceList();
         cgpl.setName(name);
         cgpl.setLineNo(lineNo);
         cgpl.setDeleteYes("N");
         cgpl.setMextrixPriceListNo(PriceLno);
         cgpl.setFromUnits(fromUnite);
         cgpl.setToUnits(toUnite);
         cgpl.setRate(rate);
         cgpl.setIsActive(isActive);
         cgpl.setGroupNo(CustomerGroupNo(cmbGroup.getSelectedItem().toString()));
         
         
            try {
               boolean result =  CustomerGroupUsageMatrixPriceListCotroler.addPriceListNewLine(cgpl);
               if(result){
                   JOptionPane.showMessageDialog(null, "Add New Price Level To "+cmbGroup.getSelectedItem()+" !");
               }else{
               JOptionPane.showMessageDialog(null, "Error !");
               return;
               }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(CustomerGroupPriceMetrix.class.getName()).log(Level.SEVERE, null, ex);
            }
         
         
         
         int rowIndex = isAlreadyExists(txtLineNo.getText().toString());

        
         
        if (rowIndex == -1) {
            Object[] rowData = {
                PriceLno,
                isActive,
                lineNo,
                name,
                fromUnite,
                toUnite,
                rate
            };
            model.addRow(rowData);
            txtLineNo.setText(  LineNoSet(txtLineNo.getText()));
            btnClear.doClick();
            
        } else {
            
           
            
            tblLine.setValueAt(isActive, rowIndex, 1);
            tblLine.setValueAt(name, rowIndex, 3);
            tblLine.setValueAt(fromUnite, rowIndex, 4);
            tblLine.setValueAt(toUnite, rowIndex, 5);
            tblLine.setValueAt(rate, rowIndex, 6);
            txtLineNo.setText(  LineNoSet(txtLineNo.getText()));
            btnClear.doClick();
        }
         
     
     
     }
           
         
     }else{
       
        
         DefaultTableModel model = (DefaultTableModel) tblLine.getModel();
     
        if(txtToUnits.getText().trim().equals("")||txtRate.getText().trim().equals("")||txtFromUnits.getText().trim().equals("")){
        
         if(txtToUnits.getText().trim().equals("")){
             txtToUnits.setBackground(Color.pink);
         }else{
           txtToUnits.setBackground(Color.white);
         }
         
         if(txtRate.getText().trim().equals("")){
             txtRate.setBackground(Color.pink);
         }else{
             txtRate.setBackground(Color.white);
         }
         
         if(txtFromUnits.getText().trim().equals("")){
             txtFromUnits.setBackground(Color.pink);
         }else{
             txtFromUnits.setBackground(Color.white);
         }
         
         
     }else{
         
         String name =txtnameLine.getText();
         String lineNo =txtLineNo.getText();
         String PriceLno=txtPriceListNoLine.getText();
         int fromUnite =Integer.parseInt(txtFromUnits.getText());
         int toUnite =Integer.parseInt(txtToUnits.getText());
         float rate =Float.parseFloat(txtRate.getText());
         String isActive ="N";
         if(rbisActiveLine.isSelected()){
            isActive ="Y"; 
         }
         
         if(fromUnite>toUnite){
             txtToUnits.setBackground(Color.pink);
             JOptionPane.showMessageDialog(null,"Invalid Units !");
             return;
         }else{
             txtToUnits.setBackground(Color.white);
         }
         
         
         
         
         int rowIndex = isAlreadyExists(txtLineNo.getText().toString());
         btnClear.doClick();
        if (rowIndex == -1) {
            Object[] rowData = {
                PriceLno,
                isActive,
                lineNo,
                name,
                fromUnite,
                toUnite,
                rate
            };
            model.addRow(rowData);
            txtLineNo.setText(  LineNoSet(txtLineNo.getText()));
        } else {
            
            tblLine.setValueAt(isActive, rowIndex, 1);
            tblLine.setValueAt(name, rowIndex, 3);
            tblLine.setValueAt(fromUnite, rowIndex, 4);
            tblLine.setValueAt(toUnite, rowIndex, 5);
            tblLine.setValueAt(rate, rowIndex, 6);
            txtLineNo.setText(  LineNoSet(txtLineNo.getText()));
             btnClear.doClick();
        }
         
        //txtLineNo.setText(  LineNoSet(txtLineNo.getText()));
     
     }
        
        
  }
         
        
    }//GEN-LAST:event_btnSave1ActionPerformed

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
       
        this.dispose();
        
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnHome1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome1MouseClicked
        this.dispose();
    }//GEN-LAST:event_btnHome1MouseClicked

    private void txtPriceListNoLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceListNoLineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceListNoLineActionPerformed

    private void txtFromUnitsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFromUnitsKeyPressed

         txtFromUnits.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent eve) {
                String AllowedData="0123456789";
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
    }//GEN-LAST:event_txtFromUnitsKeyPressed

    private void txtToUnitsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtToUnitsKeyPressed
        
          txtToUnits.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent eve) {
                String AllowedData="0123456789";
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
    }//GEN-LAST:event_txtToUnitsKeyPressed

    private void txtRateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRateKeyPressed
  
           txtRate.addKeyListener(new KeyAdapter() {
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
        
        
        
    }//GEN-LAST:event_txtRateKeyPressed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        try {
          boolean result =  CustomerGroupUsageMatrixPriceListCotroler.removePriceListLine(txtLineNo.getText());
            
          if(result){
              
              JOptionPane.showMessageDialog(null, "Removed Price Level !");
               int selectedRow = tblLine.getSelectedRow();
            
            if (selectedRow == -1) {
                return;
            }
            
            DefaultTableModel dtm = (DefaultTableModel) tblLine.getModel();
            dtm.removeRow(selectedRow);
          }else{
          
              JOptionPane.showMessageDialog(null, "Error !");
          }
           
            
            // calculateTotalValue();        // TODO add your handling code here:
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerGroupPriceMetrix.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerGroupPriceMetrix.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblLineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLineMouseClicked

 int i= tblLine.getSelectedRow();
        TableModel model =tblLine.getModel();
        txtPriceListNoLine.setText(model.getValueAt(i,0).toString());
        txtLineSearch.setText(model.getValueAt(i,0).toString());
        String isActive =model.getValueAt(i,1).toString();
        txtLineNo.setText(model.getValueAt(i,2).toString());
        txtnameLine.setText(model.getValueAt(i,3).toString());
        txtFromUnits.setText(model.getValueAt(i,4).toString());
        txtToUnits.setText(model.getValueAt(i,5).toString());
        txtRate.setText(model.getValueAt(i,6).toString());
       
        if(isActive.equals("Y")){
            rbisActiveLine.setSelected(true);
        }else{
             rbisActiveLine.setSelected(false);  
        }
        
    }//GEN-LAST:event_tblLineMouseClicked

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
      DefaultTableModel model = (DefaultTableModel) tblLine.getModel();
        int rowIndex = isAlreadyExists(txtLineNo.getText().toString());

         String name =txtnameLine.getText();
         String lineNo =txtLineNo.getText();
         String PriceLno=txtPriceListNoLine.getText();
         int fromUnite =Integer.parseInt(txtFromUnits.getText());
         int toUnite =Integer.parseInt(txtToUnits.getText());
         float rate =Float.parseFloat(txtRate.getText());
         String isActive ="N";
         if(rbisActiveLine.isSelected()){
            isActive ="Y"; 
         }
         
           if(fromUnite>toUnite){
             
             txtToUnits.setText("");
             txtToUnits.setBackground(Color.pink);
             return;
         }else{
            txtToUnits.setBackground(Color.white);
         }
         
         
         
        
        if (rowIndex == -1) {
            Object[] rowData = {
                PriceLno,
                isActive,
                lineNo,
                name,
                fromUnite,
                toUnite,
                rate
            };
            model.addRow(rowData);
            txtLineNo.setText(  LineNoSet(txtLineNo.getText()));
            btnClear.doClick();
        } else {
            
            tblLine.setValueAt(isActive, rowIndex, 1);
            tblLine.setValueAt(name, rowIndex, 3);
            tblLine.setValueAt(fromUnite, rowIndex, 4);
            tblLine.setValueAt(toUnite, rowIndex, 5);
            tblLine.setValueAt(rate, rowIndex, 6);
            btnClear.doClick();
        }

      //   btnMClear.doClick();
        
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
      //  txtLineNo.setText(  LineNoSet(txtLineNo.getText())); 
       // txtLineNo.setText("");
        txtFromUnits.setText("");
        txtToUnits.setText("");
       // txtPriceListNoLine.setText("");
       // txtPriceListNumber.setText("");
       // txtnameLine.setText("");
        txtRate.setText("");
        rbisActiveLine.setSelected(false);
        
        //  DefaultTableModel dtm =(DefaultTableModel)tblLine.getModel();
        //  dtm.setRowCount(0);
          //setLineNo();
          //setListNo();
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void tblPriceListNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPriceListNameMouseClicked


int i= tblPriceListName.getSelectedRow();
        TableModel model =tblPriceListName.getModel();
        txtPriceListNumber.setText(model.getValueAt(i,0).toString());
        txtSearchList.setText(model.getValueAt(i,0).toString());
        txtPLname.setText(model.getValueAt(i,1).toString());
        String GroupName = model.getValueAt(i,2).toString();
        cmbGroup.removeAllItems();
        cmbGroup.addItem(GroupName);
        setGroupName();
        String isActive =model.getValueAt(i,3).toString();
        txtDiscription.setText(model.getValueAt(i,4).toString());
        if(isActive.equals("Y")){
            rbIsActiveM.setSelected(true);
        }else{
             rbIsActiveM.setSelected(false);  
        }
        // DefaultTableModel dtm =(DefaultTableModel)tblLine.getModel();
        // dtm.setRowCount(0);
         getPriceListOfCustomerGroup (txtPriceListNumber.getText());
         txtPriceListNoLine.setText(model.getValueAt(i,0).toString());
         setLineNo();
    }//GEN-LAST:event_tblPriceListNameMouseClicked

    private void btnClearListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearListActionPerformed
        txtSearchList.setText("");
        txtPriceListNumber.setText("");
        txtPLname.setText("");
        txtDiscription.setText("");
        cmbGroup.removeAllItems();
        rbIsActiveM.setSelected(false);
        loadCustomerGroupPriceList();
        DefaultTableModel dtm =(DefaultTableModel)tblLine.getModel();
        dtm.setRowCount(0);
        btnClear.doClick();
         setLineNo();
        setListNo();
        setGroupName();
        
        
    }//GEN-LAST:event_btnClearListActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

      String priceListNo =  txtSearchList.getText().trim().toUpperCase();
      txtSearchList.setText(priceListNo);
        
          try {
            ArrayList<UsageMatrixPriceList> allUsageMatrixPriceList =UsageMatrixPriceListControler.searchPriceList(priceListNo); //userList
            DefaultTableModel dtm =(DefaultTableModel)tblPriceListName.getModel();
            //Object [] row =new Object[4];
            dtm.setRowCount(0);
            for(UsageMatrixPriceList l :allUsageMatrixPriceList){
                
                Object[] rowData = {
                   l.getUmextrixPriceLNo(),
                   l.getName(),
                   l.getDeteteYes(),
                   l.getIsactive(),
                   l.getDiscription()
                        
                };
                
                dtm.addRow(rowData);
                
                
        txtPriceListNumber.setText(l.getUmextrixPriceLNo());
        txtPLname.setText(l.getName());
        String GroupName = l.getDeteteYes();
        cmbGroup.removeAllItems();
        cmbGroup.addItem(GroupName);
        setGroupName();
        String isActive =l.getIsactive();
        txtDiscription.setText(l.getDiscription());
        if(isActive.equals("Y")){
            rbIsActiveM.setSelected(true);
        }else{
             rbIsActiveM.setSelected(false);  
        }
        
        getPriceListOfCustomerGroup (txtPriceListNumber.getText());
        setLineNo();
        }
          } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EmployeeGroup.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtLineSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLineSearchActionPerformed
        btnSearchListLines.doClick();
    }//GEN-LAST:event_txtLineSearchActionPerformed

    private void btnSearchListLinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchListLinesActionPerformed
            txtSearchList.setText(txtLineSearch.getText().trim().toUpperCase());
        
            btnSearch.doClick();        
    }//GEN-LAST:event_btnSearchListLinesActionPerformed

    private void txtSearchListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchListActionPerformed
            btnSearch.doClick();
    }//GEN-LAST:event_txtSearchListActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
       String PriceListNo =txtPriceListNumber.getText();
        
        try {
         boolean result  = UsageMatrixPriceListControler.deletePriceList(PriceListNo);
        
         if(result){
             JOptionPane.showMessageDialog(null,"Removed Price List !");
             btnClearList.doClick();
         }else{
             JOptionPane.showMessageDialog(null,"Error !");
             btnClearList.doClick();
         }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
            Logger.getLogger(CustomerGroupPriceMetrix.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerGroupPriceMetrix().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearList;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnHome1;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSave1;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearchListLines;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JButton btndelete;
    private javax.swing.JComboBox<String> cmbGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rbIsActiveM;
    private javax.swing.JRadioButton rbisActiveLine;
    private javax.swing.JTable tblLine;
    private javax.swing.JTable tblPriceListName;
    private javax.swing.JTextField txtDiscription;
    private javax.swing.JTextField txtFromUnits;
    private javax.swing.JTextField txtLineNo;
    private javax.swing.JTextField txtLineSearch;
    private javax.swing.JTextField txtPLname;
    private javax.swing.JTextField txtPriceListNoLine;
    private javax.swing.JTextField txtPriceListNumber;
    private javax.swing.JTextField txtRate;
    private javax.swing.JTextField txtSearchList;
    private javax.swing.JTextField txtToUnits;
    private javax.swing.JTextField txtnameLine;
    // End of variables declaration//GEN-END:variables
}
