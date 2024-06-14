import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.example.model.User;

public class GetUser {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();

        User user = session.get(User.class, 1L);
        if (user != null) {
            System.out.println("User: " + user.getName() + ", Email: " + user.getEmail());
        } else {
            System.out.println("User not found");
        }

        session.close();
        factory.close();
    }
}

