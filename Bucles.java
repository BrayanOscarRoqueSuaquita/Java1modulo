import java.util.Scanner;
public class Bucles {
    public static void main(String[]args){
        //sin bucle
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println("====con bucle=====");

        for ( int i=1; i<=5; i++){
            System.out.println(i);
        }

        //0->4
        //1->4
        //2->4
        //3->4

        int[] numeros={4,8,12,10};
        int suma =0;
        for(int j=0; j <numeros.length; j++){
            suma +=numeros[j];

        }
        System.out.println("suma total es: "+suma);

        //ejercicios alumnos
        //buscar el numero mayor en un arreglo:

        int[] valores= {15,8,40,22,9};
        int mayor=valores[0];
        for (int p=1; p< valores.length; p++){
            if (valores[p]>mayor){
                mayor=valores[p];
            }
        }
        System.out.println("el mayor es:"+mayor);


        //while

        System.out.println("====WHILE======");
        int o=10;
        while (o> 0){
            System.out.println(o);
            o--;
        }

        //ingresa un numero positivo
        Scanner sc=  new Scanner(System.in);
        int n=-1;

        while (n<0){
            System.out.println("ingrese un numero positivo");
            n=sc.nextInt();
        }

        System.out.println("correcto"+n);

        //sumar numero hasta que el usuario escriba el 0


        Scanner l = new Scanner(System.in);

        int sumaa = 0;
        int numero;

        System.out.println("Ingrese números para sumar");

        System.out.print("Ingrese un número: ");
        numero = l.nextInt();

        while (numero != 0) {
            sumaa += numero;
            System.out.print("ingrese otro número : ");
            numero = l.nextInt();
        }
        System.out.println("La suma total de todos los números es: " + sumaa);
    }
}