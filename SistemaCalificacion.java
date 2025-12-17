import java.util.Scanner;
public
class SistemaCalificacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaración de variables
        String nombre;
        int edad;
        double examen1, examen2, trabajoFinal, promedio;
        boolean aprobado;

        // Entrada de datos
        System.out.print("Ingrese nombre: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese nota del primer examen: ");
        examen1 = sc.nextDouble();

        System.out.print("Ingrese nota del segundo examen: ");
        examen2 = sc.nextDouble();

        System.out.print("Ingrese nota del trabajo final: ");
        trabajoFinal = sc.nextDouble();

        System.out.print("Ingrese edad: ");
        edad = sc.nextInt();

        // Cálculo del promedio
        promedio = (examen1 * 0.30) + (examen2 * 0.30) + (trabajoFinal * 0.40);

        // Determinar aprobado
        aprobado = (promedio >= 11.0);
        String estado = aprobado ? "Aprobado" : "Desaprobado";

        // Condiciones adicionales
        boolean menorEdad = (edad < 18);
        boolean cercaDeAprobar = (promedio >= 10.0 && promedio <= 10.99);
        boolean rendimientoCritico = (promedio <= 5.0);

        // Impresiones de mensajes especiales (según reglas)
        System.out.println("-------------------------------------");
        System.out.println("REPORTE ACADÉMICO");
        System.out.println("-------------------------------------");
        System.out.println("Nombre : " + nombre);
        System.out.println("Edad   : " + edad);
        System.out.println();
        System.out.printf("Promedio final : %.2f%n", promedio);
        System.out.println("Estado : " + estado);

        // Comentarios
        if (menorEdad) {
            System.out.println("Comentario : Alumno menor de edad, se recomienda acompañamiento.");
        } else if (aprobado) {
            System.out.println("Comentario : ¡Felicitaciones!");
        } else {
            System.out.println("Comentario : Debe reforzar sus estudios.");
        }

        // Mensajes adicionales obligatorios
        if (cercaDeAprobar) {
            System.out.println("El alumno está a 1 punto o menos de aprobar.");
        }
        if (rendimientoCritico) {
            System.out.println("Rendimiento crítico.");
        }

        System.out.println("-------------------------------------");

        sc.close();
    }
}
