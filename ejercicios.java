import java.util.Scanner;

public class ejercicios {
    public static void main(String[]args){
        Scanner par=new Scanner(System.in);
        int n1;
        System.out.println("ingrese el numero: ");
        n1=par.nextInt();

        if(n1%2 ==0){
            System.out.println("su numero es par");

        }else {
            System.out.println("su numero es impar");
        }

        //numeromayor

        Scanner ma=new Scanner(System.in);

        int n11,n2,n3;
        int mayor;

        System.out.println("ingrese el primer numero:");
        n11=ma.nextInt();
        System.out.println("ingrese el segundo numero:");
        n2=ma.nextInt();
        System.out.println("ingrese el tercer numero:");
        n3=ma.nextInt();

        mayor=n11;

        if (n2>mayor){
            mayor=n2;
        } if (n3>mayor) {
            mayor=n3;

        }
        System.out.println("el maoyr es: "+mayor);



        // salrio
        Scanner pou=new Scanner(System.in);

        double SalarioSemanal, horasSemanales, PrecioHoras;

        System.out.println("cuanto cobra por hora?");
        PrecioHoras=pou.nextDouble();

        System.out.println("Cuantas horas trabajo en esta semana?");
        horasSemanales=pou.nextDouble();

        SalarioSemanal= horasSemanales*PrecioHoras;

        System.out.println("su pago es: "+SalarioSemanal);



    }

}