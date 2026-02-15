
        package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //  Student s1=new Student();
        //s1.setSid(12);
        //s1.setSname("Naman");   //creates a student object
        // Student s2=null; //this is created for fetching concept


        try {
            Alien a1 = new Alien();
            a1.setAid(104);
            a1.setAname("inayak");
            a1.setTech("ava");

            // creating obj for java

            Laptop lp = new Laptop();

            lp.setBrand(4);
            lp.setModel(5);
            lp.setLid(2);
            a1.setLaptop(lp);    // u r emdedding laptop class in alien class and creating object for laptop class and setting
            //it in alien class and then saving alien class object so that laptop class object also gets saved in database because of cascading effect
            SessionFactory sessionFactory = new Configuration() //builds the session factory from hibernate.cfg.xml
                    .configure()            //loads hibernate configuration file
                    .addAnnotatedClass(org.example.Alien.class)
                    .addAnnotatedClass(org.example.Laptop.class)//adds the annotated class
                    .buildSessionFactory();              //builds the session factory
            Session session = sessionFactory.openSession();        //opens a session
            //fetches the student object having primary key 8
            //session.persist(s1);                             //saves the student object


            Transaction tx = session.beginTransaction();  //begins a transaction
            session.persist(lp);
            session.persist(a1);

            //session.merge(s1); //saves the student object, if the object is already present then it updates the object otherwise it creates a new object

            tx.commit();  //commits the transaction

            session.close();                             //closes the session


            System.out.println(a1);

        } catch (Exception e) {
            System.out.println(e);
            ;
        }
    }
}