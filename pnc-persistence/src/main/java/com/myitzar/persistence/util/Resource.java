package com.myitzar.persistence.util;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@ApplicationScoped
public class Resource {

    @PersistenceContext(unitName = "primary")
    private EntityManager em;

    @Produces
    public EntityManager getEntityManager(){
        return em;
    }
}
