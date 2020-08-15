
package bw.randiyadahara.wsims.view;

import bw.randiyadahara.wsims.controler.CustomerGroupControler;
import bw.randiyadahara.wsims.model.CustomersGroups;
import java.awt.Color;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;



 
public final class CustomerGroup extends javax.swing.JFrame {

   
    public CustomerGroup() {
        initComponents();
        setGroupNo();
        Show_CustomerGroup();
        rbIsActive.setSelected(true);
    }

    int user_id;
     public CustomerGroup(int User_id) {
        this.user_id=User_id; 
        initComponents();
        setGroupNo();
        Show_CustomerGroup();
        rbIsActive.setSelected(true);
    }
     
     
     
     public  void  setGroupNo(){
     
        try {
            String groupNo =CustomerGroupControler.getAttendenceID();
            txtGroupNo.setText(groupNo);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerGroup.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCusGroup = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();
        rbIsActive = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtGroupNo = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Existing groups", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tblCusGroup.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tblCusGroup.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Group No", "Name", "Is Active", "Description"
            }
        ));
        tblCusGroup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCusGroupMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCusGroup);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14)), "New Customer Group", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setText("Name");

        jLabel2.setText("Description");

        txtName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtDesc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        rbIsActive.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbIsActive.setText(" Is Active");

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

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/delete48.png"))); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/clear48.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.setActionCommand("CLEAR");
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/home2.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        jLabel3.setText("Group No");

        txtGroupNo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtGroupNo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtGroupNo.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtGroupNo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(rbIsActive, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDesc)
                    .addComponent(txtName))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGroupNo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(rbIsActive))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        txtSearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Group No");

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/Search.png"))); // NOI18N
        btnSearch.setText("Search");
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearch))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

       public void Show_CustomerGroup(){  
            
        try {
            ArrayList<CustomersGroups>list=CustomerGroupControler.viewCustomerGroupAll(); //userList
            DefaultTableModel cg =(DefaultTableModel)tblCusGroup.getModel();
            Object [] row =new Object[4];
            cg.setRowCount(0);
            for(int i =0;i<list.size();i++){
                
                row[0]=list.get(i).getCusGroupNo();
                row[1]=list.get(i).getGroupName();
                row[2]=list.get(i).getIsActive();
                row[3]=list.get(i).getDiscription(); 
                cg.addRow(row);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EmployeeGroup.class.getName()).log(Level.SEVERE, null, ex);
        }
 
 }
    
    
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        if(txtName.getText().trim().equals("")){
            txtName.setBackground(Color.pink);
            JOptionPane.showMessageDialog(this,"You should Fill The  Relevent Fields ! ");
        }else{
            txtName.setBackground(Color.white);
        

            String isActive, deleteYes ="N", groupNo =txtGroupNo.getText();
            String discription =txtDesc.getText();
            String name =txtName.getText();
            int createdBy =user_id;
            Timestamp crateDate =new Timestamp(System.currentTimeMillis());

        if(rbIsActive.isSelected()){
            isActive="Y";
        }else{
             isActive="N";
            }
        
            CustomersGroups cg = new CustomersGroups();
            cg.setGroupName(name);
            cg.setCusGroupNo(groupNo);
            cg.setCreatedBy(user_id);
            cg.setDiscription(discription);
            cg.setDeleteYes(deleteYes);
            cg.setCratedDate(crateDate);
            cg.setIsActive(isActive);

        try {
                boolean result =CustomerGroupControler.recordNewCustomerGroup(cg);
                if(result){
                   JOptionPane.showMessageDialog(null,"Recorded New Customer Group ");
                }else{
                 JOptionPane.showMessageDialog(null,"Error !");
                }
               
                  btnClear.doClick();
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(CustomerGroup.class.getName()).log(Level.SEVERE, null, ex);
               //// JOptionPane.showMessageDialog(null,ex);
        }
        
        
        
        
        }
        
        
        
        
       
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

    if(txtName.getText().trim().equals("")){
            txtName.setBackground(Color.pink);
            JOptionPane.showMessageDialog(this,"You Should Fill The Relevent Field ! ");
        }else{
            txtName.setBackground(Color.white);


            String isActive, deleteYes ="N", groupNo =txtGroupNo.getText();
            String discription =txtDesc.getText();
            String name =txtName.getText();
            int updatedBy =user_id;
            Timestamp updatedDate =new Timestamp(System.currentTimeMillis());
        
        if(rbIsActive.isSelected()){
            isActive="Y";
        }else{
             isActive="N";
            }
        
            CustomersGroups cg = new CustomersGroups();
            cg.setGroupName(name);
            cg.setCusGroupNo(groupNo);
            cg.setUpdatedBy(updatedBy);
            cg.setDiscription(discription);
            cg.setDeleteYes(deleteYes);
            cg.setUpdatedDate(updatedDate);
            cg.setIsActive(isActive);
        
        try {
                boolean result =CustomerGroupControler.updateCustomerGroup(cg);
                if(result){
                     JOptionPane.showMessageDialog(null,"Updated Details !");
                }else{
                     JOptionPane.showMessageDialog(null,"Error !");
                }
               
                btnClear.doClick();
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(CustomerGroup.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        }





    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
      
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String deleteYes ="Y",groupNo =txtGroupNo.getText();
        
         try {
                     boolean result =CustomerGroupControler.DeleteCustomerGroup(deleteYes, groupNo);
                if(result){
                    JOptionPane.showMessageDialog(null," Remove The Employee Group !");
                }else{
                    JOptionPane.showMessageDialog(null,"Error !");
                }
               
                    btnClear.doClick();
            } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(CustomerGroup.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        


    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
     
        rbIsActive.setSelected(true);
        txtName.setBackground(Color.white);
        txtDesc.setText("");
        txtGroupNo.setText("");
        txtName.setText("");
        txtSearch.setText("");
       // rbIsActive.setSelected(false);
        setGroupNo();
        Show_CustomerGroup();

        
    }//GEN-LAST:event_btnClearActionPerformed

    private void tblCusGroupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCusGroupMouseClicked


        int i=tblCusGroup.getSelectedRow();
        TableModel mode =tblCusGroup.getModel();
        
        txtGroupNo.setText(mode.getValueAt(i,0).toString());
        txtSearch.setText(mode.getValueAt(i,0).toString());
        txtName.setText(mode.getValueAt(i, 1).toString());
        String isActive=mode.getValueAt(i, 2).toString();
        txtDesc.setText(mode.getValueAt(i, 3).toString());
        if(isActive.equals("Y")){
            rbIsActive.setSelected(true);
        }else{
             rbIsActive.setSelected(false);  
        }





    }//GEN-LAST:event_tblCusGroupMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        if(txtSearch.getText().trim().equals("")){
          txtSearch.setBackground(Color.pink);
            
        }else{
          String GroupNo =txtSearch.getText().toUpperCase();
          txtSearch.setText(GroupNo);
          txtSearch.setBackground(Color.white);
   try {
            ArrayList<CustomersGroups>list=CustomerGroupControler.searchCusGroup(GroupNo); //userList
            DefaultTableModel cg =(DefaultTableModel)tblCusGroup.getModel();
            Object [] row =new Object[4];
            cg.setRowCount(0);
            for(int i =0;i<list.size();i++){
                
                row[0]=list.get(i).getCusGroupNo();
                row[1]=list.get(i).getGroupName();
                row[2]=list.get(i).getIsActive();
                row[3]=list.get(i).getDiscription(); 
                cg.addRow(row);
                
                txtGroupNo.setText((String) row[0]);
                txtName.setText((String) row[1]);
                txtDesc.setText((String) row[3]);
                String isActive =(String) row[2];
               
                if(isActive.equals("Y")){
                rbIsActive.setSelected(true);
                }else{
                rbIsActive.setSelected(false);
                
                }
                
                
                
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EmployeeGroup.class.getName()).log(Level.SEVERE, null, ex);
        }

        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed

        btnSearch.doClick();
        
    }//GEN-LAST:event_txtSearchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerGroup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbIsActive;
    private javax.swing.JTable tblCusGroup;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtGroupNo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
