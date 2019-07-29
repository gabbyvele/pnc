package com.myitzar.persistence.dao;

/**
 * Generic CRUD (create, retrieve, update, delete) util class for entities. T is the object type to be utilized.
 */
public interface DataRepository<T> {

    /**
     * T is the object type
     *
     * @param object of any type defined while initializing the class
     * @return an object defined by T
     */
    T update(T object);

}
