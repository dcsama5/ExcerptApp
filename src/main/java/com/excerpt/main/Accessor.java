/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.excerpt.main;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author ameer
 */
@Entity
@Table(name="ACCESSORS", schema="PUBLIC")
public class Accessor implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int Id;
    private String IP;
        @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date date;
    private String localname;

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLocalname() {
        return localname;
    }

    public void setLocalname(String localname) {
        this.localname = localname;
    }
    
    
}
