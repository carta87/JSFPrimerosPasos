package com.mitocode.dao;

// default package
// Generated 5 abr. 2022 20:46:54 by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.mitocode.model.Persona;

/**
 * Home object for domain model class Persona.
 * @see .Persona
 * @author Hibernate Tools
 */
@Stateless
public class PersonaHome {

	private static final Log log = LogFactory.getLog(PersonaHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Persona transientInstance) {
		log.debug("persisting Persona instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Persona persistentInstance) {
		log.debug("removing Persona instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Persona merge(Persona detachedInstance) {
		log.debug("merging Persona instance");
		try {
			Persona result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Persona findById(int id) {
		log.debug("getting Persona instance with id: " + id);
		try {
			Persona instance = entityManager.find(Persona.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
