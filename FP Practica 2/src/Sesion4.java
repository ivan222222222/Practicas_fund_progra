// Realizado por Ivan Novillo Triguero bx0153 IWSIM13
public class Sesion4 {
    public static void dibujarLineaRecursiva(int numero, char caracter){

        if (numero>=1){
            dibujarLineaRecursiva(numero-1,caracter);
            System.out.print(caracter+" ");
        }
    }

    public static void dibujarTrianguloRecursivo(int base,char caracter){
        if (base>=1){
            dibujarTrianguloRecursivo(base-1,caracter);
            dibujarLineaRecursiva(base,caracter);
            System.out.println();

        }

    }
    public static int multiplicarRecursivo(int numero1, int numero2){
        int resultado=0;
        if (numero1>=1){
            resultado= numero2+multiplicarRecursivo(numero1-1,numero2);
        }
        return resultado;
    }


}
