package br.com.bg.comhibernate.repositorios;

import br.com.bg.comhibernate.dominio.Cliente;
import org.junit.Test;

/**
 *
 * @author laramara
 */
public class RepositorioUsuarioTest {
    
    public RepositorioUsuarioTest() {
    }

    @Test
    public void testSalvar() {
        Cliente cliente = new Cliente();
        cliente.setId(Long.MIN_VALUE);
        cliente.setNome("Guilherme Travesso");
        cliente.setCPF("14611111892");
        cliente.setRG("25420888558");
        cliente.setSexo("M");
        cliente.seteMail("Rubens@");
        RepositorioUsuario repositorioCliente = new RepositorioUsuario();
       // repositorioCliente.salvar(cliente);
    }
    
}