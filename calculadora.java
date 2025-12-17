import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) {

        Scanner juanito= new Scanner(System.in);
        int n1;

        System.out.println("ingrese su numero: ");
        n1=juanito.nextInt();

        if (n1 % 2 == 0) {
            System.out.println("es par");
        }else {
            System.out.println("es impar");
        }
// definir de 3 numeros el mayor


        Scanner pou= new Scanner(System.in);
        int n11,n2,n3;
        int mayor;

        System.out.println("====BIENVENIDOS XDE======");
        System.out.println("Ingrese el primer numero");
        n11=pou.nextInt();
        System.out.println("Ingrese el segundo numero");
        n2 = pou.nextInt();
        System.out.println("Ingrese el tercero numero");
        n3= pou.nextInt();

        mayor=n11;

        if (n2>mayor){
            mayor=n2;
        }if (n3>mayor){
            mayor=n3;
        }
        System.out.println("el mayor es "+mayor);

        Scanner pepito=new Scanner(System.in);

        int num1,num2;
        int suma,resta,multiplicacion,division,opcion, resultado;

        System.out.println("====BIENVENIDOS A SU CALCULADORA VIRTUAL=======");
        System.out.println("elija la opera que desea realizar:");
        System.out.println("1.suma");
        System.out.println("2.resta");
        System.out.println("3.multiplicacion");
        System.out.println("4.division");
        opcion= pepito.nextInt();
        if (opcion<1 || opcion >4){
            System.out.println("no existe la funcion");
        }

        System.out.println("ponga el primer numero");
        num1=pepito.nextInt();
        System.out.println("ponga el segundo numero ");
        num2=pepito.nextInt();

        switch (opcion){
            case 1:
                resultado=num1+num2;
                System.out.println("la suma es: "+resultado);
                break;


            case 2:
                resultado=num1-num2;
                System.out.println("la resta es:"+resultado);
                break;
            case 3:
                resultado=num1*num2;
                System.out.println("la multiplicacion es:"+resultado);
            case 4:
                if (num2 !=0){
                    resultado=num1/num2;
                    System.out.println("el resultado es:"+resultado);
                }else {
                    System.out.println("no se puede dividir entre cero");
                }
        }

        }









    }

