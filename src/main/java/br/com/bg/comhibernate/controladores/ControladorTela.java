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
    private JFrame telaPrincipal;
    private JDesktopPane jdpTelaFilha;
    private TelaCadastroUsuario telaCadastroUsuario;

    //Construtor 
    public ControladorTela(JFrame telaPrincipal, JDesktopPane jdpTelaFilha) {
        this.telaPrincipal = telaPrincipal;
        this.jdpTelaFilha = jdpTelaFilha;
    }
    //Metodo de exibir tela no JDeskTop jdpTelaFilha   
    public void exibirTelaCadastroUsuario(){
        if(telaCadastroUsuario == null){
            telaCadastroUsuario = new TelaCadastroUsuario();//Criar nova instancia da tela.
            jdpTelaFilha.add(telaCadastroUsuario);//Adicionar no JDesktopPane.   
        }
        telaCadastroUsuario.setVisible(true);
        moverTelaParaFrenteOuParaTras(telaCadastroUsuario);
    } 
    
    public void exibirTelaCadastroProduto() {
       
        
    }
    
    
    
    private void moverTelaParaFrenteOuParaTras(JInternalFrame tela) {
       if( tela!= null){
           tela.moveToFront();
       }else {
           tela.moveToBack();
       }
       tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        tela.setSize(jdpTelaFilha.getSize());
        jdpTelaFilha.getDesktopManager().activateFrame(tela);
        try {
            tela.setSelected(true);
            tela.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ControladorTela.class.getName())
                    .log(Level.SEVERE, null, ex);
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
