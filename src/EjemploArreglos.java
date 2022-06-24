import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        String[] productos = new String[7];//Se crea la instancia del arreglo y cantidad de producto

        productos[0] = "Memoria kigston pendrive";
        productos[1] = "iPhone";
        productos[2] = "SSD Samsung";
        productos[3] = "Laptop Lenovo";
        productos[4] = "Mose razor";

        Arrays.sort(productos);//Ordena los datos de forma alfabetica

        System.out.println("productos 0 = " + productos[0]);
        System.out.println("productos 1 = " + productos[1]);
        System.out.println("productos 2 = " + productos[2]);
        System.out.println("productos 3 = " + productos[3]);
        System.out.println("productos 4 = " + productos[4]);

        int[] numeros = new int[4];//Crea la instancia del arreglo y la cantidad de valores que estaran dentro


        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;

        int i = numeros[0];
        int i2 = numeros[1];
        int i3 = numeros[2];
        int i4 = numeros[numeros.length - 1];// el menos 1 es porque  .length nos daria 4 y esa posicion no existe ya que comienza dese 0

        Arrays.sort(numeros);//Ordena de menor a mayor los numeros
        System.out.println("i = " + i);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
        System.out.println("i4 = " + i4);
    }
}
