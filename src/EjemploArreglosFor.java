import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] productos = new String[5];//Se crea la instancia del arreglo y cantidad de producto

        int largo = productos.length;
        
        productos[0] = "Memoria kigston pendrive";
        productos[1] = "iPhone";
        productos[2] = "SSD Samsung";
        productos[3] = "Laptop Lenovo";
        productos[4] = "Mose razor";

        Arrays.sort(productos);

        System.out.println("=== Usando For ===");
        for(int i = 0; i < largo; i++){// usando for
            System.out.println("Para indice = " + i + " : " + productos[i]);
        }

        System.out.println("=== Usando For Each ===");
        for(String prod: productos){//For each
            System.out.println("prod = " + prod);
        }

        int i = 0;
        System.out.println("=== Usando While ===");
        while(i < largo){
            System.out.println("productos = " + productos[i]);
            i++;
        }

        int j = 0;
        System.out.println("=== Usando Do While ===");
        do{
            System.out.println("productos[j] = " + productos[j]);
            j++;
        }while(j<largo);



        int[] numeros = new int[4];//Crea la instancia del arreglo y la cantidad de valores que estaran dentro
        int totalNum = numeros.length;

        for(int x = 0; x < totalNum; x++){
            numeros[x] = (numeros[x] + 2) * 5;//llenamos el arreglo con numeros multiplicados por 5
        }

        for(int x = 0; x < totalNum; x++){
            System.out.println("numeros[x] = " + numeros[x]);
        }
    }
}
