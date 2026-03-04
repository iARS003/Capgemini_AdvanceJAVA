package org.example.dao;

import jakarta.persistence.EntityManager;
import org.example.entity.Student;
import org.example.util.ProjUtils;

public class StudentDAO {

    public void save(Student student){
        EntityManager em = ProjUtils.getFactory().createEntityManager();
        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
        em.close();
    }

    public Student findById(Long id){
        EntityManager em = ProjUtils.getFactory().createEntityManager();
        Student student = em.find(Student.class, id);
        em.close();
        return student;
    }

    public void delete(Long id){
        EntityManager em = ProjUtils.getFactory().createEntityManager();
        em.getTransaction().begin();
        Student s = em.find(Student.class, id);
        if(s != null) em.remove(s);
        em.getTransaction().commit();
        em.close();
    }
}