package com.ap.coreFact.persistencia;

import com.ap.coreFact.entidad.Auditoria;
import com.ap.coreFact.entidad.Cuenta_;
import com.ap.coreFact.entidad.Periodo;
import com.ap.coreFact.sql.SQL;
import org.eclipse.persistence.internal.jpa.EJBQueryImpl;
import org.eclipse.persistence.queries.DatabaseQuery;

import javax.persistence.*;
import javax.persistence.criteria.*;
import javax.persistence.metamodel.SingularAttribute;
import java.util.*;

public class Helper extends Persistence {

    public Helper(String unitPersistence, Map map) {
        super(unitPersistence, map);
    }

    public void refreshSession() {
        try {
            emf.getCache().evictAll();
        } catch (Exception e) {
        }
    }

    public <T extends Object> void insert(T entity) throws Exception {
        insert(entity, null);
    }

    public <T extends Object> void insert(T entity, Auditoria auditoria)
            throws Exception {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(entity);
            if (auditoria != null) {
                em.persist(entity);
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public <T extends Object> List<T> buscarRango(Class<T> claseEntidad,
                                                  Criterio inicio, Criterio fin) {
        return buscarRango(claseEntidad, inicio, fin, true);
    }

    private <T extends Object> List<T> buscarRango(Class<T> claseEntidad,
                                                   Criterio inicio, Criterio fin, boolean incluir) {
        List<T> obj;
        EntityManager em = emf.createEntityManager();
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery cq = cb.createQuery(claseEntidad);
            Root root = cq.from(claseEntidad);
            cq.select(root);
            Predicate[] preds = new Predicate[2];
            int i = -1;
            ParameterExpression p1 = cb.parameter(inicio.getField().getType().getJavaType());
            ParameterExpression p2 = null;
            preds[++i] = incluir ? cb.greaterThanOrEqualTo(root.get(inicio.getField()), p1)
                    : cb.greaterThan(root.get(inicio.getField()), p1);
            if (fin != null) {
                p2 = cb.parameter(fin.getField().getType().getJavaType());
                preds[++i] = incluir ? cb.lessThanOrEqualTo(root.get(fin.getField()), p2)
                        : cb.lessThan(root.get(fin.getField()), p2);
            }
            cq.where(
                    cb.and(preds)
            );
            TypedQuery tq = em.createQuery(cq);
            tq.setParameter(p1, inicio.getValue());
            tq.setParameter(p2, fin.getValue());
            tq.setMaxResults(1);
            obj = (List<T>) tq.getSingleResult();
        } catch (NoResultException ex) {
            obj = null;
        } finally {
            em.close();
        }
        return obj;
    }

    public <T extends Object> void update(T entity) throws Exception {
        update(entity, null);
    }

    public <T extends Object> void update(T entity, Auditoria auditoria)
            throws Exception {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(entity);
            if (auditoria != null) {
                em.persist(auditoria);
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public <T extends Object> void delete(T entity) throws Exception {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(em.merge(entity));
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public <T extends Object> void execSql(String sql, Object... values) throws Exception {
        final EntityTransaction t = entityManager.getTransaction();
        t.begin();
        Query update = entityManager.createNativeQuery(sql);
        if (values != null) {
            for (int i = 0; i < values.length; i++) {
                update.setParameter(i + 1, values[i]);
            }
        }
        update.executeUpdate();
        t.commit();
    }

    public <T extends Object> void execSql(SQL sql, Object... values) throws Exception {
        execSql(sql.toString(), values);
    }

    public <T extends Object> T search(Object id, Class<T> entityClass) throws Exception {
        T obj;
        EntityManager em = emf.createEntityManager();
        try {
            obj = em.find(entityClass, id);
        } finally {
            em.close();
        }
        return obj;
    }

    public <T, K> K
    getMax(Class<T> entidad, SingularAttribute field, Criterio... crits) throws Exception {
        return (K) getMax(entidad, field.getType().getJavaType(),
                field, crits);
    }

    public <T, K> K
    getMax(Class<T> entidad, Class<K> returnVal,
           SingularAttribute field, Criterio... crits) throws Exception {
        EntityManager em = emf.createEntityManager();
        K val;
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery criteria
                    = cb.createQuery(returnVal);
            Root root = criteria.from(entidad);
            criteria.select(cb.max(root.get(field)));
            if (crits != null) {
                Predicate[] preds = new Predicate[crits.length];
                int ind = 0;
                for (Criterio crit : crits) {
                    preds[ind] = cb.equal(root.get(crit.getField()), crit.getValue());
                    ++ind;
                }
                criteria.where(preds);
            }
            val = (K) em.createQuery(criteria).getSingleResult();
        } catch (Exception e) {
            val = null;
        }
        return val;
    }

    public <T extends Object> T search(Class<T> claseEntidad, List<SingularAttribute> ordenar,
                                       Criterio... criterios) throws Exception {
        T obj;
        EntityManager em = emf.createEntityManager();
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery cq = cb.createQuery(claseEntidad);
            Root root = cq.from(claseEntidad);
            cq.select(root);
            Predicate[] preds = new Predicate[criterios.length];
            int ind = 0;
            for (Criterio crit : criterios) {
                preds[ind] = cb.equal(root.get(crit.getField()), crit.getValue());
                ++ind;
            }
            cq.where(
                    cb.and(preds)
            );
            if (ordenar != null) {
                List<Order> orders = new ArrayList<>();
                for (SingularAttribute order : ordenar) {
                    orders.add(cb.asc(root.get(order)));
                }
                cq.orderBy(orders);
            }
            obj = (T) em.createQuery(cq).setMaxResults(1).getSingleResult();
        } catch (NoResultException ex) {
            obj = null;
        } finally {
            em.close();
        }
        return obj;
    }

    public <T extends Object> T search(Class<T> claseEntidad, SingularAttribute ordenar, boolean asc,
                                       Criterio... criterios) throws Exception {
        T obj;
        EntityManager em = emf.createEntityManager();
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery cq = cb.createQuery(claseEntidad);
            Root root = cq.from(claseEntidad);
            cq.select(root);
            Predicate[] preds = new Predicate[criterios.length];
            int ind = 0;
            for (Criterio crit : criterios) {
                preds[ind] = cb.equal(root.get(crit.getField()), crit.getValue());
                ++ind;
            }
            cq.where(
                    cb.and(preds)
            );
            if (ordenar != null) {
                List<Order> orders = new ArrayList<>();
                if (asc) {
                    orders.add(cb.asc(root.get(ordenar)));
                } else {
                    orders.add(cb.desc(root.get(ordenar)));
                }
                cq.orderBy(orders);
            }
            obj = (T) em.createQuery(cq).setMaxResults(1).getSingleResult();
        } catch (NoResultException ex) {
            obj = null;
        } finally {
            em.close();
        }
        return obj;
    }

    public <T extends Object> List<T> searchAll(Class<T> claseEntidad) throws Exception {
        List<T> lista;
        EntityManager em = emf.createEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(claseEntidad));
            lista = (List<T>) em.createQuery(cq).getResultList();
        } catch (NoResultException ex) {
            lista = null;
        } finally {
            em.close();
        }
        return lista;
    }

    public <T extends Object> List<T> searchAll(Class<T> claseEntidad,
                                                Criterio... criterios) throws Exception {
        return searchAll(claseEntidad, (List<SingularAttribute>) null, criterios);
    }

    public <T extends Object> List<T> searchAll(Class<T> claseEntidad,
                                                List<SingularAttribute> ordenar) throws Exception {
        return searchAll(claseEntidad, ordenar, (Criterio[]) null);
    }

    public <T extends Object> List<T> searchAll(Class<T> claseEntidad,
                                                List<SingularAttribute> ordenar,
                                                Criterio... criterios) throws Exception {
        return searchAll(claseEntidad, false, ordenar, false, criterios);
    }

    public <T extends Object> List<T> searchAll(Class<T> claseEntidad, boolean distinct,
                                                List<SingularAttribute> ordenar,
                                                Criterio... criterios) throws Exception {
        return searchAll(claseEntidad, distinct, ordenar, false, criterios);
    }

    public <T extends Object> List<T> searchAll(Class<T> claseEntidad, boolean distinct,
                                                List<SingularAttribute> ordenar, boolean desc,
                                                Criterio... criterios) throws Exception {
        List<T> lista;
        EntityManager em = emf.createEntityManager();
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery cq = cb.createQuery(claseEntidad);
            Root root = cq.from(claseEntidad);
            cq.select(root).distinct(distinct);
            if (criterios != null) {
                Predicate[] preds = new Predicate[criterios.length];
                int ind = 0;
                for (Criterio crit : criterios) {
                    preds[ind] = cb.equal(root.get(crit.getField()), crit.getValue());
                    ++ind;
                }
                cq.where(
                        cb.and(preds)
                );
            }
            if (ordenar != null) {
                addOrderBy(ordenar, cq, desc, cb, root);
            }
            lista = em.createQuery(cq).getResultList();
        } catch (NoResultException ex) {
            lista = null;
        } finally {
            em.close();
        }
        return lista;
    }

    public <T extends Object> T execNamedQuery(String namedQuery, Object... valores) throws Exception {
        T obj;
        EntityManager em = emf.createEntityManager();
        try {
            Query query = em.createNamedQuery(namedQuery);
            int i = 0;
            for (Object valor : valores) {
                query.setParameter(++i, valor);
            }
            obj = (T) query.setMaxResults(1).getSingleResult();
        } catch (NoResultException e) {
            obj = null;
        } finally {
            em.close();
        }
        return obj;
    }

    public <T extends Object> List<T> execNamedQueryList(String namedQuery,
                                                         Object... valores) throws Exception {
        List<T> lst;
        EntityManager em = emf.createEntityManager();
        try {
            Query query = em.createNamedQuery(namedQuery);
            int i = 0;
            for (Object valor : valores) {
                query.setParameter(++i, valor);
            }
            lst = (List<T>) query.getResultList();
        } catch (NoResultException e) {
            lst = null;
        } finally {
            em.close();
        }
        return lst;
    }

    public <T extends Object> List<T> filter(Class<T> claseEntidad, SingularAttribute campo, Object valor,
                                             Criterio... criterios) {
        return filter(claseEntidad, null, campo, valor, false, criterios);
    }

    public <T extends Object> List<T> filter(Class<T> claseEntidad,
                                             List<SingularAttribute> ordenar, SingularAttribute campo,
                                             Object valor) {
        return filter(claseEntidad, ordenar, campo, valor, false);
    }

    public <T extends Object> List<T> filter(Class<T> claseEntidad,
                                             List<SingularAttribute> ordenar, SingularAttribute campo,
                                             Object valor, boolean desc, Criterio... criterios) {
        List<T> filtro;
        EntityManager em = emf.createEntityManager();
        try {
            refreshSession();
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery cq = cb.createQuery(claseEntidad);
            Root root = cq.from(claseEntidad);
            cq.select(root);
            ParameterExpression p = cb.parameter(campo.getJavaType());
            Predicate like;
            if (valor instanceof String) {
                like = cb.like(cb.lower(root.get(campo)), p);
            } else {
                like = cb.equal(root.get(campo), p);
            }
            if (criterios != null) {
                Predicate[] preds = new Predicate[criterios.length + 1];
                preds[0] = like;
                int ind = 1;
                for (Criterio crit : criterios) {
                    preds[ind] = cb.equal(root.get(crit.getField()), crit.getValue());
                    ++ind;
                }
                cq.where(
                        cb.and(preds)
                );
            } else {
                cq.where(
                        cb.and(like)
                );
            }
            if (ordenar != null) {
                addOrderBy(ordenar, cq, desc, cb, root);
            }
            Query query = em.createQuery(cq);
            if (valor instanceof String) {
                query.setParameter(p, "%".concat(valor.toString().trim().toLowerCase()).concat("%"));
            } else {
                query.setParameter(p, valor);
            }
            filtro = query.getResultList();
        } catch (NoResultException ex) {
            filtro = null;
        } finally {
            em.close();
        }
        return filtro;
    }

    public <T extends Object> T like(Class<T> claseEntidad, SingularAttribute campo,
                                     Object valor) {
        T mLike;
        EntityManager em = emf.createEntityManager();
        try {
            refreshSession();
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery cq = cb.createQuery(claseEntidad);
            Root root = cq.from(claseEntidad);
            cq.select(root);
            ParameterExpression p = cb.parameter(campo.getJavaType());
            Predicate like;
            if (valor instanceof String) {
                like = cb.like(root.get(campo), p);
            } else {
                like = cb.equal(root.get(campo), p);
            }
            cq.where(
                    cb.and(like)
            );
            Query query = em.createQuery(cq);
            if (valor instanceof String) {
                query.setParameter(p, valor.toString());
            } else {
                query.setParameter(p, valor);
            }
            mLike = (T) query.setMaxResults(1).getSingleResult();
        } catch (NoResultException ex) {
            mLike = null;
        } finally {
            em.close();
        }
        return mLike;
    }

    public void viewQuery(Query query) {
        DatabaseQuery databaseQuery = ((EJBQueryImpl) query).getDatabaseQuery();
        System.out.println(databaseQuery.getSQLString());
    }

    public <T extends Object> boolean exists(Class<T> claseEntidad, Criterio... criterios) {
        boolean existe;
        EntityManager em = emf.createEntityManager();
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery cq = cb.createQuery(claseEntidad);
            Root root = cq.from(claseEntidad);
            cq.select(cb.count(root));
            Predicate[] preds = new Predicate[criterios.length];
            int ind = 0;
            for (Criterio crit : criterios) {
                preds[ind] = cb.equal(root.get(crit.getField()), crit.getValue());
                ++ind;
            }
            cq.where(
                    cb.and(preds)
            );
            Query query = em.createQuery(cq);
            existe = ((long) query.getSingleResult()) > 0;
        } finally {
            em.close();
        }
        return existe;
    }

    public <T extends Object> long buscarConteo(Class<T> claseEntidad, String namedQuery, Object... valores) {
        long count = 0L;
        EntityManager em = emf.createEntityManager();
        try {
            Query query = em.createNamedQuery(claseEntidad.getSimpleName()
                    .concat(".").concat(namedQuery));
            int i = 0;
            for (Object valor : valores) {
                query.setParameter(++i, valor);
            }
            count = (long) query.getSingleResult();
        } finally {
            em.close();
        }
        return count;
    }

    public Date getFechaServer() {
        Date date;
        EntityManager em = emf.createEntityManager();
        try {
            Query query = em.createNativeQuery("SELECT NOW()");
            date = (Date) query.getSingleResult();
        } catch (NoResultException e) {
            date = null;
        } finally {
            em.close();
        }
        return date;
    }

    public Periodo getPeriodoActual() throws Exception {
        final Calendar cal = Calendar.getInstance();
        cal.setTime(getFechaServer());
        return search(String.valueOf(cal.get(Calendar.YEAR)).concat("-")
                        .concat(String.valueOf(cal.get(Calendar.MONTH) + 1)),
                Periodo.class);
    }

    private void addOrderBy(List<SingularAttribute> orderBy, CriteriaQuery cq, boolean desc,
                            CriteriaBuilder cb, Root root) {
        List<Order> orders = new ArrayList<>();
        for (SingularAttribute order : orderBy) {
            if (desc) {
                orders.add(cb.desc(root.get(order)));
            } else {
                orders.add(cb.asc(root.get(order)));
            }
        }
        cq.orderBy(orders);
    }
}
