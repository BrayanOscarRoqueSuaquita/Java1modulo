import javax.swing.plaf.synth.SynthUI;
import java.util.Scanner;
public class ParImpar {
    public static void main(String[]args){
         Scanner po= new Scanner(System.in);
         double n1, parimpar;

        System.out.println("ingrese el numero: ");
        n1=po.nextDouble();

        if (n1%2 ==0){
            System.out.println("SU NUNMERO ES PAR");

        }else {
            System.out.println("su numero es impar");
        }

        //Mayor de tres números
        //
        //Pide 3 números y muestra cuál es el mayor.

        Scanner pe=new Scanner(System.in);

        int n11,n2,n3;
        int mayor;
        System.out.println("ingrese el primer numero:");
        n11= pe.nextInt();
        System.out.println("ingrese el segundo numero:");
        n2= pe.nextInt();
        System.out.println("ingrese el tercer numero:");
        n3= pe.nextInt();

        mayor=n11;

        if (n2>mayor){
            mayor=n2;
        }else if (n3>mayor){
            mayor=n3;
        }
        System.out.println("el mayor es el : "+mayor);


        //3. Conversor de temperatura
        //
        //Convierte de Celsius a Fahrenheit y viceversa.

        Scanner pi=new Scanner((System.in));
        int opcion;

        System.out.println("===Bienvenido a su conversor====");
        System.out.println("elija la convercion que desea hacer: ");
        System.out.println("1.Celsius a fahrenheit");
        System.out.println("2.Fahrenheit a Celsius");
        opcion=pi.nextInt();

        double temperatura, resultado;


        if (opcion==1){
            System.out.println("ingrese la temperatura");
            temperatura=pi.nextInt();

            resultado=(temperatura*9/5)+32;
            System.out.println("el resultado es: "+resultado);

        } else if (opcion==2) {
            System.out.println("ingrese la temperatura: ");
            temperatura=pi.nextInt();
            resultado=(temperatura-32)*5/9;
            System.out.println("el resultado es: "+resultado);

        }

        //4. Contador de vocales
        //
        //Pide una palabra y cuenta cuántas vocales tiene.

        Scanner vo = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = vo.nextLine();   // leer la palabra completa

        int contador = 0;  // aquí guardamos cuántas vocales hay

        // Bucle que recorre cada letra de la palabra
        for (int i = 0; i < palabra.length(); i++) {

            char letra = palabra.charAt(i);  // obtiene la letra en la posición i

            // Convertimos la letra a minúscula para comparar más fácil
            letra = Character.toLowerCase(letra);

            // Verificamos si es vocal
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;   // aumenta el contador
            }
        }

        System.out.println("La palabra tiene " + contador + " vocal(es).");

        vo.close();








    }
}