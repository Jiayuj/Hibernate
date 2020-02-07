import java.util.Scanner;

public class Menu  {

    Scanner scanner = new Scanner(System.in);


    int menu(){
        System.out.println("------------------------");
        System.out.println(" 1. Mostrar procedencia y posición de los jugadores de los Cavaliers. ");
        System.out.println(" 2. Mostrar número de jugadores españoles. ");
        System.out.println(" 3. Añadir jugador. ");
        System.out.println(" 4. Mostrar jugadores que en la temporada 04/05 tenían una media de puntos por partido superior a 10. ");
        System.out.println(" 0. Salir ");
        System.out.println("------------------------");
        return scanner.nextInt();
    }
}
