package com.mitocode.dao;

// Generated 5 abr. 2022 20:46:54 by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.mitocode.model.Estudiantes;

/**
 * Home object for domain model class Estudiantes.
 * @see .Estudiantes
 * @author Hibernate Tools
 */
@Stateless
public class EstudiantesHome {

	private static final Log log = LogFactory.getLog(EstudiantesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Estudiantes transientInstance) {
		log.debug("persisting Estudiantes instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Estudiantes persistentInstance) {
		log.debug("removing Estudiantes instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Estudiantes merge(Estudiantes detachedInstance) {
		log.debug("merging Estudiantes instance");
		try {
			Estudiantes result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Estudiantes findById(String id) {
		log.debug("getting Estudiantes instance with id: " + id);
		try {
			Estudiantes instance = entityManager.find(Estudiantes.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
