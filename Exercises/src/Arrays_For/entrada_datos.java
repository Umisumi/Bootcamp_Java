package Arrays_For;

import javax.swing.JOptionPane;

public class entrada_datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeros[] = new int[5];
        
        int i = 0;
        while (i < numeros.length){
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor a guardar en el arreglo: "));
            numeros[i] = numero;
            i++;
        }
        
        i = 0;
        /*while (i < numeros.length) {
            JOptionPane.showMessageDialog(null, numeros[i]);
            i++;
        }*/
        
        //DO WHILE
        /*do {
            JOptionPane.showMessageDialog(null, numeros[i]);
            i++;
        } while (i < numeros.length);*/
        
        //FOR
        int mayor = 0;
        int menor = 0;

        for (i = 0; i < numeros.length; i++) {
            JOptionPane.showMessageDialog(null, numeros[i]);
            int no = numeros[i];
            if (no >= mayor || i == 0) {
                mayor = no;
            }
            if (no <= menor || i == 0) {
                menor = no;
            }

        }
        
        JOptionPane.showMessageDialog(null, "El número mayor del arreglo es: " + mayor);
        JOptionPane.showMessageDialog(null, "El número menor del arreglo es: " + menor);
        
        //PROMEDIO DE VALORES DEL ARREGLO
        int total = 0;
        for (i = 0; i < numeros.length; i++) {
            int no = numeros[i];
            total += no;
        }
        float promedio = (float)total/numeros.length;
        JOptionPane.showMessageDialog(null, "El promedio del arreglo es: " + promedio);
    }
    
}
