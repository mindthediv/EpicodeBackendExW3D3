package com.w3d3;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class PersonaDAO extends Persona {
    public static EntityManager em =  JpaUtil.getEntityManagerFactory().createEntityManager();
    public static EntityTransaction transaction = em.getTransaction();

    public PersonaDAO(String nome, String cognome, String email, String dataNascita, com.w3d3.sesso sesso,
            List<Partecipazione> listaPartecipazioni) {
        super(nome, cognome, email, dataNascita, sesso);
    }

    public static void save(Persona pp){
        transaction.begin();
        em.persist(pp);
        transaction.commit();
    }
    
}
