/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import java.awt.Component;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import services.IUserService;
import services.impl.UserServiceImpl;


/**
 *
 * @author hungh
 */
public class frm_Dangnhap extends javax.swing.JPanel {
    boolean hish = false;
    private IUserService userServiec;

    public frm_Dangnhap() {
        initComponents();
        userServiec = new UserServiceImpl();
    }

    public void dangnhap() {
        txtUser.grabFocus();
    }

    public void addEventquenmatkhau(ActionListener event) {
        quenmatkhau1.addActionListener(event);
    }

    public void btndangnhapEven(ActionListener event) {
        myButton2.addActionListener(event);
    }

    public boolean isdangnhap() {
        String TaiKhaon = txtUser.getText().trim();
        String MatKhau = txtPass.getText().trim();
        boolean dangNhap = userServiec.getUser(TaiKhaon, MatKhau);
        return dangNhap;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtPass = new swing.MyPassword();
        jLabel3 = new javax.swing.JLabel();
        myButton1 = new swing.MyButton();
        lbl_thongBao = new javax.swing.JButton();
        txtUser = new swing.MyTextField();
        jLabel1 = new javax.swing.JLabel();
        myButton2 = new swing.MyButton();
        hideshow = new javax.swing.JLabel();
        quenmatkhau1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(328, 373));
        setMinimumSize(new java.awt.Dimension(328, 373));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(328, 373));
        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LOGIN");
        add(jLabel2);
        jLabel2.setBounds(90, 10, 240, 60);

        txtPass.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtPass.setMinimumSize(new java.awt.Dimension(300, 40));
        txtPass.setPreferredSize(new java.awt.Dimension(300, 40));
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });
        add(txtPass);
        txtPass.setBounds(60, 220, 280, 40);

        jLabel3.setBackground(new java.awt.Color(102, 102, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Mật khẩu");
        add(jLabel3);
        jLabel3.setBounds(60, 190, 80, 24);

        myButton1.setForeground(new java.awt.Color(255, 0, 0));
        myButton1.setText("Thoát");
        myButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });
        add(myButton1);
        myButton1.setBounds(220, 350, 120, 48);

        lbl_thongBao.setForeground(new java.awt.Color(255, 51, 51));
        lbl_thongBao.setBorder(null);
        lbl_thongBao.setContentAreaFilled(false);
        lbl_thongBao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(lbl_thongBao);
        lbl_thongBao.setBounds(240, 270, 0, 0);

        txtUser.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtUser.setMinimumSize(new java.awt.Dimension(300, 40));
        txtUser.setName(""); // NOI18N
        txtUser.setPreferredSize(new java.awt.Dimension(300, 40));
        add(txtUser);
        txtUser.setBounds(60, 130, 280, 41);

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Tài khoản");
        add(jLabel1);
        jLabel1.setBounds(60, 100, 90, 24);

        myButton2.setBorder(null);
        myButton2.setForeground(new java.awt.Color(51, 51, 51));
        myButton2.setText("Đăng nhập");
        myButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        myButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton2ActionPerformed(evt);
            }
        });
        add(myButton2);
        myButton2.setBounds(60, 350, 120, 48);

        hideshow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hide.png"))); // NOI18N
        hideshow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hideshowMouseClicked(evt);
            }
        });
        add(hideshow);
        hideshow.setBounds(360, 220, 30, 40);

        quenmatkhau1.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        quenmatkhau1.setForeground(new java.awt.Color(255, 0, 0));
        quenmatkhau1.setText("Forget password?");
        quenmatkhau1.setBorder(null);
        quenmatkhau1.setContentAreaFilled(false);
        quenmatkhau1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(quenmatkhau1);
        quenmatkhau1.setBounds(240, 300, 120, 14);
    }// </editor-fold>//GEN-END:initComponents

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
       
    }//GEN-LAST:event_myButton1ActionPerformed

    private void hideshowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideshowMouseClicked
       

    }//GEN-LAST:event_hideshowMouseClicked

    private void myButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton2ActionPerformed

    }//GEN-LAST:event_myButton2ActionPerformed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtPassKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hideshow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton lbl_thongBao;
    private swing.MyButton myButton1;
    private swing.MyButton myButton2;
    private javax.swing.JButton quenmatkhau1;
    private swing.MyPassword txtPass;
    private swing.MyTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
