/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NGORole;

import Business.EcoSystem;
import Business.Worker.Worker;
import Business.NonGovtOrgVolunteer.NGOVolunteer;
import Business.NonGovtOrgVolunteer.NGOVolunteerDirectory;
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
 * @author sivanagendrakanakababumarada
 */
public class ViewModifyVolunteerPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewModifyVolunteerPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    NGOVolunteerDirectory vold;
    String nogName;

    public ViewModifyVolunteerPanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount userAcc) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        if (ecosystem.getVolDir() == null) {
            ecosystem.setVolDir(new NGOVolunteerDirectory());
        }
        nogName = userAcc.getEmployee().getName();
        populatevoltable();
        setBG();
        makeTableTransparent1();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblViewVolTitle = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        tblViewVolunteer = new javax.swing.JTable();
        btnVolDelete = new javax.swing.JButton();
        btnVolEdit = new javax.swing.JButton();
        btnVolUpdate = new javax.swing.JButton();
        lblWarehousename1 = new javax.swing.JLabel();
        lblvolunteerid = new javax.swing.JLabel();
        lblvolunteerid1 = new javax.swing.JLabel();
        lblVolunteername = new javax.swing.JLabel();
        txtVolunteername = new javax.swing.JTextField();
        lblVolunteerPhone = new javax.swing.JLabel();
        txtVolunteerPhone = new javax.swing.JTextField();
        lblVolunteerAdd = new javax.swing.JLabel();
        txtVolunteerAdd = new javax.swing.JTextField();
        lblVolunteerCity = new javax.swing.JLabel();
        txtVolunteerCity = new javax.swing.JTextField();
        lblVolunteerState = new javax.swing.JLabel();
        lblVolunteerage = new javax.swing.JLabel();
        txtVolunteerage = new javax.swing.JTextField();
        txtVolunteerState = new javax.swing.JTextField();
        lblVolunteerZip = new javax.swing.JLabel();
        txtVolunteerZip = new javax.swing.JTextField();
        lblVolunteerExp = new javax.swing.JLabel();
        txtVolunteerExp = new javax.swing.JTextField();
        lblVolunteeruname = new javax.swing.JLabel();
        txtVolunteeruname = new javax.swing.JTextField();
        lblVolunteerpwd = new javax.swing.JLabel();
        txtVolunteerpwd = new javax.swing.JTextField();
        lblVolunteerZip1 = new javax.swing.JLabel();
        lblVolunteerPhone1 = new javax.swing.JLabel();
        lblVolunteerpwd2 = new javax.swing.JLabel();
        LabelImage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblViewVolTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblViewVolTitle.setForeground(new java.awt.Color(0, 153, 204));
        lblViewVolTitle.setText("View/Modify Volunteer");
        add(lblViewVolTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 13, -1, -1));

        tblViewVolunteer.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        tblViewVolunteer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Volunteer ID", "Name", "Age", "Phone Number", "Address", "City", "State", "Zip", "Experience"
            }
        ));
        tblViewVolunteer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblViewVolunteerMousePressed(evt);
            }
        });
        jScrollPane.setViewportView(tblViewVolunteer);

        add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 972, 118));

        btnVolDelete.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnVolDelete.setText("Delete");
        btnVolDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolDeleteActionPerformed(evt);
            }
        });
        add(btnVolDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(741, 170, 92, -1));

        btnVolEdit.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnVolEdit.setText("Edit");
        btnVolEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolEditActionPerformed(evt);
            }
        });
        add(btnVolEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 170, 92, -1));

        btnVolUpdate.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnVolUpdate.setText("Update");
        btnVolUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolUpdateActionPerformed(evt);
            }
        });
        add(btnVolUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 92, -1));

        lblWarehousename1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblWarehousename1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 73, -1, -1));

        lblvolunteerid.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblvolunteerid.setText("Volunteer ID:");
        add(lblvolunteerid, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 176, -1, -1));

        lblvolunteerid1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblvolunteerid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 176, -1, -1));

        lblVolunteername.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblVolunteername.setText("Volunteer Name:");
        add(lblVolunteername, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 194, -1, -1));

        txtVolunteername.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtVolunteername.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolunteername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVolunteernameFocusLost(evt);
            }
        });
        txtVolunteername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVolunteernameActionPerformed(evt);
            }
        });
        add(txtVolunteername, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 190, 137, -1));

        lblVolunteerPhone.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblVolunteerPhone.setText("Phone Number:");
        add(lblVolunteerPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 280, -1, -1));

        txtVolunteerPhone.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtVolunteerPhone.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolunteerPhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVolunteerPhoneFocusLost(evt);
            }
        });
        add(txtVolunteerPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 276, 137, -1));

        lblVolunteerAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblVolunteerAdd.setText("Address:");
        add(lblVolunteerAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 323, -1, -1));

        txtVolunteerAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtVolunteerAdd.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolunteerAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVolunteerAddActionPerformed(evt);
            }
        });
        add(txtVolunteerAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 319, 137, -1));

        lblVolunteerCity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblVolunteerCity.setText("City:");
        add(lblVolunteerCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 366, -1, -1));

        txtVolunteerCity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtVolunteerCity.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtVolunteerCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 362, 137, -1));

        lblVolunteerState.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblVolunteerState.setText("State:");
        add(lblVolunteerState, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 409, -1, -1));

        lblVolunteerage.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblVolunteerage.setText("Volunteer Age:");
        add(lblVolunteerage, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 237, -1, -1));

        txtVolunteerage.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtVolunteerage.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolunteerage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVolunteerageFocusLost(evt);
            }
        });
        add(txtVolunteerage, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 233, 137, -1));

        txtVolunteerState.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtVolunteerState.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolunteerState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVolunteerStateActionPerformed(evt);
            }
        });
        add(txtVolunteerState, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 405, 137, -1));

        lblVolunteerZip.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblVolunteerZip.setText("Zip:");
        add(lblVolunteerZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, -1, -1));

        txtVolunteerZip.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtVolunteerZip.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolunteerZip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVolunteerZipFocusLost(evt);
            }
        });
        add(txtVolunteerZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 448, 137, -1));

        lblVolunteerExp.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblVolunteerExp.setText("Volunteer Experience:");
        add(lblVolunteerExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 495, -1, -1));

        txtVolunteerExp.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtVolunteerExp.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolunteerExp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVolunteerExpFocusLost(evt);
            }
        });
        txtVolunteerExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVolunteerExpActionPerformed(evt);
            }
        });
        add(txtVolunteerExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 491, 137, -1));

        lblVolunteeruname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblVolunteeruname.setText("Volunteer Username:");
        add(lblVolunteeruname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, -1, -1));

        txtVolunteeruname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtVolunteeruname.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtVolunteeruname, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 534, 137, -1));

        lblVolunteerpwd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblVolunteerpwd.setText("Password:");
        add(lblVolunteerpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 581, -1, -1));

        txtVolunteerpwd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtVolunteerpwd.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtVolunteerpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 577, 137, -1));

        lblVolunteerZip1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblVolunteerZip1, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 457, -1, -1));

        lblVolunteerPhone1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblVolunteerPhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 285, -1, -1));

        lblVolunteerpwd2.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblVolunteerpwd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 586, -1, -1));
        add(LabelImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -4, 1500, 990));
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblViewVolunteer.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a record to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblViewVolunteer.getModel();
        NGOVolunteer selectedvol = (NGOVolunteer) model.getValueAt(selectedRowIndex, 0);
        ecosystem.getUserAccountDirectory().deleteUserAccount(
                ecosystem.getVolDir().getVolunteerList().get(selectedRowIndex).getVolAccount());
        vold = ecosystem.getVolDir();
        vold.deleteVolunteer(selectedvol);
        ecosystem.setVolDir(vold);
        Integer volCnt = ecosystem.getVolunteersCnt();
        ecosystem.setVolunteersCnt(volCnt - 1);
        JOptionPane.showMessageDialog(this, "Volunteer deleted Successfully");
        populatevoltable();
        clearfields();
        lblvolunteerid1.setText("");
    }//GEN-LAST:event_btnVolDeleteActionPerformed

    public void setBG() {
        try {
            LabelImage.setMinimumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImage.setPreferredSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImage.setMaximumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));

            Image img = ImageIO.read(getClass().getResource("/Images/background2.png"));

            Image newimg = img.getScaledInstance(1650, 900, java.awt.Image.SCALE_SMOOTH);
            LabelImage.setIcon(new ImageIcon(newimg));
        } catch (IOException ex) {
            Logger.getLogger(ViewModifyVolunteerPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void makeTableTransparent1() {
        tblViewVolunteer.setOpaque(false);
        ((DefaultTableCellRenderer) tblViewVolunteer.getDefaultRenderer(Object.class)).setOpaque(false);
        tblViewVolunteer.setShowGrid(false);
        jScrollPane.setOpaque(false);
        jScrollPane.getViewport().setOpaque(false);

        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.WHITE);

        for (int i = 0; i < tblViewVolunteer.getModel().getColumnCount(); i++) {
            tblViewVolunteer.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
    }

    private void btnVolEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolEditActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblViewVolunteer.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a record to Edit");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblViewVolunteer.getModel();
        NGOVolunteer selectedvol = (NGOVolunteer) model.getValueAt(selectedRowIndex, 0);
        lblvolunteerid1.setText(selectedvol.getVolId());
        txtVolunteername.setText(selectedvol.getVolName());
        txtVolunteerage.setText(selectedvol.getVolAge());
        txtVolunteerPhone.setText(selectedvol.getVolPhno());
        txtVolunteerAdd.setText(selectedvol.getVolAddress());
        txtVolunteerCity.setText(selectedvol.getVolCity());
        txtVolunteerState.setText(selectedvol.getVolState());
        txtVolunteerZip.setText(selectedvol.getVolZipcode());
        txtVolunteerExp.setText(selectedvol.getVolExp());
        txtVolunteeruname.setText(selectedvol.getVolAccount().getUsername());
        txtVolunteerpwd.setText(selectedvol.getVolAccount().getPassword());
    }//GEN-LAST:event_btnVolEditActionPerformed

    public boolean isValid(String test, String regex) {
//        String regex = "^[A-Za-z0-9]+";
        Pattern p = Pattern.compile(regex);

        if (test == null) {
            return false;
        }

        Matcher m = p.matcher(test);

        return m.matches();
    }
    
    public Integer tryParse(String text) {

        try {
            return Integer.valueOf(text);
        } catch (NumberFormatException e) {
            return -1;
        }

    }
    
    private void btnVolUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblViewVolunteer.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a record to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblViewVolunteer.getModel();
        String volid = lblvolunteerid1.getText();

        ArrayList<NGOVolunteer> volList = ecosystem.getVolDir().getVolunteerList();
        for (NGOVolunteer vol : volList) {
            if (vol.getVolId().equals(volid)) {
                
                String volName = txtVolunteername.getText();
                Integer volAge = tryParse(txtVolunteerage.getText());
                
                String phone = txtVolunteerPhone.getText();
                String volAdds = txtVolunteerAdd.getText();
                String volCity = txtVolunteerCity.getText();
                String volState = txtVolunteerState.getText();
                String volZip = txtVolunteerZip.getText();
                Integer volExp = tryParse(txtVolunteerExp.getText());
                String volUser = txtVolunteeruname.getText();
                String volPswd = txtVolunteerpwd.getText();
               
                if (!isValid(volName, "^[A-Za-z]{3,}")) {
                    JOptionPane.showMessageDialog(this, "Please enter valid name");
                    return;
                }
                if (volAge < 0) {
                    JOptionPane.showMessageDialog(this, "Please enter valid Age");
                    return;
                }
                if (!isValid(phone, "[+]?[0-9]{10,13}")) {
                    JOptionPane.showMessageDialog(this, "Please enter valid phone number");
                    return;
                }
                if (volAdds.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please enter volunteer address");
                    return;
                }
                if (!isValid(volCity, "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+){3,}")) {
                    JOptionPane.showMessageDialog(this, "Please enter valid city");
                    return;
                }
                if (!isValid(volState, "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+){2,}")) {
                    JOptionPane.showMessageDialog(this, "Please enter valid state");
                    return;
                }
                if (!isValid(volZip, "^[0-9]{5}(?:-[0-9]{4})?$")) {
                    JOptionPane.showMessageDialog(this, "Please enter valid zip");
                    return;
                }
                if (volExp < 0) {
                    JOptionPane.showMessageDialog(this, "Please enter valid experience");
                    return;
                }
                if (!isValid(volUser, "^[a-zA-Z0-9._-]{6,}$")) {
                    JOptionPane.showMessageDialog(this, "Please enter a valid username of atleast 6 characters");
                    return;
                }
                if (!isValid(volPswd, "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")) {
                    JOptionPane.showMessageDialog(this, "Please enter a valid password of atleast 8 characters in length. It must contain a number, a specicial character, a lowercase and an uppercase character.");
                    return;
                }
                
                
                vol.setVolName(txtVolunteername.getText());
                vol.setVolAge(txtVolunteerage.getText());
                vol.setVolPhno(txtVolunteerPhone.getText());
                vol.setVolAddress(txtVolunteerAdd.getText());
                vol.setVolCity(txtVolunteerCity.getText());
                vol.setVolState(txtVolunteerState.getText());
                vol.setVolZipcode(txtVolunteerZip.getText());
                vol.setVolExp(txtVolunteerExp.getText());
//                UserAccount volua=new UserAccount();
//                volua.setUsername(txtVoluname.getText());
//                volua.setPassword(txtVolpwd.getText());
//                if(vol.getVolAccount().getUsername().equals(txtVoluname.getText())){
//                    Worker emp=new Worker();
//                    emp.setName(txtvolAdmin.getText());
//                    vol.getVolAccount().setPassword(txtVolpwd.getText());
//                    vol.getVolAccount().setEmployee(emp);
//                }
                if (vol.getVolAccount().getUsername().equals(txtVolunteeruname.getText())) {
                    vol.getVolAccount().setPassword(txtVolunteerpwd.getText());
                    vol.getVolAccount().getEmployee().setName(txtVolunteername.getText());
                }
                //vol.setVolAccount(volua);
                break;
            }

        }
        // ecosystem.setFCWDirectory(fcWarehouseList);
        vold = ecosystem.getVolDir();
        ecosystem.setVolDir(vold);
        JOptionPane.showMessageDialog(this, "Volunteer details updated successfully");
        clearfields();
        populatevoltable();
    }//GEN-LAST:event_btnVolUpdateActionPerformed

    private void txtVolunteernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolunteernameFocusLost
        // TODO add your handling code here:
//        if(!(txtVolname.getText().matches("^[a-zA-Z]*$"))){
//            lblVolname1.setText("Invalid input. Please enter only alphabets");
//        }
//        else{
//            lblVolname1.setText("");
//        }
    }//GEN-LAST:event_txtVolunteernameFocusLost

    private void txtVolunteernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVolunteernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVolunteernameActionPerformed

    private void txtVolunteerPhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolunteerPhoneFocusLost
        // TODO add your handling code here:
        if (!(txtVolunteerPhone.getText().matches("^[0-9]*$")) || !(txtVolunteerPhone.getText().length() == 10)) {
            lblVolunteerPhone1.setText("Please enter a valid phone number");
        } else {
            lblVolunteerPhone1.setText("");

        }
    }//GEN-LAST:event_txtVolunteerPhoneFocusLost

    private void txtVolunteerAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVolunteerAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVolunteerAddActionPerformed

    private void txtVolunteerageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolunteerageFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVolunteerageFocusLost

    private void txtVolunteerZipFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolunteerZipFocusLost
        // TODO add your handling code here:
        if ((txtVolunteerZip.getText().matches("^[a-zA-Z]*$"))) {
            lblVolunteerZip1.setText("Invalid input. Please enter only numbers");
        } else {
            lblVolunteerZip1.setText("");
        }
    }//GEN-LAST:event_txtVolunteerZipFocusLost

    private void txtVolunteerExpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolunteerExpFocusLost
        // TODO add your handling code here:
        //        if(!(txtVolExp.getText().matches("^[a-zA-Z]*$"))){
        //            lblVolAdmin1.setText("Invalid input. Please enter only alphabets.");
        //        }
        //        else{
        //            lblVolAdmin1.setText("");
        //        }
    }//GEN-LAST:event_txtVolunteerExpFocusLost

    private void txtVolunteerExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVolunteerExpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVolunteerExpActionPerformed

    private void txtVolunteerStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVolunteerStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVolunteerStateActionPerformed

    private void tblViewVolunteerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblViewVolunteerMousePressed
        // TODO add your handling code here:
        tblViewVolunteer.setSelectionForeground(Color.BLACK);

    }//GEN-LAST:event_tblViewVolunteerMousePressed

    private void clearfields() {
        txtVolunteername.setText("");
        txtVolunteerPhone.setText("");
        txtVolunteerAdd.setText("");
        txtVolunteerCity.setText("");
        txtVolunteerState.setText("");
        txtVolunteerZip.setText("");
        txtVolunteerExp.setText("");
        txtVolunteeruname.setText("");
        txtVolunteerpwd.setText("");
        txtVolunteerage.setText("");
        lblvolunteerid1.setText("");
    }

    private void populatevoltable() {
        DefaultTableModel model = (DefaultTableModel) tblViewVolunteer.getModel();
        model.setRowCount(0);
        for (NGOVolunteer vol : ecosystem.getVolDir().getVolunteerList()) {
            if (vol.getVolNGO().equals(nogName)) {
                Object[] row = new Object[9];
                row[0] = vol;
                row[1] = vol.getVolName();
                row[2] = vol.getVolAge();
                row[3] = vol.getVolPhno();
                row[4] = vol.getVolAddress();
                row[5] = vol.getVolCity();
                row[6] = vol.getVolState();
                row[7] = vol.getVolZipcode();
                row[8] = vol.getVolExp();
                model.addRow(row);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImage;
    private javax.swing.JButton btnVolDelete;
    private javax.swing.JButton btnVolEdit;
    private javax.swing.JButton btnVolUpdate;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblViewVolTitle;
    private javax.swing.JLabel lblVolunteerAdd;
    private javax.swing.JLabel lblVolunteerCity;
    private javax.swing.JLabel lblVolunteerExp;
    private javax.swing.JLabel lblVolunteerPhone;
    private javax.swing.JLabel lblVolunteerPhone1;
    private javax.swing.JLabel lblVolunteerState;
    private javax.swing.JLabel lblVolunteerZip;
    private javax.swing.JLabel lblVolunteerZip1;
    private javax.swing.JLabel lblVolunteerage;
    private javax.swing.JLabel lblVolunteername;
    private javax.swing.JLabel lblVolunteerpwd;
    private javax.swing.JLabel lblVolunteerpwd2;
    private javax.swing.JLabel lblVolunteeruname;
    private javax.swing.JLabel lblWarehousename1;
    private javax.swing.JLabel lblvolunteerid;
    private javax.swing.JLabel lblvolunteerid1;
    private javax.swing.JTable tblViewVolunteer;
    private javax.swing.JTextField txtVolunteerAdd;
    private javax.swing.JTextField txtVolunteerCity;
    private javax.swing.JTextField txtVolunteerExp;
    private javax.swing.JTextField txtVolunteerPhone;
    private javax.swing.JTextField txtVolunteerState;
    private javax.swing.JTextField txtVolunteerZip;
    private javax.swing.JTextField txtVolunteerage;
    private javax.swing.JTextField txtVolunteername;
    private javax.swing.JTextField txtVolunteerpwd;
    private javax.swing.JTextField txtVolunteeruname;
    // End of variables declaration//GEN-END:variables
}
