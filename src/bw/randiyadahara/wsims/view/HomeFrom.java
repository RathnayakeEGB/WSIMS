package bw.randiyadahara.wsims.view;


import java.text.SimpleDateFormat;
import javax.swing.*;
import javax.swing.JFrame;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public final class HomeFrom extends javax.swing.JFrame {

    int clockRun = 0;

    public HomeFrom() {
       initComponents();
       this.setExtendedState(JFrame.MAXIMIZED_BOTH);
       // cPanel.setBackground(new Color(0,0,0,10));
        //cpanel2.setBackground(new Color(0,0,0,10));
        
    }
 
 int user_id=0;   
String  Fname,userName,isActive,customer,cusGroup,empGroup,empLoyee,service,waterUsage,empAttendence,Payment,invoice,report,about,pumpInfo,priceList,userManage,subComitee,FixCost;

// Second consturctor Of the Form
 public HomeFrom (String user_id,String Fname,String userName,String isActive ,String customer ,String cusGroup,String empgroup,String employee ,String service ,String waterUsage,String empAttendence ,String payment,String invoice, String report, String about, String pumpInfo,String priceList,String userManage,String Subcomtee ,String fixCost ){
    initComponents();
    WokingTime();
    this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    
    lblUserName.setText(Fname+" ("+userName+")"); // USer Name Set As User Type
    
    this.user_id=Integer.parseInt(user_id);
    this.Fname =Fname;
    this.userName=userName;
    this.isActive=isActive;
    this.customer= customer;
    this.cusGroup =cusGroup;
    this.empGroup= empgroup;
    this.empLoyee =employee;
    this.service= service;
    this.waterUsage =waterUsage;
    this.empAttendence= empAttendence;
    this.Payment =payment;
    this.invoice =invoice;
    this.report=report;
    this.about=about;
    this.pumpInfo=pumpInfo;
    this.priceList=priceList;
    this.userManage =userManage;
    this.subComitee=Subcomtee;
    this.FixCost=fixCost;
    
      //cPanel.setBackground(new Color(0,0,0,10));
     // cpanel2.setBackground(new Color(0,0,0,10));
      //panel1.setBackground(new Color(0,0,0,10));
     
   }
    
   public  void WokingTime(){
   
   
    new Thread() {
            @Override
            public void run() {

                while (clockRun == 0) {

                    Calendar cal = Calendar.getInstance();
                  
                    int hour = cal.get(Calendar.HOUR);
                    int min = cal.get(Calendar.MINUTE);
                    int sec = cal.get(Calendar.SECOND);
                    int am_pm = cal.get(Calendar.AM_PM);

                    String time;
                    if (am_pm == 1) {
                        time = hour + ":" + min + ":" + sec + ":" + "PM";
                    } else {

                        time = hour + ":" + min + ":" + sec + ":" + "AM";
                    }

                    lblTime.setText(time);

                }

            }

        }.start();

        {
            Date d = new Date();
            SimpleDateFormat Date = new SimpleDateFormat("yyyy-MM-dd");
            lblDate.setText(Date.format(d));
        }
   
   
   
   
   
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cPanel = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        btnEmpGroup = new javax.swing.JButton();
        btnEmployee = new javax.swing.JButton();
        Employee = new javax.swing.JLabel();
        lblEmpGroup = new javax.swing.JLabel();
        btnPumpInfo = new javax.swing.JButton();
        btnAttendence = new javax.swing.JButton();
        lblAttendence = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnReports = new javax.swing.JButton();
        lblReports = new javax.swing.JLabel();
        btnWaterUsage = new javax.swing.JButton();
        Employee2 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        btnCusGroup = new javax.swing.JButton();
        lblEmpGroup1 = new javax.swing.JLabel();
        btnInvoice = new javax.swing.JButton();
        lblEmpGroup2 = new javax.swing.JLabel();
        btnSubGroup = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnService = new javax.swing.JButton();
        btnPayment = new javax.swing.JButton();
        lblEmpGroup3 = new javax.swing.JLabel();
        Employee3 = new javax.swing.JLabel();
        btncustomer = new javax.swing.JButton();
        Employee1 = new javax.swing.JLabel();
        lblProName = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        lblProjectName = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        cpanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnUserManagement = new javax.swing.JButton();
        btnPriceLevel = new javax.swing.JButton();
        lblReports1 = new javax.swing.JLabel();
        lblReports2 = new javax.swing.JLabel();
        btnFixVariable = new javax.swing.JButton();
        Employee4 = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuNewEMployee = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnuCustomer = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        setIconImages(null);
        setName("FormHomePage"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1920, 1080));

        cPanel.setBackground(new java.awt.Color(153, 153, 153));
        cPanel.setLayout(null);

        panel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnEmpGroup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/EmployeeGroup.png"))); // NOI18N
        btnEmpGroup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEmpGroupMouseClicked(evt);
            }
        });

        btnEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/Employee.png"))); // NOI18N
        btnEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEmployeeMouseClicked(evt);
            }
        });
        btnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeActionPerformed(evt);
            }
        });

        Employee.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        Employee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Employee.setText("Employee");

        lblEmpGroup.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        lblEmpGroup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpGroup.setText("EMP Group");
        lblEmpGroup.setToolTipText("");

        btnPumpInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/PumpInfo.png"))); // NOI18N
        btnPumpInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPumpInfoMouseClicked(evt);
            }
        });

        btnAttendence.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/Attendance.png"))); // NOI18N
        btnAttendence.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAttendenceMouseClicked(evt);
            }
        });

        lblAttendence.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        lblAttendence.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAttendence.setText("Attendance");

        jLabel3.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pump Info");

        btnReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/Report_1.png"))); // NOI18N
        btnReports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportsMouseClicked(evt);
            }
        });
        btnReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportsActionPerformed(evt);
            }
        });

        lblReports.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        lblReports.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReports.setText("Reports");

        btnWaterUsage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/WaterUsage.png"))); // NOI18N
        btnWaterUsage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnWaterUsageMouseClicked(evt);
            }
        });
        btnWaterUsage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWaterUsageActionPerformed(evt);
            }
        });

        Employee2.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        Employee2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Employee2.setText("Water Usage");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Employee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEmpGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmpGroup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblAttendence, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAttendence, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPumpInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblReports, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReports, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnWaterUsage, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Employee2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEmpGroup, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Employee)
                    .addComponent(lblEmpGroup))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPumpInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAttendence, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAttendence)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReports, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnWaterUsage, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReports)
                    .addComponent(Employee2))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        cPanel.add(panel1);
        panel1.setBounds(12, 18, 211, 500);

        btnCusGroup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/CusGroup_1.png"))); // NOI18N
        btnCusGroup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCusGroupMouseClicked(evt);
            }
        });
        btnCusGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCusGroupActionPerformed(evt);
            }
        });

        lblEmpGroup1.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        lblEmpGroup1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpGroup1.setText("Cus group");
        lblEmpGroup1.setToolTipText("");

        btnInvoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/Invoice_1.png"))); // NOI18N
        btnInvoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInvoiceMouseClicked(evt);
            }
        });
        btnInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvoiceActionPerformed(evt);
            }
        });

        lblEmpGroup2.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        lblEmpGroup2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpGroup2.setText("Invoice");
        lblEmpGroup2.setToolTipText("");

        btnSubGroup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/Subcommitee.png"))); // NOI18N
        btnSubGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubGroupActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sub Commitee");

        btnService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/Searvice.png"))); // NOI18N
        btnService.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnServiceMouseClicked(evt);
            }
        });
        btnService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiceActionPerformed(evt);
            }
        });

        btnPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/Payment_1.png"))); // NOI18N
        btnPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPaymentMouseClicked(evt);
            }
        });
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
            }
        });

        lblEmpGroup3.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        lblEmpGroup3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpGroup3.setText("Service");
        lblEmpGroup3.setToolTipText("");

        Employee3.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        Employee3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Employee3.setText("Payment");

        btncustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/Cutomer.png"))); // NOI18N
        btncustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncustomerMouseClicked(evt);
            }
        });
        btncustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncustomerActionPerformed(evt);
            }
        });

        Employee1.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        Employee1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Employee1.setText("Customer");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(btnSubGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCusGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Employee1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(lblEmpGroup1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblEmpGroup3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel2Layout.createSequentialGroup()
                            .addComponent(lblEmpGroup2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Employee3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel2Layout.createSequentialGroup()
                            .addComponent(btnInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(btncustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnService)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCusGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubGroup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpGroup1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnService, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpGroup3)
                    .addComponent(Employee1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpGroup2)
                    .addComponent(Employee3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cPanel.add(panel2);
        panel2.setBounds(230, 20, 218, 500);

        lblProName.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        lblProName.setForeground(new java.awt.Color(187, 22, 82));
        lblProName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProName.setText("Randiya Dahara Praja Mula Organization");

        lblLocation.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        lblLocation.setForeground(new java.awt.Color(187, 22, 82));
        lblLocation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLocation.setText("Wewala Wewa Dambulla");

        lblProjectName.setFont(new java.awt.Font("Baskerville Old Face", 1, 48)); // NOI18N
        lblProjectName.setForeground(new java.awt.Color(187, 22, 82));
        lblProjectName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProjectName.setText("Water Supply Information Management System");

        lblDate.setFont(new java.awt.Font("Digital-7 Mono", 1, 36)); // NOI18N
        lblDate.setForeground(new java.awt.Color(153, 0, 0));
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblTime.setFont(new java.awt.Font("Digital-7 Mono", 3, 36)); // NOI18N
        lblTime.setForeground(new java.awt.Color(153, 0, 0));
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        cpanel2.setBackground(new java.awt.Color(153, 153, 153));
        cpanel2.setLayout(null);

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));

        btnUserManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/UserManagement.png"))); // NOI18N
        btnUserManagement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUserManagementMouseClicked(evt);
            }
        });

        btnPriceLevel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/PriceList_2.png"))); // NOI18N
        btnPriceLevel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPriceLevelMouseClicked(evt);
            }
        });

        lblReports1.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        lblReports1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReports1.setText("User Management");

        lblReports2.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        lblReports2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReports2.setText("Price List ");

        btnFixVariable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/Varible.png"))); // NOI18N
        btnFixVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFixVariableActionPerformed(evt);
            }
        });

        Employee4.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        Employee4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Employee4.setText("Fix Variable");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnUserManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFixVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblReports1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Employee4, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                        .addGap(30, 30, 30)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblReports2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPriceLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPriceLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnUserManagement, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                        .addComponent(btnFixVariable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Employee4)
                        .addComponent(lblReports1))
                    .addComponent(lblReports2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cpanel2.add(jPanel6);
        jPanel6.setBounds(14, 13, 434, 160);

        lblUserName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(204, 0, 0));

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/EXITHOME.png"))); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bw/randiyadahara/wsims/view/Image/About (2).png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jMenuBar2.setBackground(new java.awt.Color(51, 51, 255));
        jMenuBar2.setForeground(new java.awt.Color(0, 51, 255));

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        mnuNewEMployee.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mnuNewEMployee.setText("New Employee");
        mnuNewEMployee.setActionCommand("Open");
        mnuNewEMployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNewEMployeeActionPerformed(evt);
            }
        });
        jMenu1.add(mnuNewEMployee);

        jMenuItem9.setText("Employee Group");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem10.setText("Attendance");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Cus Group");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Sub Commitee");
        jMenu1.add(jMenuItem3);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem2.setText("FixVariable");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        mnuCustomer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mnuCustomer.setText("New Customer");
        mnuCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCustomerActionPerformed(evt);
            }
        });
        jMenu1.add(mnuCustomer);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("New Service");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Water Usage");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("Bill Payment");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Invoice");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem11.setText("Pumped Info");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem11);

        jMenuItem12.setText("Reports");
        jMenu1.add(jMenuItem12);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem14.setText("Exit");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem14);

        jMenuBar2.add(jMenu1);

        jMenu4.setText("Edit");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("User Role");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(lblProName, javax.swing.GroupLayout.PREFERRED_SIZE, 1560, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(lblProjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 1420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(lblLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 1610, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(710, 710, 710)
                .addComponent(cpanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(640, 640, 640)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                    .addGap(710, 710, 710)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblProName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblProjectName)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(lblLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cpanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuNewEMployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNewEMployeeActionPerformed
       
          if(isActive.equals("Y")&& empLoyee.equals("Y")){
                       Employee e = new Employee(user_id);
                        e.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                        e.setResizable(false);
                        e.setLocationRelativeTo(null);
                        e.setTitle("Customer");
                        e.setVisible(true);
             
             }else{
             
                   JOptionPane.showMessageDialog(null,"You Can't Access");
        
          }
          
       
        
    }//GEN-LAST:event_mnuNewEMployeeActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       
         if(isActive.equals("Y")&& waterUsage.equals("Y")){
            
            MothCustomerWaterUsage mcwu =new MothCustomerWaterUsage(user_id);
                mcwu.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                mcwu.setSize(830, 795);
                mcwu.setLocationRelativeTo(null);
                mcwu.setTitle("Water Monthly USe");
                mcwu.setVisible(true);
        
        }else{  
              JOptionPane.showMessageDialog(null,"You Can't Access");
        }   
        
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
       
        
        
        if(isActive.equals("Y")&& pumpInfo.equals("Y")){
           WaterPumped wp   =  new WaterPumped(user_id);
                        wp.setResizable(false);
                        wp.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                        wp.setLocationRelativeTo(null);
                        wp.setTitle("Water Pumped information");
                        wp.setVisible(true);
               
        }else{
            JOptionPane.showMessageDialog(null,"You Can't Access !");
        
        }
        
        
        
        
        
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void mnuCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCustomerActionPerformed
        
        if(isActive.equals("Y")&& customer.equals("Y")){
                Customers c  =  new Customers(user_id);
                c.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                c.setResizable(false);
                c.setLocationRelativeTo(null);
                c.setTitle("Customer");
                c.setVisible(true);
             
        }else{
             
           JOptionPane.showMessageDialog(null,"You Can't Access");
        
        }

    }//GEN-LAST:event_mnuCustomerActionPerformed

    private void btnCusGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCusGroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCusGroupActionPerformed

    private void btnInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvoiceActionPerformed
    
        if(isActive.equals("Y")&& cusGroup.equals("Y")){
               
         Invoice i = new Invoice(user_id);
          i.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
          i.setResizable(false);
          i.setSize(1205, 999);
          i.setLocationRelativeTo(null);
          i.setTitle("Invoice");
          i.setVisible(true);
          
        }else{  
              JOptionPane.showMessageDialog(null,"You Can't Access");
        }
           
        
    }//GEN-LAST:event_btnInvoiceActionPerformed

    private void btnServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnServiceActionPerformed

    private void btnEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmployeeMouseClicked

         /* if(isActive.equals("Y")&& empLoyee.equals("Y")){
                Employee e = new Employee(user_id);
                e.setResizable(false);
                e.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                e.setLocationRelativeTo(null);
                e.setTitle("Employee Manage");
                e.setVisible(true);
             
                }else{
             
                    JOptionPane.showMessageDialog(null,"You have not Access to this Option");
        
             } */
        
       

    }//GEN-LAST:event_btnEmployeeMouseClicked

    private void btnEmpGroupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpGroupMouseClicked
       
        if(isActive.equals("Y")&& empGroup.equals("Y")){
        EmployeeGroup eg = new EmployeeGroup(user_id);
        eg.setResizable(false);
        eg.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        eg.setLocationRelativeTo(null);
        eg.setTitle("Employee Group");
        eg.setVisible(true);
             
        }else{
             
           JOptionPane.showMessageDialog(null,"You Can't Access");
        
        }
        
      

    }//GEN-LAST:event_btnEmpGroupMouseClicked

    private void btnAttendenceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAttendenceMouseClicked
        
        if(isActive.equals("Y")&& empAttendence.equals("Y")){
        EmployeeAttendence ea= new EmployeeAttendence(user_id);
         
          ea.setResizable(false);
          ea.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
          ea.setLocationRelativeTo(null);
          ea.setTitle("Employee Attendence");
          ea.setVisible(true);
        
        }else{
        
           JOptionPane.showMessageDialog(null,"You Can't Access");
        
        }
        
       

    }//GEN-LAST:event_btnAttendenceMouseClicked

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed

        this.dispose();
        
          LoginForm logF = new LoginForm();
               
                logF.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                logF.setSize(910,540);
                logF.setLocationRelativeTo(null);
                logF.setTitle("Login Page");
                logF.setVisible(true);

      
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void btnPumpInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPumpInfoMouseClicked

        if(isActive.equals("Y")&& pumpInfo.equals("Y")){
       WaterPumped wp   =  new WaterPumped(user_id);
                        wp.setResizable(false);
                        wp.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                        wp.setLocationRelativeTo(null);
                        wp.setTitle("Water Pumped information");
                        wp.setVisible(true);
               
        }else{
            JOptionPane.showMessageDialog(null,"You Can't Access !");
        
        }
        
        

    }//GEN-LAST:event_btnPumpInfoMouseClicked

    private void btncustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncustomerMouseClicked
 

    }//GEN-LAST:event_btncustomerMouseClicked

    private void btnCusGroupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCusGroupMouseClicked

         if(isActive.equals("Y")&& cusGroup.equals("Y")){
               
           CustomerGroup c = new CustomerGroup(user_id);
            c.setResizable(false);
            c.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            c.setLocationRelativeTo(null);
            c.setTitle("Customer Group");
            c.setVisible(true);
           
        
        }else{  
             JOptionPane.showMessageDialog(null,"You Can't Access");
        }
        
      

    }//GEN-LAST:event_btnCusGroupMouseClicked

    private void btnWaterUsageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWaterUsageMouseClicked

    }//GEN-LAST:event_btnWaterUsageMouseClicked

    private void btnInvoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInvoiceMouseClicked

    }//GEN-LAST:event_btnInvoiceMouseClicked

    private void btnPaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPaymentMouseClicked
 

    }//GEN-LAST:event_btnPaymentMouseClicked

    private void btnServiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnServiceMouseClicked
       
         if(isActive.equals("Y")&& service.equals("Y")){

          Service s =new Service(user_id);
            
            s.setResizable(false);
            s.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            s.setLocationRelativeTo(null);
            s.setTitle("Service");
            s.setVisible(true);
        
        }else{  
             JOptionPane.showMessageDialog(null,"You Can't Access");
        }
        
     

    }//GEN-LAST:event_btnServiceMouseClicked

    private void btnUserManagementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserManagementMouseClicked

        if(isActive.equals("Y")&& userManage.equals("Y")){
               
           Permision p =  new Permision(1,user_id);
            p.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            p.setResizable(false);
                // p.setSize(910,540);
               // p.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                 p.setLocationRelativeTo(null);
                 p.setTitle("Permision");
                 p.setVisible(true);
        
        }else{  
              JOptionPane.showMessageDialog(null,"You Can't Access");
        }
        
        
       


    }//GEN-LAST:event_btnUserManagementMouseClicked

    private void btnPriceLevelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPriceLevelMouseClicked

     if(isActive.equals("Y")&& userManage.equals("Y")){
               
                Permision p =  new Permision(2,user_id);
                p.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                p.setResizable(false);
                 p.setLocationRelativeTo(null);
                 p.setTitle("Permision");
                 p.setVisible(true);
        
        }else{  
              JOptionPane.showMessageDialog(null,"You Can't Access");
        }

    }//GEN-LAST:event_btnPriceLevelMouseClicked

    private void btncustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncustomerActionPerformed

        
         if(isActive.equals("Y")&& customer.equals("Y")){
           Customers c= new Customers(user_id);  
                    c.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                    c.pack();
                    c.setResizable(false);
                    c.setLocationRelativeTo(null);
                    c.setTitle("Customers Information");
                    c.setLocationRelativeTo(null);
                    c.setVisible(true);
                   // c.setResizable(false);
        }else{  
        JOptionPane.showMessageDialog(null,"You Can't Access");
        }
       
    }//GEN-LAST:event_btncustomerActionPerformed

    private void btnReportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportsMouseClicked

     
        
    }//GEN-LAST:event_btnReportsMouseClicked

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        
           if(isActive.equals("Y")&& Payment.equals("Y")){

                  Payment p =  new Payment(user_id);
                  p.setResizable(false);
                  p.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                  p.setLocationRelativeTo(null);
                  p.setTitle("Customer Payment Manage");
                  p.setVisible(true);
        
        }else{  
            JOptionPane.showMessageDialog(null,"You Can't Access");
        }
        
    }//GEN-LAST:event_btnPaymentActionPerformed

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeActionPerformed

    if(isActive.equals("Y")&& empLoyee.equals("Y")){
                Employee e = new Employee(user_id);
                e.setResizable(false);
                e.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                e.setLocationRelativeTo(null);
                e.setTitle("Employee Manage");
                e.setVisible(true);
             
                }else{
             
                   JOptionPane.showMessageDialog(null,"You Can't Access");
        
             }


        
    }//GEN-LAST:event_btnEmployeeActionPerformed

    private void btnSubGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubGroupActionPerformed

    if(isActive.equals("Y")&& subComitee.equals("Y")){
                SubCommitee   sc = new SubCommitee(user_id);
                sc.setResizable(false);
                sc.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                sc.setLocationRelativeTo(null);
                sc.setTitle("SUB COMMITEE MANAGE");
                sc.setVisible(true);
 
             
                }else{
             
                   JOptionPane.showMessageDialog(null,"You Can't Access");
        
             }
        
        
        
       

        
    }//GEN-LAST:event_btnSubGroupActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

     this.dispose();
        
          LoginForm logF = new LoginForm();
               
                logF.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                logF.setSize(910,540);
                logF.setLocationRelativeTo(null);
                logF.setTitle("Login Page");
                logF.setVisible(true);
        
        

    }//GEN-LAST:event_btnExitActionPerformed

    private void btnWaterUsageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWaterUsageActionPerformed
        if(isActive.equals("Y")&& waterUsage.equals("Y")){
            
            MothCustomerWaterUsage mcwu =new MothCustomerWaterUsage(user_id);
                mcwu.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                mcwu.setSize(830, 795);
                mcwu.setLocationRelativeTo(null);
                mcwu.setTitle("Water Monthly Use");
                mcwu.setVisible(true);
        
        }else{  
              JOptionPane.showMessageDialog(null,"You Can't Access");
        }   
        
               // TODO add your handling code here:
    }//GEN-LAST:event_btnWaterUsageActionPerformed

    private void btnFixVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFixVariableActionPerformed
        
         if(FixCost.equals("Y")){
               
               CustomerGroupCommonControlers i = new CustomerGroupCommonControlers(user_id);
               i .setVisible(true);
               i.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
              // i.setSize(1205, 999);
               i.setLocationRelativeTo(null);
               i.setTitle("Customer Group Common Controler");
               i.setVisible(true);
          
        }else{  
              JOptionPane.showMessageDialog(null,"You Can't Access");
        }
        
        
        
    }//GEN-LAST:event_btnFixVariableActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
        About a = new About();
       
        //  a.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
          a.setLocationRelativeTo(null);
          a.setTitle("ABOUT");
          a.setVisible(true);
        
        
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        
        
      if(isActive.equals("Y")&& service.equals("Y")){

          Service s =new Service(user_id);
            
            s.setResizable(false);
            s.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            s.setLocationRelativeTo(null);
            s.setTitle("Service");
            s.setVisible(true);
        
        }else{  
             JOptionPane.showMessageDialog(null,"You Can't Access");
        }
        
        
        
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        
      if(isActive.equals("Y")&& Payment.equals("Y")){

                  Payment p =  new Payment(user_id);
                  p.setResizable(false);
                  p.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                  p.setLocationRelativeTo(null);
                  p.setTitle("Customer Payment Manage");
                  p.setVisible(true);
        
        }else{  
            JOptionPane.showMessageDialog(null,"You Can't Access");
        }
        
        
        
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed

    if(isActive.equals("Y")&& cusGroup.equals("Y")){
               
         Invoice i = new Invoice(user_id);
          i.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
          i.setResizable(false);
          i.setSize(1205, 999);
          i.setLocationRelativeTo(null);
          i.setTitle("Invoice");
          i.setVisible(true);
          
        }else{  
              JOptionPane.showMessageDialog(null,"You Can't Access");
        }
           



        
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        
          if(isActive.equals("Y")&& empGroup.equals("Y")){
        EmployeeGroup eg = new EmployeeGroup(user_id);
        eg.setResizable(false);
        eg.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        eg.setLocationRelativeTo(null);
        eg.setTitle("Employee Group");
        eg.setVisible(true);
             
        }else{
             
           JOptionPane.showMessageDialog(null,"You Can't Access");
        
        }
        
        
        
        
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
       
        
         if(isActive.equals("Y")&& empAttendence.equals("Y")){
        EmployeeAttendence ea= new EmployeeAttendence(user_id);
         
          ea.setResizable(false);
          ea.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
          ea.setLocationRelativeTo(null);
          ea.setTitle("Employee Attendence");
          ea.setVisible(true);
        
        }else{
        
           JOptionPane.showMessageDialog(null,"You Can't Access");
        
        }
        
        
        
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
         if(isActive.equals("Y")&& cusGroup.equals("Y")){
               
           CustomerGroup c = new CustomerGroup(user_id);
            c.setResizable(false);
            c.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            c.setLocationRelativeTo(null);
            c.setTitle("Customer Group");
            c.setVisible(true);
           
        
        }else{  
             JOptionPane.showMessageDialog(null,"You Can't Access");
        }
        
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
         if(FixCost.equals("Y")){
               
               CustomerGroupCommonControlers i = new CustomerGroupCommonControlers(user_id);
               i .setVisible(true);
               i.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
              // i.setSize(1205, 999);
               i.setLocationRelativeTo(null);
               i.setTitle("Customer Group Common Controler");
               i.setVisible(true);
          
        }else{  
              JOptionPane.showMessageDialog(null,"You Can't Access");
        }
        
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       
          if(isActive.equals("Y")&& userManage.equals("Y")){
               
           Permision p =  new Permision(1,user_id);
            p.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            p.setResizable(false);
                // p.setSize(910,540);
               // p.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                 p.setLocationRelativeTo(null);
                 p.setTitle("Permision");
                 p.setVisible(true);
        
        }else{  
              JOptionPane.showMessageDialog(null,"You Can't Access");
        }
        
        
        
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void btnReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportsActionPerformed
        
           if(isActive.equals("Y")&& report.equals("Y")){
               
            Reports r =  new  Reports();
              //   r.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                 r.setResizable(false);
                 r.setLocationRelativeTo(null);
                 r.setTitle("Permision");
                 r.setVisible(true);
        
        }else{  
            JOptionPane.showMessageDialog(null,"You Can't Access");
        }
        

        
        
    }//GEN-LAST:event_btnReportsActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                 HomeFrom homef =new HomeFrom();
                 homef.setTitle("Home Page");
                 homef.setVisible(true);
                 homef.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                 homef.setResizable(false);
                 homef.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Employee;
    private javax.swing.JLabel Employee1;
    private javax.swing.JLabel Employee2;
    private javax.swing.JLabel Employee3;
    private javax.swing.JLabel Employee4;
    private javax.swing.JButton btnAttendence;
    private javax.swing.JButton btnCusGroup;
    private javax.swing.JButton btnEmpGroup;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFixVariable;
    private javax.swing.JButton btnInvoice;
    private javax.swing.JButton btnPayment;
    private javax.swing.JButton btnPriceLevel;
    private javax.swing.JButton btnPumpInfo;
    private javax.swing.JButton btnReports;
    private javax.swing.JButton btnService;
    private javax.swing.JButton btnSubGroup;
    private javax.swing.JButton btnUserManagement;
    private javax.swing.JButton btnWaterUsage;
    private javax.swing.JButton btncustomer;
    private javax.swing.JPanel cPanel;
    private javax.swing.JPanel cpanel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblAttendence;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblEmpGroup;
    private javax.swing.JLabel lblEmpGroup1;
    private javax.swing.JLabel lblEmpGroup2;
    private javax.swing.JLabel lblEmpGroup3;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblProName;
    private javax.swing.JLabel lblProjectName;
    private javax.swing.JLabel lblReports;
    private javax.swing.JLabel lblReports1;
    private javax.swing.JLabel lblReports2;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JMenuItem mnuCustomer;
    private javax.swing.JMenuItem mnuNewEMployee;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    // End of variables declaration//GEN-END:variables

}
