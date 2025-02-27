/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.RequestorRole;

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
import userinterface.FCAdminRole.ViewPantryItemsPanel;
import userinterface.MainJFrame;
import userinterface.NGORole.NGOWorkAreaPanel;

/**
 *
 * @author lokavarapusatishkumar
 */
public class RequestorAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestorAreaJPanel
     */
    
     private JPanel userProcessContainer;

    private UserAccount userAccount;
    EcoSystem ecosystem;
    JPanel jp;
    JSplitPane jsp ;
    
     public RequestorAreaJPanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount account,JPanel jp, JSplitPane jsp) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;    
        this.userAccount = account;
        this.ecosystem = ecosystem;
        this.jp = jp;
        this.jsp = jsp;
       // lblwelname.setText(account.getEmployee().getName());
        setBG();
        setLogo();
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

        SplitPaneReq = new javax.swing.JSplitPane();
        MenubarPanel = new javax.swing.JPanel();
        btnFoodReq = new javax.swing.JButton();
        btnMyProfile = new javax.swing.JButton();
        btnCheckStatus = new javax.swing.JButton();
        lblReqWelcome = new javax.swing.JLabel();
        lblReqlogout = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        Imagelogo = new javax.swing.JLabel();
        WorkAreaPanel = new javax.swing.JPanel();
        LabelImage = new javax.swing.JLabel();

        SplitPaneReq.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        MenubarPanel.setBackground(new java.awt.Color(255, 255, 255));
        MenubarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFoodReq.setBackground(new java.awt.Color(0, 153, 204));
        btnFoodReq.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnFoodReq.setText("Request Food");
        btnFoodReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoodReqActionPerformed(evt);
            }
        });
        MenubarPanel.add(btnFoodReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, -1));

        btnMyProfile.setBackground(new java.awt.Color(0, 153, 204));
        btnMyProfile.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnMyProfile.setText("My Profile");
        btnMyProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyProfileActionPerformed(evt);
            }
        });
        MenubarPanel.add(btnMyProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        btnCheckStatus.setBackground(new java.awt.Color(0, 153, 204));
        btnCheckStatus.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnCheckStatus.setText("Check Status");
        btnCheckStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckStatusActionPerformed(evt);
            }
        });
        MenubarPanel.add(btnCheckStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, -1, -1));

        lblReqWelcome.setFont(new java.awt.Font("Trebuchet MS", 1, 29)); // NOI18N
        lblReqWelcome.setForeground(new java.awt.Color(0, 153, 204));
        lblReqWelcome.setText("Welcome Requestor!");
        MenubarPanel.add(lblReqWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        lblReqlogout.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblReqlogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblReqlogoutMousePressed(evt);
            }
        });
        MenubarPanel.add(lblReqlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 40, 43, 41));

        jLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        MenubarPanel.add(jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(819, 46, -1, 57));
        MenubarPanel.add(Imagelogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 90));

        SplitPaneReq.setLeftComponent(MenubarPanel);

        WorkAreaPanel.setPreferredSize(new java.awt.Dimension(1000, 700));

        javax.swing.GroupLayout WorkAreaPanelLayout = new javax.swing.GroupLayout(WorkAreaPanel);
        WorkAreaPanel.setLayout(WorkAreaPanelLayout);
        WorkAreaPanelLayout.setHorizontalGroup(
            WorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelImage, javax.swing.GroupLayout.DEFAULT_SIZE, 1604, Short.MAX_VALUE)
        );
        WorkAreaPanelLayout.setVerticalGroup(
            WorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelImage, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
        );

        SplitPaneReq.setRightComponent(WorkAreaPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPaneReq, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPaneReq, javax.swing.GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

      public void setLogo() {
        try {
            Imagelogo.setMinimumSize(new Dimension(100, 100));
            Imagelogo.setPreferredSize(new Dimension(100, 100));
            Imagelogo.setMaximumSize(new Dimension(100, 100));

            Image img = ImageIO.read(getClass().getResource("/Images/cmnlogo.jpeg"));

            Image newimg = img.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
            Imagelogo.setIcon(new ImageIcon(newimg));
        } catch (IOException ex) {
            Logger.getLogger(DonorProfilePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void setBG() {
        try {
            LabelImage.setMinimumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImage.setPreferredSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImage.setMaximumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));

            Image img = ImageIO.read(getClass().getResource("/Images/background2.png"));

            Image newimg = img.getScaledInstance(1650, userProcessContainer.getHeight(), java.awt.Image.SCALE_SMOOTH);
            LabelImage.setIcon(new ImageIcon(newimg));
        } catch (IOException ex) {
            Logger.getLogger(RequestorAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
      public void logoutlogo() {

        try {
           
            lblReqlogout.setMinimumSize(new Dimension(50,60));
            lblReqlogout.setPreferredSize(new Dimension(50,60));
            lblReqlogout.setMaximumSize(new Dimension(50,60));
            
            Image img1 = ImageIO.read(getClass().getResource("/Images/signout.png"));
            Image newimg1 = img1.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);

            lblReqlogout.setIcon(new ImageIcon(newimg1));
            
            
        } catch (IOException ex) {
            Logger.getLogger(RequestorAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    private void btnFoodReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoodReqActionPerformed
        // TODO add your handling code here:
        RequestFoodPanel objReq = new RequestFoodPanel(userProcessContainer,ecosystem,userAccount);
        SplitPaneReq.setRightComponent(objReq);
    }//GEN-LAST:event_btnFoodReqActionPerformed

    private void btnMyProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyProfileActionPerformed
        // TODO add your handling code here:
        RequestorProfilePanel objReqProf = new RequestorProfilePanel(userProcessContainer,ecosystem,userAccount);
        SplitPaneReq.setRightComponent(objReqProf);
    }//GEN-LAST:event_btnMyProfileActionPerformed

    private void btnCheckStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckStatusActionPerformed
        // TODO add your handling code here:
        ReqorderStatusPanel objReqstatus = new ReqorderStatusPanel(userProcessContainer,ecosystem,userAccount);
        SplitPaneReq.setRightComponent(objReqstatus);
    }//GEN-LAST:event_btnCheckStatusActionPerformed

    private void lblReqlogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReqlogoutMousePressed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            MainJFrame mjf = new MainJFrame();
            mjf.logout(userProcessContainer, jp, jsp);
        } catch (IOException ex) {
            Logger.getLogger(RequestorAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblReqlogoutMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagelogo;
    private javax.swing.JLabel LabelImage;
    private javax.swing.JPanel MenubarPanel;
    private javax.swing.JSplitPane SplitPaneReq;
    private javax.swing.JPanel WorkAreaPanel;
    private javax.swing.JButton btnCheckStatus;
    private javax.swing.JButton btnFoodReq;
    private javax.swing.JButton btnMyProfile;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel lblReqWelcome;
    private javax.swing.JLabel lblReqlogout;
    // End of variables declaration//GEN-END:variables
}
