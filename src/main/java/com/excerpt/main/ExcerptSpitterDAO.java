package com.excerpt.main;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Administrator
 */
public interface ExcerptSpitterDAO {
    
    public void addExcerpt(Excerpt exc);
    public void removeExcerpt(Excerpt exc);
    public void updateExcerpt(Excerpt exc);
    public Map<String, Object> getMappedExcerpt();
    public List retrieveByDate(String name);
    public List retrieveAll();
    public void addAccessor(Accessor accessor);
    public List<Excerpt> searchByAccount();
    public void load(String param, Excerpt excerpt);
    public Excerpt get(String param);
}
