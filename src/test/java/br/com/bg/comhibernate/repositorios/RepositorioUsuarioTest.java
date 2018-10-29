<<<<<<< HEAD:src/test/java/br/com/bg/comhibernate/repositorios/RepositorioUsuarioTest.java
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
=======
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
>>>>>>> 2879b0ff93ac4cd052879a08ca64493c9eab41dd:src/test/java/br/com/bg/comhibernate/repositorios/RepositorioClienteTest.java
