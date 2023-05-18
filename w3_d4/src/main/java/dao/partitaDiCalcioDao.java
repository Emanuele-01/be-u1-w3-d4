package dao;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class partitaDiCalcioDao {
	private Logger logger = LoggerFactory.getLogger(partitaDiCalcioDao.class);
	
	private final EntityManager em;
	
	public partitaDiCalcioDao(EntityManager em) {
		this.em = em;
	};
}
