package kz.kbtu.edu.ejb.demo;

import javax.ejb.Local;

@Local
public interface BeanALocal {

    
    public String greetings(String msg);
    
}
