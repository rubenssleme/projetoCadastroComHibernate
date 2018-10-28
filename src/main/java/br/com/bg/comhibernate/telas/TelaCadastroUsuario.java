package br.com.bg.comhibernate.telas;

import br.com.bg.comhibernate.controladores.ControladorTelaCadastroUsuario;

/**
 *
 * @author rubens leme
 */
public class TelaCadastroUsuario extends javax.swing.JInternalFrame {

    public TelaCadastroUsuario() {
        initComponents();
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
      controladorTelaCadastroUsuario = new ControladorTelaCadastroUsuario(jtfNome,jtfEmail, jtfCPF, jtfRG,jtfIdade, jcbSexo );

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlaNome = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jlaEMail = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jlaCPF = new javax.swing.JLabel();
        jtfCPF = new javax.swing.JTextField();
        jtfRG = new javax.swing.JTextField();
        jlaRG = new javax.swing.JLabel();
        jlaIdade = new javax.swing.JLabel();
        jtfIdade = new javax.swing.JTextField();
        jlaSexo = new javax.swing.JLabel();
        jcbSexo = new javax.swing.JComboBox<>();
        jbuSalvar = new javax.swing.JButton();
        jbuCancelar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Tela Cadastro Usuario Internal");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jlaNome.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jlaNome.setText("Nome:");

        jlaEMail.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jlaEMail.setText("E-Mail: ");

        jlaCPF.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jlaCPF.setText("CPF:");

        jlaRG.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jlaRG.setText("RG:");

        jlaIdade.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jlaIdade.setText("Idade: ");

        jlaSexo.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jlaSexo.setText("Sexo:");

        jcbSexo.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jcbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));

        jbuSalvar.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jbuSalvar.setText("Salvar");
        jbuSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuSalvarActionPerformed(evt);
            }
        });

        jbuCancelar.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jbuCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jbuSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbuCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addComponent(jlaCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jlaIdade, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                            .addComponent(jlaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNome)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfCPF)
                                .addGap(9, 9, 9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfIdade, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                                .addGap(52, 52, 52)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jlaEMail))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jlaSexo)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfEmail)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfRG, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                .addGap(65, 65, 65))
                            .addComponent(jcbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(497, 497, 497)
                        .addComponent(jlaRG)))
                .addGap(68, 68, 68))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbuCancelar, jbuSalvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlaEMail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jlaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlaSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlaRG, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfRG, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addComponent(jtfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jlaIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(320, 320, 320)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbuSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbuCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jbuCancelar, jbuSalvar});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        controladorTelaCadastroUsuario.fecharTela();
    }//GEN-LAST:event_formInternalFrameClosing

    private void jbuSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuSalvarActionPerformed
      controladorTelaCadastroUsuario.salvarUsuario();
    }//GEN-LAST:event_jbuSalvarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbuCancelar;
    private javax.swing.JButton jbuSalvar;
    private javax.swing.JComboBox<String> jcbSexo;
    private javax.swing.JLabel jlaCPF;
    private javax.swing.JLabel jlaEMail;
    private javax.swing.JLabel jlaIdade;
    private javax.swing.JLabel jlaNome;
    private javax.swing.JLabel jlaRG;
    private javax.swing.JLabel jlaSexo;
    private javax.swing.JTextField jtfCPF;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfIdade;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfRG;
    // End of variables declaration//GEN-END:variables
    ControladorTelaCadastroUsuario controladorTelaCadastroUsuario;
}
