import java.util.Arrays;

public class EjemploArreglosForInverso {
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
        System.out.println("=== Usando For inverso ===");
        for(int i = 0; i < largo; i++){
            System.out.println("productos = " + productos[largo-1-i]);
        }
        System.out.println("=== Usando For inverso 2 ===");
        for(int i = largo - 1; i >= 0; i--){
            System.out.println("productos = " + productos[i]);
        }


    }
}
