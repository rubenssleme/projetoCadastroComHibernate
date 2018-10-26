package br.com.bg.comhibernate.controladores;

import br.com.bg.comhibernate.telas.TelaCadastroUsuario;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Rubens Leme
 */
public abstract class ControladorTela {

    //Atributos
    private String mensagem;
    private final JFrame telaPrincipal;
    private final JDesktopPane jdpTelaCadastroUsuario;
    private TelaCadastroUsuario telaCadastroUsuario;

    //Construtor 
    public ControladorTela(JFrame telaPrincipal, JDesktopPane jdpTelaCadastroUsuario) {
        this.telaPrincipal = telaPrincipal;
        this.jdpTelaCadastroUsuario = jdpTelaCadastroUsuario;
    }

    public void exibirTelaCadastroCliente() {
        if (telaCadastroUsuario == null) {
            telaCadastroUsuario = new TelaCadastroUsuario();//Criar nova instancia da tela.
            jdpTelaCadastroUsuario.add(telaCadastroUsuario);//Adicionar no JDesktopPane.   
        }
        telaCadastroUsuario.setVisible(true);
        moverTelaParaFrenteOuParaTras(telaCadastroUsuario);
    }

    private void moverTelaParaFrenteOuParaTras(JInternalFrame tela) {
        if (tela != null) {
            tela.moveToFront();
        } else {
            tela.moveToBack();
        }
        tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        tela.setSize(jdpTelaCadastroUsuario.getSize());
        jdpTelaCadastroUsuario.getDesktopManager().activateFrame(tela);
        try {
            tela.setSelected(true);
            tela.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ControladorTela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void fechar() {
        int sair = JOptionPane.showConfirmDialog(null,
                "Tem certeza que deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

}
