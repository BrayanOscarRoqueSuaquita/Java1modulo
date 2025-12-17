import java.util.Scanner;
public class doWhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("ejecutando una vez");
            i--;
        } while (i > 0);

        //menu simple
        int opcion;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1.saludar");
            System.out.println("2.salir");
            System.out.println("opcion:");
            opcion = sc.nextInt();
            if (opcion == 1) {
                System.out.println("hola");
            }
        } while (opcion != 0);

        //validacion contraseña(maximo 3 intentos)
        //ingresar la clave->validar la clave->si es correcta:imprimes acceso concedido
        //->no es correcta: incorreto, intentos restantes: valordeintentos
        //->se acabaron los intentos: imprimes cuenta bloqueada

        Scanner scc = new Scanner(System.in);

        String claveCorrecta = "java123";
        String claveIngresada;
        int intentos = 3;

        do {
            System.out.println("ingrese su cuenta: ");
            String cuenta = scc.next();

            System.out.println("ingrese la contraseña: ");
            claveIngresada = scc.next();

            if (claveIngresada.equals(claveCorrecta)) {
                System.out.println("acceso concedido");
                break;
            } else {
                intentos--;
                if (intentos > 0) {
                    System.out.println(" Contraseña incorrecta. Intentos restantes: " + intentos);
                }
            }

        } while (intentos > 0);

        if (intentos == 0) {
            System.out.println(" Cuenta bloqueada por demasiados intentos");
        }






    }
}