
import com.pucpr.model.Bike;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas.duffeck
 */
public class Principal {
    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ecobike");
        EntityManager em = factory.createEntityManager();
        
        Bike bike;
        bike = new Bike();
        
        bike.setCapacidade(123);
        bike.setNumeroSerie("333333");
        
        em.getTransaction().begin();  
        em.persist(bike);  
        em.getTransaction().commit();
        System.out.println("Aeeeeeeeeeeeo");
    }
}
