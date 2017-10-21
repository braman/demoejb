package kz.kbtu.edu.ejb.demo;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class BeanA
 */
@Stateless
@LocalBean
public class BeanA implements BeanALocal {

    @EJB
    BeanBLocal beanBLocal;

    @Override
    public String greetings(String msg) {
        return beanBLocal.greetings("greeting from A -> " + msg);
    }
    
}
