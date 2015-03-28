/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.excerpt.main;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Administrator
 */

    @Repository
public class HibernateExcerptSpitter implements ExcerptSpitterDAO {

        @Autowired
    private SessionFactory sessionFactory;
    
    public Session currentSession() {
       return sessionFactory.getCurrentSession();
    }

    public void addExcerpt(Excerpt exc) {
        //System.out.println(currentSession().isConnected());
        /*sessionFactory.openSession();
        System.out.println(currentSession().isConnected());
        currentSession().beginTransaction();
        
        currentSession().getTransaction().commit();
        currentSession().close();*/
        currentSession().save(exc);
    }

    public void removeExcerpt(Excerpt exc) {
        currentSession().delete(exc);  
    }

    public void updateExcerpt(Excerpt exc) {
    currentSession().update(exc);
    }

    public List<Excerpt> getExcerptbyAccountName(String name)
    {   
        return (List<Excerpt>) currentSession().get(List.class, name);
    }
    /**
     * Method selects a single instance and makes a map of the ENTITY-COLUMN/VALUE
     * relationship.
     * @return Map of the object
     */
    public Map<String, Object> getMappedExcerpt() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List retrieveByDate(String name) {
        List objects = currentSession().createQuery("FROM Excerpt E WHERE E.account = ? ORDER BY Date DESC").setString(0, name).list();
        return objects;
    }
    
    public List retrieveAll()
    {
        List objects = currentSession().createQuery("FROM Excerpt ORDER BY Date DESC").list();
        return objects;
    }

        public void addAccessor(Accessor accessor) {
        currentSession().save(accessor);
    }

    public List<Excerpt> searchByAccount() {
    	// TODO Auto-generated method stub
    	return null;
    }
    public void load(String param, Excerpt excerpt) {
        currentSession().load(excerpt, param);
    }
    
    public Excerpt get(String param) {
        return (Excerpt)currentSession().get(Excerpt.class, param);
    }
    
}
