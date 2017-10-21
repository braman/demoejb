package kz.kbtu.edu.ejb.demo;

import javax.ejb.Local;

@Local
public interface BeanCLocal {

    public String greetings(String msg);
    
}
