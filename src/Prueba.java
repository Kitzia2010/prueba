
import java.util.Scanner;

public class Prueba {
    public static void Prueba(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CALCULADORA ===");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Salir");
        System.out.print("Elige una opcion: ");

        int opcion = sc.nextInt();

        System.out.println("Elegiste la opcion: " + opcion);

        sc.close();
    }
}

