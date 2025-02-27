/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NGORole;

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
import userinterface.DonorRole.DonorProfilePanel;
import userinterface.MainJFrame;

/**
 *
 * @author sivanagendrakanakababumarada
 */
public class NGOWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form NGOWorkAreaPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAcc;
    JPanel jp;
    JSplitPane jsp;
    public NGOWorkAreaPanel(JPanel userProcessContainer,EcoSystem ecosystem,UserAccount userAcc, JPanel jp, JSplitPane jsp) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAcc =userAcc;
        this.jp = jp;
        this.jsp = jsp;
        setLogo();
        setBG();
        logoutlogo();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPaneDon = new javax.swing.JSplitPane();
        ManubarNonGovOrgPanel = new javax.swing.JPanel();
        btnManagevol = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        lblWelcomemsg = new javax.swing.JLabel();
        lbllogout = new javax.swing.JLabel();
        logoImage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        WorkAreaNonGovOrgPanel = new javax.swing.JPanel();
        LabelImg = new javax.swing.JLabel();

        SplitPaneDon.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        ManubarNonGovOrgPanel.setBackground(new java.awt.Color(255, 255, 255));
        ManubarNonGovOrgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManagevol.setBackground(new java.awt.Color(0, 153, 204));
        btnManagevol.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnManagevol.setText("Manage Volunteers");
        btnManagevol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagevolActionPerformed(evt);
            }
        });
        ManubarNonGovOrgPanel.add(btnManagevol, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, -1, -1));

        btnProfile.setBackground(new java.awt.Color(0, 153, 204));
        btnProfile.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnProfile.setText("My Profile");
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });
        ManubarNonGovOrgPanel.add(btnProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        lblWelcomemsg.setFont(new java.awt.Font("Trebuchet MS", 1, 29)); // NOI18N
        lblWelcomemsg.setForeground(new java.awt.Color(0, 153, 204));
        lblWelcomemsg.setText("Welcome NGO!");
        ManubarNonGovOrgPanel.add(lblWelcomemsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 6, -1, -1));

        lbllogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbllogoutMousePressed(evt);
            }
        });
        ManubarNonGovOrgPanel.add(lbllogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 30, 43, 41));
        ManubarNonGovOrgPanel.add(logoImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 80, 60));
        ManubarNonGovOrgPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 6, -1, 110));

        SplitPaneDon.setLeftComponent(ManubarNonGovOrgPanel);

        WorkAreaNonGovOrgPanel.setPreferredSize(new java.awt.Dimension(1000, 700));

        javax.swing.GroupLayout WorkAreaNonGovOrgPanelLayout = new javax.swing.GroupLayout(WorkAreaNonGovOrgPanel);
        WorkAreaNonGovOrgPanel.setLayout(WorkAreaNonGovOrgPanelLayout);
        WorkAreaNonGovOrgPanelLayout.setHorizontalGroup(
            WorkAreaNonGovOrgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelImg, javax.swing.GroupLayout.DEFAULT_SIZE, 1005, Short.MAX_VALUE)
        );
        WorkAreaNonGovOrgPanelLayout.setVerticalGroup(
            WorkAreaNonGovOrgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WorkAreaNonGovOrgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelImg, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE))
        );

        SplitPaneDon.setRightComponent(WorkAreaNonGovOrgPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPaneDon, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPaneDon, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
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
         
    private void btnManagevolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagevolActionPerformed
        // TODO add your handling code here:
        ManageVolunteerPanel objViewDon = new ManageVolunteerPanel(userProcessContainer,ecosystem,userAcc, jp, jsp);
        SplitPaneDon.setRightComponent(objViewDon);
    }//GEN-LAST:event_btnManagevolActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        // TODO add your handling code here:
        NGOProfilePanel objNGOProf = new NGOProfilePanel(userProcessContainer,ecosystem,userAcc);
        SplitPaneDon.setRightComponent(objNGOProf);
    }//GEN-LAST:event_btnProfileActionPerformed

    private void lbllogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbllogoutMousePressed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            MainJFrame mjf = new MainJFrame();
            mjf.logout(userProcessContainer, jp, jsp);
        } catch (IOException ex) {
            Logger.getLogger(NGOWorkAreaPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbllogoutMousePressed

    public void setBG() {
        try {
            LabelImg.setMinimumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setPreferredSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setMaximumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));

            Image img = ImageIO.read(getClass().getResource("/Images/background2.png"));

            Image newimg = img.getScaledInstance(1450, userProcessContainer.getHeight(), java.awt.Image.SCALE_SMOOTH);
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
            Logger.getLogger(NGOWorkAreaPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImg;
    private javax.swing.JPanel ManubarNonGovOrgPanel;
    private javax.swing.JSplitPane SplitPaneDon;
    private javax.swing.JPanel WorkAreaNonGovOrgPanel;
    private javax.swing.JButton btnManagevol;
    private javax.swing.JButton btnProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblWelcomemsg;
    private javax.swing.JLabel lbllogout;
    private javax.swing.JLabel logoImage;
    // End of variables declaration//GEN-END:variables
}
