package org.example.util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ProjUtils {

    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("myPersistenceUnit");

    public static EntityManagerFactory getFactory() {
        return emf;
    }
}