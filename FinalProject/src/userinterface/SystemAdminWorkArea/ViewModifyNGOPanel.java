/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Worker.Worker;
import Business.FoodWarehouse.FoodWarehouse;
import Business.NonGovtOrg.NonGovtOrg;
import Business.NonGovtOrg.NonGovtOrgDirectory;
import Business.UserAccount.UserAccount;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import userinterface.DonorRole.DonorProfilePanel;

/**
 *
 * @author admin
 */
public class ViewModifyNGOPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewModifyNGOPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    NonGovtOrgDirectory ngod;

    public ViewModifyNGOPanel(JPanel userProcessContainer, EcoSystem ecosystem) throws IOException {
        initComponents();

//        imageLbl.setMinimumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
//        imageLbl.setPreferredSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
//        imageLbl.setMaximumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
//
//        Image img = ImageIO.read(getClass().getResource("/Images/background2.png"));
//
//        Image newimg = img.getScaledInstance(userProcessContainer.getWidth(), userProcessContainer.getHeight(), java.awt.Image.SCALE_SMOOTH);
//        imageLbl.setIcon(new ImageIcon(newimg));
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        if (ecosystem.getNgoDir() == null) {
            ecosystem.setNgoDir(new NonGovtOrgDirectory());
        }
        populatengotable();
        txtNonGovtOrguname.setEnabled(false);
        setBG();
        makeTableTransparent();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAddNonGovtOrgTitle = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        tblNonGovtOrg = new javax.swing.JTable();
        btnNonGovtOrgDelete = new javax.swing.JButton();
        btnNonGovtOrgEdit = new javax.swing.JButton();
        jPanel = new javax.swing.JPanel();
        lblNonGovtOrgname = new javax.swing.JLabel();
        txtNonGovtOrgname = new javax.swing.JTextField();
        lblNonGovtOrgPhone = new javax.swing.JLabel();
        txtNonGovtOrgPhone = new javax.swing.JTextField();
        lblNonGovtOrgAdd = new javax.swing.JLabel();
        txtNonGovtOrgAdd = new javax.swing.JTextField();
        lblNonGovtOrgCity = new javax.swing.JLabel();
        txtNonGovtOrgCity = new javax.swing.JTextField();
        lblNonGovtOrgState = new javax.swing.JLabel();
        txtNonGovtOrgState = new javax.swing.JTextField();
        lblNonGovtOrgZip = new javax.swing.JLabel();
        txtNonGovtOrgZip = new javax.swing.JTextField();
        lblNonGovtOrgAgent = new javax.swing.JLabel();
        txtNonGovtOrgAgent = new javax.swing.JTextField();
        lblNonGovtOrguname = new javax.swing.JLabel();
        txtNonGovtOrguname = new javax.swing.JTextField();
        lblNonGovtOrgpwd = new javax.swing.JLabel();
        txtNonGovtOrgpwd = new javax.swing.JTextField();
        btnNonGovtOrgUpdate = new javax.swing.JButton();
        lblNonGovtOrgname1 = new javax.swing.JLabel();
        lblNonGovtOrgPhone1 = new javax.swing.JLabel();
        lblNonGovtOrgAdd1 = new javax.swing.JLabel();
        lbNonGovtOrgCity1 = new javax.swing.JLabel();
        lblNonGovtOrgState1 = new javax.swing.JLabel();
        lblNonGovtOrgZip1 = new javax.swing.JLabel();
        lblNonGovtOrgAgent1 = new javax.swing.JLabel();
        lblNonGovtOrguname1 = new javax.swing.JLabel();
        lblNonGovtOrgpwd1 = new javax.swing.JLabel();
        lblNonGovtOrgid1 = new javax.swing.JLabel();
        btnNonGovtOrgCancel = new javax.swing.JButton();
        LabelImage = new javax.swing.JLabel();
        lblNonGovtOrgid = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAddNonGovtOrgTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 29)); // NOI18N
        lblAddNonGovtOrgTitle.setForeground(new java.awt.Color(0, 153, 204));
        lblAddNonGovtOrgTitle.setText("NGO Details");
        add(lblAddNonGovtOrgTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 190, 40));

        tblNonGovtOrg.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        tblNonGovtOrg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NGO ID", "Name", "Agent Name", "Phone Number", "Address", "City", "State", "Zip"
            }
        ));
        tblNonGovtOrg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblNonGovtOrgMousePressed(evt);
            }
        });
        jScrollPane.setViewportView(tblNonGovtOrg);

        add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 820, 130));

        btnNonGovtOrgDelete.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnNonGovtOrgDelete.setText("Delete");
        btnNonGovtOrgDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNonGovtOrgDeleteActionPerformed(evt);
            }
        });
        add(btnNonGovtOrgDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 200, 92, -1));

        btnNonGovtOrgEdit.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnNonGovtOrgEdit.setText("Edit");
        btnNonGovtOrgEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNonGovtOrgEditActionPerformed(evt);
            }
        });
        add(btnNonGovtOrgEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, 92, -1));

        jPanel.setOpaque(false);
        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNonGovtOrgname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblNonGovtOrgname.setText("NGO Name:");
        jPanel.add(lblNonGovtOrgname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        txtNonGovtOrgname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtNonGovtOrgname.setPreferredSize(new java.awt.Dimension(150, 25));
        txtNonGovtOrgname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNonGovtOrgnameFocusLost(evt);
            }
        });
        txtNonGovtOrgname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNonGovtOrgnameKeyReleased(evt);
            }
        });
        jPanel.add(txtNonGovtOrgname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 137, -1));

        lblNonGovtOrgPhone.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblNonGovtOrgPhone.setText("Phone Number:");
        jPanel.add(lblNonGovtOrgPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        txtNonGovtOrgPhone.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtNonGovtOrgPhone.setPreferredSize(new java.awt.Dimension(150, 25));
        txtNonGovtOrgPhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNonGovtOrgPhoneFocusLost(evt);
            }
        });
        txtNonGovtOrgPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNonGovtOrgPhoneKeyReleased(evt);
            }
        });
        jPanel.add(txtNonGovtOrgPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 137, -1));

        lblNonGovtOrgAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblNonGovtOrgAdd.setText("NGO Address:");
        jPanel.add(lblNonGovtOrgAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        txtNonGovtOrgAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtNonGovtOrgAdd.setPreferredSize(new java.awt.Dimension(150, 25));
        jPanel.add(txtNonGovtOrgAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 137, -1));

        lblNonGovtOrgCity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblNonGovtOrgCity.setText("City :");
        jPanel.add(lblNonGovtOrgCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        txtNonGovtOrgCity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtNonGovtOrgCity.setPreferredSize(new java.awt.Dimension(150, 25));
        jPanel.add(txtNonGovtOrgCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 137, -1));

        lblNonGovtOrgState.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblNonGovtOrgState.setText("State :");
        jPanel.add(lblNonGovtOrgState, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        txtNonGovtOrgState.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtNonGovtOrgState.setPreferredSize(new java.awt.Dimension(150, 25));
        jPanel.add(txtNonGovtOrgState, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 137, -1));

        lblNonGovtOrgZip.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblNonGovtOrgZip.setText("Zip:");
        jPanel.add(lblNonGovtOrgZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        txtNonGovtOrgZip.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtNonGovtOrgZip.setPreferredSize(new java.awt.Dimension(150, 25));
        txtNonGovtOrgZip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNonGovtOrgZipFocusLost(evt);
            }
        });
        jPanel.add(txtNonGovtOrgZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 137, -1));

        lblNonGovtOrgAgent.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblNonGovtOrgAgent.setText("NGO Agent Name:");
        jPanel.add(lblNonGovtOrgAgent, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        txtNonGovtOrgAgent.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtNonGovtOrgAgent.setPreferredSize(new java.awt.Dimension(150, 25));
        txtNonGovtOrgAgent.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNonGovtOrgAgentFocusLost(evt);
            }
        });
        jPanel.add(txtNonGovtOrgAgent, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 137, -1));

        lblNonGovtOrguname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblNonGovtOrguname.setText("NGO Agent Username :");
        jPanel.add(lblNonGovtOrguname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        txtNonGovtOrguname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtNonGovtOrguname.setPreferredSize(new java.awt.Dimension(150, 25));
        jPanel.add(txtNonGovtOrguname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 137, -1));

        lblNonGovtOrgpwd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblNonGovtOrgpwd.setText("Password :");
        jPanel.add(lblNonGovtOrgpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, 25));

        txtNonGovtOrgpwd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtNonGovtOrgpwd.setPreferredSize(new java.awt.Dimension(150, 25));
        jPanel.add(txtNonGovtOrgpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 137, -1));

        btnNonGovtOrgUpdate.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnNonGovtOrgUpdate.setText("Update");
        btnNonGovtOrgUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNonGovtOrgUpdateActionPerformed(evt);
            }
        });
        jPanel.add(btnNonGovtOrgUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 92, -1));

        lblNonGovtOrgname1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jPanel.add(lblNonGovtOrgname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 58, 360, 20));

        lblNonGovtOrgPhone1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jPanel.add(lblNonGovtOrgPhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 98, 360, 20));

        lblNonGovtOrgAdd1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jPanel.add(lblNonGovtOrgAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 138, 360, 20));

        lbNonGovtOrgCity1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jPanel.add(lbNonGovtOrgCity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 178, 360, 20));

        lblNonGovtOrgState1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jPanel.add(lblNonGovtOrgState1, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 218, 360, 20));

        lblNonGovtOrgZip1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jPanel.add(lblNonGovtOrgZip1, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 246, 360, 20));

        lblNonGovtOrgAgent1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jPanel.add(lblNonGovtOrgAgent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 298, 360, 20));

        lblNonGovtOrguname1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jPanel.add(lblNonGovtOrguname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 338, 360, 20));

        lblNonGovtOrgpwd1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jPanel.add(lblNonGovtOrgpwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 378, 360, 20));

        lblNonGovtOrgid1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jPanel.add(lblNonGovtOrgid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 28, 150, 20));

        btnNonGovtOrgCancel.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnNonGovtOrgCancel.setText("Cancel");
        btnNonGovtOrgCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNonGovtOrgCancelActionPerformed(evt);
            }
        });
        jPanel.add(btnNonGovtOrgCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, -1, -1));

        add(jPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 660, -1));
        add(LabelImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 1490, 770));

        lblNonGovtOrgid.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblNonGovtOrgid.setText("NGO Id:");
        add(lblNonGovtOrgid, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    public void setBG() {
        try {
            LabelImage.setMinimumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImage.setPreferredSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImage.setMaximumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));

            Image img = ImageIO.read(getClass().getResource("/Images/background2.png"));

            Image newimg = img.getScaledInstance(1500, userProcessContainer.getHeight(), java.awt.Image.SCALE_SMOOTH);
            LabelImage.setIcon(new ImageIcon(newimg));
        } catch (IOException ex) {
            Logger.getLogger(DonorProfilePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void makeTableTransparent() {
        tblNonGovtOrg.setOpaque(false);
        ((DefaultTableCellRenderer) tblNonGovtOrg.getDefaultRenderer(Object.class)).setOpaque(false);
        tblNonGovtOrg.setShowGrid(false);
        jScrollPane.setOpaque(false);
        jScrollPane.getViewport().setOpaque(false);

        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.WHITE);

        for (int i = 0; i < tblNonGovtOrg.getModel().getColumnCount(); i++) {
            tblNonGovtOrg.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
    }

    private void btnNonGovtOrgDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNonGovtOrgDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblNonGovtOrg.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a record to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblNonGovtOrg.getModel();
        NonGovtOrg selectedNGO = (NonGovtOrg) model.getValueAt(selectedRowIndex, 0);
        ecosystem.getUserAccountDirectory().deleteUserAccount(
                ecosystem.getNgoDir().getNgoList().get(selectedRowIndex).getNgoAccount());
        ngod = ecosystem.getNgoDir();
        ngod.deleteNGO(selectedNGO);
        ecosystem.setNgoDir(ngod);
        Integer ngoCnt = ecosystem.getNgoCnt();
        ecosystem.setNgoCnt(ngoCnt - 1);
        JOptionPane.showMessageDialog(this, "NGO deleted Successfully");
        populatengotable();
        clearfields();
    }//GEN-LAST:event_btnNonGovtOrgDeleteActionPerformed

    private void btnNonGovtOrgEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNonGovtOrgEditActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblNonGovtOrg.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a record to Edit");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblNonGovtOrg.getModel();
        NonGovtOrg selectedNGO = (NonGovtOrg) model.getValueAt(selectedRowIndex, 0);
        lblNonGovtOrgid1.setText(selectedNGO.getNgoId());
        txtNonGovtOrgname.setText(selectedNGO.getNgoName());
        txtNonGovtOrgPhone.setText(selectedNGO.getNgoPhno());
        txtNonGovtOrgAdd.setText(selectedNGO.getNgoAddress());
        txtNonGovtOrgCity.setText(selectedNGO.getNgoCity());
        txtNonGovtOrgState.setText(selectedNGO.getNgoState());
        txtNonGovtOrgZip.setText(selectedNGO.getNgoZipcode());
        txtNonGovtOrgAgent.setText(selectedNGO.getNgoAgent());
        txtNonGovtOrguname.setText(selectedNGO.getNgoAccount().getUsername());
        txtNonGovtOrgpwd.setText(selectedNGO.getNgoAccount().getPassword());
    }//GEN-LAST:event_btnNonGovtOrgEditActionPerformed

    private void txtNonGovtOrgnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNonGovtOrgnameFocusLost
        // TODO add your handling code here:
        if (!(txtNonGovtOrgname.getText().matches("^[a-zA-Z]*$"))) {
            lblNonGovtOrgname1.setText("Invalid input. Please enter only alphabets");
        } else {
            lblNonGovtOrgname1.setText("");
        }
    }//GEN-LAST:event_txtNonGovtOrgnameFocusLost

    private void txtNonGovtOrgnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNonGovtOrgnameKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtNonGovtOrgnameKeyReleased

    private void txtNonGovtOrgPhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNonGovtOrgPhoneFocusLost
        // TODO add your handling code here:
        if (!(txtNonGovtOrgPhone.getText().matches("^[0-9]*$")) || !(txtNonGovtOrgPhone.getText().length() == 10)) {
            lblNonGovtOrgPhone1.setText("Please enter a valid phone number");
        } else {
            lblNonGovtOrgPhone1.setText("");

        }
    }//GEN-LAST:event_txtNonGovtOrgPhoneFocusLost

    private void txtNonGovtOrgPhoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNonGovtOrgPhoneKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtNonGovtOrgPhoneKeyReleased

    private void txtNonGovtOrgZipFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNonGovtOrgZipFocusLost
        // TODO add your handling code here:
        if ((txtNonGovtOrgZip.getText().matches("^[a-zA-Z]*$"))) {
            lblNonGovtOrgZip1.setText("Invalid input. Please enter only numbers");
        } else {
            lblNonGovtOrgZip1.setText("");
        }
    }//GEN-LAST:event_txtNonGovtOrgZipFocusLost

    private void txtNonGovtOrgAgentFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNonGovtOrgAgentFocusLost
        // TODO add your handling code here:
        if (!(txtNonGovtOrgAgent.getText().matches("^[a-zA-Z]*$"))) {
            lblNonGovtOrgAgent1.setText("Invalid input. Please enter only alphabets");
        } else {
            lblNonGovtOrgAgent1.setText("");
        }
    }//GEN-LAST:event_txtNonGovtOrgAgentFocusLost

    public boolean isValid(String test, String regex) {
//        String regex = "^[A-Za-z0-9]+";
        Pattern p = Pattern.compile(regex);

        if (test == null) {
            return false;
        }

        Matcher m = p.matcher(test);

        return m.matches();
    }

    private void btnNonGovtOrgUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNonGovtOrgUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblNonGovtOrg.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a record to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblNonGovtOrg.getModel();
        String NGOid = lblNonGovtOrgid1.getText();

        ArrayList<NonGovtOrg> nogList = ecosystem.getNgoDir().getNgoList();
        for (NonGovtOrg f : nogList) {
            if (f.getNgoId().equals(NGOid)) {

                String ngoName = txtNonGovtOrgname.getText();
                String phone = txtNonGovtOrgPhone.getText();

                String ngoCity = txtNonGovtOrgCity.getText();
                String ngoState = txtNonGovtOrgState.getText();
                String ngoZip = txtNonGovtOrgZip.getText();
                String ngoAgent = txtNonGovtOrgAgent.getText();
                String ngoUser = txtNonGovtOrguname.getText();
                String ngoPswd = txtNonGovtOrgpwd.getText();
                
                if (!isValid(ngoName, "^[A-Za-z]{3,}")) {
                    JOptionPane.showMessageDialog(this, "Please enter valid name");
                    return;
                }
                if (!isValid(phone, "[+]?[0-9]{10,13}")) {
                    JOptionPane.showMessageDialog(this, "Please enter valid phone number");
                    return;
                }
                if (!isValid(ngoCity, "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+){3,}")) {
                    JOptionPane.showMessageDialog(this, "Please enter valid city");
                    return;
                }
                if (!isValid(ngoState, "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+){2,}")) {
                    JOptionPane.showMessageDialog(this, "Please enter valid state");
                    return;
                }
                if (!isValid(ngoZip, "^[0-9]{5}(?:-[0-9]{4})?$")) {
                    JOptionPane.showMessageDialog(this, "Please enter valid zip");
                    return;
                }
                if (!isValid(ngoAgent, "^[A-Za-z]{3,}")) {
                    JOptionPane.showMessageDialog(this, "Please enter a valid name");
                    return;
                }
                if (!isValid(ngoUser, "^[a-zA-Z0-9._-]{6,}$")) {
                    JOptionPane.showMessageDialog(this, "Please enter a valid username of atleast 6 characters");
                    return;
                }
                if (!isValid(ngoPswd, "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")) {
                    JOptionPane.showMessageDialog(this, "Please enter a valid password of atleast 8 characters in length. It must contain a number, a specicial character, a lowercase and an uppercase character.");
                    return;
                }

                f.setNgoName(txtNonGovtOrgname.getText());
                f.setNgoPhno(txtNonGovtOrgPhone.getText());
                f.setNgoAddress(txtNonGovtOrgAdd.getText());
                f.setNgoCity(txtNonGovtOrgCity.getText());
                f.setNgoState(txtNonGovtOrgState.getText());
                f.setNgoZipcode(txtNonGovtOrgZip.getText());
                f.setNgoAgent(txtNonGovtOrgAgent.getText());
                UserAccount NGOua = new UserAccount();
                NGOua.setUsername(txtNonGovtOrguname.getText());
                NGOua.setPassword(txtNonGovtOrgpwd.getText());
                Worker emp = new Worker();
                emp.setName(txtNonGovtOrgAgent.getText());
                NGOua.setEmployee(emp);
                f.setNgoAccount(NGOua);
                break;
            }

        }
        // ecosystem.setFCWDirectory(fcWarehouseList);
        ngod = ecosystem.getNgoDir();
        ecosystem.setNgoDir(ngod);
        JOptionPane.showMessageDialog(this, "NGO details updated successfully");
        clearfields();
        populatengotable();
    }//GEN-LAST:event_btnNonGovtOrgUpdateActionPerformed

    private void tblNonGovtOrgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNonGovtOrgMousePressed
        // TODO add your handling code here:
        tblNonGovtOrg.setSelectionForeground(Color.BLUE);
    }//GEN-LAST:event_tblNonGovtOrgMousePressed

    private void btnNonGovtOrgCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNonGovtOrgCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNonGovtOrgCancelActionPerformed

    private void populatengotable() {
        DefaultTableModel model = (DefaultTableModel) tblNonGovtOrg.getModel();
        model.setRowCount(0);
        for (NonGovtOrg ngo : ecosystem.getNgoDir().getNgoList()) {
            Object[] row = new Object[8];
            row[0] = ngo;
            row[1] = ngo.getNgoName();
            row[2] = ngo.getNgoAgent();
            row[3] = ngo.getNgoPhno();
            row[4] = ngo.getNgoAddress();
            row[5] = ngo.getNgoCity();
            row[6] = ngo.getNgoState();
            row[7] = ngo.getNgoZipcode();
            model.addRow(row);
        }
    }

    private void clearfields() {
        txtNonGovtOrgname.setText("");
        txtNonGovtOrgPhone.setText("");
        txtNonGovtOrgAdd.setText("");
        txtNonGovtOrgCity.setText("");
        txtNonGovtOrgState.setText("");
        txtNonGovtOrgZip.setText("");
        txtNonGovtOrgAgent.setText("");
        txtNonGovtOrguname.setText("");
        txtNonGovtOrgpwd.setText("");
        lblNonGovtOrgid1.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImage;
    private javax.swing.JButton btnNonGovtOrgCancel;
    private javax.swing.JButton btnNonGovtOrgDelete;
    private javax.swing.JButton btnNonGovtOrgEdit;
    private javax.swing.JButton btnNonGovtOrgUpdate;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lbNonGovtOrgCity1;
    private javax.swing.JLabel lblAddNonGovtOrgTitle;
    private javax.swing.JLabel lblNonGovtOrgAdd;
    private javax.swing.JLabel lblNonGovtOrgAdd1;
    private javax.swing.JLabel lblNonGovtOrgAgent;
    private javax.swing.JLabel lblNonGovtOrgAgent1;
    private javax.swing.JLabel lblNonGovtOrgCity;
    private javax.swing.JLabel lblNonGovtOrgPhone;
    private javax.swing.JLabel lblNonGovtOrgPhone1;
    private javax.swing.JLabel lblNonGovtOrgState;
    private javax.swing.JLabel lblNonGovtOrgState1;
    private javax.swing.JLabel lblNonGovtOrgZip;
    private javax.swing.JLabel lblNonGovtOrgZip1;
    private javax.swing.JLabel lblNonGovtOrgid;
    private javax.swing.JLabel lblNonGovtOrgid1;
    private javax.swing.JLabel lblNonGovtOrgname;
    private javax.swing.JLabel lblNonGovtOrgname1;
    private javax.swing.JLabel lblNonGovtOrgpwd;
    private javax.swing.JLabel lblNonGovtOrgpwd1;
    private javax.swing.JLabel lblNonGovtOrguname;
    private javax.swing.JLabel lblNonGovtOrguname1;
    private javax.swing.JTable tblNonGovtOrg;
    private javax.swing.JTextField txtNonGovtOrgAdd;
    private javax.swing.JTextField txtNonGovtOrgAgent;
    private javax.swing.JTextField txtNonGovtOrgCity;
    private javax.swing.JTextField txtNonGovtOrgPhone;
    private javax.swing.JTextField txtNonGovtOrgState;
    private javax.swing.JTextField txtNonGovtOrgZip;
    private javax.swing.JTextField txtNonGovtOrgname;
    private javax.swing.JTextField txtNonGovtOrgpwd;
    private javax.swing.JTextField txtNonGovtOrguname;
    // End of variables declaration//GEN-END:variables
}
