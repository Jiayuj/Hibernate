import model.Equipos;
import model.Estadisticas;
import model.Jugadores;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        List<Jugadores> list = session.createQuery("FROM Jugadores").list();
        List<Estadisticas> estadisticasList = session.createQuery("FROM Estadisticas").list();

        List <Jugadores> jugadoresList = new ArrayList<>();

        int opcion = menu.menu();
        while (opcion < 5) {
            switch (opcion) {
                case 1:
                    list.stream().filter( line -> line.getNombre_equipo().equals("Cavaliers")).collect(Collectors.toList()).forEach((k)->System.out.println("Procedencia : " + k.getProcedencia() + " Posición : " + k.getPosicion()));
                    opcion = menu.menu();
                    break;
                case 2:
                    int count= 0;
                    try {
                        for (Jugadores j : list) {
                            if (j.getProcedencia().equals("Spain")) count++ ;
                        }
                    }catch (NullPointerException e){
                        System.out.println("hay "+count+ " jugadores");
                    }
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
                    estadisticasList.stream().filter( line -> line.getTemporada().equals("04/05") && line.getPuntosPorPartido() > 10).collect(Collectors.toList()).forEach((k)->System.out.println(session.find(Jugadores.class,k.getJugador()).getNombre()));
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
