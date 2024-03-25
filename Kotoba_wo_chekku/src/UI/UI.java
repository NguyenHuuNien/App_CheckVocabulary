package UI;

import Objects_Language.TiengAnh;
import Objects_Language.TiengNhat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class UI extends javax.swing.JFrame {
    private List<TiengNhat> dsTiengNhat;
    private List<TiengAnh> dsTiengAnh;
    private int index;
    private boolean isTiengNhat;
    public UI() {
        initComponents();
        index = 0;
        txtInput.setText("");
    }
    
    private void Atarashi_Shitsumon(){
        if(isTiengNhat){
            index = new Random().nextInt(dsTiengNhat.size()-1);
            txtCheck.setText(dsTiengNhat.get(index).getTX());
        }else{
            index = new Random().nextInt(dsTiengAnh.size()-1);
            txtCheck.setText(dsTiengAnh.get(index).getText());
        }
    }
    
    private void Nihongo_check(){
        String s1 = dsTiengNhat.get(index).review().toLowerCase();
        String s2 = txtInput.getText().toLowerCase();
        if(s1.indexOf(s2)!=-1){
            System.out.println("Maru");
        }else{
            System.out.println("Batsu");
        }
        Atarashi_Shitsumon();
    }
    private void Eigo_check(){
        String s1 = dsTiengAnh.get(index).review().toLowerCase();
        String s2 = txtInput.getText().toLowerCase();
        if(s1.indexOf(s2)!=-1){
            System.out.println("Maru");
        }else{
            System.out.println("Batsu");
        }
        Atarashi_Shitsumon();
    }
    private void Kotae_check(){
        if(isTiengNhat) Nihongo_check();
        else Eigo_check();
    }
    
    
    private void buttonOKEvent(){
        if(isTiengNhat){
            System.out.println(dsTiengNhat.get(0).getHiragana());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nameFile = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtCheck = new javax.swing.JLabel();
        jpanl = new javax.swing.JPanel();
        lb = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chuong trinh kiem tra tu vung");
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        getContentPane().setLayout(new java.awt.FlowLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(990, 50));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ABC");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1);

        jPanel2.setPreferredSize(new java.awt.Dimension(990, 50));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Choose");
        jPanel2.add(jLabel2);

        nameFile.setText("nameOfFile");
        jPanel2.add(nameFile);

        jButton1.setText("File Nihongo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton8.setText("File English");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);

        getContentPane().add(jPanel2);

        jPanel3.setPreferredSize(new java.awt.Dimension(990, 35));

        jButton2.setText("History");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);

        jButton3.setText("read all file");
        jPanel3.add(jButton3);

        jButton4.setText("random check");
        jPanel3.add(jButton4);

        jButton5.setText("check with list");
        jPanel3.add(jButton5);

        getContentPane().add(jPanel3);

        jPanel4.setMinimumSize(new java.awt.Dimension(100, 100));
        jPanel4.setPreferredSize(new java.awt.Dimension(990, 35));

        jLabel4.setText("from");
        jPanel4.add(jLabel4);

        jButton6.setText("change");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6);

        jLabel5.setText("to");
        jPanel4.add(jLabel5);

        getContentPane().add(jPanel4);

        jPanel5.setPreferredSize(new java.awt.Dimension(990, 50));

        txtCheck.setText("voca");
        jPanel5.add(txtCheck);

        getContentPane().add(jPanel5);

        jpanl.setPreferredSize(new java.awt.Dimension(990, 100));

        lb.setText("jLabel7");
        jpanl.add(lb);

        txtInput.setPreferredSize(new java.awt.Dimension(200, 25));
        jpanl.add(txtInput);

        getContentPane().add(jpanl);

        jPanel7.setPreferredSize(new java.awt.Dimension(990, 50));
        jPanel7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel7KeyPressed(evt);
            }
        });

        jButton7.setText("check");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 459, Short.MAX_VALUE)
                    .addComponent(jButton7)
                    .addGap(0, 459, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 13, Short.MAX_VALUE)
                    .addComponent(jButton7)
                    .addGap(0, 14, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel7);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        isTiengNhat = true;
        JFileChooser jfilechooser = new JFileChooser();
        FileNameExtensionFilter fileChoose = new FileNameExtensionFilter("*.csv", "csv");
        jfilechooser.setFileFilter(fileChoose);
        jfilechooser.setMultiSelectionEnabled(false);
        int x = jfilechooser.showDialog(this, "Chon file");
        if(x == JFileChooser.APPROVE_OPTION){
            saveLoad.saveload.path = jfilechooser.getSelectedFile();
            nameFile.setText(saveLoad.saveload.path.getName());
        }
        dsTiengNhat = new ArrayList<>();
        dsTiengNhat = saveLoad.saveload.Load("TiengNhat");
        Atarashi_Shitsumon();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPanel7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel7KeyPressed
        
    }//GEN-LAST:event_jPanel7KeyPressed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(isTiengNhat){
            if(dsTiengNhat == null){
                return;
            }
        }else{
            if(dsTiengAnh == null){
                return;
            }
        }
        Nihongo_check();
        buttonOKEvent();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        isTiengNhat = false;
        JFileChooser jfilechooser = new JFileChooser();
        FileNameExtensionFilter fileChoose = new FileNameExtensionFilter("*.csv", "csv");
        jfilechooser.setFileFilter(fileChoose);
        jfilechooser.setMultiSelectionEnabled(false);
        int x = jfilechooser.showDialog(this, "Chon file");
        if(x == JFileChooser.APPROVE_OPTION){
            saveLoad.saveload.path = jfilechooser.getSelectedFile();
            nameFile.setText(saveLoad.saveload.path.getName());
        }
        dsTiengAnh = new ArrayList<>();
        dsTiengAnh = saveLoad.saveload.Load("TiengAnh");
        Atarashi_Shitsumon();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Atarashi_Shitsumon();
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jpanl;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel nameFile;
    private javax.swing.JLabel txtCheck;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}
