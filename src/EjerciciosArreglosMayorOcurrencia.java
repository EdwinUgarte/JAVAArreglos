import java.util.Scanner;

public class EjerciciosArreglosMayorOcurrencia {
    public static void main(String[] args) {

        int[] arreglo = new int[10];
        int[] repeticiones = new int[10];


        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe 10 numeros enteros en un rango de 1 - 9");
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = scanner.nextInt();
        }

        for(int i = 0; i < arreglo.length; i++){
            int contador = 0;
            for(int x = 0; x < arreglo.length; x++){
                if(arreglo[i] == arreglo[x]){
                    contador++;
                }
            }
            repeticiones[i] = contador;
        }
        int indice = 0;
        int mayor = 0;
        for(int i = 0; i < arreglo.length; i++){
            if(mayor < repeticiones[i]){
                mayor = repeticiones[i];
                indice = i;
            }
        }
        System.out.println("El maximo de repeticiones es = " + mayor);
        System.out.println("El valor con mas repeticiones es = " + arreglo[indice]);
        System.out.println("El numero es = " + arreglo[indice] + " y se repite: " + mayor + " veces");


    }
}
