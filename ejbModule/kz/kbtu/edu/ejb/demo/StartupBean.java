package kz.kbtu.edu.ejb.demo;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@LocalBean
@Startup
public class StartupBean {

    @EJB
    HelloBeanLocal helloLocal; //comes from some pool
    
    @PostConstruct
    public void init() {
        helloLocal.sayHello("KBTU");
    }
    
}
