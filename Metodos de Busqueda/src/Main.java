public class Main {
    public static void main(String[] args) {
        int[] numeros = {23, 30, 45, 67, 89, 110, 240, 367, 400, 403, 580}; // Debe estar ordenado para la binaria
        int clave = 580;

        //Busqueda Secuencial
        int resultadoSecuencial = Busqueda.busquedaSecuencial(numeros, clave);
        System.out.println("Secuencial: " + (resultadoSecuencial != -1 ? "Encontrado en posición " + resultadoSecuencial : "No encontrado"));

        // Búsqueda Binaria
        int resultadoBinario = Busqueda.busquedaBinaria(numeros, clave);
        System.out.println("Binaria: " + (resultadoBinario != -1 ? "Encontrado en posición " + resultadoBinario : "No encontrado"));
    }
}
