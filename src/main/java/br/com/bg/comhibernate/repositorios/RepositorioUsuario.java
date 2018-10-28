package br.com.bg.comhibernate.repositorios;

import br.com.bg.comhibernate.dominio.Usuario;
import br.com.bg.comhibernate.utilitarios.Mensagem;

/**
 *
 * @author rubens leme
 */
public class RepositorioUsuario extends RepositorioGenerico<Usuario>{
 
    public void inserirUsuario(Usuario usuario){
        
        Mensagem.exibirMensagem( "Agora foi - "  + usuario.toString());
    }
    
    
}
