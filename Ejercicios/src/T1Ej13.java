import java.util.Scanner;

public class T1Ej13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia,mes,anio,suma,numero,resto;
        System.out.print("Introduce tu dia de nacimiento, mes y año");
        dia = teclado.nextInt();
        mes = teclado.nextInt();
        anio = teclado.nextInt();
        suma = dia+mes+anio;
        System.out.println(suma);
        numero = suma/1000;
        System.out.println("Tu numero de la suerte es: "+ numero);
    }
}
