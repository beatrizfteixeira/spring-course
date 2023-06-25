package beatrizfteixeira.cruddemo.dao;

import beatrizfteixeira.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{
private EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override // simply read-only query doesn't need @Transactional annotation
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> query = entityManager.createQuery("FROM Student order by lastName asc", Student.class);

        return query.getResultList();
    }

    @Override
    public List<Student> findByLastName(String theLastName) {
        TypedQuery<Student> query = entityManager.createQuery("FROM Student WHERE lastName=:theData", Student.class);
        query.setParameter("theData", theLastName);
        return query.getResultList();
    }

    @Override
    @Transactional // db update !
    public void update(Student student) {
        entityManager.merge(student);
    }

}
