/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
