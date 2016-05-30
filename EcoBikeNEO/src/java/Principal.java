
import com.pucpr.model.Bike;
import com.pucpr.model.Biker;
import com.pucpr.model.Empresa;
import com.pucpr.model.Endereco;
import java.util.ArrayList;
import java.util.List;
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
        
        List<Bike> bikes = new ArrayList<Bike>(0);
        Bike bike;
        bike = new Bike();
        
        bike.setCapacidade(1);
        bike.setNumeroSerie("1A");
        bikes.add(bike);
        
        bike.setCapacidade(2);
        bike.setNumeroSerie("2A");
        bikes.add(bike);
        
        
/*================================================================================*/
        Biker biker;
        biker = new Biker();
        
        biker.setBikes(bikes);
        biker.setCpf(12312234);
        biker.setNome("Zé");
        biker.setRg(3333333);
        
        for(Bike theBike : biker.getBikes()){
            theBike.setBiker(biker);
        }
        
        em.getTransaction().begin();
        em.persist(biker);
        em.getTransaction().commit();
        
        Endereco endereco = new Endereco();
        endereco.setBairro("Bairro 1");
        endereco.setCidade("Curitiba");
        endereco.setComplemento("Casa");
        endereco.setEstado("PR");
        endereco.setNumero(3324);
        endereco.setPais("Brasil");
        endereco.setRua("TheRua");
        
        em.getTransaction().begin();
        em.persist(endereco);
        em.getTransaction().commit();
        
        Empresa empresa = new Empresa();
        empresa.setCnpj(123123123);
        empresa.setEmail("qweqwewe");
        empresa.setEndereco(endereco);
        empresa.setNome("TheEmpresa");
        empresa.setTelefone("3244-5445");
        
        em.getTransaction().begin();
        em.persist(empresa);
        em.getTransaction().commit();
        
    }
}
