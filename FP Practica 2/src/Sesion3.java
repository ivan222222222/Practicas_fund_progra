import java.util.Scanner;

public class Sesion3 {

    public static int leerNumero(int minimo,int maximo){
        Scanner teclado = new Scanner(System.in);
        int dato;
        do {
            System.out.print("Introduce un numero entre " + minimo + " y " + maximo+": ");
            dato = teclado.nextInt();
            if (dato<minimo||dato>maximo){
                System.out.println("Opcion incorrecta");
            }
        }while (dato<minimo||dato>maximo);
        return dato;
    }


    public static char leerCaracter(){
        Scanner teclado = new Scanner(System.in);
        char caracter;
        do {
            System.out.print("Introduce un caracter no alfabetico ni numerico: ");
            caracter = teclado.nextLine().charAt(0);
            if((caracter>='a' && caracter<='z')||(caracter>='A' && caracter<= 'Z') || (caracter>='0'&& caracter<='9')){
                System.out.println("Opcion incorrecta");
            }
        }while ((caracter>='a' && caracter<='z')||(caracter>='A' && caracter<= 'Z') || (caracter>='0'&& caracter<='9'));
        return caracter;
    }


    public static int menu(){
        int opcion;
        System.out.println("Menu:");
        System.out.println("1. Dibujar un triangulo rectangulo");
        System.out.println("2. Dibujar un cuadrado");
        System.out.println("3. Multiplicar dos numreos");
        System.out.println("4. Escribir una tabla de multiplicar");
        System.out.println("5. Finalizar la ejecucion");
        System.out.print("Introduzca la opcion deseada: ");
        opcion = leerNumero(1,5);
        return opcion;
    }

    public static void dibujarTriangulo(int base, char caracter){
        for (int i=1; i<=base; i++){
            for (int a=0;a<i;a++){
                System.out.print(caracter+" ");
            }
            System.out.println();

        }
    }


    public static void dibujarCuadrado(int lado,char caracter){
        for (int i=lado; i>0;i--){
            for (int a=0;a<=lado;a++){
                System.out.print(caracter+"  ");
            }
            System.out.println();
        }
    }


    public static int multiplicarIterativo(int numero1,int numero2){
        int multiplicacion=0;
        for (int i=0;i<numero1;i++){
            multiplicacion +=numero2;
        }
        return multiplicacion;
    }


    public static void tablaDeMultiplicar(int numero){
        for (int i=1;i<=10;i++){
            int resultado = numero*i;
            System.out.printf(numero+" * %2d = %3d \n",i, resultado);
        }
    }

    public static void main(String[] args) {
        int i;
        do {
            i = menu();
            switch (i){
                case 1:
                    dibujarTriangulo(leerNumero(5,30),leerCaracter());
                    break;

                case 2:
                    dibujarCuadrado(leerNumero(10,35),leerCaracter());
                    break;
                case 3:
                    int num1 = leerNumero(0,20);
                    int num2 = leerNumero(0,20);
                    System.out.println(num1+" * "+num2+" = "+multiplicarIterativo(num1,num2));
                    break;
                case 4:
                    tablaDeMultiplicar(leerNumero(1,10));
            }
        }while (i !=5);
        System.out.println("Adios");

    }
}
