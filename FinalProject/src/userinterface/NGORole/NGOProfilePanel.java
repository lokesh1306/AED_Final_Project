/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NGORole;

import Business.EcoSystem;
import Business.NonGovtOrg.NonGovtOrg;
import Business.NonGovtOrg.NonGovtOrgDirectory;
import Business.NonGovtOrgVolunteer.NGOVolunteerDirectory;
import Business.UserAccount.UserAccount;
import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.DonorRole.DonorProfilePanel;

/**
 *
 * @author sivanagendrakanakababumarada
 */
public class NGOProfilePanel extends javax.swing.JPanel {

    /**
     * Creates new form NGOProfilePanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    NGOVolunteerDirectory vold;
    UserAccount userAcc;
    NonGovtOrgDirectory ngod;
    String NGOUname;
    String ngoAname;
    boolean validateName = false, validatePhone =false, validateAdd =false, validate; 
    public NGOProfilePanel(JPanel userProcessContainer,EcoSystem ecosystem,UserAccount userAcc) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAcc = userAcc;
        ngoAname=userAcc.getEmployee().getName();
        NGOUname = userAcc.getUsername();
        btnNonGovOrgSubmit.setVisible(false);
        btnNonGovOrgCancel.setVisible(false);
        lblNonGovOrgpwd1.setVisible(false);
        txtNonGovOrgpwd1.setVisible(false);
        populateFields();
        setBG();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNGOProTitle = new javax.swing.JLabel();
        lblNonGovOrgName = new javax.swing.JLabel();
        txtNonGovOrgname = new javax.swing.JTextField();
        lblNonGovOrgPhone = new javax.swing.JLabel();
        txtNonGovOrgPhone = new javax.swing.JTextField();
        lblNonGovOrgadd = new javax.swing.JLabel();
        txtNonGovOrgadd = new javax.swing.JTextField();
        lblNonGovOrgcity = new javax.swing.JLabel();
        txtNonGovOrgcity = new javax.swing.JTextField();
        lblNonGovOrgstate = new javax.swing.JLabel();
        txtNonGovOrgstate = new javax.swing.JTextField();
        lblNonGovOrgzip = new javax.swing.JLabel();
        txtNonGovOrgzip = new javax.swing.JTextField();
        lblNonGovOrgagent = new javax.swing.JLabel();
        txtNonGovOrgAgent = new javax.swing.JTextField();
        btnNonGovOrgSubmit = new javax.swing.JButton();
        btnNonGovOrgEdit = new javax.swing.JButton();
        lblNonGovOrgUname = new javax.swing.JLabel();
        txtNonGovOrguname = new javax.swing.JTextField();
        lblNonGovOrgpwd = new javax.swing.JLabel();
        txtNonGovOrgpwd = new javax.swing.JTextField();
        lblNonGovOrgpwd1 = new javax.swing.JLabel();
        txtNonGovOrgpwd1 = new javax.swing.JTextField();
        lblNonGovOrgName1 = new javax.swing.JLabel();
        lblNonGovOrgphone1 = new javax.swing.JLabel();
        lblNonGovOrgadd1 = new javax.swing.JLabel();
        lblNonGovOrgcity1 = new javax.swing.JLabel();
        lblNonGovOrgstate1 = new javax.swing.JLabel();
        lblNonGovOrgzip1 = new javax.swing.JLabel();
        lblNonGovOrgAgent1 = new javax.swing.JLabel();
        lblNonGovOrgname1 = new javax.swing.JLabel();
        lblNonGovOrgpwd2 = new javax.swing.JLabel();
        lblNonGovOrgpwd3 = new javax.swing.JLabel();
        btnNonGovOrgCancel = new javax.swing.JButton();
        LabelImage = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNGOProTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 29)); // NOI18N
        lblNGOProTitle.setForeground(new java.awt.Color(0, 153, 204));
        lblNGOProTitle.setText("My Profile");
        add(lblNGOProTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 23, -1, -1));

        lblNonGovOrgName.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblNonGovOrgName.setText("Name:");
        add(lblNonGovOrgName, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 81, -1, -1));

        txtNonGovOrgname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtNonGovOrgname.setPreferredSize(new java.awt.Dimension(150, 25));
        txtNonGovOrgname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNonGovOrgnameFocusLost(evt);
            }
        });
        add(txtNonGovOrgname, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 77, 137, -1));

        lblNonGovOrgPhone.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblNonGovOrgPhone.setText("Phone Number:");
        add(lblNonGovOrgPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 127, -1, -1));

        txtNonGovOrgPhone.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtNonGovOrgPhone.setPreferredSize(new java.awt.Dimension(150, 25));
        txtNonGovOrgPhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNonGovOrgPhoneFocusLost(evt);
            }
        });
        add(txtNonGovOrgPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 123, 137, -1));

        lblNonGovOrgadd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblNonGovOrgadd.setText("Address:");
        add(lblNonGovOrgadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 170, -1, -1));

        txtNonGovOrgadd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtNonGovOrgadd.setPreferredSize(new java.awt.Dimension(150, 25));
        txtNonGovOrgadd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNonGovOrgaddFocusLost(evt);
            }
        });
        add(txtNonGovOrgadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 166, 137, -1));

        lblNonGovOrgcity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblNonGovOrgcity.setText("City:");
        add(lblNonGovOrgcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 213, -1, -1));

        txtNonGovOrgcity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtNonGovOrgcity.setPreferredSize(new java.awt.Dimension(150, 25));
        txtNonGovOrgcity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNonGovOrgcityFocusLost(evt);
            }
        });
        add(txtNonGovOrgcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 209, 137, -1));

        lblNonGovOrgstate.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblNonGovOrgstate.setText("State:");
        add(lblNonGovOrgstate, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 256, -1, -1));

        txtNonGovOrgstate.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtNonGovOrgstate.setPreferredSize(new java.awt.Dimension(150, 25));
        txtNonGovOrgstate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNonGovOrgstateFocusLost(evt);
            }
        });
        add(txtNonGovOrgstate, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 252, 137, -1));

        lblNonGovOrgzip.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblNonGovOrgzip.setText("Zip:");
        add(lblNonGovOrgzip, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, -1, -1));

        txtNonGovOrgzip.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtNonGovOrgzip.setPreferredSize(new java.awt.Dimension(150, 25));
        txtNonGovOrgzip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNonGovOrgzipFocusLost(evt);
            }
        });
        add(txtNonGovOrgzip, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 295, 137, -1));

        lblNonGovOrgagent.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblNonGovOrgagent.setText("NGO Agent Name:");
        add(lblNonGovOrgagent, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        txtNonGovOrgAgent.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtNonGovOrgAgent.setPreferredSize(new java.awt.Dimension(150, 25));
        txtNonGovOrgAgent.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNonGovOrgAgentFocusLost(evt);
            }
        });
        add(txtNonGovOrgAgent, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 338, 137, -1));

        btnNonGovOrgSubmit.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnNonGovOrgSubmit.setText("Submit");
        btnNonGovOrgSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNonGovOrgSubmitActionPerformed(evt);
            }
        });
        add(btnNonGovOrgSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 510, -1, -1));

        btnNonGovOrgEdit.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnNonGovOrgEdit.setText("Edit Profile");
        btnNonGovOrgEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNonGovOrgEditActionPerformed(evt);
            }
        });
        add(btnNonGovOrgEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, -1, -1));

        lblNonGovOrgUname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblNonGovOrgUname.setText("NGO Agent Username:");
        add(lblNonGovOrgUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        txtNonGovOrguname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtNonGovOrguname.setPreferredSize(new java.awt.Dimension(150, 25));
        txtNonGovOrguname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNonGovOrgunameFocusLost(evt);
            }
        });
        add(txtNonGovOrguname, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 381, 137, -1));

        lblNonGovOrgpwd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblNonGovOrgpwd.setText("Password:");
        add(lblNonGovOrgpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 428, -1, -1));

        txtNonGovOrgpwd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtNonGovOrgpwd.setPreferredSize(new java.awt.Dimension(150, 25));
        txtNonGovOrgpwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNonGovOrgpwdFocusLost(evt);
            }
        });
        add(txtNonGovOrgpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 424, 137, -1));

        lblNonGovOrgpwd1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblNonGovOrgpwd1.setText("Confirm Password:");
        add(lblNonGovOrgpwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 471, -1, -1));

        txtNonGovOrgpwd1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtNonGovOrgpwd1.setPreferredSize(new java.awt.Dimension(150, 25));
        txtNonGovOrgpwd1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNonGovOrgpwd1FocusLost(evt);
            }
        });
        txtNonGovOrgpwd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNonGovOrgpwd1ActionPerformed(evt);
            }
        });
        add(txtNonGovOrgpwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 467, 137, -1));

        lblNonGovOrgName1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblNonGovOrgName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 76, -1, -1));

        lblNonGovOrgphone1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblNonGovOrgphone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 123, -1, -1));

        lblNonGovOrgadd1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblNonGovOrgadd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 166, -1, -1));

        lblNonGovOrgcity1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblNonGovOrgcity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 209, -1, -1));

        lblNonGovOrgstate1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblNonGovOrgstate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 252, -1, -1));

        lblNonGovOrgzip1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblNonGovOrgzip1, new org.netbeans.lib.awtextra.AbsoluteConstraints(606, 295, -1, -1));

        lblNonGovOrgAgent1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblNonGovOrgAgent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 338, -1, -1));

        lblNonGovOrgname1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblNonGovOrgname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 381, -1, -1));

        lblNonGovOrgpwd2.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblNonGovOrgpwd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(606, 424, -1, -1));

        lblNonGovOrgpwd3.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblNonGovOrgpwd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(606, 467, -1, -1));

        btnNonGovOrgCancel.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnNonGovOrgCancel.setText("Cancel");
        btnNonGovOrgCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNonGovOrgCancelActionPerformed(evt);
            }
        });
        add(btnNonGovOrgCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, -1, -1));
        add(LabelImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, -4, 1690, 900));
    }// </editor-fold>//GEN-END:initComponents

    public void setBG() {
        try {
            LabelImage.setMinimumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImage.setPreferredSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImage.setMaximumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));

            Image img = ImageIO.read(getClass().getResource("/Images/background2.png"));

            Image newimg = img.getScaledInstance(1750, 950, java.awt.Image.SCALE_SMOOTH);
            LabelImage.setIcon(new ImageIcon(newimg));
        } catch (IOException ex) {
            Logger.getLogger(NGOProfilePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void txtNonGovOrgnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNonGovOrgnameFocusLost
        // TODO add your handling code here:
        if(!(txtNonGovOrgname.getText().matches("^[a-zA-Z]*$"))){
            lblNonGovOrgName1.setText("Invalid input. Please enter only alphabets");
        }
        else{
            lblNonGovOrgName1.setText("");
        }
    }//GEN-LAST:event_txtNonGovOrgnameFocusLost

    private void txtNonGovOrgPhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNonGovOrgPhoneFocusLost
        // TODO add your handling code here:
        if(!(txtNonGovOrgPhone.getText().matches("^[0-9]*$")) || !(txtNonGovOrgPhone.getText().length()==10)) {
            lblNonGovOrgphone1.setText("Please enter a valid phone number");
        }
        else{
            lblNonGovOrgphone1.setText("");

        }
    }//GEN-LAST:event_txtNonGovOrgPhoneFocusLost

    private void txtNonGovOrgaddFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNonGovOrgaddFocusLost
        // TODO add your handling code here:
        if(!(txtNonGovOrgadd.getText().matches("^[a-zA-Z]*$"))){
            lblNonGovOrgadd1.setText("Invalid input. Please enter only alphabets");
        }
        else{
            lblNonGovOrgadd1.setText("");
        }
    }//GEN-LAST:event_txtNonGovOrgaddFocusLost

    private void txtNonGovOrgcityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNonGovOrgcityFocusLost
        // TODO add your handling code here:
        if(!(txtNonGovOrgcity.getText().matches("^[a-zA-Z]*$"))){
            lblNonGovOrgcity1.setText("Invalid input. Please enter only alphabets");
        }
        else{
            lblNonGovOrgcity1.setText("");
        }
    }//GEN-LAST:event_txtNonGovOrgcityFocusLost

    private void txtNonGovOrgstateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNonGovOrgstateFocusLost
        // TODO add your handling code here:
        if(!(txtNonGovOrgstate.getText().matches("^[a-zA-Z]*$"))){
            lblNonGovOrgstate1.setText("Invalid input. Please enter only alphabets");
        }
        else{
            lblNonGovOrgstate1.setText("");
        }
    }//GEN-LAST:event_txtNonGovOrgstateFocusLost

    private void txtNonGovOrgzipFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNonGovOrgzipFocusLost
        // TODO add your handling code here:
        if((txtNonGovOrgzip.getText().matches("^[a-zA-Z]*$"))){
            lblNonGovOrgzip1.setText("Invalid input. Please enter only numbers");
        }
        else{
            lblNonGovOrgzip1.setText("");
        }
    }//GEN-LAST:event_txtNonGovOrgzipFocusLost

    private void txtNonGovOrgAgentFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNonGovOrgAgentFocusLost
        // TODO add your handling code here:
        if ((!txtNonGovOrgAgent.getText().isEmpty()) && !txtNonGovOrgAgent.getText().matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")) {
            lblNonGovOrgAgent1.setText( "Please Provide Valid Email Address !!");
        }
        else{
            lblNonGovOrgAgent1.setText("");
        }
    }//GEN-LAST:event_txtNonGovOrgAgentFocusLost

    private void btnNonGovOrgSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNonGovOrgSubmitActionPerformed
        // TODO add your handling code here:
        if(!nullCheck()){
            ArrayList<NonGovtOrg> nogList = ecosystem.getNgoDir().getNgoList();
            for(NonGovtOrg d: nogList)
            {
                if(d.getNgoAccount().getUsername().equals(NGOUname))
                {
                    d.setNgoName(txtNonGovOrgname.getText());
                    d.setNgoPhno(txtNonGovOrgPhone.getText());
                    d.setNgoAgent(txtNonGovOrgAgent.getText());
                    d.setNgoAddress(txtNonGovOrgadd.getText());
                    d.setNgoCity(txtNonGovOrgcity.getText());
                    d.setNgoState(txtNonGovOrgstate.getText());
                    d.setNgoZipcode(txtNonGovOrgzip.getText());
                    UserAccount nogAccount=new UserAccount();
                    nogAccount.setUsername(txtNonGovOrguname.getText());
                    nogAccount.setPassword(txtNonGovOrgpwd.getText());
                }
            }
            // ecosystem.setFCWDirectory(fcWarehouseList);
            ngod = ecosystem.getNgoDir();
            ecosystem.setNgoDir(ngod);
            JOptionPane.showMessageDialog(this, "Profile updated successfully");
            disableFields();
        }
        else{
            JOptionPane.showMessageDialog(this, "All fields are mandatory!");
        }
    }//GEN-LAST:event_btnNonGovOrgSubmitActionPerformed

    private void btnNonGovOrgEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNonGovOrgEditActionPerformed
        // TODO add your handling code here:
        enablefields();
    }//GEN-LAST:event_btnNonGovOrgEditActionPerformed

    private void txtNonGovOrgunameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNonGovOrgunameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNonGovOrgunameFocusLost

    private void txtNonGovOrgpwdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNonGovOrgpwdFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNonGovOrgpwdFocusLost

    private void txtNonGovOrgpwd1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNonGovOrgpwd1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNonGovOrgpwd1FocusLost

    private void txtNonGovOrgpwd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNonGovOrgpwd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNonGovOrgpwd1ActionPerformed

    private void btnNonGovOrgCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNonGovOrgCancelActionPerformed
        // TODO add your handling code here:
        disableFields();
    }//GEN-LAST:event_btnNonGovOrgCancelActionPerformed

    private void populateFields() {
        for(NonGovtOrg d: ecosystem.getNgoDir().getNgoList()){
            if(d.getNgoAgent().equals(ngoAname)){
            txtNonGovOrgname.setText(d.getNgoName());
            txtNonGovOrgname.setEnabled(false);
            txtNonGovOrgPhone.setText(d.getNgoPhno());
            txtNonGovOrgPhone.setEnabled(false);
            txtNonGovOrgAgent.setText(d.getNgoAgent());
            txtNonGovOrgAgent.setEnabled(false);
            txtNonGovOrgadd.setText(d.getNgoAddress());
            txtNonGovOrgadd.setEnabled(false);
            txtNonGovOrgcity.setText(d.getNgoCity());
            txtNonGovOrgcity.setEnabled(false);
            txtNonGovOrgstate.setText(d.getNgoState());
            txtNonGovOrgstate.setEnabled(false);
            txtNonGovOrgzip.setText(d.getNgoZipcode());
            txtNonGovOrgzip.setEnabled(false);
            txtNonGovOrguname.setText(d.getNgoAccount().getUsername());
            txtNonGovOrguname.setEnabled(false);
            txtNonGovOrgpwd.setText(d.getNgoAccount().getPassword());
            txtNonGovOrgpwd.setEnabled(false);
            }
        }
    }
    
    private void enablefields() {
        txtNonGovOrgname.setEnabled(true);
        txtNonGovOrgPhone.setEnabled(true);
        txtNonGovOrgAgent.setEnabled(true);
        txtNonGovOrgadd.setEnabled(true);
        txtNonGovOrgcity.setEnabled(true);
        txtNonGovOrgstate.setEnabled(true);
        txtNonGovOrgzip.setEnabled(true);
        txtNonGovOrguname.setEnabled(true);
        txtNonGovOrgpwd.setEnabled(true);
        btnNonGovOrgSubmit.setVisible(true);
        btnNonGovOrgCancel.setVisible(true);
        lblNonGovOrgpwd1.setVisible(true);
        txtNonGovOrgpwd1.setVisible(true);
    }
    
    private void disableFields() {
        txtNonGovOrgname.setEnabled(false);
        txtNonGovOrgPhone.setEnabled(false);
        txtNonGovOrgAgent.setEnabled(false);
        txtNonGovOrgadd.setEnabled(false);
        txtNonGovOrgcity.setEnabled(false);
        txtNonGovOrgstate.setEnabled(false);
        txtNonGovOrgzip.setEnabled(false);
        txtNonGovOrguname.setEnabled(false);
        txtNonGovOrgpwd.setEnabled(false);
        btnNonGovOrgSubmit.setVisible(false);
        btnNonGovOrgCancel.setVisible(false);
        lblNonGovOrgpwd1.setVisible(false);
        txtNonGovOrgpwd1.setVisible(false);
        lblNonGovOrgName1.setText("");
        lblNonGovOrgphone1.setText("");
        lblNonGovOrgAgent1.setText("");
        lblNonGovOrgadd1.setText("");
        lblNonGovOrgcity1.setText("");
        lblNonGovOrgstate1.setText("");
        lblNonGovOrgzip1.setText("");
        lblNonGovOrgname1.setText("");
        lblNonGovOrgpwd2.setText("");
        lblNonGovOrgpwd3.setText("");
    }
 
    private boolean nullCheck() {
        if(txtNonGovOrgname.getText().length()!=0 && txtNonGovOrgPhone.getText().length()!=0 && txtNonGovOrgAgent.getText().length()!=0 
                && txtNonGovOrgadd.getText().length()!=0 && txtNonGovOrgcity.getText().length()!=0 && txtNonGovOrgstate.getText().length()!=0
                && txtNonGovOrgzip.getText().length()!=0 && txtNonGovOrguname.getText().length()!=0 && txtNonGovOrgpwd.getText().length()!=0
                && txtNonGovOrgpwd1.getText().length()!=0 )
        {
            return false;
        }
        else return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImage;
    private javax.swing.JButton btnNonGovOrgCancel;
    private javax.swing.JButton btnNonGovOrgEdit;
    private javax.swing.JButton btnNonGovOrgSubmit;
    private javax.swing.JLabel lblNGOProTitle;
    private javax.swing.JLabel lblNonGovOrgAgent1;
    private javax.swing.JLabel lblNonGovOrgName;
    private javax.swing.JLabel lblNonGovOrgName1;
    private javax.swing.JLabel lblNonGovOrgPhone;
    private javax.swing.JLabel lblNonGovOrgUname;
    private javax.swing.JLabel lblNonGovOrgadd;
    private javax.swing.JLabel lblNonGovOrgadd1;
    private javax.swing.JLabel lblNonGovOrgagent;
    private javax.swing.JLabel lblNonGovOrgcity;
    private javax.swing.JLabel lblNonGovOrgcity1;
    private javax.swing.JLabel lblNonGovOrgname1;
    private javax.swing.JLabel lblNonGovOrgphone1;
    private javax.swing.JLabel lblNonGovOrgpwd;
    private javax.swing.JLabel lblNonGovOrgpwd1;
    private javax.swing.JLabel lblNonGovOrgpwd2;
    private javax.swing.JLabel lblNonGovOrgpwd3;
    private javax.swing.JLabel lblNonGovOrgstate;
    private javax.swing.JLabel lblNonGovOrgstate1;
    private javax.swing.JLabel lblNonGovOrgzip;
    private javax.swing.JLabel lblNonGovOrgzip1;
    private javax.swing.JTextField txtNonGovOrgAgent;
    private javax.swing.JTextField txtNonGovOrgPhone;
    private javax.swing.JTextField txtNonGovOrgadd;
    private javax.swing.JTextField txtNonGovOrgcity;
    private javax.swing.JTextField txtNonGovOrgname;
    private javax.swing.JTextField txtNonGovOrgpwd;
    private javax.swing.JTextField txtNonGovOrgpwd1;
    private javax.swing.JTextField txtNonGovOrgstate;
    private javax.swing.JTextField txtNonGovOrguname;
    private javax.swing.JTextField txtNonGovOrgzip;
    // End of variables declaration//GEN-END:variables
}
