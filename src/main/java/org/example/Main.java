package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

//import javax.security.auth.login.Configuration;

import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal(1L, "Barsik",3,true );

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(cat);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();


    }
}