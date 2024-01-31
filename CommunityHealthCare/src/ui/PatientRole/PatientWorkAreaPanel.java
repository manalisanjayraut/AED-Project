/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PatientRole;

import business.EcoSystem;
import business.Organization.DoctorOrganization;
import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import ui.DoctorRole.ManageAppointment;

/**
 *
 * @author manal
 */
public class PatientWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientWorkAreaPanel
     */
    private JPanel workArea;

    private EcoSystem business;
    private UserAccount userAccount;

    public PatientWorkAreaPanel(JPanel workArea, UserAccount account, EcoSystem business) {
        initComponents();

        this.workArea = workArea;

        this.business = business;
        this.userAccount = account;
        
        Time();

    }
    
    
    private void Time() {
       
                Date date= new Date();
                DateFormat timeFormat =  new SimpleDateFormat("HH:mm a");
                String time = timeFormat.format(date);
                timeLabel.setText(time);
    
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        japnel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        timeLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Appointments = new javax.swing.JPanel();
        prescriptionPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        profile = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        manageAppointment = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        checkLabResult = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        donateBlood = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        reqEmergency = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        myrecord = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(249, 252, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        timeLabel.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        timeLabel.setText("3:45 PM");
        jPanel6.add(timeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, -1, -1));

        jLabel10.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jLabel10.setText("Patient Dashboard");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        jLabel1.setForeground(new java.awt.Color(152, 151, 151));
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jLabel7.setText("jLabel6");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, -1));

        rightPanel.setBackground(new java.awt.Color(250, 249, 251));
        rightPanel.setLayout(new java.awt.CardLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/patinet.jpg"))); // NOI18N
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        rightPanel.add(jLabel8, "card2");

        Appointments.setBackground(new java.awt.Color(255, 255, 255));
        Appointments.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        prescriptionPanel.setBackground(new java.awt.Color(255, 255, 255));
        prescriptionPanel.setPreferredSize(new java.awt.Dimension(100, 48));
        prescriptionPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                prescriptionPanelMousePressed(evt);
            }
        });
        prescriptionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Check Prescription");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        prescriptionPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 190, -1));

        Appointments.add(prescriptionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 230, 60));

        profile.setBackground(new java.awt.Color(255, 255, 255));
        profile.setPreferredSize(new java.awt.Dimension(100, 48));
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                profileMousePressed(evt);
            }
        });
        profile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("Manage Profile");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        profile.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 170, -1));

        Appointments.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 50));

        manageAppointment.setBackground(new java.awt.Color(255, 255, 255));
        manageAppointment.setPreferredSize(new java.awt.Dimension(100, 48));
        manageAppointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageAppointmentMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageAppointmentMousePressed(evt);
            }
        });
        manageAppointment.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 0));
        jLabel9.setText("Mange Appointments");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        manageAppointment.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, -1));

        Appointments.add(manageAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 230, 60));

        checkLabResult.setBackground(new java.awt.Color(255, 255, 255));
        checkLabResult.setPreferredSize(new java.awt.Dimension(100, 48));
        checkLabResult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkLabResultMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                checkLabResultMousePressed(evt);
            }
        });
        checkLabResult.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("Check Lab Result");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        checkLabResult.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 170, -1));

        Appointments.add(checkLabResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 230, 60));

        donateBlood.setBackground(new java.awt.Color(255, 255, 255));
        donateBlood.setPreferredSize(new java.awt.Dimension(100, 48));
        donateBlood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                donateBloodMousePressed(evt);
            }
        });
        donateBlood.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("Donate Blood");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        donateBlood.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 190, -1));

        Appointments.add(donateBlood, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 230, 50));

        reqEmergency.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("Request Emergency");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout reqEmergencyLayout = new javax.swing.GroupLayout(reqEmergency);
        reqEmergency.setLayout(reqEmergencyLayout);
        reqEmergencyLayout.setHorizontalGroup(
            reqEmergencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reqEmergencyLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        reqEmergencyLayout.setVerticalGroup(
            reqEmergencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reqEmergencyLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        Appointments.add(reqEmergency, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 230, 60));

        myrecord.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 153, 0));
        jLabel11.setText("My Health Record");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout myrecordLayout = new javax.swing.GroupLayout(myrecord);
        myrecord.setLayout(myrecordLayout);
        myrecordLayout.setHorizontalGroup(
            myrecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myrecordLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        myrecordLayout.setVerticalGroup(
            myrecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myrecordLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel11)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        Appointments.add(myrecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 230, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Appointments, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 1266, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Appointments, javax.swing.GroupLayout.PREFERRED_SIZE, 1006, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout japnelLayout = new javax.swing.GroupLayout(japnel);
        japnel.setLayout(japnelLayout);
        japnelLayout.setHorizontalGroup(
            japnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        japnelLayout.setVerticalGroup(
            japnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(japnelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(japnel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(japnel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void prescriptionPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prescriptionPanelMousePressed
        // TODO add your handling code here:
        //   requestBlood();
        checkPresciption();
    }//GEN-LAST:event_prescriptionPanelMousePressed

    private void profileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMousePressed
        // TODO add your handling code here:
        //ad  appointments();

        // updateProfile();
    }//GEN-LAST:event_profileMousePressed

    private void manageAppointmentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageAppointmentMousePressed
        // TODO add your handling code here:


    }//GEN-LAST:event_manageAppointmentMousePressed

    private void checkLabResultMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkLabResultMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkLabResultMousePressed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:

        populateProfile();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        donateBlood();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void donateBloodMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donateBloodMousePressed
        // TODO add your handling code here:
        donateBlood();
    }//GEN-LAST:event_donateBloodMousePressed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

        checklab();


    }//GEN-LAST:event_jLabel4MouseClicked

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
        // TODO add your handling code here:
        populateProfile();


    }//GEN-LAST:event_profileMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void manageAppointmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageAppointmentMouseClicked
        // TODO add your handling code here:
        manageAppointment();
    }//GEN-LAST:event_manageAppointmentMouseClicked

    private void checkLabResultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkLabResultMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_checkLabResultMouseClicked

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        // TODO add your handling code here:

        manageAppointment();
    }//GEN-LAST:event_jLabel9MousePressed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:

        manangeemergency();

    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        checkPresciption();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:

        addmyrecords();

    }//GEN-LAST:event_jLabel11MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Appointments;
    private javax.swing.JPanel checkLabResult;
    private javax.swing.JPanel donateBlood;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel japnel;
    private javax.swing.JPanel manageAppointment;
    private javax.swing.JPanel myrecord;
    private javax.swing.JPanel prescriptionPanel;
    private javax.swing.JPanel profile;
    private javax.swing.JPanel reqEmergency;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables

    private void checkPresciption() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        prescriptionPanel.setBackground(new Color(255, 255, 255));
        profile.setBackground(new Color(213, 230, 249));
        checkLabResult.setBackground(new Color(213, 230, 249));
        manageAppointment.setBackground(new Color(213, 230, 249));
        donateBlood.setBackground(new Color(213, 230, 249));
        reqEmergency.setBackground(new Color(213, 230, 249));
        myrecord.setBackground(new Color(213, 230, 249));

        CheckPrescriptionOrder ckpjp = new CheckPrescriptionOrder(workArea, userAccount, business);

        rightPanel.add(ckpjp);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);

    }

    private void populateProfile() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        profile.setBackground(new Color(255, 255, 255));
        prescriptionPanel.setBackground(new Color(213, 230, 249));
        checkLabResult.setBackground(new Color(213, 230, 249));
        manageAppointment.setBackground(new Color(213, 230, 249));
        donateBlood.setBackground(new Color(213, 230, 249));
        reqEmergency.setBackground(new Color(213, 230, 249));
        myrecord.setBackground(new Color(213, 230, 249));

        ManagePatientProfile mpjp = new ManagePatientProfile(workArea, userAccount, business);

        rightPanel.add(mpjp);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);

    }

    private void donateBlood() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        donateBlood.setBackground(new Color(255, 255, 255));
        prescriptionPanel.setBackground(new Color(213, 230, 249));
        checkLabResult.setBackground(new Color(213, 230, 249));
        manageAppointment.setBackground(new Color(213, 230, 249));
        profile.setBackground(new Color(213, 230, 249));
        reqEmergency.setBackground(new Color(213, 230, 249));
        myrecord.setBackground(new Color(213, 230, 249));

        DonateBlood dbjp = new DonateBlood(workArea, userAccount, business);

        rightPanel.add(dbjp);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);

    }

    private void checklab() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        checkLabResult.setBackground(new Color(255, 255, 255));
        prescriptionPanel.setBackground(new Color(213, 230, 249));
        donateBlood.setBackground(new Color(213, 230, 249));
        manageAppointment.setBackground(new Color(213, 230, 249));
        profile.setBackground(new Color(213, 230, 249));
        reqEmergency.setBackground(new Color(213, 230, 249));
        myrecord.setBackground(new Color(213, 230, 249));

        CheckLabResultJPanel clrjp = new CheckLabResultJPanel(userAccount, business);

        rightPanel.add(clrjp);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);

    }

    private void manageAppointment() {
        //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        manageAppointment.setBackground(new Color(255, 255, 255));
        prescriptionPanel.setBackground(new Color(213, 230, 249));
        donateBlood.setBackground(new Color(213, 230, 249));
        profile.setBackground(new Color(213, 230, 249));
        checkLabResult.setBackground(new Color(213, 230, 249));
        reqEmergency.setBackground(new Color(213, 230, 249));
        myrecord.setBackground(new Color(213, 230, 249));

        ManageDoctorAppointment map = new ManageDoctorAppointment(workArea, userAccount, business);

        rightPanel.add(map);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);

    }

    private void manangeemergency() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        reqEmergency.setBackground(new Color(255, 255, 255));
        prescriptionPanel.setBackground(new Color(213, 230, 249));
        donateBlood.setBackground(new Color(213, 230, 249));
        profile.setBackground(new Color(213, 230, 249));
        checkLabResult.setBackground(new Color(213, 230, 249));
        manageAppointment.setBackground(new Color(213, 230, 249));
        myrecord.setBackground(new Color(213, 230, 249));

        RequestEmergencyJPanel map = new RequestEmergencyJPanel(userAccount, business);

        rightPanel.add(map);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);

    }

    private void addmyrecords() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        myrecord.setBackground(new Color(255, 255, 255));
        prescriptionPanel.setBackground(new Color(213, 230, 249));
        donateBlood.setBackground(new Color(213, 230, 249));
        profile.setBackground(new Color(213, 230, 249));
        checkLabResult.setBackground(new Color(213, 230, 249));
        manageAppointment.setBackground(new Color(213, 230, 249));
        reqEmergency.setBackground(new Color(213, 230, 249));
        
        ManageMyRecordJPanel myrjp = new ManageMyRecordJPanel(workArea, userAccount, business);
        
        rightPanel.add(myrjp);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);

    }

}
