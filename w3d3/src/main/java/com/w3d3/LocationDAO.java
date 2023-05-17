package com.w3d3;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class LocationDAO extends Location{
    public static EntityManager em =  JpaUtil.getEntityManagerFactory().createEntityManager();
        public static EntityTransaction transaction = em.getTransaction();

    public LocationDAO(String nome, String citta) {
        super(nome, citta);
    }

    public static void save(Location loc){
        transaction.begin();
        em.persist(loc);
        transaction.commit();
    }
    
}
