package com.excerpt.main;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import static junit.runner.Version.id;

/**
 *
 * @author Administrator
 */
@Entity
@Table(schema="PUBLIC", name="REFERENCE")
public class Excerpt implements Serializable {
    
    private String account;
    private boolean show;
    
    @Id
    private String Excerpt;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date date;

    public String getExcerpt() {
        return Excerpt;
    }

    public void setExcerpt(String Excerpt) {
        this.Excerpt = Excerpt;
    }
    
    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }
        
    
    
    private String link;
    public void setLink(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }
    
    private String comments;
    /**
     * This method sets the date to the current DateTime 
     */
    public void setDate() {
        date = Calendar.getInstance().getTime();  
    }
    
    public Date getDate() {
        
        return this.date;
    }
    /*    private Date date;
     *
     *
     *
     * public void setDate() {
     * this.date = Calendar.getInstance().getTime();    }
     */
    public void setAccount(String account) {
        this.account = account;
    }
    
    
    
    public void setComments(String comments) {
        this.comments = comments;
    }
    
    
    public String getAccount() {
        return account;
    }
    
  
    
    
    public String getComments() {
        return comments;
    }
    
    
    
    public Excerpt()
    {
        
    }
    
    

}


