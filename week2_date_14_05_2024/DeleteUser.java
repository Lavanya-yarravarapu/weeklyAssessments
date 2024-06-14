import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.example.model.User;

public class DeleteUser {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();

        User user = session.get(User.class, 1L);
        if (user != null) {
            session.delete(user);
        }

        session.getTransaction().commit();
        session.close();
        factory.close();
    }
}

