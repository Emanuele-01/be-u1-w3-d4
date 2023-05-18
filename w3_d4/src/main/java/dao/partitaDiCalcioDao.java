package dao;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import entità.PartitaDiCalcio;

public class partitaDiCalcioDao {
	private Logger logger = LoggerFactory.getLogger(partitaDiCalcioDao.class);
	
	private final EntityManager em;
	
	public partitaDiCalcioDao(EntityManager em) {
		this.em = em;
	};
	
	public void saveDocument(PartitaDiCalcio u) {
		EntityTransaction t = em.getTransaction();
		t.begin();
		em.persist(u);
		t.commit();
		logger.info("partita salvata!");
	}
	
	public PartitaDiCalcio findById(String id) {
		PartitaDiCalcio found = em.find(PartitaDiCalcio.class, UUID.fromString(id));
		return found;
	}
}
