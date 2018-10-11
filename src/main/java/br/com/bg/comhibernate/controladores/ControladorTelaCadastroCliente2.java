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
 * @author ruben
 */
public class ControladorTelaCadastroCliente2 {
    
    private JTextField jtfNome;
    private JTextField jtfCPF;
    private JTextField jtfRG;
    private JTextField jtfSexo;
    private JTextField jtfEmail;
    Cliente cliente ;

    public ControladorTelaCadastroCliente2(JTextField jtfNome, JTextField jtfCPF, JTextField jtfRG,
            JTextField jtfSexo, JTextField jtfEmail) {
        this.jtfNome = jtfNome;
        this.jtfCPF = jtfCPF;
        this.jtfRG = jtfRG;
        this.jtfSexo = jtfSexo;
        this.jtfEmail = jtfEmail;
    }
    
    private void preencherCliente(){
        
        cliente = new Cliente();
        cliente.setNome(jtfNome.getText());
        cliente.setCPF(jtfCPF.getText());
        cliente.setRG(jtfRG.getText());
        cliente.setSexo(jtfSexo.getText());
        cliente.seteMail(jtfEmail.getText());
        
    }
    
    public void salvarCliente(){
        preencherCliente();
        
        JOptionPane.showMessageDialog(null, "Cliente - " + cliente.toString()  );
        
    }
    
    
}
