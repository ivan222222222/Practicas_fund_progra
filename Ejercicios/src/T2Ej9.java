import java.util.Scanner;

public class T2Ej9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int suma_pos=0,cont_pos=0,suma_neg=0,cont_neg=0,cont_ceros=0,numero;
        double media_pos,media_neg;
        for (int i=0;i<10;i++){
            System.out.print("Introduce un numero entero: ");
            numero = teclado.nextInt();
            if (numero>0){
                cont_pos++;
                suma_pos += numero;
            } else if (numero<0) {
                cont_neg ++;
                suma_neg +=numero;
            }else {
                cont_ceros++;
            }
        }
        if (cont_pos>0){
            media_pos = (double)suma_pos/cont_pos;
            System.out.println("La suma de los positivos es "+suma_pos+" y su media es "+media_pos);

        }
        if (cont_neg>0){
            media_neg = (double)suma_neg/cont_neg;
            System.out.println("La suma de los negativos es "+suma_neg+" y su media es "+media_neg);
        }
        System.out.println("El numero de ceros introducidos es "+cont_ceros);
    }
}
