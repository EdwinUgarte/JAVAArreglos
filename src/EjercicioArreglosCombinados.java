import java.util.Scanner;

public class EjercicioArreglosCombinados {
    public static void main(String[] args) {
        int[] a,b,c;
        a = new int[5];
        b = new int[5];
        c = new int[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe 10 numeros enteros");
        for(int i = 0; i < a.length; i++){
            a[i] = scanner.nextInt();
        }
        for(int i = 4; i >= 0; i--){
            b[i] = scanner.nextInt();
        }


        int aux = 0;
        for(int i = 0; i < a.length; i++){
            c[aux++] = a[i];
            c[aux++] = b[i];
        }

        for(int i = 0; i < c.length; i++){
           System.out.print("[" + c[i] +"]");
        }

    }
}
