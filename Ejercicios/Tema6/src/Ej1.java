import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej1 {
    public static int leerEntero(String texto, Scanner teclado){
        int resultado=0;
        boolean error;
        do {
            error=false;
            try {
                System.out.print(texto);
                resultado=teclado.nextInt();
                teclado.nextLine();
            }catch (InputMismatchException ex){
                System.out.println("Dato no valido");
                error = true;
            }finally {
                teclado.nextLine();
            }
        }while (error);
        return resultado;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int entero1=0,entero2=0;
        String cadena="";
        double real1=0.0,real2=0.0;
        boolean error;
        do {
            error=false;

            try {
                System.out.print("Introduce el primer enetero: ");
                entero1 = teclado.nextInt();
                System.out.print("Introduce el segundo enetero: ");
                entero2 = teclado.nextInt();
                teclado.nextLine();
                System.out.print("Introduce una cadena de caracterres: ");
                cadena = teclado.nextLine();
                System.out.print("Introduce el primer real: ");
                real1 = teclado.nextDouble();
                System.out.print("Introduce el segundo real: ");
                real2 = teclado.nextDouble();
            } catch (InputMismatchException ex) {
                System.out.println("Dato no valido");
                error=true;
            }finally {
                teclado.nextLine();
            }

        }while (error);
        System.out.println(entero1+" "+entero2+" "+cadena+" "+real1+" "+real2);
    }

}
