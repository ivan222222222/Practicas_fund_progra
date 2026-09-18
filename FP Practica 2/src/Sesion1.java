import java.util.Scanner;
// Realizado por Ivan Novillo Triguero bx0153 IWSIM13
public class Sesion1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Dibujar un triangulo rectangulo");
        System.out.println("2. Dibujar un cuadrado");
        System.out.println("3. Multiplicar dos numreos");
        System.out.println("4. Escribir una tabla de multiplicar");
        System.out.println("5. Finalizar la ejecucion");
        System.out.print("Introduzca la opcion deseada: ");
        int menu = teclado.nextInt();
        if (menu >= 1 && menu <= 5){
            System.out.println("Ha elegido la opcion: "+ menu);
        }
        else {
            System.out.println("Opcion incorrecta");
        }
        System.out.print("Intoduzca un numero entre el 0 y el 100: ");
        double numero = teclado.nextDouble();
        if (numero >= 0.0 && numero <= 100.0){
            System.out.println("Ha elegido el numero: "+ numero);
        }
        else {
            System.out.println("El numero introducido es incorrecto");
        }
        System.out.println("Acontinuacion introduzca dos numero enteros:" );
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        if (num1 <= num2){
            if (num2%num1 == 0){
                System.out.println("El numero "+ num1 +" es menor o igual que "+ num2 +" y "+ num2 +" es multiplo de "+num1);
            }
            else {
                System.out.println("El numero "+ num1 +" es menor o igual que "+ num2 +" y "+ num2 +" no es multiplo de "+num1);
            }
        }
        else {
            System.out.println("El numero "+ num1 +" no es menor o igual que "+ num2 +" y "+ num2 +" no es multiplo de "+num1);
        }
    }
}
