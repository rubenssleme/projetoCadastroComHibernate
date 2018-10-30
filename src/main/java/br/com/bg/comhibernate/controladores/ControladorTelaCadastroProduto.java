package br.com.bg.comhibernate.controladores;

import br.com.bg.comhibernate.dominio.Produto;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author rubens leme
 */
public class ControladorTelaCadastroProduto {
    private JTextField jtfNome;
    private JComboBox jcbCategoria;
    private Produto produto;

    public ControladorTelaCadastroProduto(JTextField jtfNome, JComboBox jcbCategoria) {
        this.jtfNome = jtfNome;
        this.jcbCategoria = jcbCategoria;
    }

private void preencherProduto(){
    produto = new Produto();
    produto.setNome(jtfNome.getText());
    produto.setCategoria(jcbCategoria.getSelectedItem().toString());
}

}
