package br.com.bg.comhibernate.utilitarios;

import javax.swing.JOptionPane;

/**
 *
 * @author Rubens Leme
 */
public class Mensagem {
    
    public static void exibirMensagem(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    public static String exibirPergunta(String mensagem){
     return JOptionPane.showInputDialog(mensagem);
    
    }
}
