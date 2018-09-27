package br.com.bg.comhibernate.controladores;

import br.com.bg.comhibernate.telas.TelaCadastroCliente;

/**
 *
 * @author laramara
 */
public class Principal {
    
    private static void main(String [] args){
        TelaCadastroCliente telaCadastroCliente = new TelaCadastroCliente();
        telaCadastroCliente.setVisible(true);
    }
}
