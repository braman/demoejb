package kz.kbtu.edu.ejb.demo;

import javax.ejb.Local;
import javax.ejb.Remote;

@Remote
public interface HelloBeanRemote {

    void sayHello(String message);
    
}
