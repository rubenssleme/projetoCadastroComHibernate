/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bg.comhibernate.controladores;

import br.com.bg.comhibernate.dominio.Cliente;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Rubens Leme
 */

public class ControladorTelaCadastroCliente {
    private JTextField jtfNome;
    private JTextField jtfCPF;
    private JTextField jtfRG;
    private JTextField jtfSexo;
    private JTextField jtfEmail;
    Cliente cliente = new Cliente();

    public ControladorTelaCadastroCliente(JTextField jtfNome, JTextField jtfCPF, JTextField jtfRG, JTextField jtfSexo, JTextField jtfEmail) {
        this.jtfNome = jtfNome;
        this.jtfCPF = jtfCPF;
        this.jtfRG = jtfRG;
        this.jtfSexo = jtfSexo;
        this.jtfEmail = jtfEmail;
    }
    
    private void preencherObjeto(){
        cliente.setNome(jtfNome.getText());
    }
    
    public void salvarCliente(){
        preencherObjeto();
        JOptionPane.showMessageDialog(null, "OK  - " + cliente.toString());
    }
    
}
