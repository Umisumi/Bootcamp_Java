package adivina_numero;

import javax.swing.JOptionPane;

/**
 *
 * @author Morita
 */
public class advina_no {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Adivina el número
        
        Integer numero;
        int numero_aleatorio = 0;
        
        numero_aleatorio = (int)(Math.random()*100);
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Adivina el número: "));
        
        if(numero == numero_aleatorio){
            JOptionPane.showMessageDialog(null, "Adivinaste el número!");
        }else{
            JOptionPane.showMessageDialog(null, "Número equivocado, el numero correcto es: " + numero_aleatorio);
        }
    }
    
}
