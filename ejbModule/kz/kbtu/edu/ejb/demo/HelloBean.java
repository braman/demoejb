package kz.kbtu.edu.ejb.demo;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless(name = "hello")
@LocalBean
public class HelloBean implements HelloBeanLocal, BeanALocal {
    
    @EJB(mappedName = "hello")
    BeanALocal beanALocal;
    
    @Override
    public void sayHello(String message) {
        System.out.println(beanALocal.greetings(message));
    }

    @Override
    public String greetings(String msg) {
        return "Greetings, " + msg;
    }
}
