package T2;

import java.util.Scanner;

public class T2Ej12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char c;
        do {
            System.out.print("introduzca un caracter. ¨*¨ para acabar el programa: ");
            c = teclado.nextLine().charAt(0);
            if (c>='A' && c<='Z'){
                c = (char)(c-'A'+'a');
                System.out.println(c);
            } else if (c>='a'&& c<= 'z') {
                System.out.println((char)(c-'a'+'A'));
            } else if (c>='0' && c<='9') {
                System.out.println(c-'0'+80);
            }
        }while (c!='*');

    }
}
