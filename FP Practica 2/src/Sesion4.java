// Realizado por Ivan Novillo Triguero bx0153 IWSIM13
public class Sesion4 {
    public static void dibujarLineaRecursiva(int numero, char caracter){
        if (numero<1){
            dibujarLineaRecursiva(numero-=1,caracter);
            System.out.print(caracter+" ");
        }
    }

    public static void dibujarTrianguloRecursivo(int base,char caracter){
        if (base>0){
            dibujarTrianguloRecursivo(--base,caracter);
        }
        dibujarLineaRecursiva(base,caracter);
    }
    public static void main() {
        dibujarLineaRecursiva(4,'*');
        dibujarTrianguloRecursivo(4,'*');
    }



}
