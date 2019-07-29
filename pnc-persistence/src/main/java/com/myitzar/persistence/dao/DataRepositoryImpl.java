package com.myitzar.persistence.dao;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Stateless
public class DataRepositoryImpl<T> implements DataRepository<T> {

    @Inject
    private EntityManager em;

    @Override
    public T update(T object) {
        em.merge(object);
        em.flush();
        return object;
    }

}
