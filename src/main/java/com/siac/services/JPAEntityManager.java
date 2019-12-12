/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siac.services;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.SingularAttribute;

/**
 *
 * @author Jessica Arroliga
 */
public class JPAEntityManager {
   
    EntityManager em = null;

    public JPAEntityManager(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public void guardar(Object objeto, Object registro) {
            em = getEntityManager();
        if (registro != null) {
            em.persist(registro);
        }
     }
    
    public <T extends Object> T actualizar(T entidad) {
        return em.merge(entidad);
    }

    public <T extends Object> T actualizar(T entidad, Object registro) {
        T tmp = em.merge(entidad);
        em.persist(registro);
        return tmp;
    }

    public <T extends Object> void borrar(T entidad, Object registro) {
        em.remove(actualizar(entidad));
        em.persist(registro);
    }

    public <T extends Object> T buscar(Object id, Class<T> clase) {
        return em.find(clase, id);
    }

    public <T extends Object> List<T> buscarTodo(Class<T> clase) {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        Root r = cq.from(clase);
        cq.select(r);
        return em.createQuery(cq).getResultList();
    }

    public <T extends Object> List<T> buscarTodo(Class<T> clase, SingularAttribute att) {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        Root r = cq.from(clase);
        cq.select(r);
        cq.orderBy(em.getCriteriaBuilder().desc(r.get(att)));
        return em.createQuery(cq).getResultList();
    }

    public <T extends Object> List<T> buscarActivos(Class<T> clase) {
        Query query = em.createNamedQuery(clase.getSimpleName()
                .concat(".findByActivo"));
        query.setParameter("activo", true);
        return query.getResultList();
    }

}
