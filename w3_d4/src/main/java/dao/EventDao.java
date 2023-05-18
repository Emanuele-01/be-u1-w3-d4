package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import entità.gestioneventiConstructor;

public class EventDao {
	private static Logger logger = LoggerFactory.getLogger(EventDao.class);
	private final EntityManager em;
	
	public EventDao (EntityManager em) {
		this.em = em;
	}; 
	
	public void save(gestioneventiConstructor ge) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(ge);
		transaction.commit();
		logger.info("evento salvato con successo!!!");;
	};
	
	public gestioneventiConstructor findById(long id) {
		gestioneventiConstructor found = em.find(gestioneventiConstructor.class, id);
		return found;
	}
	
	public void Delete(long id) {
		gestioneventiConstructor found = em.find(gestioneventiConstructor.class, id);
		if (found != null) {
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			em.remove(found);
			transaction.commit();
			logger.info("evento rimosso con successo!!!");
		}
	}
	
	public void refresh(long id) {
		gestioneventiConstructor found = em.find(gestioneventiConstructor.class, id);
		em.refresh(found);
		logger.info("refresh di: ");
		logger.info("-> " + found);
	}
}
