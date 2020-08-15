 
package bw.randiyadahara.wsims.view;

import bw.randiyadahara.wsims.controler.payment.controler.InvoicePaymentControler;
import bw.randiyadahara.wsims.controler.payment.controler.PaymentControler;
import bw.randiyadahara.wsims.dbConnection.DBConnection;
import bw.randiyadahara.wsims.model.payment.InvoicePayment;
import bw.randiyadahara.wsims.model.payment.Payments;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public final class Payment extends javax.swing.JFrame {

   
    public Payment() {
        initComponents();
        setPaymentID();
        setPaymentLineNo();
        loadAllPayment();
        rbIsActive.setSelected(true);
    }
    int User_ID;
    String CusNo,cusNo ,isPaid;
    float totalInvoiceCost=0;
    
    public Payment(int User_ID) {
        initComponents();
        this.User_ID=User_ID;
        setPaymentID();
        setPaymentLineNo();
        loadAllPayment();
        rbIsActive.setSelected(true);
    }
   
    public void setPaymentID(){
    
        try {
          String vouNo =  PaymentControler.getPaymentNumber();
          txtVouNo.setText(vouNo);
          txtVouNoLine.setText(vouNo);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
   public  void setPaymentLineNo(){
   
        try {
            String lNo= InvoicePaymentControler.getPaymentLineNumber();
              txtPaymetLineNo.setText(lNo);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   public String getIsPaid(String InvNo){
   String ispaid = null;
        try {
            ispaid =  PaymentControler.getInvoiceIsPaid(InvNo);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        }
   return ispaid;
   
   }
   
     private int isAlreadyExists(String lineNo) {

         
        DefaultTableModel dtm = (DefaultTableModel) tblline.getModel();

        for (int i = 0; i < dtm.getRowCount(); i++) {
            String code = (String) dtm.getValueAt(i, 4);
            if (code.equals(lineNo)) {
                return i;
            }
        }

        return -1;

    }
private String setLineNo(String lineNo){

      String lNo =lineNo; 
      int numberPart;
      String TxtPart;
            TxtPart =lNo.substring(0,4);
            numberPart =Integer.parseInt(lNo.substring(4));
            numberPart++;
            lNo=TxtPart+numberPart;
            
          return lNo;

}     

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtVouNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rbIsActive = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txtCusNo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCusName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRs = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtInvCost = new javax.swing.JTextField();
        btnHome1 = new javax.swing.JButton();
        pDate = new com.toedter.calendar.JDateChooser();
        txtPayAmount = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtRemain = new javax.swing.JTextField();
        txtRmain = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtChange = new javax.swing.JTextField();
        btnPrint = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPayment = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnClear1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPaymetLineNo = new javax.swing.JTextField();
        txtInvoiceNoLine = new javax.swing.JTextField();
        txtInvDate = new javax.swing.JTextField();
        rbIsPaid = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        txtMonth = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtInvoiceAmountLine = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDescriptionLine = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        btnUpdateLine = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDeleteLine = new javax.swing.JButton();
        btnClearLine = new javax.swing.JButton();
        txtVouNoLine = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        txtPaymentForInv = new javax.swing.JTextField();
        txtLateChage = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtLateDate = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        txtSearchLine = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnClear3 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblline = new javax.swing.JTable();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payment ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14)))); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Voucher No");

        txtVouNo.setEditable(false);
        txtVouNo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtVouNo.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Date");

        rbIsActive.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbIsActive.setText("  Active");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Customer No");

        txtCusNo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtCusNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCusNoActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Customer Name");

        txtCusName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtCusName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCusNameActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Rs");

        txtRs.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtRs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRsKeyPressed(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Payment");

        txtInvCost.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtInvCost.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtInvCost.setEnabled(false);
        txtInvCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInvCostActionPerformed(evt);
            }
        });

        btnHome1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/home2.png"))); // NOI18N
        btnHome1.setText("Home");
        btnHome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome1ActionPerformed(evt);
            }
        });

        pDate.setDateFormatString("yyyy-MM-dd");
        pDate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtPayAmount.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtPayAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPayAmountActionPerformed(evt);
            }
        });
        txtPayAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPayAmountKeyPressed(evt);
            }
        });

        txtDescription.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriptionActionPerformed(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Description");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Change");
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        txtRemain.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtRemain.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtRemain.setEnabled(false);
        txtRemain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRemainActionPerformed(evt);
            }
        });

        txtRmain.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtRmain.setText("Remain");
        txtRmain.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Total Cost");
        jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        txtChange.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChangeActionPerformed(evt);
            }
        });

        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/Print.png"))); // NOI18N
        btnPrint.setText("Print");
        btnPrint.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtRmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCusNo, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                    .addComponent(txtVouNo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(rbIsActive, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                                        .addComponent(btnHome1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(pDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(txtCusName)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtRs, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                    .addComponent(txtRemain)
                                    .addComponent(txtChange))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDescription, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtInvCost)
                                    .addComponent(txtPayAmount)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtVouNo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbIsActive)))
                    .addComponent(btnHome1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCusNo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addComponent(pDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCusName, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRs, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtPayAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInvCost, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtChange, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtRmain, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRemain, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrint, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payment Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14)))); // NOI18N

        tblPayment.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tblPayment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Voucher No", "Is Active", "Cus No", "Name", "Date", "Rs.", "Change", "Payment", "Invoices Cost", "Remain", "Description"
            }
        ));
        tblPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPaymentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPayment);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Search Payment", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        txtSearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Voucher No");

        btnClear1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/Search.png"))); // NOI18N
        btnClear1.setText("Search");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClear1)
                .addGap(18, 18, 18))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                        .addComponent(btnClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Payment", jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Payment Invoice ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Voucher No");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Invoice No");

        txtPaymetLineNo.setEditable(false);
        txtPaymetLineNo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtInvoiceNoLine.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtInvoiceNoLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInvoiceNoLineActionPerformed(evt);
            }
        });

        txtInvDate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        rbIsPaid.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbIsPaid.setText(" Is Paid");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Payment Line No");

        txtMonth.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMonthActionPerformed(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Invoice Date");

        txtInvoiceAmountLine.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtInvoiceAmountLine.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtInvoiceAmountLine.setEnabled(false);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Description");

        txtDescriptionLine.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtDescriptionLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriptionLineActionPerformed(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnUpdateLine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/UpdateListItem.png"))); // NOI18N
        btnUpdateLine.setText("Update");
        btnUpdateLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateLineActionPerformed(evt);
            }
        });

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/AddListItem.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDeleteLine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/RemoveListItem.png"))); // NOI18N
        btnDeleteLine.setText("Delete");
        btnDeleteLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteLineActionPerformed(evt);
            }
        });

        btnClearLine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/ClearList.png"))); // NOI18N
        btnClearLine.setText("Clear");
        btnClearLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearLineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdateLine, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteLine, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClearLine, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClearLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdateLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        txtVouNoLine.setEditable(false);
        txtVouNoLine.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtYear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearActionPerformed(evt);
            }
        });

        txtPaymentForInv.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtPaymentForInv.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtPaymentForInv.setEnabled(false);

        txtLateChage.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtLateChage.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtLateChage.setEnabled(false);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Invoice Year");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Invoiced Month");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Invoice Amount");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Late Charge");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Paymet for Invoice");

        txtLateDate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtLateDate.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtLateDate.setEnabled(false);
        txtLateDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLateDateActionPerformed(evt);
            }
        });

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Late Days");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(0, 240, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(13, 13, 13))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtInvoiceNoLine, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                                    .addComponent(txtVouNoLine)
                                    .addComponent(txtYear)
                                    .addComponent(txtMonth, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                                    .addComponent(txtInvDate))
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel11)
                                        .addGap(12, 12, 12))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel7Layout.createSequentialGroup()
                                                    .addGap(11, 11, 11)
                                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtLateChage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                    .addComponent(txtLateDate, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtInvoiceAmountLine, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPaymetLineNo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPaymentForInv)
                                    .addComponent(rbIsPaid, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(txtDescriptionLine))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(rbIsPaid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPaymetLineNo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtInvoiceAmountLine, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLateDate, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLateChage, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPaymentForInv, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVouNoLine, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtInvoiceNoLine, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtInvDate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescriptionLine, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Payment Line", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        txtSearchLine.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtSearchLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchLineActionPerformed(evt);
            }
        });

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Voucher No");

        btnClear3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/Search.png"))); // NOI18N
        btnClear3.setText("Search");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearchLine)
                .addGap(18, 18, 18)
                .addComponent(btnClear3)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(btnClear3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchLine, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payment Line", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tblline.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tblline.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Voucher No", "Cus No", "Inv No", "Is Paid", "Line No", "Inv Date", "Inv Year", "Inv Moth", "InvAmount", "Late Date", "Late Chage", "Payment For Invoice", "Description"
            }
        ));
        tblline.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbllineMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblline);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Payment Line", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(882, 919));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCusNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCusNoActionPerformed
       
       String cusno = txtCusNo.getText().trim().toUpperCase();
       txtCusNo.setText(cusno);
        try {
            Payments p =PaymentControler.getCustomerInfo(cusno);
            txtCusName.setText(p.getCustomerName());
            this.CusNo =cusno;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_txtCusNoActionPerformed

    public  void  loadAllPayment(){
    
        ArrayList<Payments> allPayment = null;
        try {
            allPayment = PaymentControler.loadAllPayments(); //userList
             DefaultTableModel dtm =(DefaultTableModel)tblPayment .getModel();
             dtm.setRowCount(0);
            for(Payments p :allPayment ){
            
            Object[] rowData = {
                p.getVoucherNo(),
                p.getIsActive(),
                p.getCusNo(),
                p.getCustomerName(),
                p.getPaymentDate(),
                p.getRs(),
                p.getChange(),
                p.getPayment(), 
                p.getTotalInvoiceCOst(),
                p.getRemain(),
                p.getDescription()
            };
            
            dtm.addRow(rowData);
        }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
    }
    
    public  void  loadAllPaymentLine(String Pno){
    
        ArrayList<InvoicePayment> allPaymentLine = null;
        try {
            allPaymentLine = InvoicePaymentControler.loadAllPaymentsLines(Pno); //userList
             DefaultTableModel dtm =(DefaultTableModel)tblline .getModel();
             dtm.setRowCount(0);
             float total =0;
             
            for(InvoicePayment p :allPaymentLine ){
            
            Object[] rowData = {
                p.getVoucherNo(),
                p.getCusNo(),
                p.getInvoiceNo(),
                p.getIsPaid(),
                p.getLineNo(),
                p.getDeleteYes(), //
                p.getYear(), 
                p.getMonth(),
                p.getSetOFfAmount(),
                (int) p.getDf2(),
                p.getLateChageRate(),
                p.getTotalcostForInvoice(),
                p.getDescriptin()
                    
            };
            
            dtm.addRow(rowData);
           
            total =total+p.getTotalcostForInvoice();
            
        }
          txtInvCost.setText(""+total);  
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
    }  
    
    
    private void txtCusNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCusNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCusNameActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMonthActionPerformed
        
    }//GEN-LAST:event_txtMonthActionPerformed

    private void txtDescriptionLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriptionLineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescriptionLineActionPerformed

    private void txtSearchLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchLineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchLineActionPerformed

    private void txtYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearActionPerformed

    private void txtInvCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInvCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInvCostActionPerformed

    private void btnHome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome1ActionPerformed
  
        this.dispose();
    }//GEN-LAST:event_btnHome1ActionPerformed

    private void txtPayAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPayAmountActionPerformed
       
        try{
        
        float rs = Float.parseFloat(txtRs.getText());
        float payment =Float.parseFloat(txtPayAmount.getText());
        float invoiceCost =Float.parseFloat(txtInvCost.getText());
        txtRemain.setText(""+(float)(payment-invoiceCost));
        txtChange.setText(""+(float)((float)rs-payment));
        }catch(NumberFormatException e){
        
        
        }
        
        
        
    }//GEN-LAST:event_txtPayAmountActionPerformed

    private void txtDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescriptionActionPerformed

    private void txtRemainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRemainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRemainActionPerformed

    private void txtChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChangeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChangeActionPerformed

    private void btnUpdateLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateLineActionPerformed
         if(txtLateDate.getText().trim().equals("")||txtInvoiceNoLine.getText().trim().equals("")||txtInvoiceAmountLine.getText().trim().equals("")){
            
                if(txtLateDate.getText().trim().equals("")){txtLateDate.setBackground(Color.pink); }else{txtLateDate.setBackground(Color.white);}
                if(txtInvoiceNoLine.getText().trim().equals("")){txtInvoiceNoLine.setBackground(Color.pink); }else{txtInvoiceNoLine.setBackground(Color.white);}
                if(txtInvoiceAmountLine.getText().trim().equals("")){txtInvoiceAmountLine.setBackground(Color.pink); }else{txtInvoiceAmountLine.setBackground(Color.white);}
                if(txtPaymentForInv.getText().trim().equals("")){txtPaymentForInv.setBackground(Color.pink); }else{txtPaymentForInv.setBackground(Color.white);}
 
                
        }else{
                DefaultTableModel model = (DefaultTableModel) tblline.getModel(); 
               txtLateDate.setBackground(Color.white);
                txtInvoiceNoLine.setBackground(Color.white);
                txtInvoiceAmountLine.setBackground(Color.white); 
                txtPaymentForInv.setBackground(Color.white); 
                
                String VouNo =txtVouNoLine.getText();
                String cusno =txtCusNo.getText();
                String invno =txtInvoiceNoLine.getText();
                String lineNo =txtPaymetLineNo.getText();
                String date =txtInvDate.getText();
                String Year =txtYear.getText();
                String month =txtMonth.getText();
                String invAmount =txtInvoiceAmountLine.getText();
                String latedates =txtLateDate.getText();
                String latecharge =txtLateChage.getText();
                String paymentForInv =txtPaymentForInv.getText();
                String isPaid ="N";
                String Description =txtDescriptionLine.getText();
                if(rbIsPaid.isSelected()){isPaid="Y";}
                
        int rowIndex = isAlreadyExists(lineNo);
      
            if (rowIndex == -1) {
                 Object[] rowData = {
                     VouNo,
                     cusno,
                     invno,
                     isPaid,
                     lineNo,
                     date,
                     Year,
                     month,
                    invAmount,
                    latedates,
                    latecharge,
                    paymentForInv,
                    Description

                 };
                 model.addRow(rowData);
                 txtPaymetLineNo.setText(setLineNo(lineNo));
                 btnClearLine.doClick();
             }else{
            tblline.setValueAt( VouNo, rowIndex, 0);
            tblline.setValueAt(cusNo, rowIndex, 1);
            tblline.setValueAt(invno, rowIndex, 2);
            tblline.setValueAt(isPaid, rowIndex, 3);
            tblline.setValueAt(lineNo, rowIndex, 4);
            tblline.setValueAt(date, rowIndex, 5);
            tblline.setValueAt(Year, rowIndex, 6);
            tblline.setValueAt(month, rowIndex, 7);
            tblline.setValueAt(invAmount, rowIndex, 8);
            tblline.setValueAt(latedates, rowIndex, 9);
            tblline.setValueAt(latecharge, rowIndex, 10);
            tblline.setValueAt(paymentForInv, rowIndex, 11);
            tblline.setValueAt(Description, rowIndex, 12);
            }
       
        
      }
        
        
        
        
    }//GEN-LAST:event_btnUpdateLineActionPerformed

    private void txtRsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRsKeyPressed
       
         txtRs.addKeyListener(new KeyAdapter() {
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
        
        
        
    }//GEN-LAST:event_txtRsKeyPressed

    private void txtPayAmountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPayAmountKeyPressed
       
       
          txtPayAmount.addKeyListener(new KeyAdapter() {
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
        
                
    }//GEN-LAST:event_txtPayAmountKeyPressed

    private void txtInvoiceNoLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInvoiceNoLineActionPerformed

      String invNo=  txtInvoiceNoLine.getText().trim().toUpperCase();
      txtInvoiceNoLine.setText(invNo);
      String cusNo =txtCusNo.getText().trim().toUpperCase();
      float rate=0;int lateDay;
        try {
                InvoicePayment ip=InvoicePaymentControler.getInvoiceInformation(invNo, cusNo);
                rate =InvoicePaymentControler.getLateChageRate(cusNo);
                txtYear.setText(""+ip.getYear());
                txtMonth.setText(""+ip.getMonth());
                txtInvoiceAmountLine.setText(""+ip.getDf1());        
                txtInvDate.setText(ip.getDeleteYes()); //SET INVOICED DATE
                isPaid =ip.getIsPaid();
                if((int)ip.getDf2()>ip.getDueDate()){

                        lateDay =((int)ip.getDf2()-ip.getDueDate());
                        txtLateDate.setText(""+lateDay);
                        txtLateChage.setText(""+(lateDay*rate));
                        txtPaymentForInv.setText(""+((float)(lateDay*rate)+ip.getDf1()));

                }else{
                        txtLateDate.setText("0");
                        txtLateChage.setText("0");
                        txtPaymentForInv.setText(""+(float)ip.getDf1());
                }
         
         
         
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_txtInvoiceNoLineActionPerformed

    private void txtLateDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLateDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLateDateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
      
        if(txtLateDate.getText().trim().equals("")||txtInvoiceNoLine.getText().trim().equals("")||txtInvoiceAmountLine.getText().trim().equals("")){
            
                if(txtLateDate.getText().trim().equals("")){txtLateDate.setBackground(Color.pink); }else{txtLateDate.setBackground(Color.white);}
                if(txtInvoiceNoLine.getText().trim().equals("")){txtInvoiceNoLine.setBackground(Color.pink); }else{txtInvoiceNoLine.setBackground(Color.white);}
                if(txtInvoiceAmountLine.getText().trim().equals("")){txtInvoiceAmountLine.setBackground(Color.pink); }else{txtInvoiceAmountLine.setBackground(Color.white);}
                if(txtPaymentForInv.getText().trim().equals("")){txtPaymentForInv.setBackground(Color.pink); }else{txtPaymentForInv.setBackground(Color.white);}
 
                
        }else{
            String iSpaid =getIsPaid(txtInvoiceNoLine.getText());
            
            if(iSpaid.trim().equals("Y")){
                    JOptionPane.showMessageDialog(null, " Sorry This Invoice Settle Off ! ");
            }else{
                DefaultTableModel model = (DefaultTableModel) tblline.getModel(); 
               txtLateDate.setBackground(Color.white);
                txtInvoiceNoLine.setBackground(Color.white);
                txtInvoiceAmountLine.setBackground(Color.white); 
                txtPaymentForInv.setBackground(Color.white); 
                String isPaid ="N";
                
                String VouNo =txtVouNoLine.getText();
                String cusno =txtCusNo.getText();
                String invno =txtInvoiceNoLine.getText();
                String lineNo =txtPaymetLineNo.getText();
                String date =txtInvDate.getText();
                String Year =txtYear.getText();
                String month =txtMonth.getText();
                String invAmount =txtInvoiceAmountLine.getText();
                String latedates =txtLateDate.getText();
                String latecharge =txtLateChage.getText();
                float paymentForInv =Float.parseFloat(txtPaymentForInv.getText());
                if(rbIsPaid.isSelected()){isPaid="Y";}
                String Description =txtDescriptionLine.getText();
                String invISpaid =getIsPaid(invno);
        int rowIndex = isAlreadyExists(lineNo);
      
            if (rowIndex == -1) {
                 Object[] rowData = {
                     VouNo,
                     cusno,
                     invno,
                     isPaid,
                     lineNo,
                     date,
                     Year,
                     month,
                     invAmount,
                     latedates,
                     latecharge,
                     paymentForInv,
                     Description

                 };

                  model.addRow(rowData);
                //  txtPaymetLineNo.setText(setLineNo(lineNo));
                  totalInvoiceCost= totalInvoiceCost+paymentForInv;
                  float payAmount;// Float.parseFloat(txtPayAmount.getText());
                  txtInvCost.setText(""+(float)totalInvoiceCost);
                try{ 
                    payAmount= Float.parseFloat(txtPayAmount.getText());
                    txtRemain.setText(""+((float)payAmount-totalInvoiceCost));
                    
                }catch(NumberFormatException ex){
                    
                    txtRemain.setText("");
                    txtInvCost.setText("");
                    txtInvCost.setText(""+(float)totalInvoiceCost);
                }
                String lineNo2 =  setLineNo( txtPaymetLineNo.getText());
                txtPaymetLineNo.setText(lineNo2);
                btnClearLine.doClick();
             }else{
                
                //JOptionPane.showMessageDialog(null, "Invoice Allready Paid !");

             }
       
        
       }
     }   
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteLineActionPerformed
       
         int selectedRow = tblline.getSelectedRow();
            DefaultTableModel dtm = (DefaultTableModel) tblline.getModel();
            dtm.removeRow(selectedRow);
        
    }//GEN-LAST:event_btnDeleteLineActionPerformed

    private void btnClearLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearLineActionPerformed
        
              txtVouNoLine.setText("");
              //txtCusNo.setText("");
              txtInvoiceNoLine.setText("");
             /// txtPaymetLineNo.setText("");
              txtInvDate.setText("");
              txtYear.setText("");
              txtMonth.setText("");
              txtInvoiceAmountLine.setText("");
              txtLateDate.setText("");
              txtLateChage.setText("");
              txtPaymentForInv.setText("");
              txtLateDate.setBackground(Color.white);
              txtInvoiceNoLine.setBackground(Color.white);
              txtInvoiceAmountLine.setBackground(Color.white); 
              txtPaymentForInv.setBackground(Color.white);
              setPaymentID();
              int rowIndex = isAlreadyExists(txtPaymetLineNo.getText());
              
                if(rowIndex<1){
                
                }else{
                    String lineNo =  setLineNo( txtPaymetLineNo.getText());
                    txtPaymetLineNo.setText(lineNo);
                    
             // setPaymentLineNo();
                }
              
        
        
        
    }//GEN-LAST:event_btnClearLineActionPerformed

    private void tbllineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbllineMouseClicked
        
         int i= tblline.getSelectedRow();
        TableModel model =tblline.getModel();
        DefaultTableModel dtm =(DefaultTableModel)tblline.getModel();
            
        //dtm.setRowCount(0);
        
            txtVouNoLine.setText(model.getValueAt(i,0).toString());
            txtSearchLine.setText(model.getValueAt(i,0).toString());
            txtInvoiceNoLine.setText(model.getValueAt(i,2).toString());
            String isPaid =model.getValueAt(i,3).toString();
            txtPaymetLineNo.setText(model.getValueAt(i,4).toString());
            txtInvDate.setText(model.getValueAt(i,5).toString());
            txtYear.setText(model.getValueAt(i,6).toString());
            txtMonth.setText(model.getValueAt(i,7).toString());
            txtInvoiceAmountLine.setText(model.getValueAt(i,8).toString());
            txtLateDate.setText(model.getValueAt(i,9).toString());
            txtLateChage.setText(model.getValueAt(i,10).toString());
            txtPaymentForInv.setText(model.getValueAt(i,11).toString());
            txtDescriptionLine.setText(model.getValueAt(i,12).toString());
            cusNo =model.getValueAt(i,1).toString();
            if(isPaid.equals("Y")){
                rbIsPaid.setSelected(true);
            }else{ rbIsPaid.setSelected(false);}
            

        
    }//GEN-LAST:event_tbllineMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
         TableModel model =tblline.getModel();
         DefaultTableModel dtm =(DefaultTableModel)tblline.getModel();
         
         if((dtm.getRowCount()<0)||txtRmain.getText().trim().equals("")||txtCusName.getText().trim().equals("")||txtCusNo.getText().equals("")||txtPayAmount.getText().trim().equals("")||pDate.getDate() == null){
                    
                    if(dtm.getRowCount()<0){
                        JOptionPane.showMessageDialog(null, "Please Add Invoice To Payment !");
                    }
                    
                    if(txtPayAmount.getText().trim().equals("")){
                            txtPayAmount.setBackground(Color.pink);
                    }else{txtPayAmount.setBackground(Color.white);}
                    
                    if(txtRmain.getText().trim().equals("")){
                            txtRmain.setBackground(Color.pink);
                    }else{txtRmain.setBackground(Color.white);}
                    
                    if(txtCusNo.getText().trim().equals("")){
                            txtCusNo.setBackground(Color.pink);
                    }else{txtCusNo.setBackground(Color.white);}
                    
                    if(txtCusName.getText().trim().equals("")){
                            txtCusName.setBackground(Color.pink);
                    }else{txtCusName.setBackground(Color.white);}
                    
                    JOptionPane.showMessageDialog(null, "Fill All Relevent Fields  !");
                    
         }else{
         
                 txtPayAmount.setBackground(Color.white);
                 txtPayAmount.setBackground(Color.white);
                 txtCusName.setBackground(Color.white);
                 txtCusNo.setBackground(Color.white);
                 txtRmain.setBackground(Color.white);
                 txtRmain.setBackground(Color.white);
                 txtPayAmount.setBackground(Color.white);
                 
                 String vNo =txtVouNo.getText();
                 String cunNo =txtCusNo.getText().trim();
                 String isActive ="N",deleteYes ="N";
                 String description =txtDescription.getText();
                 java.sql.Date paymentDate =new java.sql.Date(pDate.getDate().getTime());
                 Timestamp createdDate =new Timestamp(System.currentTimeMillis());
                 float Rs =Float.parseFloat(txtRs.getText());
                 float rmain =Float.parseFloat(txtRemain.getText());
                 float change =Float.parseFloat(txtChange.getText());
                 float invCost =Float.parseFloat(txtInvCost.getText()); //invoices COST
                 float Payment = Float.parseFloat(txtPayAmount.getText());
                 int CreateBy =User_ID;
                 if(rbIsPaid.isSelected()){isActive ="Y";}
                 Payments p = new Payments();
                 p.setCusNo(cunNo);
                 p.setCreatedBY(User_ID);
                 p.setCreatedDate(createdDate);
                 p.setPayment(Payment);
                 p.setDeleteYes(deleteYes);
                 p.setDescription(description);
                 p.setIsActive(isActive);
                 p.setRemain(rmain);
                 p.setResiveForPay(invCost);
                 p.setVoucherNo(vNo);
                 p.setPaymentDate(paymentDate);
                 p.setRs(Rs);
                 p.setChange(change);
                 
         
          ArrayList<InvoicePayment> ip= new ArrayList<>();
      //  DefaultTableModel dtm = (DefaultTableModel) tblline.getModel();
                for (int i = 0; i < dtm.getRowCount(); i++) {
                    String vouNoLine = (String) dtm.getValueAt(i, 0);
                    String invNo = (String)dtm.getValueAt(i, 2);
                    String LineNo = (String) dtm.getValueAt(i,4 );
                    String isPaid =(String) dtm.getValueAt(i,3 );
                    String Description = dtm.getValueAt(i, 12).toString();
                    int lateDate = Integer.parseInt( model.getValueAt(i,9).toString());
                    float latechage =Float.parseFloat((String) model.getValueAt(i,10));
                    float amountInv =Float.parseFloat(model.getValueAt(i,11).toString());
                    if(rbIsActive.isSelected()){isPaid ="Y";}

                  InvoicePayment ipl  = new  InvoicePayment();

                    ipl.setInvoiceNo(invNo);
                    ipl.setVoucherNo(vouNoLine);
                    ipl.setDeleteYes(deleteYes);
                    ipl.setSetOFfAmount(amountInv);
                    ipl.setDescriptin(Description);
                    ipl.setLateChageRate(latechage);
                    ipl.setMonth(lateDate); //LATE DATE 
                    ipl.setLineNo(LineNo);
                    ipl.setCusNo(cusNo);
                    ipl.setIsPaid("Y");
                    
                    ip.add(ipl);

        }
        
     
             try {
               boolean result =  PaymentControler.createPayment(p, ip,cunNo);
               
               if(result){
                   JOptionPane.showMessageDialog(null, " Paid For Invoice !");
                   btnClear.doClick();
               }else{JOptionPane.showMessageDialog(null, "Error !"); btnClear.doClick();}
               
             } catch (ClassNotFoundException | SQLException ex) {
                 JOptionPane.showMessageDialog(null, ex);
                 Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
             }
                
                
   }





        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       
        try {
            String payno =txtVouNo.getText();
            
            boolean result =  InvoicePaymentControler.deletePaymentInvoice(payno);
            
            if(result){
                    JOptionPane.showMessageDialog(null, "Delete Payment Record !");
                    btnClear.doClick();
            }else{
                    JOptionPane.showMessageDialog(null, "Error !");
                    btnClear.doClick();
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, ex);
        }
       
       
        
        
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
       loadAllPayment();
       txtCusName.setText("");
       txtCusNo.setText("");
       txtDescription.setText("");
       txtInvCost.setText("");
       txtRemain.setText("");
       txtInvCost.setText("");
       txtChange.setText("");
       txtRs.setText("");
       txtSearch.setText("");
       txtVouNo.setText("");
       txtSearch.setText("");
       txtPayAmount.setText("");
       txtInvCost.setText("");
       rbIsActive.setSelected(false);
       pDate.setCalendar(null);
       btnClearLine.doClick();
       rbIsActive.setSelected(true);
       DefaultTableModel dtm =(DefaultTableModel)tblline .getModel();
        dtm.setColumnCount(0);
        setPaymentID();
        setPaymentLineNo();
        loadAllPayment();
      
    }//GEN-LAST:event_btnClearActionPerformed

    private void tblPaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPaymentMouseClicked
       
        int i= tblPayment.getSelectedRow();
        TableModel model =tblPayment.getModel();
        DefaultTableModel dtm =(DefaultTableModel)tblPayment .getModel();
            
      //  dtm.setRowCount(0);
        
            txtVouNo.setText(model.getValueAt(i,0).toString());
            txtSearch.setText(model.getValueAt(i,0).toString());
            String isActive =(model.getValueAt(i,1).toString());
           // String isPaid =model.getValueAt(i,3).toString();
            txtCusNo.setText(model.getValueAt(i,2).toString());
            txtCusName.setText(model.getValueAt(i,3).toString());
            Date tanggal = (Date) model.getValueAt(tblPayment.getSelectedRow(), 4);
            pDate.setDate(tanggal);
            txtRs.setText(model.getValueAt(i,5).toString());
            txtPayAmount.setText(model.getValueAt(i,7).toString());
            txtChange.setText(model.getValueAt(i,6).toString());
            txtRemain.setText(model.getValueAt(i,9).toString());
            txtDescription.setText(model.getValueAt(i,10).toString()); 
        
        
            
         if(isActive.equals("N")){
             rbIsActive.setSelected(false);
         }else{
             rbIsActive.setSelected(true);
         }

         loadAllPaymentLine(model.getValueAt(i,0).toString());
         
        
        
        
        
    }//GEN-LAST:event_tblPaymentMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
               TableModel model =tblline.getModel();
         DefaultTableModel dtm =(DefaultTableModel)tblline.getModel();
         
         if((dtm.getRowCount()<0)||txtRmain.getText().trim().equals("")||txtCusName.getText().trim().equals("")||txtCusNo.getText().equals("")||txtPayAmount.getText().trim().equals("")||pDate.getDate() == null){
                    
                    if(dtm.getRowCount()<0){
                        JOptionPane.showMessageDialog(null, "Please Add Invoice To Payment !");
                    }
                    
                    if(txtPayAmount.getText().trim().equals("")){
                            txtPayAmount.setBackground(Color.pink);
                    }else{txtPayAmount.setBackground(Color.white);}
                    
                    if(txtRmain.getText().trim().equals("")){
                            txtRmain.setBackground(Color.pink);
                    }else{txtRmain.setBackground(Color.white);}
                    
                    if(txtCusNo.getText().trim().equals("")){
                            txtCusNo.setBackground(Color.pink);
                    }else{txtCusNo.setBackground(Color.white);}
                    
                    if(txtCusName.getText().trim().equals("")){
                            txtCusName.setBackground(Color.pink);
                    }else{txtCusName.setBackground(Color.white);}
                    
                    JOptionPane.showMessageDialog(null, "Fill All Relevent Fields  !");
                    
         }else{
         
                 txtPayAmount.setBackground(Color.white);
                 txtPayAmount.setBackground(Color.white);
                 txtCusName.setBackground(Color.white);
                 txtCusNo.setBackground(Color.white);
                 txtRmain.setBackground(Color.white);
                 txtRmain.setBackground(Color.white);
                 txtPayAmount.setBackground(Color.white);
                 
                 String vNo =txtVouNo.getText();
                 String cunNo =txtCusNo.getText().trim();
                 String isActive ="N",deleteYes ="N";
                 String description =txtDescription.getText();
                 java.sql.Date paymentDate =new java.sql.Date(pDate.getDate().getTime());
                 Timestamp createdDate =new Timestamp(System.currentTimeMillis());
                 float Rs =Float.parseFloat(txtRs.getText());
                 float rmain =Float.parseFloat(txtRemain.getText());
                 float change =Float.parseFloat(txtChange.getText());
                 float invCost =Float.parseFloat(txtInvCost.getText()); //invoices COST
                 float Payment = Float.parseFloat(txtPayAmount.getText());
                 int CreateBy =User_ID;
                 if(rbIsPaid.isSelected()){isActive ="Y";}
                 
                 
                 Payments p = new Payments();
                 p.setCusNo(cunNo);
                 p.setUpdateBy(User_ID);
                 p.setUpdateDate(createdDate);
                 p.setPayment(Payment);
                 p.setDeleteYes(deleteYes);
                 p.setDescription(description);
                 p.setIsActive(isActive);
                 p.setRemain(rmain);
                 p.setResiveForPay(invCost);
                 p.setVoucherNo(vNo);
                 p.setPaymentDate(paymentDate);
                 p.setRs(Rs);
                 p.setChange(change);
                 
         
          ArrayList<InvoicePayment> ip= new ArrayList<>();
      //  DefaultTableModel dtm = (DefaultTableModel) tblline.getModel();
                for (int i = 0; i < dtm.getRowCount(); i++) {
                    String vouNoLine = (String) dtm.getValueAt(i, 0);
                    String invNo = (String)dtm.getValueAt(i, 2);
                    String LineNo = (String) dtm.getValueAt(i,4 );
                    String isPaid =(String) dtm.getValueAt(i,3 );
                    String Description = dtm.getValueAt(i, 12).toString();
                    int lateDate = Integer.parseInt(model.getValueAt(i,9).toString());
                    float latechage =Float.parseFloat( model.getValueAt(i,10).toString());
                    float amountInv =Float.parseFloat(model.getValueAt(i,11).toString());
                    if(rbIsPaid.isSelected()){isPaid ="Y";}

                  InvoicePayment ipl  = new  InvoicePayment();

                    ipl.setInvoiceNo(invNo);
                    ipl.setVoucherNo(vouNoLine);
                    ipl.setDeleteYes(deleteYes);
                    ipl.setSetOFfAmount(amountInv);
                    ipl.setDescriptin(Description);
                    ipl.setLateChageRate(latechage);
                    ipl.setMonth(lateDate); //LATE DATE 
                    ipl.setLineNo(LineNo);
                    ipl.setCusNo(cusNo);
                    ipl.setIsPaid("Y");
                    
                    ip.add(ipl);

        }
        
     
                   try {
                       boolean result =PaymentControler.updatePaymentRecord(p, ip, vNo);
                       if(result){
                                    JOptionPane.showMessageDialog(null,"Records Updated !");
                                    btnClear.doClick();
                       }else{
                       JOptionPane.showMessageDialog(null," Error !");
                                     btnClear.doClick();
                       }
                   } catch (ClassNotFoundException | SQLException ex) {
                       Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
                       JOptionPane.showMessageDialog(null,ex);
                   }
                
                
   }
        
        
        
        
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        
        
        try {
          //  Runtime.getRuntime().exec("rundll32 url.d11,FileProtocolHandler"+"C:\\Users\\RATHNAYAKA\\Desktop\\INVNO1.pdf");
            File myFile = new File("C:\\Users\\RATHNAYAKA\\Desktop\\Dk.pdf");
            Desktop.getDesktop().open(myFile);
        } catch (IOException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
           // JOptionPane.showMessageDialog(null,"Error");
        }
           
        
       

        
        
    }//GEN-LAST:event_btnPrintActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Payment().setVisible(true);
                     
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClear1;
    private javax.swing.JButton btnClear3;
    private javax.swing.JButton btnClearLine;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteLine;
    private javax.swing.JButton btnHome1;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdateLine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private com.toedter.calendar.JDateChooser pDate;
    private javax.swing.JRadioButton rbIsActive;
    private javax.swing.JRadioButton rbIsPaid;
    private javax.swing.JTable tblPayment;
    private javax.swing.JTable tblline;
    private javax.swing.JTextField txtChange;
    private javax.swing.JTextField txtCusName;
    private javax.swing.JTextField txtCusNo;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtDescriptionLine;
    private javax.swing.JTextField txtInvCost;
    private javax.swing.JTextField txtInvDate;
    private javax.swing.JTextField txtInvoiceAmountLine;
    private javax.swing.JTextField txtInvoiceNoLine;
    private javax.swing.JTextField txtLateChage;
    private javax.swing.JTextField txtLateDate;
    private javax.swing.JTextField txtMonth;
    private javax.swing.JTextField txtPayAmount;
    private javax.swing.JTextField txtPaymentForInv;
    private javax.swing.JTextField txtPaymetLineNo;
    private javax.swing.JTextField txtRemain;
    private javax.swing.JLabel txtRmain;
    private javax.swing.JTextField txtRs;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSearchLine;
    private javax.swing.JTextField txtVouNo;
    private javax.swing.JTextField txtVouNoLine;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
