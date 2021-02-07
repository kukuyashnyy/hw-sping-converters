package org.itstep.domain.dao.impl;

import org.itstep.domain.dao.StudentDao;
import org.itstep.domain.enitity.Student;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class StudentDaoImpl implements StudentDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public Student update(Student student) {
        return entityManager.merge(student);
    }

    @Override
    @Transactional(readOnly = true)
    public Student findById(int id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Student> findAll() {
        return entityManager.createQuery("from Student", Student.class).getResultList();
    }

    @Override
    public void delete(Student student) {
        entityManager.remove(student);
    }
}
