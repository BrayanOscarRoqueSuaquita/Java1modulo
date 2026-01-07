import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numeros=new ArrayList<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        numeros.add(25);

        for (int n: numeros){
            System.out.println(n);
        }

        //Crea un ArrayList<String> con los nombres de 5 ciudades.
        //Agrega una ciudad en la posición 2.

        ArrayList<String> ciudades=new ArrayList<>();

        ciudades.add("juliaca");
        ciudades.add("Puno");
        ciudades.add("Arequipa");
        ciudades.add("cuzco");
        ciudades.add("Ilave");
        ciudades.add(2,"San miguel");

        System.out.println(ciudades);

        //Ejercicio 3
        //Crea un ArrayList<Double> vacío.
        //Agrega números decimales hasta que tenga 10 elementos (usa un for).

        ArrayList<Double> Numeros=new ArrayList<>();

        for (int i=1; i<=10; i++){
            Numeros.add(i * 0.5);
        }
        System.out.println("Contenido del array es:"+Numeros);
        System.out.println("Tamaño final "+Numeros.size());

        //Ejercicio 4
        //
        //Dado un ArrayList<String> con 6 nombres:
        //
        //Imprime el primer elemento
        //
        //Imprime el último elemento (usando size())

        ArrayList<String> Nombres= new ArrayList<>();
        Nombres.add("pepe");
        Nombres.add("juan");
        Nombres.add("penacho");
        Nombres.add("yorch");
        Nombres.add("etesech");
        Nombres.add("tito");

        System.out.println(Nombres.get(0));
        System.out.println(Nombres.get(Nombres.size()-1));

        //Ejercicio 5
        //
        //Crea un ArrayList<Integer> con 8 números.
        //
        //Imprime solo los elementos que estén en posiciones pares

       ArrayList<Integer> Pares= new ArrayList<>();
        for(int i=0; i<=8; i++){
            Pares.add(i);
        }
        for (int i=0; i<Pares.size(); i++){
            if (i%2==0){
                System.out.println("los numeros pares son:"+i);
            }
        }


        //Crea un ArrayList<String> con:
        //"rojo", "verde", "azu";
        //Cambia "verde" por "amarillo" usando set.

        ArrayList<String> Colores=new ArrayList<>();

        Colores.add("rojo");
        Colores.add("verde");
        Colores.add("azul");
        Colores.set(2,"amarillo");

        System.out.println(Colores.get(2));

        //Ejercicio 7
        //Crea un ArrayList<Integer> con valores del 1 al 10.
        //Cambia todos los números impares por 0

        ArrayList<Integer> cero=new ArrayList<>();

        for (int i=1; i<=10; i++){
            cero.add(i);
        }
        for (int i=0; i<cero.size();i++){

            int convertir= cero.get(i);
            if (convertir%2!=0){
                cero.set(i,0);
            }
        }

        System.out.println("los numeros son:"+cero);

        //Ejercicio 8
        //Crea un ArrayList<String> con 5 frutas.
        //Elimina la fruta en la posición 3

        ArrayList<String> frutas= new ArrayList<>();
        frutas.add("pera");
        frutas.add("manzana");
        frutas.add("mango");
        frutas.add("platano");
        frutas.add("fresas");

        frutas.remove(3);
        System.out.println(frutas);

        //crea un ArrayList<Integer> con:
        //10, 20, 30, 40, 50
        //Elimina el número 30 (NO por índice).

        ArrayList<Integer> trampa=new ArrayList<>();
        trampa.add(10);
        trampa.add(20);
        trampa.add(30);
        trampa.add(40);
        trampa.add(50);

        trampa.remove(trampa.size()-3);

        System.out.println(trampa);

        //Ejercicio 10
        //Elimina todos los números mayores a 50 de un ArrayList<Integer>.

        ArrayList<Integer> mayores=new ArrayList<>();
        mayores.add(50);
        mayores.add(55);
        mayores.add(49);




    }
}
