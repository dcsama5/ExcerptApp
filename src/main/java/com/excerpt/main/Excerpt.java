package com.excerpt.main;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.Date;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Administrator
 */
@Entity
@Table(schema="PUBLIC", name="REFERENCE")
public class Excerpt implements Serializable {
    
    private String account;
    private boolean show;

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }

    @EmbeddedId
            ExcerptIdentifier id;
    
    
    private String link;
    public void setLink(String link) {
        this.link = link;
    }
    
    public void setId(ExcerptIdentifier id)
    {
          
        this.id = id;
    }
    
    public ExcerptIdentifier getId()
    {
        return this.id;
    }
    public String getLink() {
        return link;
    }
    
    private String comments;
    /**
     * This method sets the date to the current DateTime 
     */
    public void setDate() {
        id.setDate();
        
    }
    
    public Date getDate() {
        
        return id.getDate();
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


