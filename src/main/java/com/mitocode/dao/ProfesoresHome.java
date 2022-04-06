package com.mitocode.dao;

// default package
// Generated 5 abr. 2022 20:46:54 by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.mitocode.model.Profesores;

/**
 * Home object for domain model class Profesores.
 * @see .Profesores
 * @author Hibernate Tools
 */
@Stateless
public class ProfesoresHome {

	private static final Log log = LogFactory.getLog(ProfesoresHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Profesores transientInstance) {
		log.debug("persisting Profesores instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Profesores persistentInstance) {
		log.debug("removing Profesores instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Profesores merge(Profesores detachedInstance) {
		log.debug("merging Profesores instance");
		try {
			Profesores result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Profesores findById(String id) {
		log.debug("getting Profesores instance with id: " + id);
		try {
			Profesores instance = entityManager.find(Profesores.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
