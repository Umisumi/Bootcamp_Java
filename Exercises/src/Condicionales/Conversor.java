package Condicionales;

import java.util.Scanner;
//import javax.swing.JOptionPane;

/**
 *
 * @author Morita
 */
public class Conversor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Conversor de millas a kilómetros

        Scanner input = new Scanner(System.in);
        double millas, kilometros;
        //String cadena;
        String nombre;

        //cadena = JOptionPane.showInputDialog("Ingresa tu nombre");
        System.out.print("Ingresa tu nombre: ");
        nombre = input.next();
        System.out.println("Distancia en millas: ");
        millas = input.nextDouble();
        kilometros = millas * 1.60934;
        System.out.println("La converción a kilómetros es: " + kilometros + ", trabajo realizado por: " + nombre);
    }

}
