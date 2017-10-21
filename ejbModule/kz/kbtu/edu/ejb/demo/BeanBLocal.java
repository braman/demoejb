package kz.kbtu.edu.ejb.demo;

import javax.ejb.Local;

@Local
public interface BeanBLocal {

    public String greetings(String msg);
}
