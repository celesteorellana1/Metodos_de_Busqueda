import java.util.Arrays;

public class Busqueda {
    //Busqueda Secuencial
    public static int busquedaSecuencial(int[] arreglo, int clave) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == clave) {
                return i;
            }
        }
        return -1;
    }

    // Busqueda Binaria
    public static int busquedaBinaria(int[] arreglo, int clave) {
        int inicio = 0, fin = arreglo.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (arreglo[medio] == clave) {
                return medio; //Se eencontro la clave
            }

            if (arreglo[medio] < clave) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1; // No se encontro
    }
}
