package dao;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import entità.LocationEvent;

public class locationEventDao {

	private Logger logger = LoggerFactory.getLogger(locationEventDao.class);
	
	private final EntityManager em;
	
	public locationEventDao(EntityManager em) {
		this.em = em;
	};
	
	public void saveLocationEventDao(LocationEvent u) {
		EntityTransaction t = em.getTransaction();
		t.begin();
		em.persist(u);
		t.commit();
		logger.info("location evento salvato!");
	}
	
	public LocationEvent findById(String id) {
		LocationEvent found = em.find(LocationEvent.class, UUID.fromString(id));
		return found;
	}
}
