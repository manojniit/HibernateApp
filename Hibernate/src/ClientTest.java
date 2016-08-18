import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx = session.beginTransaction();
		Student_Info info = new Student_Info();
		info.setName("manoj");
		info.setCourse("java");
		info.setDepartment("software department");
		session.persist(info);
		tx.commit();
		session.close();
		System.out.println("done");
			
	}

}
