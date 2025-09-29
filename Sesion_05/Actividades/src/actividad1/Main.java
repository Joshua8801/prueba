package actividad1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de nombres: ");
        int tamNombres = sc.nextInt();
        sc.nextLine(); 

        String[] nombres = new String[tamNombres];
        for (int i = 0; i < tamNombres; i++) {
            System.out.print("Ingrese el nombre " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
        }

        System.out.print("Ingrese la cantidad de números: ");
        int tamNumeros = sc.nextInt();

        Integer[] numeros = new Integer[tamNumeros];
        for (int i = 0; i < tamNumeros; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nArreglo completo:");
        Funciones.imprimirArreglo(nombres);
        Funciones.imprimirArreglo(numeros);

        try {
            System.out.print("\nIngrese índice inicial para subarreglo: ");
            int inicio = sc.nextInt();
            System.out.print("Ingrese índice final para subarreglo: ");
            int fin = sc.nextInt();

            int cantidad = Funciones.imprimirArreglo(nombres, inicio, fin);
            System.out.println("Cantidad de elementos impresos: " + cantidad);
        } catch (InvalidSubscriptException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("\nProbando excepción con números:");
            Funciones.imprimirArreglo(numeros, 4, 2); // Esto lanza excepción
        } catch (InvalidSubscriptException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}



