package br.com.bg.comhibernate.controladores;

import br.com.bg.comhibernate.dominio.Usuario;
import br.com.bg.comhibernate.utilitarios.Mensagem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author rubens leme
 */
public class ControladorTelaCadastroUsuario {

    private JTextField jtfNome;
    private JTextField jtfEmail;
    private JTextField jtfCPF;
    private JTextField jtfRG;
    private JTextField jtfIdade;
    private JTextField jtfSexo;

    Usuario usuario;

    public ControladorTelaCadastroUsuario() {
    }

    public ControladorTelaCadastroUsuario(JTextField jtfNome, JTextField jtfCPF, JTextField jtfRG,
            JTextField jtfSexo, JTextField jtfEmail) {
        this.jtfNome = jtfNome;
        this.jtfCPF = jtfCPF;
        this.jtfRG = jtfRG;
        this.jtfSexo = jtfSexo;
        this.jtfEmail = jtfEmail;
    }

    private void preencherUsuario() {

        usuario = new Usuario();

        usuario.setNome(jtfNome.getText());
        usuario.seteMail(jtfEmail.getText());
        usuario.setCpf(jtfCPF.getText());
        usuario.setRg(jtfRG.getText());
        usuario.setIdade(Integer.parseInt(jtfIdade.getText()));
        usuario.setSexo(jtfSexo.getText());
    }

    public void salvarCliente() {
        preencherUsuario();
        JOptionPane.showMessageDialog(null,
                "Usuario - " + usuario.toString());

    }

    public void fecharTela() {
        int opcao = JOptionPane.showConfirmDialog(null,
                "Tem certeza que deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            Mensagem.exibirMensagem("valor ---> " + opcao);
        } else {
            Mensagem.exibirMensagem("valor nao ---> " + opcao);
        }
    }

}
