/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.GovernmentOrganization;

import business.EcoSystem;
import business.Lab.Lab;
import business.Organization.LabOrganization;
import business.Organization.Organization;
import business.WorkQueue.WorkRequest;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author shrey
 */
public class LabRequestAnalysis extends javax.swing.JFrame {

    private EcoSystem business;

    /**
     * Creates new form LabDataAnalysis
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 899, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    private DefaultCategoryDataset dataset;

    public LabRequestAnalysis(String title, EcoSystem business) {
        super(title);
        this.business = business;
        dataset = createDataset(); // Create dataset with lab request data
        JFreeChart chart = createChart(dataset); // Create bar chart
        ChartPanel chartPanel = new ChartPanel(chart);
        setContentPane(chartPanel);
        initComponents();

    }

    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        int completeCount = 0;
        int pendingCount = 0;
        Organization org = null;
        // Assuming labRequestList is a list of LabRequest objects
        for (Organization organization : business.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof LabOrganization) {
                org = organization;
                break;
            }
        }
        if (org != null) {

            org.getEmployeeDirectory().getLabDirectory();
        }
        LabOrganization labOrg = (LabOrganization) org; // Typecast if necessary
        System.out.println("labOrg" + labOrg);

        for (WorkRequest labRequest : labOrg.getWorkQueue().getWorkRequestList()) {
            System.out.println("labRequest" + labRequest);
            System.out.println("labRequest" + labRequest.getStatus());
            if (labRequest.getStatus().equalsIgnoreCase("completed")) {
                completeCount++;
            } else if (labRequest.getStatus().equalsIgnoreCase("sent")) {
                pendingCount++;
            }
        }

        // Add counts to the dataset
        dataset.addValue(completeCount, "Status", "Complete");
        dataset.addValue(pendingCount, "Status", "Sent");

        return dataset;
    }

    private JFreeChart createChart(DefaultCategoryDataset dataset) {
        JFreeChart chart = ChartFactory.createBarChart(
                "Lab Request Analysis", // Chart title
                "Status", // X-axis label
                "Number of Requests", // Y-axis label
                dataset // Dataset
        );
        return chart;
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
