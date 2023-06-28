package Clase13_Ejercicios;

import javax.swing.JOptionPane;



public class amigo_invisible {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Integer noPersonas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas personas van a jugar ala amigo invisible?"));
        
        String[] listaPersonas = new String[noPersonas];
        
        for (int i = 0; i < noPersonas; i++) {
            String nombrePersona = JOptionPane.showInputDialog("Ingrese el nombre de las personas:");
            listaPersonas[i] = nombrePersona;
        }
        
        for (int i = 0; i < listaPersonas.length; i++) {
            String nombrePersona = listaPersonas[i];
            JOptionPane.showInputDialog("Que " + nombrePersona + " se acerque a la computadora y presione ENTER");
            JOptionPane.showInputDialog("Le tienes que hacer un regalo a X. Presiona ENTER");
        }
        
        
        //JOptionPane.showInputDialog("Presiona ENTER2");
        
        
        
        
        /*Integer contador = 1;
        for (int i = 0; i < listaPersonas.length; i++) {
            System.out.println("Nombre de la persona " + contador + ": " + listaPersonas[i]);
            contador ++;
        }*/
        
    }
    
}
