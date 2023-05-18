package dao;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import entità.garaDiAtletica;

public class GaraDiAtleticaDao {
	private Logger logger = LoggerFactory.getLogger(GaraDiAtleticaDao.class);
	
	private final EntityManager em;
	
	public GaraDiAtleticaDao(EntityManager em) {
		this.em = em;
	};
	
	public void saveDocument(garaDiAtletica u) {
		EntityTransaction t = em.getTransaction();
		t.begin();
		em.persist(u);
		t.commit();
		logger.info("Documento salvato!");
	}
	
	public garaDiAtletica findById(String id) {
		garaDiAtletica found = em.find(garaDiAtletica.class, UUID.fromString(id));
		return found;
	}
}
