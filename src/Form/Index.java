package Form;

import Class.IMC;
import Form.*;


public class Index extends javax.swing.JFrame {

    
    public Index() {
        initComponents();
        setLocationRelativeTo(null);
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        panelRound1 = new Resources.PanelRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/policlinicoLogo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 220, 210));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Estatura(mt)");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 140, 50));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Peso(kg)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 90, 50));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 110, 40));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 110, 40));

        jButton1.setBackground(new java.awt.Color(51, 57, 192));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Calcular IMC");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 160, 40));

        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 350, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Double altura=Double.parseDouble(jTextField1.getText());  
        Double peso=Double.parseDouble(jTextField3.getText());
        IMC indice = new IMC(altura,peso);
        Double imc = indice.CalcularIMC(altura, peso);
        System.out.println("El indice de masa Coporal es de :"+imc);
        
        Resultado_Inferior ri = new Resultado_Inferior();
        Resultado_Ligero_Inferior rli = new Resultado_Ligero_Inferior();
        Resultado_Regular rr = new Resultado_Regular();
        Resultado_Ligero_Superior rls = new Resultado_Ligero_Superior();
        Resultado_Superior rs = new Resultado_Superior();
        
        
        if (imc<=16.99) {
            System.out.println("imc muy bajo");
            ri.setVisible(true);
        }else{
            if (imc>=17.00 && imc<=18.49) {
                System.out.println("imc bajo");
                rli.setVisible(true);
            }else{
                if (imc>=18.50 && imc<=24.99) {
                    System.out.println("saludable"); 
                    rr.setVisible(true);
                }else{
                    if (imc>=25.00 && imc<=29.99) {
                    System.out.println("imc alto");     
                    rls.setVisible(true);
                    }else{
                        if (imc>=30.00) {
                            System.out.println("imc muy alto"); 
                            rs.setVisible(true);
                        }else{
                            System.out.println("Error");
                        }
                    }
                }
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed
     
    
    public static void main(String args[]) {
                   
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private Resources.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
