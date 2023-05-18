package dao;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import entità.Concerto;

public class concertoDao {
	private Logger logger = LoggerFactory.getLogger(concertoDao.class);
	
	private final EntityManager em;
	
	public concertoDao(EntityManager em) {
		this.em = em;
	};
	
	public void saveDocument(Concerto u) {
		EntityTransaction t = em.getTransaction();
		t.begin();
		em.persist(u);
		t.commit();
		logger.info("Documento salvato!");
	}
	
	public Concerto findById(String id) {
		Concerto found = em.find(Concerto.class, UUID.fromString(id));
		return found;
	}
}
