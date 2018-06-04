package View;

import Model.DatePlayer;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;

public class WinnerFrame extends javax.swing.JFrame {

    private int point;
    private String nickname;
    private DatePlayer datePlayer;

    public WinnerFrame(DatePlayer datePlayer) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());
        setTitle("Won");
        setResizable(false);
        setLocationRelativeTo(null);
        initComponents();
        this.getContentPane().setBackground(new Color(0, 250, 0));

        this.datePlayer = datePlayer;
        this.point = datePlayer.getPointers();
        this.nickname = datePlayer.getNickname();

        jLabel7.setText("" + point);
        jLabel4.setText("" + nickname);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(22, 255, 0));
        setUndecorated(true);

        menuButton.setFont(new java.awt.Font("URW Gothic L", 0, 15)); // NOI18N
        menuButton.setText("Menu");
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("URW Gothic L", 0, 24)); // NOI18N
        jLabel3.setText("Eaah!");

        jLabel4.setFont(new java.awt.Font("DejaVu Serif", 1, 24)); // NOI18N
        jLabel4.setText("names");

        jLabel5.setFont(new java.awt.Font("URW Gothic L", 0, 24)); // NOI18N
        jLabel5.setText("You Won! ");

        jLabel6.setFont(new java.awt.Font("URW Gothic L", 0, 24)); // NOI18N
        jLabel6.setText("Your points are:");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        jLabel7.setText("000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(menuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addComponent(jLabel5)
                .addGap(6, 6, 6)
                .addComponent(jLabel6)
                .addGap(6, 6, 6)
                .addComponent(jLabel7)
                .addGap(6, 6, 6)
                .addComponent(menuButton))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton menuButton;
    // End of variables declaration//GEN-END:variables
}
