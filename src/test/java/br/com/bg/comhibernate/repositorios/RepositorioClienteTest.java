/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bg.comhibernate.repositorios;

import br.com.bg.comhibernate.dominio.Cliente;
import org.junit.Test;

/**
 *
 * @author laramara
 */
public class RepositorioClienteTest {
    
    public RepositorioClienteTest() {
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
        RepositorioCliente repositorioCliente = new RepositorioCliente();
        repositorioCliente.salvar(cliente);
    }
    
}
