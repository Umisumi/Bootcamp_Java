package Condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author Morita
 */
public class No_MayorMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer no1, no2;
        
        no1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el No. 1: "));
        no2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el No. 2: "));
        
        if(no1 > no2){
            JOptionPane.showMessageDialog(null, "El número " + no1 + " es el mayor y el número " + no2 + " es el menor");
        }
        else if(no2 > no1){
            JOptionPane.showMessageDialog(null, "El número " + no2 + " es el mayor y el número " + no1 + " es el menor");
        }else{
            //JOptionPane.showMessageDialog(null, "Tanto el número: " + no1 + " cómo el número: " + no2 + ", son identicos");
            JOptionPane.showMessageDialog(null, "Tanto el primer número cómo el segundo número son identicos");
        }
    }
    
}
