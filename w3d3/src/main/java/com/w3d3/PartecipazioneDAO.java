package com.w3d3;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class PartecipazioneDAO extends Partecipazione {
    public static EntityManager em =  JpaUtil.getEntityManagerFactory().createEntityManager();
    public static EntityTransaction transaction = em.getTransaction();

    public PartecipazioneDAO(Persona persona, Evento evento, com.w3d3.stato stato) {
        super(persona, evento, stato);
    }

        public static void save(Partecipazione par) {
            transaction.begin();
            em.persist(par);
            transaction.commit();
        }
    
    
}
