package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Automovel;
import entities.Marca;
import entities.Modelo;


public class Application {

	public static void main(String[] args) {
		
		Marca ma = new Marca();
		ma.setNome("FIAT");
		
		Marca ma1 = new Marca();
		ma1.setNome("FORD");
		
		Modelo mo = new Modelo();
		mo.setDescricao("Carro");
		mo.setPotencia(1000);
		mo.setMarca(ma);
		
		Modelo mo1 = new Modelo();
		mo1.setDescricao("Carro Esportivo");
		mo1.setPotencia(2000);
		mo1.setMarca(ma1);
		
		Automovel a1 = new Automovel();
		a1.setAnoFabricacao(2021);
		a1.setAnoModelo(2021);
		a1.setObservacoes("Ano 2021");
		a1.setPreco(50000);
		a1.setKilometragem(0);
		a1.setModelo(mo);
		
		Automovel a2 = new Automovel();
		a2.setAnoFabricacao(2022);
		a2.setAnoModelo(2022);
		a2.setObservacoes("Ano 2022");
		a2.setPreco(100000);
		a2.setKilometragem(0);
		a2.setModelo(mo1);
		

		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("atividade6");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(ma);
		em.persist(ma1);
		em.persist(mo);
		em.persist(mo1);
		em.persist(a1);
		em.persist(a2);
		
		em.getTransaction().commit();
		em.getTransaction().commit();
		em.getTransaction().commit();
		em.getTransaction().commit();
		em.getTransaction().commit();
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

}
