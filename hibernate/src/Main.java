
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate-config.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        session.beginTransaction();
        /*Student student = new Student();
        student.setFirst_name("salma");
        student.setLast_name("shehata");
        session.save(student);*/

        Student student = session.get(Student.class , 2);

        System.out.println(student.toString());

        student.setLast_name("emam");

        session.update(student);
        Student studentUpdated = session.get(Student.class , 2);

        System.out.println(studentUpdated.toString());
        session.delete(student)
        session.getTransaction().commit();

    }
}