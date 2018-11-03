package br.com.bg.comhibernate.dominio;

/**
 *
 * @author rubens leme
 * @since  29/10/2018
 */
public class Produto {
    private String nome;
    private String categoria;

    public Produto(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public Produto() {
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", categoria=" + categoria + '}';
    }
    
    
    
}
