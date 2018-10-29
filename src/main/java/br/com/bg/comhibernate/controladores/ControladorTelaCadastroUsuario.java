package br.com.bg.comhibernate.controladores;

import br.com.bg.comhibernate.dominio.Usuario;
import br.com.bg.comhibernate.repositorios.RepositorioUsuario;
import br.com.bg.comhibernate.utilitarios.Mensagem;
import javax.swing.JComboBox;
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
    private JComboBox jcbSexo;

    Usuario usuario;
    RepositorioUsuario repositoUsuario = new RepositorioUsuario();

    public ControladorTelaCadastroUsuario() {
    }

    public ControladorTelaCadastroUsuario(JTextField jtfNome,JTextField jtfEmail, JTextField jtfCPF, 
            JTextField jtfRG,JTextField jtfIdade,JComboBox jcbSexo) {
        this.jtfNome = jtfNome;
        this.jtfEmail = jtfEmail;
        this.jtfCPF = jtfCPF;
        this.jtfRG = jtfRG;
        this.jtfIdade =jtfIdade;
        this.jcbSexo = jcbSexo;
        
    }

    private void preencherUsuario() {

        usuario = new Usuario();

        usuario.setNome(jtfNome.getText());
        usuario.seteMail(jtfEmail.getText());
        usuario.setCpf(jtfCPF.getText());
        usuario.setRg(jtfRG.getText());
        usuario.setIdade(Integer.parseInt(jtfIdade.getText()));
        usuario.setSexo(jcbSexo.getSelectedItem().toString());
    }

    public void salvarUsuario() {
        preencherUsuario();
        repositoUsuario.inserirUsuario(usuario);
        /*JOptionPane.showMessageDialog(null,
                "Usuario - " + usuario.toString());*/

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