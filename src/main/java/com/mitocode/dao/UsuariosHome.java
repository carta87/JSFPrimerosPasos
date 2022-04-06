package com.mitocode.dao;

// default package
// Generated 5 abr. 2022 20:46:54 by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.mitocode.model.Usuarios;

/**
 * Home object for domain model class Usuarios.
 * @see .Usuarios
 * @author Hibernate Tools
 */
@Stateless
public class UsuariosHome {

	private static final Log log = LogFactory.getLog(UsuariosHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Usuarios transientInstance) {
		log.debug("persisting Usuarios instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Usuarios persistentInstance) {
		log.debug("removing Usuarios instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Usuarios merge(Usuarios detachedInstance) {
		log.debug("merging Usuarios instance");
		try {
			Usuarios result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Usuarios findById(String id) {
		log.debug("getting Usuarios instance with id: " + id);
		try {
			Usuarios instance = entityManager.find(Usuarios.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
