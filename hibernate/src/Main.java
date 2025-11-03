
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import util.studentUtil;
//import org.hibernate.query.Query;

import javax.persistence.Query;
import java.util.Date;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate-config.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        session.beginTransaction();
    //    Transaction transaction = null;
        /* HQL get all queries */
       /* Query query = session.createQuery("from Student");
        List<Student> students = query.getResultList();

        for (Student student : students) {
            System.out.println(student.toString());
        }*/

        // hql update row

      /*  Query query = session.createQuery("update Student set first_name=:name where id=:id" );
        query.setParameter("name", "salooma");
        query.setParameter("id", 1);
        query.executeUpdate();
        query = session.createQuery("from Student where id=:id");
        query.setParameter("id", 1);
        Student student = (Student) query.getSingleResult();


        session.getTransaction().commit();*/

        // create student with data column

       /* Date date = new Date();  // using all arg constructor
        studentUtil studentUtil = new studentUtil();
        Student student = new Student(5, "salma", "emam", date, studentUtil);
        System.out.println(student.toString());*/

        // create  Student using builder

        Student student = Student.builder()
                        .first_name("salma").last_name("emam").join_date(new Date()).build();
        System.out.println(student.toString());
        session.save(student);
        session.getTransaction().commit();
        System.out.println(student.toString());
    }
}