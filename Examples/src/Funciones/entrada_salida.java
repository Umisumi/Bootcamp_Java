package Funciones;

import java.util.Scanner;


public class entrada_salida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numeros[] = new int[5];
        String datos[] = {"Piedra", "Papel", "Tijeras"};
        capturarDatosUsuario(numeros);
        mostrarDatosArray(numeros);
        System.out.println();
        int resultado[] = mayor_menor(numeros);
        int mayor = resultado[0];
        int menor = resultado[1];
        System.out.println("El número mayor del arreglo es: " + mayor);
        System.out.println("El número menor del arreglo es: " + menor);
        
        //PROMEDIO
        System.out.println("El promedio del arreglo es: " + promedioArray(numeros));

    }

    private static int entradaDatosArray(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingresa el valor a guardar en el arreglo: ");
        int numero = input.nextInt();
        return numero;
    }
    
    private static void capturarDatosUsuario(int numeros[]) {
        for(int i = 0; i < numeros.length; i++){
            //int numero = entradaDatosArray();
            numeros[i] = entradaDatosArray();
        }
    }

    private static void mostrarDatosArray(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
        }
    }
    
    private static int[] mayor_menor(int numeros[]){
        int mayor = 0;
        int menor = 0;
        
        for(int i = 0; i < numeros.length; i++){
            int no = numeros[i];
            if(no >= mayor || i == 0){
                mayor = no;
            }
            if(no <= menor || i == 0){
                menor = no;
            }
        }
        int resultado[] = new int[2];
        resultado[0] = mayor;
        resultado[1] = menor;
        
        return resultado;
    }
    
    private static float promedioArray(int numeros[]) {
        int total = 0;
        for (int i = 0; i < numeros.length; i++) {
            total += numeros[i];
        }

        float promedio = total / numeros.length;
        return promedio;
    }
 
}
