import java.util.Scanner;

public class Utils {
    static Scanner sc = new Scanner(System.in);

    public static int validaInt() {
        while (!sc.hasNextInt()) {
            System.out.println("Numero incorrecto");
            sc.next();
        }
        return sc.nextInt();
    }

    public static double validaDouble() {
        while (!sc.hasNextDouble()) {
            System.out.println("Introduce un numero que sea valido por favor");
            sc.next();
        }
        return sc.nextDouble();
    }
}
