import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.example.model.User;

public class CreateUser {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();

        User user = new User();
        user.setName("John Doe");
        user.setEmail("john.doe@example.com");

        session.save(user);

        session.getTransaction().commit();
        session.close();
        factory.close();
    }
}
