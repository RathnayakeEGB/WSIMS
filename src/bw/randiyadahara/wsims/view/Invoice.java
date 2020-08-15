
package bw.randiyadahara.wsims.view;

import bw.randiyadahara.wsims.controler.invoice.controler.InvoiceControler;
import bw.randiyadahara.wsims.controler.invoice.controler.InvoiceSearviceControler;
import bw.randiyadahara.wsims.model.invoice.CalculateBillAmount;
import bw.randiyadahara.wsims.model.invoice.InvoiceSearvice;
import bw.randiyadahara.wsims.model.invoice.Invoices;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public final class Invoice extends javax.swing.JFrame {

    
    public Invoice() {
        initComponents();
        setInvoiceNo();
         ButtonGroup b =new ButtonGroup();
        b.add(rbno);
        b.add(rbyes);
        SetInvoiceSearviceLineNo();
        loadAllSearvices();
        loadAllInvoice();
        rbno.setSelected(true);
        rbIsActive.setSelected(true);
        rbIsactiveLine.setSelected(true);
    }
    int User_ID;
    String WaterUsageNo,cusGroupNo,lineNo;
    
     public Invoice(int user_ID) {
        initComponents();
        this.User_ID=user_ID;
        setInvoiceNo();
        ButtonGroup b =new ButtonGroup();
        b.add(rbno);
        b.add(rbyes);
        rbno.setSelected(true);
        SetInvoiceSearviceLineNo();
        loadAllSearvices();
        loadAllInvoice();
        rbIsActive.setSelected(true);
        rbIsactiveLine.setSelected(true);
    }

     
     
     
     
     public void setInvoiceNo(){
     
        try {
            String invNo = InvoiceControler.getInvoiceNo();
            txtInvNo.setText(invNo);
            txtInvNoLine.setText(invNo);
            lblInvNo.setText(invNo);
            
        } catch (ClassNotFoundException | SQLException ex) {  
            Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
            
        }
     
     }
     
     public void SetInvoiceSearviceLineNo(){
     String LineNo;
        try {
         LineNo =  InvoiceSearviceControler.getInvoiceSearviceLineNo();
         txtSearviceLineNO.setText(LineNo);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     private String LineNoSet (String liString){

      String lNo =lineNo; 
      int numberPart;
      String TxtPart;
            TxtPart =lNo.substring(0,4);
            numberPart =Integer.parseInt(lNo.substring(4));
            numberPart++;
            lNo=TxtPart+numberPart;
            
          return lNo;

}
     
     public  void loadAllSearvices(){
     
        try {
       ArrayList<InvoiceSearvice> al= InvoiceSearviceControler.getsearviceName();
       
       for (InvoiceSearvice c : al){
             cmbNameOfsearvice.addItem(c.getServiceName());
            }
       
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     
     }
     
     private int isAlreadyExists(String InvLineNo) {

        DefaultTableModel dtm = (DefaultTableModel) tblLine.getModel();

        for (int i = 0; i < dtm.getRowCount(); i++) {
            String code = (String) dtm.getValueAt(i, 2);
            if (code.equals(InvLineNo)) {
                return i;
            }
        }

        return -1;

    }
      
     private float getSumofSearviceChages() {

        DefaultTableModel dtm = (DefaultTableModel) tblLine.getModel();
      float LineTotal=0,allSearviceCost =0;
      
        for (int i = 0; i < dtm.getRowCount(); i++) {
          LineTotal  = (float) dtm.getValueAt(i, 6);
            allSearviceCost =allSearviceCost+LineTotal;
    
    }
        return allSearviceCost;
   } 
   
     private Invoices  getWaterUsageDetails(int month,int Year,String CusNo ){
    
         Invoices i=null;
        
        try {
            i =InvoiceControler.GetCustomerAndOtherDetails(month, Year, CusNo);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
        }
       return i;
     }
   
   
    public  void  loadInvoiceSearvices(String invoiceNo ){
    
         try {
            ArrayList<InvoiceSearvice> allInvoiceSearvices =InvoiceSearviceControler.viewInvoiceSearvice(invoiceNo); //userList
            DefaultTableModel dtm =(DefaultTableModel)tblLine .getModel();
            //Object [] row =new Object[4];
            dtm.setRowCount(0);
            for(InvoiceSearvice i :allInvoiceSearvices ){
                
                Object[] rowData = {
                   i.getDeletedYes(),
                   i.getIsActve(),
                   i.getInvoiceLineNo(),
                   i.getServiceName(),
                   i.getQty(),
                   i.getPrice(),
                   i.getLineTotal(),
                   i.getDescription()     
                };
                
                dtm.addRow(rowData);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EmployeeGroup.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    
    
    
    }
   public void loadAllInvoice(){
      
      
       try {
            ArrayList<Invoices> allInvoices =InvoiceControler.loadAllinvoices(); //userList
            DefaultTableModel dtm =(DefaultTableModel)tblInvoice .getModel();
            //Object [] row =new Object[4];
            dtm.setRowCount(0);
            for(Invoices i :allInvoices ){
                
                Object[] rowData = {
                   i.getInvoiceNo(),
                   i.getIsActive(),
                   i.getIsPaid(),
                   i.getCusNo(),
                   i.getName(),
                   i.getAddress(),
                   i.getCusGroupName(),
                   i.getInvDate(),
                   i.getYear(),
                   i.getMonth(),
                   i.getInvType(),
                   i.getDueDate(),
                   i.getServiceYeas(),
                   (int) i.getConsumpUnites(),
                   i.getBillAmount(),
                   i.getDf2(),  //i.setDf2(rst.getFloat(18));  //service cost
                   i.getFixCost(),
                   i.getOpenBalance(),
                   i.getTotalPrice(),
                   i.getDescription()
                        
                };
                
                dtm.addRow(rowData);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EmployeeGroup.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      
      
      }  
     
     public  void  setCustomerDetails(int month,int Year,String CusNo ){
       Invoices i=null;
        try {
               i =InvoiceControler.GetCustomerAndOtherDetails(month, Year, CusNo);

            try{WaterUsageNo =i.getWaterUsageNo(); cusGroupNo =i.getCusGroupNo();}catch(Exception exx){WaterUsageNo =null; cusGroupNo=null;  }
            
            if(i!=null){
             lblInvNo.setText(txtInvNo.getText());
             txtCuName.setText(i.getName());
             lblCusname.setText(i.getName());
             lblAddress.setText(i.getAddress());
             lblCusGroupName.setText(i.getCusGroupName());
             lblYear.setText(""+i.getYear());
             lblMonth.setText(""+i.getMonth());
             lblCusNo.setText(CusNo);
             lblMeterReadDate.setText(""+i.getMterReadDate());
             lblStartU.setText(""+i.getMeterStrat());
             lblEndU.setText(""+i.getMeterEnd());
             lblComU.setText(Integer.toString((int)i.getConsumpUnites()));
             txtUseUnite.setText(Integer.toString((int)i.getConsumpUnites()));
             lblOpenB.setText(""+i.getOpenBalance());
             lblFixcost.setText(""+i.getFixCost());
             txtDueDate.setText(""+i.getDueDate());
             String cusgupNo =i.getCusGroupNo();
             float usageChage =getComsuptionUnitChageAmount((int) i.getConsumpUnites(), i.getCusGroupNo()); //UNITS CHARGE FIND
             txtBillPrice.setText(""+usageChage);
             lblPrice.setText(""+usageChage);
             float op =i.getOpenBalance();
             
             try{
             lblBillPayment.setText(""+(usageChage+i.getFixCost()-(i.getOpenBalance())));
             txtInvAmount.setText(""+((float)i.getFixCost()+(usageChage-(op))+Float.parseFloat(txtInvAmount.getText())));
             lblInvAmount.setText(""+((float)i.getFixCost()+(usageChage-(op))+Float.parseFloat(lblInvAmount.getText())));    
                 
             }catch(NumberFormatException ex){
             
             txtInvAmount.setText(""+((float)i.getFixCost()+usageChage-(op)));
             lblInvAmount.setText(""+((float)i.getFixCost()+usageChage-(op)));
             
             }
            }else{
            JOptionPane.showMessageDialog(null, " Empty Records. Check agian ! ");
            
            }
          
            
        } catch (ClassNotFoundException | SQLException ex) {
            //JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    
     }
     
     public float getComsuptionUnitChageAmount(int units,String cusNo ){
     
     float Amount =0;
     
        try {
          Amount= CalculateBillAmount.comsuptionUnitesChages(units, cusNo);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex);
        }
     return Amount;
     }
        public String Qty(){
        int Qty = Integer.parseInt( txtQtyLine.getText().trim());
        float price = Float.parseFloat( txtServicePrice.getText().trim());
        return ""+(price*Qty);
    }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtInvNo = new javax.swing.JTextField();
        txtCuName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCusNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmbInvType = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtDueDate = new javax.swing.JTextField();
        rbIsActive = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        txtDesxription = new javax.swing.JTextField();
        txtUseUnite = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        rbyes = new javax.swing.JRadioButton();
        rbno = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        txtInvAmount = new javax.swing.JTextField();
        rbIsPaid = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        Idate = new com.toedter.calendar.JDateChooser();
        IYear = new com.toedter.calendar.JYearChooser();
        Imoth = new com.toedter.calendar.JMonthChooser();
        jLabel29 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtBillPrice = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblCusNo = new javax.swing.JLabel();
        lblCusname = new javax.swing.JLabel();
        lblCusGroupName = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        lblMonth = new javax.swing.JLabel();
        lblMeterReadDate = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lblStartU = new javax.swing.JLabel();
        lblEndU = new javax.swing.JLabel();
        lblComU = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblOpenB = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        lblInvAmount = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        lblInvNo = new javax.swing.JLabel();
        lblFixcost = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        lblBillPayment = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblAddiSearvicePrice = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        btnsearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInvoice = new javax.swing.JTable();
        btnHome = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        txtInvNoLine = new javax.swing.JTextField();
        txtSearviceLineNO = new javax.swing.JTextField();
        txtQty = new javax.swing.JLabel();
        txtQtyLine = new javax.swing.JTextField();
        cmbNameOfsearvice = new javax.swing.JComboBox<>();
        rbIsactiveLine = new javax.swing.JRadioButton();
        jLabel43 = new javax.swing.JLabel();
        txtServicePrice = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btnUpdateLine = new javax.swing.JButton();
        btnSaveLine = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        btnLineClear = new javax.swing.JButton();
        txtDiscriptionLine = new javax.swing.JTextField();
        txtLineTotal = new javax.swing.JTextField();
        x = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLine = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        btnSearch3 = new javax.swing.JButton();
        txtSearchLine = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Invoice"); // NOI18N

        jPanel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer Invoice", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Invoice Number");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Customer Name");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Invoice Date");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Invoice Type");

        txtInvNo.setEditable(false);
        txtInvNo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtInvNo.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        txtCuName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Customer Number");

        txtCusNo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtCusNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCusNoActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Bill Amount");

        cmbInvType.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmbInvType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AR", "AP" }));
        cmbInvType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbInvTypeActionPerformed(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Due Date");

        txtDueDate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtDueDate.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDueDate.setEnabled(false);

        rbIsActive.setText("  Active");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Description");

        txtDesxription.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtUseUnite.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtUseUnite.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtUseUnite.setEnabled(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Consumption Units");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Aditional Service");

        rbyes.setText(" Yes");

        rbno.setText("  No");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Invoice Amount");

        txtInvAmount.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtInvAmount.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtInvAmount.setEnabled(false);

        rbIsPaid.setText(" Paid");

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

        Idate.setDateFormatString("yyyy-MM-dd");
        Idate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        IYear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        Imoth.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Month");

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel36.setText("Year");

        txtBillPrice.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtBillPrice.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtBillPrice.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 64, Short.MAX_VALUE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDesxription, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                                    .addComponent(txtCuName)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(rbyes, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbno, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(cmbInvType, 0, 176, Short.MAX_VALUE)
                                            .addComponent(txtUseUnite))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtInvAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtBillPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtInvNo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(133, 133, 133))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(txtCusNo)
                                    .addGap(59, 59, 59)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(IYear, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addGap(62, 62, 62)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Imoth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Idate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rbIsActive)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbIsPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtInvNo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbIsActive)
                    .addComponent(rbIsPaid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(IYear, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Imoth, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel29)
                            .addGap(18, 18, 18)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCusNo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel4))
                    .addComponent(Idate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCuName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUseUnite, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbInvType, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBillPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(rbyes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtInvAmount, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDesxription, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Water Bill", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Customer Number");

        a.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        a.setText("Address");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Customer Type");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Year");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Month");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Meter Read Date");

        lblCusNo.setText("................................................");

        lblCusname.setText("................................................");

        lblCusGroupName.setText("................................................");

        lblYear.setText("................................................");

        lblMonth.setText("................................................");

        lblMeterReadDate.setText("................................................");

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Start Units");

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("End Units");

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Comsuption Units");

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Price For Consumption Units");

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Open Balance Of Moth");

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Fix Cost");

        lblStartU.setText("................................................");

        lblEndU.setText("................................................");

        lblComU.setText("................................................");

        lblPrice.setText("................................................");

        lblOpenB.setText("................................................");

        jLabel38.setForeground(new java.awt.Color(255, 51, 51));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel38.setText("Aditional Service Charges");

        jLabel39.setForeground(new java.awt.Color(255, 51, 51));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel39.setText("Total Invoice Amount");

        lblInvAmount.setForeground(new java.awt.Color(255, 51, 51));
        lblInvAmount.setText("................................................");

        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel41.setText("Invoice Number");

        lblInvNo.setText("................................................");

        lblFixcost.setText("................................................");

        lblBillPayment.setForeground(new java.awt.Color(255, 0, 0));
        lblBillPayment.setText("................................................");

        jLabel44.setForeground(new java.awt.Color(255, 0, 0));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel44.setText("Bill Payment");

        lblAddress.setText("................................................");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Name");

        lblAddiSearvicePrice.setForeground(new java.awt.Color(255, 51, 51));
        lblAddiSearvicePrice.setText(".");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lblAddiSearvicePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblBillPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel27))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lblInvAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                .addGap(10, 10, 10))
                            .addComponent(lblCusGroupName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCusname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblInvNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCusNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMeterReadDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMonth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblComU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblStartU, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEndU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFixcost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblOpenB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblYear, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(lblInvNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblCusNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCusname)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(a))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCusGroupName)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lblYear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lblMonth))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMeterReadDate)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(lblStartU))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(lblEndU))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComU)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(lblPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(lblOpenB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(lblFixcost))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(lblBillPayment))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel38)
                        .addComponent(lblAddiSearvicePrice)))
                .addGap(139, 139, 139)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInvAmount)
                    .addComponent(jLabel39))
                .addGap(43, 43, 43))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search invoice", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel45.setText("Invoice Number");

        btnsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/Search.png"))); // NOI18N
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnsearch)
                .addGap(33, 33, 33))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(btnsearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21))))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Existing Invoices", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tblInvoice.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tblInvoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice No", "IsActive", "Is Paid", "Cus No", "Name", "Address", "C Type", "Date", "Year", "Month", "INVType", "Due Date", "Additional Searvice", "Qty", "Bill Amount", "Additional Cost", "FixCost", "OpBalance", "Total", "Description"
            }
        ));
        tblInvoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblInvoiceMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblInvoice);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1075, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
        );

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/home2.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(btnHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Invoice", jPanel1);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Searvice Add", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel47.setText("Service Name");

        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel48.setText("Service Line No");

        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel49.setText("Invoice Number");

        txtInvNoLine.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtInvNoLine.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtInvNoLine.setEnabled(false);

        txtSearviceLineNO.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtSearviceLineNO.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtSearviceLineNO.setEnabled(false);

        txtQty.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtQty.setText("QTY");

        txtQtyLine.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtQtyLine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtQtyLineMouseReleased(evt);
            }
        });
        txtQtyLine.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtQtyLineInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        txtQtyLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyLineActionPerformed(evt);
            }
        });
        txtQtyLine.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQtyLineKeyTyped(evt);
            }
        });

        cmbNameOfsearvice.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmbNameOfsearvice.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbNameOfsearviceItemStateChanged(evt);
            }
        });
        cmbNameOfsearvice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNameOfsearviceActionPerformed(evt);
            }
        });

        rbIsactiveLine.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbIsactiveLine.setText("  Active");

        jLabel43.setText("Service Price");

        txtServicePrice.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel51.setText("Description");

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnUpdateLine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/UpdateListItem.png"))); // NOI18N
        btnUpdateLine.setText("Update");
        btnUpdateLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateLineActionPerformed(evt);
            }
        });

        btnSaveLine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/AddListItem.png"))); // NOI18N
        btnSaveLine.setText("Add");
        btnSaveLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveLineActionPerformed(evt);
            }
        });

        btnDelete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/RemoveListItem.png"))); // NOI18N
        btnDelete1.setText("Delete");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });

        btnLineClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/ClearList.png"))); // NOI18N
        btnLineClear.setText("Clear");
        btnLineClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLineClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSaveLine, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdateLine, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLineClear, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateLine)
                    .addComponent(btnSaveLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLineClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        txtDiscriptionLine.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtLineTotal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        x.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        x.setText("Amount");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSearviceLineNO)
                            .addComponent(txtQtyLine, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                            .addComponent(txtInvNoLine)
                            .addComponent(txtLineTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel47))
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtServicePrice)
                            .addComponent(cmbNameOfsearvice, 0, 487, Short.MAX_VALUE)
                            .addComponent(rbIsactiveLine, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiscriptionLine))))
                .addGap(493, 493, 493))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(rbIsactiveLine)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbNameOfsearvice, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtServicePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDiscriptionLine, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel51))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtInvNoLine, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearviceLineNO, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQtyLine, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQty))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLineTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        tblLine.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tblLine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice No", "Is Active", "Line No", "Searvice Name", "Qty", "Price", "Line Total", "Description"
            }
        ));
        tblLine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLineMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblLine);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1065, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search invoice", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel53.setText("Invoice Number");

        btnSearch3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/Search.png"))); // NOI18N
        btnSearch3.setText("Search");
        btnSearch3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch3ActionPerformed(evt);
            }
        });

        txtSearchLine.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtSearchLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchLineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearchLine, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearchLine, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                        .addComponent(btnSearch3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 1091, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Invoice Line", jPanel2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void SetServicePrice(){
    
       String Name =cmbNameOfsearvice.getSelectedItem().toString().trim();
        try {
            InvoiceSearvice i  = InvoiceSearviceControler.getsearvicePrice(Name);
            txtServicePrice.setText(Float.toString(i.getPrice()));
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
            Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
    public  Invoices ContorlingSaving(int year,int month,String cusno){
   Invoices i = null; 
        try {
             i =InvoiceControler.getControlers(year, month, cusno);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return i;
    }
    
    
   public String getSevrviceNo(String name){
   String sno =null;
        try {
            InvoiceSearvice is =  InvoiceSearviceControler.getsearvicePrice(name);
            sno =is.getServiceNo();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   return sno;
   }
    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
       this.dispose();   
    }//GEN-LAST:event_btnHomeActionPerformed

    private void cmbInvTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbInvTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbInvTypeActionPerformed

    private void txtCusNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCusNoActionPerformed
        

        txtInvAmount.setText("");
        lblInvAmount.setText("");
        String cusNo =  txtCusNo.getText().trim().toUpperCase();
        txtCusNo.setText(cusNo);
        int Year =IYear.getYear();
        int Month =Imoth.getMonth()+1;
        setCustomerDetails(Month, Year, cusNo);
        setInvoiceNo();
        
    }//GEN-LAST:event_txtCusNoActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

            String invNo =txtInvNo.getText();
            int Year =IYear.getYear();
            int Month =Imoth.getMonth()+1;
            String cusno =   txtCusNo.getText();
            Timestamp createdDate =new Timestamp(System.currentTimeMillis());
            int createdBy = User_ID;
            DefaultTableModel dtm =(DefaultTableModel)tblLine .getModel();
            Invoices i = new Invoices();
            int row =dtm.getRowCount();

            if(row>0){
                i.setServiceYeas("Y");
            }else{ i.setServiceYeas("N");  }
            
           
            i.setDeleteYeas("Y");
            i.setInvoiceNo(invNo);
            i.setUpdateBY(createdBy);
            i.setUpdateDate(createdDate);
   
         
                try {
                    boolean result = InvoiceControler.deleteInvoice(i);
                    if(result){
                        JOptionPane.showMessageDialog(null, "Invoice Deleted !");
                        btnClear.doClick();
                    }else{
                        JOptionPane.showMessageDialog(null, "Error !");
                        btnClear.doClick();
                    }
                    
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
                }



        // }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void cmbNameOfsearviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNameOfsearviceActionPerformed
    
   
        
    }//GEN-LAST:event_cmbNameOfsearviceActionPerformed

    private void cmbNameOfsearviceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbNameOfsearviceItemStateChanged
     
        if(cmbNameOfsearvice.getItemCount()>0){
        SetServicePrice();
        }else{
        
        }
       

// TODO add your handling code here:
    }//GEN-LAST:event_cmbNameOfsearviceItemStateChanged

    private void btnSaveLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveLineActionPerformed
       DefaultTableModel model = (DefaultTableModel) tblLine.getModel();
      
      if(txtLineTotal.getText().trim().equals("")||txtQtyLine.getText().trim().equals("")) {
      
          if(txtLineTotal.getText().trim().equals("")){
                 txtLineTotal.setBackground(Color.pink);
          }else{
                 txtLineTotal.setBackground(Color.white);
          }
          if(txtQtyLine.getText().trim().equals("")){
                 txtQtyLine.setBackground(Color.pink);
          }else{
                 txtQtyLine.setBackground(Color.white);
          }
          
          
      }else{
         
                 txtLineTotal.setBackground(Color.white);
                 txtQty.setBackground(Color.white);
                  txtQtyLine.setBackground(Color.white);
      
      String lineNo=txtSearviceLineNO.getText().trim();
      String InvNo =txtInvNoLine.getText().trim();
      String serviceName =cmbNameOfsearvice.getSelectedItem().toString();
      InvoiceSearvice i = null;
           try {
               i = InvoiceSearviceControler.getsearvicePrice(serviceName);
           } catch (ClassNotFoundException | SQLException ex) {
               Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
           }
        String serviceno=i.getServiceNo();
      
      int Qty = Integer.parseInt(txtQtyLine.getText().trim());
      float lineTotal =Float.parseFloat(txtLineTotal.getText());
      String Description =txtDiscriptionLine.getText();
      float Price = Float.parseFloat(txtServicePrice.getText());
      String isActive ="N",deleteYes ="N";
      float invAmount;
      try{invAmount =Float.parseFloat(txtInvAmount.getText()); }catch (NumberFormatException ex){ invAmount =0;}
      if(rbIsactiveLine.isSelected()){
       isActive="Y";  
      }
      
       int rowIndex = isAlreadyExists(lineNo);
      
       if (rowIndex == -1) {
            Object[] rowData = {
                InvNo,
                isActive,
                lineNo,
                serviceName,
                Qty,
                Price,
                lineTotal,
                Description
                
            };
           
            model.addRow(rowData);
            this.lineNo =lineNo;
            txtInvAmount.setText(""+((float)invAmount+lineTotal));
            lblInvAmount.setText(""+((float)invAmount+lineTotal));
            txtSearviceLineNO.setText(LineNoSet(lineNo));
            lblAddiSearvicePrice.setText(""+(float)getSumofSearviceChages());
            
           // btnLineClear.doClick();
        } else {
          
        }
      
      
      }
      
        
    }//GEN-LAST:event_btnSaveLineActionPerformed
 

    
    private void txtQtyLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyLineActionPerformed
      txtLineTotal.setText(Qty());  
      
         txtQtyLine.addKeyListener(new KeyAdapter() {
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
      
      
      
    }//GEN-LAST:event_txtQtyLineActionPerformed

    private void txtQtyLineKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyLineKeyTyped
  
    }//GEN-LAST:event_txtQtyLineKeyTyped

    private void txtQtyLineInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtQtyLineInputMethodTextChanged
               
    }//GEN-LAST:event_txtQtyLineInputMethodTextChanged

    private void txtQtyLineMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQtyLineMouseReleased
                  // TODO add your handling code here:
    }//GEN-LAST:event_txtQtyLineMouseReleased

    private void btnLineClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLineClearActionPerformed
       txtSearchLine.setText("");
        txtLineTotal.setText("");
        txtDiscriptionLine.setText("");
        txtQtyLine.setText("");
        txtServicePrice.setText("");
        cmbNameOfsearvice.removeAllItems();
        txtLineTotal.setBackground(Color.white);
        txtQty.setBackground(Color.white);
        txtQtyLine.setBackground(Color.white);
        
        loadAllSearvices();
        SetServicePrice();
      //  txtSearviceLineNO.setText(LineNoSet(lineNo));
        //DefaultTableModel model = (DefaultTableModel) tblLine.getModel();
        //model.setRowCount(0);
        
    }//GEN-LAST:event_btnLineClearActionPerformed

    private void btnUpdateLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateLineActionPerformed
  DefaultTableModel model = (DefaultTableModel) tblLine.getModel();
      
      if(txtLineTotal.getText().trim().equals("")||txtQtyLine.getText().trim().equals("")) {
      
          if(txtLineTotal.getText().trim().equals("")){
                 txtLineTotal.setBackground(Color.pink);
          }else{
                 txtLineTotal.setBackground(Color.white);
          }
          if(txtQtyLine.getText().trim().equals("")){
                 txtQtyLine.setBackground(Color.pink);
          }else{
                 txtQtyLine.setBackground(Color.white);
          }
          
          
      }else{
         
                 txtLineTotal.setBackground(Color.white);
                 txtQty.setBackground(Color.white);     
      DefaultTableModel dtm = (DefaultTableModel) tblLine.getModel();  
     
      String lineNo=txtSearviceLineNO.getText().trim();
      String InvNo =txtInvNoLine.getText().trim();
      String serviceName =cmbNameOfsearvice.getSelectedItem().toString();
      InvoiceSearvice i = null;
      
      int Qty = Integer.parseInt(txtQtyLine.getText().trim());
      float lineTotal =Float.parseFloat(txtLineTotal.getText());
      String Description =txtDiscriptionLine.getText();
      float Price = Float.parseFloat(txtServicePrice.getText());
      String isActive ="N",deleteYes ="N";
      if(rbIsactiveLine.isSelected()){
       isActive="Y";
      } 
     float invAmount;
     try { invAmount =Float.parseFloat(txtBillPrice.getText());}catch (Exception e){invAmount=0;}
      
      
        int rowIndex = isAlreadyExists(lineNo);
      
       if (rowIndex == -1) {
          
        } else {
           
            tblLine.setValueAt(isActive, rowIndex, 1);
            tblLine.setValueAt(serviceName, rowIndex, 3);
            tblLine.setValueAt(Qty, rowIndex, 4);
            tblLine.setValueAt(Price, rowIndex, 5);
            tblLine.setValueAt(lineTotal, rowIndex, 6);
            tblLine.setValueAt(Description, rowIndex, 7);
            txtSearviceLineNO.setText(LineNoSet(lineNo));
            getSumofSearviceChages();
            lblAddiSearvicePrice.setText(""+(float)getSumofSearviceChages());
            txtInvAmount.setText(""+((float)invAmount+getSumofSearviceChages()));
            lblInvAmount.setText(""+((float)invAmount+getSumofSearviceChages()));
           
        } 
       // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateLineActionPerformed
}
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

    if(txtCusNo.getText().trim().equals("")||txtCuName.getText().trim().equals("")||txtInvAmount.getText().trim().equals("")||txtBillPrice.getText().equals("")||Idate.getDate()==null){
    
          if(txtCusNo.getText().trim().equals("")){
                 txtCusNo.setBackground(Color.pink);
          }else{
                 txtCusNo.setBackground(Color.white);
          }
          if(txtCuName.getText().trim().equals("")){
                 txtCuName.setBackground(Color.pink);
          }else{
                 txtCuName.setBackground(Color.white);
          }
          if(txtInvAmount.getText().trim().equals("")){
                 txtInvAmount.setBackground(Color.pink);
          }else{
                 txtInvAmount.setBackground(Color.white);
          }
          if(txtBillPrice.getText().trim().equals("")){
                txtBillPrice.setBackground(Color.pink);
          }else{
                 txtBillPrice.setBackground(Color.white);
          }
        
        JOptionPane.showMessageDialog(null," You should Fill the All Relevent Fields !");
        
     
    }else{
            {txtBillPrice.setBackground(Color.white);
             txtInvAmount.setBackground(Color.white);
             txtCuName.setBackground(Color.white);
             txtCusNo.setBackground(Color.white);
            }
        
            
            String invNo =txtInvNo.getText();
            String cusno =txtCusNo.getText();
            String cusName =txtCuName.getText();
            int year =IYear.getYear();
            int month =Imoth.getMonth()+1;
            java.sql.Date invDate =new java.sql.Date(Idate.getDate().getTime());
            Timestamp createdDate =new Timestamp(System.currentTimeMillis());
            int createdBy = User_ID;
            String waterUsageNo =this.WaterUsageNo;
            int dueDate =Integer.parseInt( txtDueDate.getText());
            String invType =cmbInvType.getSelectedItem().toString();
            String additionalSearvice ="N",isActive ="N",deleteYes ="N",isPaid="N";
            
            if(rbyes.isSelected()){
                additionalSearvice="Y";
            }else{
                additionalSearvice ="N";
            }
            if(rbIsActive.isSelected()){
                isActive="Y";
            }
             if(rbIsPaid.isSelected()){
                isPaid="N";
            }
             
                String description =txtDesxription.getText();
                float billAmount =Float.parseFloat(txtBillPrice.getText());
                float InvoiceAmount= Float.parseFloat(txtInvAmount.getText());
                float fixcost =Float.parseFloat(lblFixcost.getText());
                float openBalance =Float.parseFloat(lblOpenB.getText());
                float serviceCost;
           
             if(lblAddiSearvicePrice.getText().trim().equals(".")){
                    serviceCost =0;
             }else{
                    serviceCost =Float.parseFloat(lblAddiSearvicePrice.getText());
             }
             
        Invoices i =new Invoices();
                i.setInvoiceNo(invNo);
                i.setFixCost(fixcost);
                i.setDeleteYeas(deleteYes);
                i.setInvType(invType);
                i.setIsPaid(isPaid);
                i.setIsActive(isActive);
                i.setOpenBalance(openBalance);
                i.setCreatedBy(User_ID);
                i.setCreatedDate(createdDate);
                i.setBillAmount(billAmount);
                i.setInvAmount(InvoiceAmount);
                i.setInvDate(invDate);
                i.setYear(year);
                i.setMonth(month);
                i.setCusNo(cusno);
                i.setAdditionalSearvic(additionalSearvice);
                i.setCusGroupNo(cusno);
                i.setCusGroupNo(cusGroupNo);
                i.setDescription(description);
                i.setServiceYeas(additionalSearvice);
                i.setDf1(serviceCost);
                i.setWaterUsageNo(waterUsageNo);
                i.setDueDate(dueDate);
            
        ArrayList<InvoiceSearvice> isList= new ArrayList<>();
        DefaultTableModel dtm = (DefaultTableModel) tblLine.getModel();
        if(dtm.getRowCount()>0){
                for (int j = 0; j < dtm.getRowCount(); j++) {
                   String invNoline = (String) dtm.getValueAt(j, 0);
                   String isActiveLine = (String)dtm.getValueAt(j, 1);
                   String LineNo = (String) dtm.getValueAt(j,2 );
                   String Servicename =(String) dtm.getValueAt(j,3 );
                   int qty = (int) dtm.getValueAt(j, 4);
                   float price = (float) dtm.getValueAt(j, 5);
                   float linetotal =  (float)dtm.getValueAt(j, 6);
                   String descriptionLine = (String) dtm.getValueAt(j,7 );

                   InvoiceSearvice is = new  InvoiceSearvice();
                   is.setDeletedYes("N");
                   is.setInvoiceLineNo(LineNo);
                   is.setIsActve(isActiveLine);
                   is.setServiceNo(getSevrviceNo(Servicename));
                   is.setQty(qty);
                   is.setPrice(price);
                   is.setLineTotal(linetotal);
                   is.setDescription(descriptionLine);
                   is.setServiceName(invNo);
                   isList.add(is);
                }
                 
               
            }else{
        
                 isList=null;
        }
         Invoices ic =ContorlingSaving(year, month, cusno);
         int y,m; String N;
         try{ y=ic.getYear();m=ic.getMonth();N=ic.getIsPaid();}catch(Exception e){y=0;m=0;N="N"; } //exception hadel
         
         
      if(year==y && month==m ){
          
          JOptionPane.showMessageDialog(null," Invoice is already created ! ");
          btnClear.doClick();
          
      }else{
          
          try {
            
                 boolean result = InvoiceControler.createInvoice(i, isList);
              
              if(result){
              
                    JOptionPane.showMessageDialog(null, " Invoiced for The Selected Month ");
                    btnClear.doClick();
              }else{
                    JOptionPane.showMessageDialog(null, "Error !");
                     btnClear.doClick();
              }
             
          } catch (ClassNotFoundException | SQLException ex) {
              Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
              JOptionPane.showMessageDialog(null,ex);
          }
          
      }
    
    }
   
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

             loadAllInvoice();
             lblInvNo.setText("................................................");
             txtCuName.setText("");
             lblCusname.setText("................................................");
             lblAddress.setText("................................................");
             lblCusGroupName.setText("................................................");
             lblYear.setText("................................................");
             lblMonth.setText("................................................");
             lblCusNo.setText("................................................");
             lblMeterReadDate.setText("................................................");
             lblStartU.setText("................................................");
             lblEndU.setText("................................................");
             lblComU.setText("................................................");
             txtUseUnite.setText("");
             lblOpenB.setText("................................................");
             lblFixcost.setText("................................................");
             txtBillPrice.setText("");
             lblPrice.setText("................................................");
             lblBillPayment.setText("................................................");
             lblInvNo.setText("................................................");
             lblAddiSearvicePrice.setText("."); //lblAddiSearvicePrice
             lblInvAmount.setText("................................................");
             txtDesxription.setText("");
             txtDueDate.setText("");
             txtDiscriptionLine.setText("");
             txtInvAmount.setText("");
             txtLineTotal.setText("");
             txtInvNoLine.setText("");
             txtQty.setText("");
             txtQtyLine.setText("");
             txtSearch.setText("");
             txtSearchLine.setText("");
             txtServicePrice.setText("");
             txtUseUnite.setText("");
             rbIsActive.setSelected(false);
             rbIsPaid.setSelected(false);
             rbno.setSelected(true);
             cmbNameOfsearvice.removeAllItems();
             txtCusNo.setText("");
             Idate.setCalendar(null);
             SetInvoiceSearviceLineNo();
             btnLineClear.doClick();
             loadAllSearvices();
             setInvoiceNo();
             SetServicePrice();
             SetInvoiceSearviceLineNo();
             loadAllInvoice();
             rbIsActive.setSelected(true);
             rbIsactiveLine.setSelected(true);
            
            // DefaultTableModel model = (DefaultTableModel) tblLine.getModel();
            // model.setRowCount(0);
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

         if(txtCusNo.getText().trim().equals("")||txtCuName.getText().trim().equals("")||txtInvAmount.getText().trim().equals("")||txtBillPrice.getText().equals("")||Idate.getDate()==null){
    
          if(txtCusNo.getText().trim().equals("")){
                 txtCusNo.setBackground(Color.pink);
          }else{
                 txtCusNo.setBackground(Color.white);
          }
          if(txtCuName.getText().trim().equals("")){
                 txtCuName.setBackground(Color.pink);
          }else{
                 txtCuName.setBackground(Color.white);
          }
          if(txtInvAmount.getText().trim().equals("")){
                 txtInvAmount.setBackground(Color.pink);
          }else{
                 txtInvAmount.setBackground(Color.white);
          }
          if(txtBillPrice.getText().trim().equals("")){
                txtBillPrice.setBackground(Color.pink);
          }else{
                 txtBillPrice.setBackground(Color.white);
          }
        
        JOptionPane.showMessageDialog(null," You should fill the relevent Fields !");
        
     
    }else{
            {txtBillPrice.setBackground(Color.white);
             txtInvAmount.setBackground(Color.white);
             txtCuName.setBackground(Color.white);
             txtCusNo.setBackground(Color.white);
            }
        
            
            String invNo =txtInvNo.getText();
            String cusno =txtCusNo.getText();
            String cusName =txtCuName.getText();
            int year =IYear.getYear();
            int month =Imoth.getMonth()+1;
            java.sql.Date invDate =new java.sql.Date(Idate.getDate().getTime());
            Timestamp createdDate =new Timestamp(System.currentTimeMillis());
            int createdBy = User_ID;
            String waterUsageNo =this.WaterUsageNo;
            int dueDate =Integer.parseInt( txtDueDate.getText());
            String invType =cmbInvType.getSelectedItem().toString();
            String additionalSearvice ="N",isActive ="N",deleteYes ="N",isPaid="N";
            
            if(rbyes.isSelected()){
                additionalSearvice="Y";
            }else{
                additionalSearvice ="N";
            }
            if(rbIsActive.isSelected()){
                isActive="Y";
            }
             if(rbIsPaid.isSelected()){
                isPaid="N";
            }
             
                String description =txtDesxription.getText();
                float billAmount =Float.parseFloat(txtBillPrice.getText());
                float InvoiceAmount= Float.parseFloat(txtInvAmount.getText());
                float fixcost =Float.parseFloat(lblFixcost.getText());
                float openBalance =Float.parseFloat(lblOpenB.getText());
                float serviceCost;
           
             if(lblAddiSearvicePrice.getText().trim().equals("................................................")){
                    serviceCost =0;
             }else{
                    serviceCost =Float.parseFloat(lblAddiSearvicePrice.getText());
             }
             
        Invoices i =new Invoices();
                i.setInvoiceNo(invNo);
                i.setFixCost(fixcost);
                i.setDeleteYeas(deleteYes);
                i.setInvType(invType);
                i.setIsPaid(isPaid);
                i.setIsActive(isActive);
                i.setOpenBalance(openBalance);
                i.setUpdateBY(User_ID);
                i.setUpdateDate(createdDate);
                i.setBillAmount(billAmount);
                i.setInvAmount(InvoiceAmount);
                i.setInvDate(invDate);
                i.setYear(year);
                i.setMonth(month);
                i.setCusNo(cusno);
                i.setAdditionalSearvic(additionalSearvice);
                i.setCusGroupNo(cusno);
                i.setCusGroupNo(cusGroupNo);
                i.setDescription(description);
                i.setServiceYeas(additionalSearvice);
                i.setDf1(serviceCost);
                i.setWaterUsageNo(waterUsageNo);
                i.setDueDate(dueDate);
            
        ArrayList<InvoiceSearvice> isList= new ArrayList<>();
        DefaultTableModel dtm = (DefaultTableModel) tblLine.getModel();
        if(dtm.getRowCount()>0){
                for (int j = 0; j < dtm.getRowCount(); j++) {
                   String invNoline = (String) dtm.getValueAt(j, 0);
                   String isActiveLine = (String)dtm.getValueAt(j, 1);
                   String LineNo = (String) dtm.getValueAt(j,2 );
                   String Servicename =(String) dtm.getValueAt(j,3 );
                   int qty = (int) dtm.getValueAt(j, 4);
                   float price = (float) dtm.getValueAt(j, 5);
                   float linetotal =  (float)dtm.getValueAt(j, 6);
                   String descriptionLine = (String) dtm.getValueAt(j,7 );

                   InvoiceSearvice is = new  InvoiceSearvice();
                   is.setDeletedYes("N");
                   is.setInvoiceLineNo(LineNo);
                   is.setIsActve(isActiveLine);
                   is.setServiceNo(getSevrviceNo(Servicename));
                   is.setQty(qty);
                   is.setPrice(price);
                   is.setLineTotal(linetotal);
                   is.setDescription(descriptionLine);
                   is.setServiceName(invNo); // USE AS INVOICE NUMBER 
                   isList.add(is);
                }
                 
               
            }else{
        
                 isList=null;
            }
         
        
         Invoices ic =ContorlingSaving(year, month, cusno);
         int y,m; String N;
         try{ y=ic.getYear();m=ic.getMonth();N=ic.getIsPaid().trim();}catch(Exception e){ y=0;m=0;N="N"; }
         
        if(rbIsPaid.isSelected()||N.equals("Y")){
         
            JOptionPane.showMessageDialog(null," Sorry ! Invoice is already paid ");
            btnClear.doClick();
            return;
        }else{
                
                try {

                       boolean result = InvoiceControler.updateInvoice(i, isList);

                    if(result){

                          JOptionPane.showMessageDialog(null, " Record Updated ! ");
                          btnClear.doClick();
                    }else{
                          JOptionPane.showMessageDialog(null, "Error !");
                           btnClear.doClick();
                    }

                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
                   // JOptionPane.showMessageDialog(null,ex);
                }
          
         }
    
    }
     

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
 
            int selectedRow = tblLine.getSelectedRow();
            DefaultTableModel dtm = (DefaultTableModel) tblLine.getModel();
            dtm.removeRow(selectedRow);
         
                   // TODO add your handling code here:
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void tblInvoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInvoiceMouseClicked

    int i= tblInvoice.getSelectedRow();
        TableModel model =tblInvoice.getModel();
        DefaultTableModel dtm =(DefaultTableModel)tblLine .getModel();
            
        dtm.setRowCount(0);
        
            lblInvNo.setText(model.getValueAt(i,0).toString());
            txtInvNo.setText(model.getValueAt(i,0).toString());
            txtSearch.setText(model.getValueAt(i,0).toString());
            String isActive =model.getValueAt(i,1).toString();
            String isPaid =model.getValueAt(i,2).toString().trim();
            txtCusNo.setText(model.getValueAt(i,3).toString()); 
            lblCusNo.setText(model.getValueAt(i,3).toString());
            String cusNo =txtCusNo.getText();
            txtCuName.setText(model.getValueAt(i,4).toString());
            lblCusname.setText(model.getValueAt(i,4).toString());
            lblAddress.setText(model.getValueAt(i,5).toString());
            lblCusGroupName.setText(model.getValueAt(i,6).toString());
            lblMeterReadDate.setText(model.getValueAt(i,7).toString());
            Date tanggal = (Date) model.getValueAt(tblInvoice.getSelectedRow(), 7);
            Idate.setDate(tanggal);
            int year =Integer.parseInt(model.getValueAt(i,8).toString());
            int month =Integer.parseInt(model.getValueAt(i,9).toString());
            Imoth.setMonth(month-1);
            IYear.setYear(year);
            lblYear.setText(model.getValueAt(i,8).toString());
            lblMonth.setText(model.getValueAt(i,9).toString());
            String InvType = model.getValueAt(i,10).toString();
            txtDueDate.setText(model.getValueAt(i,11).toString());
            String addSearvice =(model.getValueAt(i,12).toString());
            txtUseUnite.setText(model.getValueAt(i,13).toString());
            lblPrice.setText(model.getValueAt(i,13).toString());
            txtBillPrice.setText(model.getValueAt(i,14).toString());
            lblBillPayment.setText(model.getValueAt(i,14).toString());
            lblAddiSearvicePrice.setText(model.getValueAt(i,15).toString());
            lblFixcost.setText(model.getValueAt(i,16).toString());
            lblOpenB.setText(model.getValueAt(i,17).toString());
            lblInvAmount.setText(model.getValueAt(i,18).toString());
            txtInvAmount.setText(model.getValueAt(i,18).toString());
            txtDesxription.setText(model.getValueAt(i,19).toString());
            Invoices in =getWaterUsageDetails(month,year,cusNo);
            try { lblEndU.setText(""+in.getMeterEnd());
            lblComU.setText(Integer.toString((int)in.getConsumpUnites()));
            lblStartU.setText(""+in.getMeterStrat());} catch (Exception ex){lblEndU.setText("");lblComU.setText("");lblStartU.setText(""); }
            loadInvoiceSearvices((String)model.getValueAt(i,0).toString());
            
         if(isActive.equals("N")){
             rbIsActive.setSelected(false);
         }else{
             rbIsActive.setSelected(true);
         }

         if(isPaid.equals("Y")){
             rbIsPaid.setSelected(true);
         }else{
             rbIsPaid.setSelected(false); 
         }
         if(addSearvice.equals("Y")){
             rbyes.setSelected(true);
         }else{
             rbno.setSelected(true);
         }
        
        
    }//GEN-LAST:event_tblInvoiceMouseClicked

    private void tblLineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLineMouseClicked

     int i= tblLine.getSelectedRow();
        TableModel model =tblLine.getModel();
        DefaultTableModel dtm =(DefaultTableModel)tblLine .getModel();
            
        //dtm.setRowCount(0);
        
            txtInvNoLine.setText(model.getValueAt(i,0).toString());
            txtSearchLine.setText(model.getValueAt(i,0).toString());
            String isActive =model.getValueAt(i,1).toString();
            txtSearviceLineNO.setText(model.getValueAt(i,2).toString());
            txtQtyLine.setText(model.getValueAt(i,4).toString());
            txtServicePrice.setText(model.getValueAt(i,5).toString());
            String searviceNAme =model.getValueAt(i,3).toString();
            txtLineTotal.setText(model.getValueAt(i,6).toString());
            txtDiscriptionLine.setText(model.getValueAt(i,7).toString());

            if(isActive.equals("Y")){
                rbIsactiveLine.setSelected(true);
            }
 
    }//GEN-LAST:event_tblLineMouseClicked

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed

        String invNo =txtSearch.getText().toUpperCase();
        txtSearch .setText(invNo);
        
try {
            ArrayList<Invoices> allInvoices =InvoiceControler.searchinvoice(invNo); //userList
            DefaultTableModel dtm =(DefaultTableModel)tblInvoice .getModel();
            //Object [] row =new Object[4];
            dtm.setRowCount(0);
            for(Invoices i :allInvoices ){
                
                Object[] rowData = {
                   i.getInvoiceNo(),
                   i.getIsActive(),
                   i.getIsPaid(),
                   i.getCusNo(),
                   i.getName(),
                   i.getAddress(),
                   i.getCusGroupName(),
                   i.getInvDate(),
                   i.getYear(),
                   i.getMonth(),
                   i.getInvType(),
                   i.getDueDate(),
                   i.getServiceYeas(),
                   (int) i.getConsumpUnites(),
                   i.getBillAmount(),
                   i.getDf2(),  //i.setDf2(rst.getFloat(18));  //service cost
                   i.getFixCost(),
                   i.getOpenBalance(),
                   i.getTotalPrice(),
                   i.getDescription()
                        
                };
                
                dtm.addRow(rowData);
                loadInvoiceSearvices(invNo);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EmployeeGroup.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnsearchActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
       btnsearch.doClick();
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnSearch3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch3ActionPerformed
        btnsearch.doClick();
    }//GEN-LAST:event_btnSearch3ActionPerformed

    private void txtSearchLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchLineActionPerformed
        btnsearch.doClick();
    }//GEN-LAST:event_txtSearchLineActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Invoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JYearChooser IYear;
    private com.toedter.calendar.JDateChooser Idate;
    private com.toedter.calendar.JMonthChooser Imoth;
    private javax.swing.JLabel a;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLineClear;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSaveLine;
    private javax.swing.JButton btnSearch3;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdateLine;
    private javax.swing.JButton btnsearch;
    private javax.swing.JComboBox<String> cmbInvType;
    private javax.swing.JComboBox<String> cmbNameOfsearvice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAddiSearvicePrice;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBillPayment;
    private javax.swing.JLabel lblComU;
    private javax.swing.JLabel lblCusGroupName;
    private javax.swing.JLabel lblCusNo;
    private javax.swing.JLabel lblCusname;
    private javax.swing.JLabel lblEndU;
    private javax.swing.JLabel lblFixcost;
    private javax.swing.JLabel lblInvAmount;
    private javax.swing.JLabel lblInvNo;
    private javax.swing.JLabel lblMeterReadDate;
    private javax.swing.JLabel lblMonth;
    private javax.swing.JLabel lblOpenB;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblStartU;
    private javax.swing.JLabel lblYear;
    private javax.swing.JRadioButton rbIsActive;
    private javax.swing.JRadioButton rbIsPaid;
    private javax.swing.JRadioButton rbIsactiveLine;
    private javax.swing.JRadioButton rbno;
    private javax.swing.JRadioButton rbyes;
    private javax.swing.JTable tblInvoice;
    private javax.swing.JTable tblLine;
    private javax.swing.JTextField txtBillPrice;
    private javax.swing.JTextField txtCuName;
    private javax.swing.JTextField txtCusNo;
    private javax.swing.JTextField txtDesxription;
    private javax.swing.JTextField txtDiscriptionLine;
    private javax.swing.JTextField txtDueDate;
    private javax.swing.JTextField txtInvAmount;
    private javax.swing.JTextField txtInvNo;
    private javax.swing.JTextField txtInvNoLine;
    private javax.swing.JTextField txtLineTotal;
    private javax.swing.JLabel txtQty;
    private javax.swing.JTextField txtQtyLine;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSearchLine;
    private javax.swing.JTextField txtSearviceLineNO;
    private javax.swing.JTextField txtServicePrice;
    private javax.swing.JTextField txtUseUnite;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables
}
