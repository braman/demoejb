package kz.kbtu.edu.ejb.demo;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class BeanC implements BeanCLocal {

    @EJB
    BeanALocal beanALocal;

    @Override
    public String greetings(String msg) {
        return beanALocal.greetings("greeting from C -> " + msg);
    }

}
