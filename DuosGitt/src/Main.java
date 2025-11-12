public class Main {
    public static void main(String[] args) {

        System.out.printf("Hola mi colega introduce un numero: ");
        int letra = Utils.validaInt();
        for (int i = 1; i <= letra; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("Este es tu numero y los anteriores");
        System.out.println(prueba(letra));

        }
        public static int prueba(int a) {
        return + a;
    }
}