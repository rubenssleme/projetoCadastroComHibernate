<<<<<<< HEAD
package br.com.bg.comhibernate.repositorios;

import br.com.bg.comhibernate.utilitarios.HibernateUtil;
import java.lang.reflect.ParameterizedType;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Rubens Leme
 */
public class RepositorioGenerico<Entidade> {

    private final Class<Entidade> classe;

    public RepositorioGenerico() {
        this.classe = (Class<Entidade>) ((ParameterizedType) getClass().getGenericSuperclass())
                .getActualTypeArguments()[0];
    }

    public boolean salvar(Entidade entidade) {
        Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
        boolean retorno = false;
        Transaction transacao = null;
        try {
            transacao = sessao.beginTransaction();
            sessao.save(entidade);
            transacao.commit();
            retorno = true;
        } catch (RuntimeException e) {
            if (transacao != null) {
                transacao.rollback();
            }
            retorno = false;
            throw e;
        } finally {
            sessao.close();
        }
        return retorno;
    }

}
=======
package br.com.bg.comhibernate.repositorios;

import br.com.bg.comhibernate.utilitarios.HibernateUtil;
import java.lang.reflect.ParameterizedType;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Rubens Leme
 */
public class RepositorioGenerico<Entidade> {
    
    private final Class<Entidade> classe;
    
    public RepositorioGenerico(){
       this.classe = (Class<Entidade>)((ParameterizedType) getClass().getGenericSuperclass())
               .getActualTypeArguments()[0];
    }
    
    public boolean salvar(Entidade entidade){
        Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
        boolean retorno = false;
        Transaction transacao = null;
        try{
            transacao = sessao.beginTransaction();
            sessao.save(entidade);
            transacao.commit();
            retorno  = true;
        }catch(RuntimeException e){
            if(transacao != null){
                transacao.rollback();
            }
            retorno = false;
            throw e;
        }finally{
            sessao.close();
        }
        return retorno;
    }
    
    
}
>>>>>>> 2879b0ff93ac4cd052879a08ca64493c9eab41dd
