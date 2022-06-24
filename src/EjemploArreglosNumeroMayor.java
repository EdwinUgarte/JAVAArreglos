import java.util.Scanner;

public class EjemploArreglosNumeroMayor {
    public static void main(String[] args) {

        int[] a = new int[5];
        Scanner scanner = new Scanner(System.in);


        for(int i = 0; i < a.length; i++){
            System.out.println("Escribe un numero entre 11 y 99");
            a[i] = scanner.nextInt();
            if(a[i] < 11 || a[i] > 99){
                System.out.println("El numero " + a[i] + " no esta dentro del rango");
                System.err.println("Salio del sistema");
                System.exit(0);
            }
            if(a[i] == a[i]){
                a[i] = a[i];
            }

        }
        int max = 0;
        for(int i = 1 ; i < a.length ; i++){
            max = (a[max] > a[i]) ? max : i;
        }
        System.out.println("max = " + a[max]);
    }
}
