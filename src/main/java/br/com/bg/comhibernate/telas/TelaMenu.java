package br.com.bg.comhibernate.telas;

import br.com.bg.comhibernate.controladores.ControladorTelaMenu;

/**
 *
 * @author Rubens Leme
 */
public class TelaMenu extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaMenu() {
        initComponents();
        controlador = new ControladorTelaMenu(this, jdpTelaFilha, jlaHora, jlaData, jlaDiaSemana);
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpaBarraInformacao = new javax.swing.JPanel();
        jpaUsuarioLogado = new javax.swing.JPanel();
        jlaUsuarioLogado = new javax.swing.JLabel();
        jpaLogoEmpresa = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpaInfoDataHora = new javax.swing.JPanel();
        jlaHora = new javax.swing.JLabel();
        jlaDiaSemana = new javax.swing.JLabel();
        jlaData = new javax.swing.JLabel();
        jdpTelaFilha = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiCadastroCliente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Menu");
        setExtendedState(6);
        setFocusCycleRoot(false);
        setResizable(false);

        jpaUsuarioLogado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuário logado:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(204, 0, 0))); // NOI18N

        jlaUsuarioLogado.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jlaUsuarioLogado.setForeground(new java.awt.Color(153, 0, 0));
        jlaUsuarioLogado.setText("Usuario Logado");

        javax.swing.GroupLayout jpaUsuarioLogadoLayout = new javax.swing.GroupLayout(jpaUsuarioLogado);
        jpaUsuarioLogado.setLayout(jpaUsuarioLogadoLayout);
        jpaUsuarioLogadoLayout.setHorizontalGroup(
            jpaUsuarioLogadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaUsuarioLogadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlaUsuarioLogado, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpaUsuarioLogadoLayout.setVerticalGroup(
            jpaUsuarioLogadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaUsuarioLogadoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jlaUsuarioLogado)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jpaLogoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Logo Empresa:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(153, 0, 0))); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bg/comhibernate/icones/logo_bg.png"))); // NOI18N

        javax.swing.GroupLayout jpaLogoEmpresaLayout = new javax.swing.GroupLayout(jpaLogoEmpresa);
        jpaLogoEmpresa.setLayout(jpaLogoEmpresaLayout);
        jpaLogoEmpresaLayout.setHorizontalGroup(
            jpaLogoEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaLogoEmpresaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpaLogoEmpresaLayout.setVerticalGroup(
            jpaLogoEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
        );

        jpaInfoDataHora.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(153, 0, 0))); // NOI18N

        jlaHora.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        jlaHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlaHora.setText("Hora");

        jlaDiaSemana.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        jlaDiaSemana.setForeground(new java.awt.Color(102, 0, 0));
        jlaDiaSemana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlaDiaSemana.setText("dia");

        jlaData.setFont(new java.awt.Font("Cantarell", 1, 26)); // NOI18N
        jlaData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlaData.setText("Data");

        javax.swing.GroupLayout jpaInfoDataHoraLayout = new javax.swing.GroupLayout(jpaInfoDataHora);
        jpaInfoDataHora.setLayout(jpaInfoDataHoraLayout);
        jpaInfoDataHoraLayout.setHorizontalGroup(
            jpaInfoDataHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlaData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jlaDiaSemana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jlaHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpaInfoDataHoraLayout.setVerticalGroup(
            jpaInfoDataHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpaInfoDataHoraLayout.createSequentialGroup()
                .addComponent(jlaDiaSemana)
                .addGap(45, 45, 45)
                .addComponent(jlaData)
                .addGap(40, 40, 40)
                .addComponent(jlaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpaBarraInformacaoLayout = new javax.swing.GroupLayout(jpaBarraInformacao);
        jpaBarraInformacao.setLayout(jpaBarraInformacaoLayout);
        jpaBarraInformacaoLayout.setHorizontalGroup(
            jpaBarraInformacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaBarraInformacaoLayout.createSequentialGroup()
                .addGroup(jpaBarraInformacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jpaLogoEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpaInfoDataHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpaUsuarioLogado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpaBarraInformacaoLayout.setVerticalGroup(
            jpaBarraInformacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaBarraInformacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpaUsuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpaInfoDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpaLogoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        jdpTelaFilha.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jdpTelaFilhaLayout = new javax.swing.GroupLayout(jdpTelaFilha);
        jdpTelaFilha.setLayout(jdpTelaFilhaLayout);
        jdpTelaFilhaLayout.setHorizontalGroup(
            jdpTelaFilhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        jdpTelaFilhaLayout.setVerticalGroup(
            jdpTelaFilhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastro");

        jmiCadastroCliente.setText("Cadastro Usuario");
        jmiCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastroClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jmiCadastroCliente);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consulta");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpaBarraInformacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdpTelaFilha)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jdpTelaFilha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpaBarraInformacao, javax.swing.GroupLayout.PREFERRED_SIZE, 699, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastroClienteActionPerformed
        controlador.exibirTelaCadastroCliente();
    }//GEN-LAST:event_jmiCadastroClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jdpTelaFilha;
    private javax.swing.JLabel jlaData;
    private javax.swing.JLabel jlaDiaSemana;
    private javax.swing.JLabel jlaHora;
    private javax.swing.JLabel jlaUsuarioLogado;
    private javax.swing.JMenuItem jmiCadastroCliente;
    private javax.swing.JPanel jpaBarraInformacao;
    private javax.swing.JPanel jpaInfoDataHora;
    private javax.swing.JPanel jpaLogoEmpresa;
    private javax.swing.JPanel jpaUsuarioLogado;
    // End of variables declaration//GEN-END:variables
    private ControladorTelaMenu controlador;
}
