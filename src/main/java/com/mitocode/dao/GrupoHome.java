package com.mitocode.dao;

// default package
// Generated 5 abr. 2022 20:46:54 by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.mitocode.model.Grupo;

/**
 * Home object for domain model class Grupo.
 * @see .Grupo
 * @author Hibernate Tools
 */
@Stateless
public class GrupoHome {

	private static final Log log = LogFactory.getLog(GrupoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Grupo transientInstance) {
		log.debug("persisting Grupo instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Grupo persistentInstance) {
		log.debug("removing Grupo instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Grupo merge(Grupo detachedInstance) {
		log.debug("merging Grupo instance");
		try {
			Grupo result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Grupo findById(String id) {
		log.debug("getting Grupo instance with id: " + id);
		try {
			Grupo instance = entityManager.find(Grupo.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
