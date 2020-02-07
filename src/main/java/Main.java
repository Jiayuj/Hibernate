import model.Equipos;
import model.Estadisticas;
import model.Jugadores;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        int opcion = menu.menu();
        while (opcion < 5) {
            switch (opcion) {
                case 1:
                    List<Jugadores> list = session.createQuery("FROM Jugadores").list();
                    list.stream().filter(line -> line.getNombre_equipo().equals("Cavaliers")).forEach(System.out::println);

                    opcion = menu.menu();
                    break;
                case 2:
                    System.out.println("2");
                    opcion = menu.menu();
                    break;
                case 3:
                    Jugadores j = new Jugadores();
                    j.setcodigo(999);
                    j.setNombre("11111");
                    j.setNombre_equipo("Timberwolves");
                    j.setAltura("1-1");
                    j.setPeso(111);
                    j.setPosicion("1");
                    j.setProcedencia("qq");
                    session.save(j);
                    opcion = menu.menu();
                    break;
                case 4:
                    System.out.println("4");
                    opcion = menu.menu();
                    break;
                default:
                    opcion = 9;
                    break;
            }
        }

        transaction.commit();
        session.close();
        sf.close();
    }
}
