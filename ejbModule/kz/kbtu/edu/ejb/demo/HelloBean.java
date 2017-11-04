package kz.kbtu.edu.ejb.demo;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.jboss.logging.Logger;

import kz.kbtu.edu.ejb.demo.entities.UserEntity;

@Stateless(name = "hello")
@LocalBean
public class HelloBean implements HelloBeanLocal, HelloBeanRemote {

    Logger log = Logger.getLogger(getClass());
    
    @PersistenceContext EntityManager em;
    
    @Override
    public void sayHello(String message) {
        List<UserEntity> users = em.createQuery("FROM UserEntity").getResultList();
        log.info("Starting...");
        users.stream().forEach(log::info);
        log.info("Ending...");
        System.out.println("Hello, " + message);
    }
    
}
