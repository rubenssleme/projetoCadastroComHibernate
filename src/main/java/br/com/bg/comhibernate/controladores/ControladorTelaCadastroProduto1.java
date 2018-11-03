package br.com.bg.comhibernate.controladores;

import br.com.bg.comhibernate.dominio.Produto1;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author rubens leme
 */
public class ControladorTelaCadastroProduto1 {
    private JTextField jtfDescricao;
    private JComboBox jcbGenero;
    Produto1 produto1;

    public ControladorTelaCadastroProduto1(JTextField jtfDescricao, JComboBox jcbGenero) {
        this.jtfDescricao = jtfDescricao;
        this.jcbGenero = jcbGenero;
    }
    
    public void preecherProduto(){
        produto1 = new Produto1();
        produto1.setDescricao(jtfDescricao.getText());
        produto1.setGenero(jcbGenero.getSelectedItem().toString());
    }
}
