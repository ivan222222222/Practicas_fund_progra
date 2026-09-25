import java.util.Scanner;

public class Sesion2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        int altura;
        do {
            System.out.print("Introduce un numero entre 5 y 30: ");
            altura = teclado.nextInt();
            if (altura<5 || altura>30) {
                System.out.println("numero incorecto");
            }
        }while (altura<5 || altura>30);
        for (int i=1; i<=altura; i++){
            for (int a=0;a<i;a++){
                System.out.print("* ");
            }
            System.out.println();

        }


        int lado;
        do {
            System.out.print("introduce un numero entre 10 y 35: ");
            lado = teclado.nextInt();
            if (lado<10 || lado>35){
                System.out.println("numero incorrecto");
            }
        }while (lado<10 || lado >35);
        for (int i=lado; i>0;i--){
            for (int a=0;a<=lado;a++){
                System.out.print("*  ");
            }
            System.out.println();
        }


        int num1,num2=0,multiplicacion=0;
        do {
            System.out.print("Introduce un numero entre el 0 y 20: ");
            num1 = teclado.nextInt();
            if (num1>=0 && num1 <=20){
                do {
                    System.out.print("introduce otro numero entre 0 y 20: ");
                    num2 = teclado.nextInt();
                    if (num2 <0 || num2 >20){
                        System.out.println("numero incorrecto");
                    }
                }while (num2<0 || num2>20);
            }else {
                System.out.println("numero incorrecto");
            }

        }while(num1<0 || num1 >20);
        for (int i=0;i<num1;i++){
            multiplicacion +=num2;
        }
        System.out.println(num1+" * "+num2+" = "+multiplicacion);


        int tabla_multi;
        do{
            System.out.print("introduce un numero entre 1 y 10: ");
            tabla_multi = teclado.nextInt();
            if (tabla_multi<1 || tabla_multi>10){
                System.out.println("numero incorrecto");
            }
        }while (tabla_multi<1 ||tabla_multi>10);
        for (int i=1;i<=10;i++){
            int resultado = tabla_multi*i;
            System.out.printf(tabla_multi+" * %2d = %3d \n",i, resultado);
        }
    }
}










