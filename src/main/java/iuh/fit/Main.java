package iuh.fit;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Admin 1/13/2025
 **/
public class Main {
    public static void main(String[] args) {
//        Application.main(args);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssql");
        EntityManager em = emf.createEntityManager();
    }
}