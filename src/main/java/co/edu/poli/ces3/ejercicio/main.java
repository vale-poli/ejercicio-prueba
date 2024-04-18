package co.edu.poli.ces3.ejercicio;

public class main {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        java.util.Random random = new java.util.Random();

        // Asignar 10 números aleatorios al arreglo
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100); // Genera números aleatorios entre 0 y 99
        }

        // Imprimir los números en posiciones pares
        System.out.println("Números en posiciones pares:");
        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 == 0) { // Verificar si la posición es par
                System.out.println(numeros[i]);
            }
        }
    }
}