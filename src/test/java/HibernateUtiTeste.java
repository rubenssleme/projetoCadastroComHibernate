
import br.com.bg.comhibernate.utilitarios.HibernateUtil;
import org.hibernate.Session;
import org.junit.Test;

/**
 *
 * @author rubens.leme
 */
public class HibernateUtiTeste {
    @Test
    public void conectar(){
        Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
        sessao.close();
        HibernateUtil.getFabricaDeSessoes().close();
    }
}
