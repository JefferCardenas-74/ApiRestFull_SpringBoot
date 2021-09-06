/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.apirest.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

/**
 *
 * @author Jeffer Cardenas <jecgdevp@gmail.com>
 */

@Data
@Entity
@Table(name = "users")
public class Users implements Serializable {
    
    @Id
    @Column(name = "user_id")
    private int id;
    
    @Column(name = "firstname")
    private String firstname;
    
    @Column(name = "lastname")
    private String lastname;
    
    @Column(name = "username")
    private String username;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    
    /* Metodo para actualizar el atributo createdAt de manera automatica*/
    
    @PrePersist
    public void prePersist(){
        this.createdAt = new Date();
    }
    
    /* Metodo para actualizar el atributo updatedAt de manera automatica*/
    
    @PreUpdate
    public void preUpdate(){
        this.updatedAt = new Date();
    }
}
