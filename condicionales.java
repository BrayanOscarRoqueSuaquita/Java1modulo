import java.util.Scanner;

public class condicionales {
    public static void main (String[]args){
        //ejemplo IF

        int numero=15;

        if(numero>10){
            System.out.println("el numero es mayor a 10");

        }
        //validar si un estudiante aprobo
        double nota=14.5;
        if(nota>= 11){
            System.out.println("aprobado");
        }

        //verificar si un numero esta dentro de un rngo
        int edad= 29;
        if(edad>= 18 && edad <=30){
            System.out.println("edad dentro del rango permitido");
        }

        //validar si un cliente califica un prestamo

        double ingresos = 3200;
        boolean tieneDeuda = false;
        int aniosTrabajo= 2;
        int age=21;
        boolean califica= true;


        if(ingresos <=2500){
            califica = false;

        }
        if(tieneDeuda == true){
            califica =false;
        }
        if(aniosTrabajo < 2){
            califica =false;
        }
        if(age <21 || age >65){
            califica = false;
        }

        if (califica){
            System.out.println("cliente apto para prestamo");


        }
        if (!califica){
            System.out.println("cliente no apto");
        }


        //validar dado unpuntaje 0 a 100, clasificar en uno de los siguietes rangos:
        /*
        *0 a 20 -> Muy bajo
        * 21 a 50 ->bajo
        * 51 a 80 ->medio
        * 81 a 100-> alto
        * fuerza de rango->puntaje invalido
        * imprimir: Rango: ValoRango
         */


        int puntaje = 75;
        String rango = "No clasificado";


        if (puntaje < 0 || puntaje > 100) {
            rango = "Puntaje invalido";
        }


        if (puntaje >= 0 && puntaje <= 20) {
            rango = "Muy bajo";
        }


        if (puntaje >= 21 && puntaje <= 50) {
            rango = "Bajo";
        }

        if (puntaje >= 51 && puntaje <= 80) {
            rango = "Medio";
        }

        if (puntaje >= 81 && puntaje <= 100) {
            rango = "Alto";
        }


        System.out.println("Rango: " + rango);


        //else

        int num=9;

        if(num>10){
            System.out.println("el numero es mayor a 10");

        }else {
            System.out.println("el numero es menor a 10");
        }

        //else - if
        int note = 13;
        if(note >=18){
            System.out.println("excelente");
        }else if(note >=14){
            System.out.println("bueno");
        }else {
            System.out.println("necesitas mejorar");
        }

        //swich

        int dia=1;

        switch (dia){
            case 1:
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            default:
                System.out.println("otro dia");

        }

        //Swich

        Scanner scanner=new Scanner(System.in);
        String producto = scanner.nextLine();
        int stock=8;

        switch (producto){
            case "bebida":
                if(stock >10){
                    System.out.println("stock alto");
                }else if(stock>=5 && stock<=10){
                    System.out.println("stock moderado");
                }else{
                    System.out.println("stock bajo");
                }
                break;
            case "postre":
                if(stock < 3){
                    System.out.println("necesita reposicion");
                }
                break;
            default:
                System.out.println("producto no registrado");

        }

        //calculadora de tarifa de transporte cobra una tarifa segun el tipo de ruta
        //corto ->3.00,medio ->5.00,largo ->8.00
        //reglas: si el pasajero es estudiante ->20% de descuento
        //si es adulto mayor (mayor o igual de 60 años) ->30% descuento
        //sino pertenece a ninguo paga normal
        //adicional: si el tipo de ruta no existe "mensajede eroro"
        //si la edad es menor a 0-> mensaje error
        //solo se aplica un descuento, el mayor



        Scanner sc= new Scanner(System.in);
        double tarifaBase=0;

        System.out.println("==== TIPOS DE RUTA ===");
        System.out.println("1. Corto (S/ 3.00)");
        System.out.println("2. Medio (S/ 5.00)");
        System.out.println("3. Largo (S/ 8.00)");
        System.out.println("Seleccione una ruta: ");
        int ruta = sc.nextInt();
        if (ruta <1 || ruta>3 ){
            System.out.println("la Ruta no existe");
            return;
        }


        System.out.println("Ingrese su edad:");
        int edadPasajero = sc.nextInt();

            if(edadPasajero <0 ){
                System.out.println("error de edad ");
                return;
            }

        System.out.println("¿Es estudiante?: (true/false)");
        boolean estuidiante = sc.nextBoolean();





        switch (ruta){
            case 1:
                tarifaBase= 3.00;
                break;
            case 2:
                tarifaBase=5.00;
                break;
            case 3:
                tarifaBase=8.00;

                break;
            default:
                System.out.println("la ruta no existe");


        }
        double Descuento=0;
        if (edadPasajero>=60){
            Descuento= 0.30;
        }else if (estuidiante){
            Descuento=0.20;

        }else {
            Descuento=0;
        }

        double montoDESCUENTO= tarifaBase*Descuento;
        double  precioFinal= tarifaBase-montoDESCUENTO;
        System.out.println("pagar: " +precioFinal);




    }




    }





