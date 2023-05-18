package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import dao.EventDao;
import dao.UserDao;
import lombok.extern.slf4j.Slf4j;
import utils.JpaUtil;


@Slf4j
public class application {

	private static EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
	
	public static void main(String[] args) {
		EntityManager em = emf.createEntityManager();
		EventDao ed = new EventDao(em);
		UserDao ud = new UserDao(em);

	}

}
