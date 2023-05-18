package dao;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import app.application;
import entità.User;

public class UserDao {
	
	private Logger logger = LoggerFactory.getLogger(UserDao.class);
	
	private final EntityManager em;
	
	public UserDao(EntityManager em) {
		this.em = em;
	};
	
	public void saveDocument(User u) {
		EntityTransaction t = em.getTransaction();
		t.begin();
		em.persist(u);
		t.commit();
		logger.info("User salvato!");
	}
	
	public User findById(String id) {
		User found = em.find(User.class, UUID.fromString(id));
		return found;
	}
}
