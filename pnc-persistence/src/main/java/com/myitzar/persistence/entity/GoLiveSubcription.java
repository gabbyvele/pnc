package com.myitzar.persistence.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "go_live_subscription")
public class GoLiveSubcription {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "created_on")
    private Date createdOn;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
}
