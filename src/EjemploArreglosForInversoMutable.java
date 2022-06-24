import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {
    public static void main(String[] args) {

        String[] productos = new String[5];//Se crea la instancia del arreglo y cantidad de producto


        
        productos[0] = "Memoria kigston pendrive";
        productos[1] = "iPhone";
        productos[2] = "SSD Samsung";
        productos[3] = "Laptop Lenovo";
        productos[4] = "Mose razor";

        //Arrays.sort(productos);//Ordena alfabeticamente con los metodos de java
        ordenarAlfabeticamente(productos);//llamamos nuestro metodo para ordenar

        int largo = productos.length;

        //arregloInverso(productos);// mandamos llamar el metodo
        Collections.reverse(Arrays.asList(productos));// este es un metodo de la APi de java para poder hacer inverso un arreglo

        for(int i = 0; i < largo; i++){// usando for
            System.out.println("Para indice = " + i + " : " + productos[i]);
        }



    }
    //Creamos un metodo para poderlo reutilizar despues se manda llamar en el main
    public static void arregloInverso(String[] arreglo){ // aqui recibe un arreglo String[] y le damos un nombre "productos"
        int largo = arreglo.length;
        int largo2 = largo/2;// se divide en 2 para encontrar el punto de quiebre si no lo hacemos no habra cambios
        for(int i = 0 ; i < largo2; i++){ String actual = arreglo[i];
            String inverso = arreglo[largo - 1 - i];
            arreglo[i] = inverso;
            arreglo[largo-1-i] = actual;
            largo2--;
        }
    }

    public static void ordenarAlfabeticamente(String[] arreglo){
        int largo = arreglo.length;
        int contador = 0;

        for(int i = 0; i < largo - 1; i++){
            for(int j = 0; j < largo - 1 - i; j++){
                if (arreglo[j + 1].compareTo(arreglo[j]) < 0) {
                    String auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
            }
            contador++;
        }
        System.out.println("El for itero = " + contador);
    }
}
