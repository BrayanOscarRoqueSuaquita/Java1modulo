import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        int[] numeros={5,10,15,20,25};

        for (int i=0; i<numeros.length;i++){
            System.out.println("elemento en posicion "+i+":"+numeros[i]);
        }

        //*****************************************************//
        /*NOTA: ESTAS REUTILIZANDO EL ARRAY*/
        int suma=0;

        for (int j=0; j<numeros.length;j++){
            suma+= numeros[j];

        }
        System.out.println("la suma total es:"+suma);


        //*****************EJERCICIO 3*************************//
        //detectar los duplicados
        //imprimir numero repetido
        int[] numbers = {1,3,3,7,9,8,5,2,5};

        System.out.println("Los números repetidos son:");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                    break;
                }
            }
        }





        //*****************EJERCICIO 4*************************//

        //*****************EJERCICIO 4*************************//

        String[] nombres={"ana","nike","brayan", "flavio","jean"};

        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese el nombre a buscar");
        String nombreBuscado= sc.next();

        boolean encontrado=false;
        int posicion=-1;

        for (int e=0; e<nombres.length;e++){
            if(nombres[e].equalsIgnoreCase(nombreBuscado)){
                encontrado=true;
                posicion=e;
                break;
            }
        }
        if(encontrado){
            System.out.println("nombre encontrado en la posicion: "+posicion);
        }else {
            System.out.println("nombre no encontrado");
        }

        //*****************EJERCICIO 5*************************//

        char[] vocales = {'p','r','o','g','r','a','m','a','1','1','o','n'};
        int contarVocales = 0;
        int contarConsonantes = 0;

        for (int i = 0; i < vocales.length; i++) {
            char vocale = vocales[i];

            if (vocale == 'a' || vocale == 'e' || vocale == 'i' || vocale == 'o' || vocale == 'u') {
                contarVocales++;
            } else if (Character.isLetter(vocale)) {
                contarConsonantes++;
            }
        }

        System.out.println("Cantidad de vocales: " + contarVocales);
        System.out.println("Cantidad de consonantes: " + contarConsonantes);





    }
}
