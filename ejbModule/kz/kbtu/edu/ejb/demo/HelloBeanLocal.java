package kz.kbtu.edu.ejb.demo;

import javax.ejb.Local;

@Local
public interface HelloBeanLocal {

    void sayHello(String message);
    
}
