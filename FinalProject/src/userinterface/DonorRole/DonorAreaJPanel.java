/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.DonorRole;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import userinterface.FCAdminRole.FCAdminWorkAreaPanel;
import userinterface.MainJFrame;

/**
 *
 * @author vipinmamidi
 */
public class DonorAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DonorAreaJPanel
     */
    private JPanel userProcessContainer;

    private UserAccount userAccount;
    EcoSystem ecosystem;
    JPanel jp;
    JSplitPane jsp;

    public DonorAreaJPanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount account, JPanel jp, JSplitPane jsp) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        //valueLabel.setText(enterprise.getName());
        this.ecosystem = ecosystem;
        this.jp = jp;
        this.jsp = jsp;
        setBG();
        logoutlogo();
        setLogo();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPaneDonor = new javax.swing.JSplitPane();
        DonorMenubarPanel = new javax.swing.JPanel();
        btnViewDon = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        btnDonNow = new javax.swing.JButton();
        lblWelcomemsg = new javax.swing.JLabel();
        lbllogout = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        logoImage = new javax.swing.JLabel();
        DonorWorkAreaPanel = new javax.swing.JPanel();
        LabelImg = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(2000, 1050));

        SplitPaneDonor.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        DonorMenubarPanel.setBackground(new java.awt.Color(255, 255, 255));
        DonorMenubarPanel.setPreferredSize(new java.awt.Dimension(617, 500));
        DonorMenubarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnViewDon.setBackground(new java.awt.Color(0, 153, 204));
        btnViewDon.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnViewDon.setText("View Donations");
        btnViewDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDonActionPerformed(evt);
            }
        });
        DonorMenubarPanel.add(btnViewDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        btnProfile.setBackground(new java.awt.Color(0, 153, 204));
        btnProfile.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnProfile.setText("View Profile");
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });
        DonorMenubarPanel.add(btnProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        btnDonNow.setBackground(new java.awt.Color(0, 153, 204));
        btnDonNow.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnDonNow.setText("Donate Now");
        btnDonNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonNowActionPerformed(evt);
            }
        });
        DonorMenubarPanel.add(btnDonNow, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, -1, -1));

        lblWelcomemsg.setFont(new java.awt.Font("Trebuchet MS", 1, 29)); // NOI18N
        lblWelcomemsg.setForeground(new java.awt.Color(0, 153, 204));
        lblWelcomemsg.setText("Welcome Donor !");
        DonorMenubarPanel.add(lblWelcomemsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        lbllogout.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lbllogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbllogoutMousePressed(evt);
            }
        });
        DonorMenubarPanel.add(lbllogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 30, 42, 32));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        DonorMenubarPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 0, -1, 130));
        DonorMenubarPanel.add(logoImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, 110));

        SplitPaneDonor.setLeftComponent(DonorMenubarPanel);

        DonorWorkAreaPanel.setPreferredSize(new java.awt.Dimension(2000, 900));

        LabelImg.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout DonorWorkAreaPanelLayout = new javax.swing.GroupLayout(DonorWorkAreaPanel);
        DonorWorkAreaPanel.setLayout(DonorWorkAreaPanelLayout);
        DonorWorkAreaPanelLayout.setHorizontalGroup(
            DonorWorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DonorWorkAreaPanelLayout.setVerticalGroup(
            DonorWorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
        );

        SplitPaneDonor.setRightComponent(DonorWorkAreaPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPaneDonor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPaneDonor, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

     public void setLogo() {
        try {
            logoImage.setMinimumSize(new Dimension(100, 100));
            logoImage.setPreferredSize(new Dimension(100, 100));
            logoImage.setMaximumSize(new Dimension(100, 100));

            Image img = ImageIO.read(getClass().getResource("/Images/cmnlogo.jpeg"));

            Image newimg = img.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
            logoImage.setIcon(new ImageIcon(newimg));
        } catch (IOException ex) {
            Logger.getLogger(DonorProfilePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    public void setBG() {
        try {
            LabelImg.setMinimumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setPreferredSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setMaximumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));

            Image img = ImageIO.read(getClass().getResource("/Images/background2.png"));

            Image newimg = img.getScaledInstance(1500, userProcessContainer.getHeight(), java.awt.Image.SCALE_SMOOTH);
            LabelImg.setIcon(new ImageIcon(newimg));
        } catch (IOException ex) {
            Logger.getLogger(DonorProfilePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void logoutlogo() {

        try {
           
            lbllogout.setMinimumSize(new Dimension(50,60));
            lbllogout.setPreferredSize(new Dimension(50,60));
            lbllogout.setMaximumSize(new Dimension(50,60));
            
            Image img1 = ImageIO.read(getClass().getResource("/Images/signout.png"));
            Image newimg1 = img1.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);

            lbllogout.setIcon(new ImageIcon(newimg1));
            
            
        } catch (IOException ex) {
            Logger.getLogger(DonorAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    private void btnViewDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDonActionPerformed
        // TODO add your handling code here:
        ViewDonationPanel objViewDon = new ViewDonationPanel(userProcessContainer, ecosystem, userAccount);
        SplitPaneDonor.setRightComponent(objViewDon);
    }//GEN-LAST:event_btnViewDonActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        // TODO add your handling code here:
        DonorProfilePanel objDonProf = new DonorProfilePanel(userProcessContainer, ecosystem, userAccount);
        SplitPaneDonor.setRightComponent(objDonProf);
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnDonNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonNowActionPerformed
        // TODO add your handling code here:
        DonateNowPanel objDonNow = new DonateNowPanel(userProcessContainer, ecosystem, userAccount);
        SplitPaneDonor.setRightComponent(objDonNow);
    }//GEN-LAST:event_btnDonNowActionPerformed

    private void lbllogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbllogoutMousePressed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            MainJFrame mjf = new MainJFrame();
            mjf.logout(userProcessContainer, jp, jsp);
        } catch (IOException ex) {
            Logger.getLogger(FCAdminWorkAreaPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbllogoutMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DonorMenubarPanel;
    private javax.swing.JPanel DonorWorkAreaPanel;
    private javax.swing.JLabel LabelImg;
    private javax.swing.JSplitPane SplitPaneDonor;
    private javax.swing.JButton btnDonNow;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnViewDon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblWelcomemsg;
    private javax.swing.JLabel lbllogout;
    private javax.swing.JLabel logoImage;
    // End of variables declaration//GEN-END:variables
}
