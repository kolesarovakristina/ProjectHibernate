package hibernate;

import hibernate.entity.Writer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;



public class App 
{
    public static void main( String[] args )
    {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Writer writer = new Writer();
        writer.setFirstname("Maxim");
        writer.setLastname("Matkin");

        session.save(writer);
        session.getTransaction().commit();
        session.close();
    }
}
