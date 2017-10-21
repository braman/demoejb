package kz.kbtu.edu.ejb.demo;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class BeanB
 */
@Stateless
@LocalBean
public class BeanB implements BeanBLocal {

    @EJB
    BeanCLocal beanCLocal;

    @Override
    public String greetings(String msg) {
        return beanCLocal.greetings("greeting from B -> " + msg);
    }
    
}
