package com.septproject.wed_16_30_2.model;


import javax.persistence.*;

import java.util.Date;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String first_name;
    private String last_name;
    private String email_address;
    private String username;

    private Date created;
    private Date updated;

    @PrePersist
    protected void conCreate(){
        this.created = new Date();
    }

    @PreUpdate
    protected void onUpdate(){
        this.updated = new Date();
    }


}
