package Arayuz;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import roller.Kasa;
import yazlabb3.Yazlabb3;

public class arayuz extends javax.swing.JFrame {

    public static ArrayList<JButton> masalar = new ArrayList<>();
     Yazlabb3 r;
     Kasa kasa;
    public arayuz() {
        masalar.add(masa1);
        masalar.add(masa2);
        masalar.add(masa3);
        masalar.add(masa4);
        masalar.add(masa5);
        masalar.add(masa6);

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        musteri3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        musteri1txt = new javax.swing.JTextField();
        musteri2txt = new javax.swing.JTextField();
        musteri3txt = new javax.swing.JTextField();
        musteri4txt = new javax.swing.JTextField();
        musteri5txt = new javax.swing.JTextField();
        musteri6txt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        yemek2a1 = new javax.swing.JTextField();
        yemek1a1 = new javax.swing.JTextField();
        yemek1a2 = new javax.swing.JTextField();
        yemek2a2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        garson3 = new javax.swing.JLabel();
        garson1 = new javax.swing.JLabel();
        garson2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        siparis1lbl = new javax.swing.JLabel();
        siparis2lbl = new javax.swing.JLabel();
        siparis3lbl = new javax.swing.JLabel();
        siparis1txt = new javax.swing.JTextField();
        siparis2txt = new javax.swing.JTextField();
        siparis3txt = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        toplamMusteri = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        toplamOdeme = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        odemeyapan = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        musteri3.setBackground(new java.awt.Color(255, 255, 204));

        masa3.setBackground(new java.awt.Color(255, 204, 204));
        masa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arayuz/masa.png"))); // NOI18N

        masa2.setBackground(new java.awt.Color(255, 204, 204));
        masa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arayuz/masa.png"))); // NOI18N

        masa6.setBackground(new java.awt.Color(255, 204, 204));
        masa6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arayuz/masa.png"))); // NOI18N

        masa5.setBackground(new java.awt.Color(255, 204, 204));
        masa5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arayuz/masa.png"))); // NOI18N

        masa1.setBackground(new java.awt.Color(255, 204, 204));
        masa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arayuz/masa.png"))); // NOI18N
        masa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masa1ActionPerformed(evt);
            }
        });

        masa4.setBackground(new java.awt.Color(255, 204, 204));
        masa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arayuz/masa.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel7.setText("MASA 1:");

        jLabel8.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel8.setText("MASA 2:");

        jLabel9.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel9.setText("MASA 3:");

        jLabel10.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel10.setText("MASA 4:");

        jLabel11.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel11.setText("MASA 5:");
        jLabel11.setToolTipText("");

        jLabel12.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel12.setText("MASA 6:");

        musteri1txt.setFont(new java.awt.Font("Segoe Print", 1, 13)); // NOI18N
        musteri1txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        musteri1txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        musteri2txt.setFont(new java.awt.Font("Segoe Print", 1, 13)); // NOI18N
        musteri2txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        musteri2txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        musteri3txt.setFont(new java.awt.Font("Segoe Print", 1, 13)); // NOI18N
        musteri3txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        musteri3txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        musteri4txt.setFont(new java.awt.Font("Segoe Print", 1, 13)); // NOI18N
        musteri4txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        musteri4txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        musteri5txt.setFont(new java.awt.Font("Segoe Print", 1, 13)); // NOI18N
        musteri5txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        musteri5txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        musteri6txt.setFont(new java.awt.Font("Segoe Print", 1, 13)); // NOI18N
        musteri6txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        musteri6txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout musteri3Layout = new javax.swing.GroupLayout(musteri3);
        musteri3.setLayout(musteri3Layout);
        musteri3Layout.setHorizontalGroup(
            musteri3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(musteri3Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(musteri3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(musteri3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(musteri4txt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(musteri3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(musteri1txt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(masa1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(masa4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addGroup(musteri3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(musteri3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(musteri5txt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(musteri3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(musteri3Layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(musteri2txt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(masa2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(masa5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(79, 79, 79)
                .addGroup(musteri3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, musteri3Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(musteri6txt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(masa3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(masa6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, musteri3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(musteri3txt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        musteri3Layout.setVerticalGroup(
            musteri3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(musteri3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(musteri3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(musteri3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(musteri5txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(musteri3Layout.createSequentialGroup()
                        .addGroup(musteri3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(masa2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(masa3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(masa1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(musteri3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(musteri3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(musteri2txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(musteri3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(musteri1txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addGroup(musteri3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(musteri3txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(musteri3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(masa6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(masa5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(masa4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(musteri3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(musteri3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(musteri4txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(musteri3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(musteri6txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(203, 242, 250));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arayuz/asci11.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arayuz/asci22.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel13.setText("  Aþçý 1  ");

        jLabel15.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel15.setText("  Aþçý 2  ");

        jLabel14.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel14.setText("Yemek 1 ");

        jLabel16.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel16.setText("Yemek 2 ");

        yemek2a1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        yemek2a1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        yemek2a1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        yemek1a1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        yemek1a1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        yemek1a1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        yemek1a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yemek1a1ActionPerformed(evt);
            }
        });

        yemek1a2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        yemek1a2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        yemek1a2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        yemek1a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yemek1a2ActionPerformed(evt);
            }
        });

        yemek2a2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        yemek2a2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        yemek2a2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel17.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel17.setText("Yemek 1 ");

        jLabel18.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel18.setText("Yemek 2 ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(254, 254, 254)
                                        .addComponent(jLabel14))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(221, 221, 221)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(yemek1a1)
                                            .addComponent(yemek2a1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))))
                                .addGap(93, 93, 93))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(112, 112, 112)))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(yemek1a2)
                            .addComponent(yemek2a2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel13)
                                .addGap(147, 147, 147)
                                .addComponent(jLabel15))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)))))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yemek1a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yemek1a2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yemek2a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yemek2a2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(229, 213, 234));

        garson3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arayuz/garson2.png"))); // NOI18N

        garson1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arayuz/garson3.png"))); // NOI18N

        garson2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arayuz/garson1.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 13)); // NOI18N
        jLabel4.setText("       Garson 1 ");

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 13)); // NOI18N
        jLabel5.setText("        Garson 2");

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 13)); // NOI18N
        jLabel6.setText("         Garson 3");

        siparis1lbl.setFont(new java.awt.Font("Segoe Print", 1, 13)); // NOI18N
        siparis1lbl.setText(" Sipariþi Alýnan Masa");

        siparis2lbl.setFont(new java.awt.Font("Segoe Print", 1, 13)); // NOI18N
        siparis2lbl.setText(" Sipariþi Alýnan Masa");

        siparis3lbl.setFont(new java.awt.Font("Segoe Print", 1, 13)); // NOI18N
        siparis3lbl.setText(" Sipariþi Alýnan Masa");

        siparis1txt.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        siparis1txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        siparis1txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        siparis2txt.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        siparis2txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        siparis2txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        siparis3txt.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        siparis3txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        siparis3txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        siparis3txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siparis3txtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(garson1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(97, 97, 97))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(siparis1lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(siparis1txt, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(garson2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(siparis2lbl))
                    .addComponent(siparis2txt, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(siparis3txt, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(garson3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(siparis3lbl)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(garson2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(garson1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(garson3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(siparis2lbl)
                    .addComponent(siparis3lbl)
                    .addComponent(siparis1lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(siparis1txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siparis2txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siparis3txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arayuz/kasiyer.png"))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Segoe Print", 1, 16)); // NOI18N
        jLabel19.setText("Toplam Müþteri Sayýsý : ");

        toplamMusteri.setFont(new java.awt.Font("Segoe Print", 1, 16)); // NOI18N
        toplamMusteri.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        toplamMusteri.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        toplamMusteri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toplamMusteriActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe Print", 1, 16)); // NOI18N
        jLabel20.setText("Toplam Ödeme Miktarý :");

        toplamOdeme.setFont(new java.awt.Font("Segoe Print", 1, 16)); // NOI18N
        toplamOdeme.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        toplamOdeme.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        toplamOdeme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toplamOdemeActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe Print", 1, 16)); // NOI18N
        jLabel21.setText("Ödeme Yapan Masa");

        odemeyapan.setFont(new java.awt.Font("Segoe Print", 1, 16)); // NOI18N
        odemeyapan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        odemeyapan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        odemeyapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odemeyapanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toplamOdeme, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addComponent(jLabel3))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel19)
                            .addGap(15, 15, 15)
                            .addComponent(toplamMusteri, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(odemeyapan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(odemeyapan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(toplamMusteri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(toplamOdeme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(musteri3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(musteri3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void masa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masa1ActionPerformed

    }//GEN-LAST:event_masa1ActionPerformed

    private void siparis3txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siparis3txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siparis3txtActionPerformed

    private void yemek1a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yemek1a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yemek1a1ActionPerformed

    private void yemek1a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yemek1a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yemek1a2ActionPerformed

    private void toplamMusteriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toplamMusteriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toplamMusteriActionPerformed

    private void toplamOdemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toplamOdemeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toplamOdemeActionPerformed

    private void odemeyapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odemeyapanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_odemeyapanActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new arayuz().setVisible(true);

            }
        });
    }

    public void icon(int masa) {
        if (masa == 0) {
            Icon icon = new ImageIcon("C:\\Users\\Rabia\\Desktop\\logo\\1.png");
            masalar.get(masa).setIcon(icon);
            musteri1txt.setText(" "+(r.Masalar.get(masa).getMusId()+1)+" ");
        } else if (masa == 1) {
            Icon icon = new ImageIcon("C:\\Users\\Rabia\\Desktop\\logo\\2.png");
            masalar.get(masa).setIcon(icon);
            musteri2txt.setText(" "+(r.Masalar.get(masa).getMusId()+1)+" ");
        } else if (masa == 2) {
            Icon icon = new ImageIcon("C:\\Users\\Rabia\\Desktop\\logo\\3.png");
            masalar.get(masa).setIcon(icon);
            musteri3txt.setText(" "+(r.Masalar.get(masa).getMusId()+1)+" ");
        } else if (masa == 3) {
            Icon icon = new ImageIcon("C:\\Users\\Rabia\\Desktop\\logo\\4.png");
            masalar.get(masa).setIcon(icon);
            musteri4txt.setText(" "+(r.Masalar.get(masa).getMusId()+1)+" ");
        } else if (masa == 4) {
            Icon icon = new ImageIcon("C:\\Users\\Rabia\\Desktop\\logo\\5.png");
            masalar.get(masa).setIcon(icon);
            musteri5txt.setText(" "+(r.Masalar.get(masa).getMusId()+1)+" ");
        } else if (masa == 5) {
            Icon icon = new ImageIcon("C:\\Users\\Rabia\\Desktop\\logo\\6.png");
            masalar.get(masa).setIcon(icon);
            musteri6txt.setText(" "+(r.Masalar.get(masa).getMusId()+1)+" ");
        }
       
        
    }

    public void azalt(int masa) {
        Icon icon = new ImageIcon("C:\\Users\\Rabia\\Desktop\\logo\\masa.png");
        masalar.get(masa).setIcon(icon);
     
        if (masa == 0) {
          musteri1txt.setText("");
         }
        else if (masa == 1) {
          musteri2txt.setText("");
         }
         else if (masa == 2) {
          musteri3txt.setText("");
         }
          else if (masa == 3) {
          musteri4txt.setText("");
         }
          else if (masa == 4) {
          musteri5txt.setText("");
         }
          else if (masa == 5) {
          musteri6txt.setText("");
         }
         
       
         
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel garson1;
    private javax.swing.JLabel garson2;
    private javax.swing.JLabel garson3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public static final javax.swing.JButton masa1 = new javax.swing.JButton();
    public static final javax.swing.JButton masa2 = new javax.swing.JButton();
    public static final javax.swing.JButton masa3 = new javax.swing.JButton();
    public static final javax.swing.JButton masa4 = new javax.swing.JButton();
    public static final javax.swing.JButton masa5 = new javax.swing.JButton();
    public static final javax.swing.JButton masa6 = new javax.swing.JButton();
    public static javax.swing.JTextField musteri1txt;
    public static javax.swing.JTextField musteri2txt;
    public static javax.swing.JPanel musteri3;
    public static javax.swing.JTextField musteri3txt;
    public static javax.swing.JTextField musteri4txt;
    public static javax.swing.JTextField musteri5txt;
    public static javax.swing.JTextField musteri6txt;
    public static javax.swing.JTextField odemeyapan;
    public static javax.swing.JLabel siparis1lbl;
    public static javax.swing.JTextField siparis1txt;
    public static javax.swing.JLabel siparis2lbl;
    public static javax.swing.JTextField siparis2txt;
    public static javax.swing.JLabel siparis3lbl;
    public static javax.swing.JTextField siparis3txt;
    public static javax.swing.JTextField toplamMusteri;
    public static javax.swing.JTextField toplamOdeme;
    public static javax.swing.JTextField yemek1a1;
    public static javax.swing.JTextField yemek1a2;
    public static javax.swing.JTextField yemek2a1;
    public static javax.swing.JTextField yemek2a2;
    // End of variables declaration//GEN-END:variables

}
