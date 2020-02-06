import model.Equipos;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {

    public static void main(String[] args) {

        SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        Session s = sf.openSession();
        s.beginTransaction();



        Equipos p =(Equipos) s.get(Equipos.class, "Hawks");

        System.out.println(p.getNombre() + "   "+ p.getCiudad());



        s.getTransaction().commit();
        s.close();
        sf.close();

    }

}
