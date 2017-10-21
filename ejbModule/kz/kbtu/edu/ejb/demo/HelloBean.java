package kz.kbtu.edu.ejb.demo;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless(name = "hello")
@LocalBean
public class HelloBean implements HelloBeanLocal {
    
    @Override
    public void sayHello(String message) {
        System.out.println("Hello, " + message);
    }

}
