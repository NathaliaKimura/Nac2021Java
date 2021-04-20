/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiapfilmenac;

import java.awt.Image;
 
import java.io.File;
import java.util.Set;
 
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
 
import javax.swing.JFileChooser;
import javax.swing.JLabel;
 
import javax.swing.JOptionPane;
 
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Nathália
 */
public class JanelaFilme extends javax.swing.JFrame {
   Situacao enviarFoto, EnviarTexto1, EnviarTexto2;
   String enderecoFoto, Titulozin, Sinopse1;
   int ComboCaixinha;
   boolean ManoDoCeu;
  
    public JanelaFilme() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblFoto = new javax.swing.JLabel();
        btnGravar = new javax.swing.JButton();
        Netflix = new javax.swing.JRadioButton();
        Youtube = new javax.swing.JRadioButton();
        Amazon = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        Caixinha = new javax.swing.JComboBox<>();
        OhMeuDeus = new javax.swing.JCheckBox();
        Titulo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Sinopse = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadrastro Filme");
        setResizable(false);

        btnGravar.setBackground(new java.awt.Color(0, 255, 255));
        btnGravar.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        btnGravar.setForeground(new java.awt.Color(255, 255, 255));
        btnGravar.setText("Gravar Filme");
        btnGravar.setBorderPainted(false);
        btnGravar.setCursor(new java.awt.Cursor(java.awt.Cursor.E_RESIZE_CURSOR));
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        buttonGroup1.add(Netflix);
        Netflix.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Netflix.setText("Netflix");
        Netflix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NetflixActionPerformed(evt);
            }
        });

        buttonGroup1.add(Youtube);
        Youtube.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Youtube.setText("Youtube");
        Youtube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YoutubeActionPerformed(evt);
            }
        });

        buttonGroup1.add(Amazon);
        Amazon.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Amazon.setText("Amazon");

        jButton1.setBackground(new java.awt.Color(0, 255, 255));
        jButton1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Adicionar Capa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Caixinha.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Caixinha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Genero", "Ação", "Terror", "Comédia", "Drama" }));
        Caixinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaixinhaActionPerformed(evt);
            }
        });

        OhMeuDeus.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        OhMeuDeus.setText("Assistido");
        OhMeuDeus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OhMeuDeusActionPerformed(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TituloActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("TÍTULO DO FILME:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("QUAL CATEGORIA:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("PLATAFORMA DISPONÍVEL:");

        Sinopse.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Sinopse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SinopseActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setText("SINOPSE:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Sinopse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(Caixinha, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Netflix)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Amazon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(OhMeuDeus)
                                    .addComponent(btnGravar))
                                .addGap(25, 25, 25))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Youtube)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sinopse))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Caixinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(Youtube, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Amazon)
                    .addComponent(jLabel3)
                    .addComponent(OhMeuDeus))
                .addGap(18, 18, 18)
                .addComponent(Netflix)
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnGravar))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
         Titulozin = Titulo.getText();
         Sinopse1 = Sinopse.getText();
         
         if (enviarFoto == null) {

                enviarFoto = new Situacao(Netflix, Amazon, Youtube, ComboCaixinha, ManoDoCeu, Titulozin, Sinopse1);
                enviarFoto.setVisible(true);
                enviarFoto.recebendo(enderecoFoto);

        }
         if (EnviarTexto1 == null) {
             EnviarTexto1 = new Situacao(Netflix, Amazon, Youtube, ComboCaixinha, ManoDoCeu, Titulozin, Sinopse1);
             EnviarTexto1.recebeTexto(Titulo.getText());
        }
        if (EnviarTexto2 == null) {
             EnviarTexto2 = new Situacao(Netflix, Amazon, Youtube, ComboCaixinha, ManoDoCeu, Titulozin, Sinopse1);
             EnviarTexto2.recebeTexto2(Sinopse.getText());
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void NetflixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NetflixActionPerformed
        if (Netflix.isSelected()) {
        Situacao a = new Situacao(Netflix, Amazon, Youtube, ComboCaixinha, ManoDoCeu,Titulozin,Sinopse1);
       a.Netflix2.setAction(null);
       System.out.println(Netflix.getAction());
        int b = 1;
        }
// TODO add your handling code here:
    }//GEN-LAST:event_NetflixActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
               JFileChooser fileChooser = new JFileChooser();
 
        FileNameExtensionFilter filter = new FileNameExtensionFilter("4 Extensions Supported", "jpg", "png", "jpeg", "gif");
 
        fileChooser.setFileFilter(filter);
 
        int selected = fileChooser.showOpenDialog(null);
 
        if (selected == JFileChooser.APPROVE_OPTION) {
 
            File file = fileChooser.getSelectedFile();

            String getselectedImage = file.getAbsolutePath();
 
 
            JOptionPane.showMessageDialog(null, getselectedImage);
 
            ImageIcon imIco = new ImageIcon(getselectedImage);

            Image imFit = imIco.getImage();
 
            Image imgFit = imFit.getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_SMOOTH);
       
            lblFoto.setIcon(new ImageIcon(imgFit));
            enderecoFoto = file.toString();
            
        }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CaixinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaixinhaActionPerformed
        ComboCaixinha = Caixinha.getSelectedIndex();
        
    }//GEN-LAST:event_CaixinhaActionPerformed

    private void OhMeuDeusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OhMeuDeusActionPerformed
      ManoDoCeu = OhMeuDeus.isSelected();
    }//GEN-LAST:event_OhMeuDeusActionPerformed

    private void TituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TituloActionPerformed
        
        
        int a = 1;
       
    }//GEN-LAST:event_TituloActionPerformed

    private void YoutubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YoutubeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YoutubeActionPerformed

    private void SinopseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SinopseActionPerformed
       int a =1;
    }//GEN-LAST:event_SinopseActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaFilme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Amazon;
    private javax.swing.JComboBox<String> Caixinha;
    public javax.swing.JRadioButton Netflix;
    private javax.swing.JCheckBox OhMeuDeus;
    private javax.swing.JTextField Sinopse;
    private javax.swing.JTextField Titulo;
    private javax.swing.JRadioButton Youtube;
    private javax.swing.JButton btnGravar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblFoto;
    // End of variables declaration//GEN-END:variables

}
