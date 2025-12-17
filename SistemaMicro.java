import  java.util.Scanner;

public class SistemaMicro {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        double tarifaBase=0;

        System.out.println("HELLO WORLD");
        System.out.println("==== TIPOS DE RUTA ===");
        System.out.println("1. Corto (S/ 3.00)");
        System.out.println("2. Medio (S/ 5.00)");
        System.out.println("3. Largo (S/ 8.00)");
        System.out.println("Seleccione una ruta: ");
        int ruta = sc.nextInt();
        if (ruta < 1 || ruta > 3) {
            System.out.println("no existe la ruta");
            return;
        }

        System.out.println("Ingrese su edad:");
        int edadPasajero = sc.nextInt();
        if(edadPasajero <0 ){
            System.out.println("error de edad ");
            return;
        }

        System.out.println("¿Es estudiante?: (true/false)");
        boolean estudiante = sc.nextBoolean();


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
                break;
        }
        double Descuento=0;

        if (edadPasajero >=60 ){
            Descuento=0.30;
        }else if (estudiante){
            Descuento=0.20;

        }else {
            Descuento=0;
        }

        double montoDescuento= tarifaBase*Descuento;
        double PrecioFinal=tarifaBase-montoDescuento;
        System.out.println("Pagar: "+PrecioFinal);

    }
}