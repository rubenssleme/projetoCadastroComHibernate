package br.com.bg.comhibernate.dominio;

/**
 *
 * @author rubens leme
 * @since 01/11/2018
 */
public class Produto1 {

private String descricao;
private String genero;

    public Produto1(String descricao, String genero) {
        this.descricao = descricao;
        this.genero = genero;
    }

    public Produto1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Produto1{" + "descricao=" + descricao + ", genero=" + genero + '}';
    }


    
    
}
