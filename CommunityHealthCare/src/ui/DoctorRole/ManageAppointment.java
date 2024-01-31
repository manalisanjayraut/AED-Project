/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.DoctorRole;

import business.Doctor.Appointment;
import business.Doctor.Doctor;
import business.Doctor.DoctorDirectorty;
import business.Doctor.DoctorPatientMap;
import business.EcoSystem;
import business.Patient.Patient;
import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manal
 */
public class ManageAppointment extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Doctor doctor;
    private Patient selectedPatient;
    private Appointment selectedAppointment;

    /**
     * Creates new form ManageAppointment
     */
    public ManageAppointment(JPanel userProcessContainer, UserAccount account, EcoSystem business, Doctor doctor) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.userAccount = account;
        this.doctor = doctor;
        populateAppointmentTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        prescribe1 = new javax.swing.JButton();
        labTest1 = new javax.swing.JButton();
        labTest2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Appointments");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Status", "Date", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        prescribe1.setBackground(new java.awt.Color(255, 55, 95));
        prescribe1.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        prescribe1.setForeground(new java.awt.Color(255, 255, 255));
        prescribe1.setText("Prescription");
        prescribe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prescribe1ActionPerformed(evt);
            }
        });

        labTest1.setBackground(new java.awt.Color(255, 55, 95));
        labTest1.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        labTest1.setForeground(new java.awt.Color(255, 255, 255));
        labTest1.setText("Process ");
        labTest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labTest1ActionPerformed(evt);
            }
        });

        labTest2.setBackground(new java.awt.Color(255, 55, 95));
        labTest2.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        labTest2.setForeground(new java.awt.Color(255, 255, 255));
        labTest2.setText("Lab Test");
        labTest2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labTest2ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doctor_patient.jpg"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(labTest1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(labTest2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(prescribe1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labTest1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labTest2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prescribe1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(427, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void prescribe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prescribe1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        Set<Appointment> doctorAppointmentsMap = doctor.getMap().getDoctorAppointmentsMap().get(doctor);

        if (selectedRow >= 0) {
            String sRow = (table.getValueAt(selectedRow, 1).toString());
            for (Appointment appointment : doctorAppointmentsMap) {
                String patientUsername = appointment.getPatient().getUsername();
                if (sRow.equalsIgnoreCase(patientUsername)) {/*&&o.getStatus().matches("Deliver Man Assigned")*/ {
                        selectedPatient = appointment.getPatient();
                    }
                }
            }
        }

        RequestPresciption reqMed = new RequestPresciption(userProcessContainer, userAccount, business, doctor, selectedPatient);

        userProcessContainer.add(
                "RequestPresciption", reqMed);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();

        layout.show(userProcessContainer,
                "RequestPresciption");


    }//GEN-LAST:event_prescribe1ActionPerformed

    private void labTest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labTest1ActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = jTable1.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to view.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        selectedAppointment= (Appointment) model.getValueAt(selectedRowIndex, 0);
        
        selectedAppointment.setStatus("Processed");
        
         JOptionPane.showMessageDialog(null, "Doctor has processed the request.");

         populateAppointmentTable();

       
      
        
    }//GEN-LAST:event_labTest1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void labTest2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labTest2ActionPerformed
        // TODO add your handling code here:
          // TODO add your handling code here:
        System.out.println("inside lab test");
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        Set<Appointment> doctorAppointmentsMap = doctor.getMap().getDoctorAppointmentsMap().get(doctor);
 
        if (selectedRow >= 0) {
            String sRow = (table.getValueAt(selectedRow, 1).toString());
            for (Appointment appointment : doctorAppointmentsMap) {
                String patientUsername = appointment.getPatient().getUsername();
                if (sRow.equalsIgnoreCase(patientUsername)) {/*&&o.getStatus().matches("Deliver Man Assigned")*/ {
                        selectedPatient = appointment.getPatient();
                    }
                }
            }
        }
        System.out.println("selectedPatient"+selectedPatient);
        RequestLabJPanel reqMed = new RequestLabJPanel(userProcessContainer, userAccount, business, doctor, selectedPatient);
 
        
        
        userProcessContainer.add(
                "RequestPresciption", reqMed);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
 
        layout.show(userProcessContainer,
                "RequestPresciption");
    }//GEN-LAST:event_labTest2ActionPerformed

    private void requestLab() {
        
        

      /*  RequestLabTestJPanel labTest = new RequestLabTestJPanel(userProcessContainer, userAccount, business);
        userProcessContainer.add("RequestLabTestJPanel", labTest);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.show(userProcessContainer, "RequestLabTestJPanel");*/

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton labTest1;
    private javax.swing.JButton labTest2;
    private javax.swing.JButton prescribe1;
    // End of variables declaration//GEN-END:variables

    private void populateAppointmentTable() {
        Set<Appointment> doctorAppointmentsMap = doctor.getMap().getDoctorAppointmentsMap().get(doctor);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        if(doctorAppointmentsMap!=null){
        // DefaultTableModel tableModel = new DefaultTableModel();
        for (Appointment appointment : doctorAppointmentsMap) {
            String patientUsername = appointment.getPatient().getUsername();
            // Retrieve patient information based on username from DoctorPatientMap

            Object[] rowData = {
                appointment,
                patientUsername,
                appointment.getStatus(),
                appointment.getDate(),
                appointment.getTime()
            };
            model.addRow(rowData);
        }

        // jTable1.setModel(tableModel);
    }
    }

}
