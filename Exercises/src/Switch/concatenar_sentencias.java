package Switch;

import java.util.Scanner;
//import javax.swing.JOptionPane;

public class concatenar_sentencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int dato;
        
        System.out.println("MENU");
        //JOptionPane.showMessageDialog(null, "MENU");
        System.out.println("1)Google Maps - Países");
        System.out.println("2)Buscador de Tweets");
        System.out.println("3)Llamada por Whatsapp");
        System.out.println("4)Narrativa de una aventura: ");
        System.out.print("Selecciona una opción: ");
        dato = input.nextInt();
        
        switch(dato){
            case 1:
                System.out.print("Ingresa un país: ");
                String pais = input.next();
                System.out.println("https://www.google.com/maps/search/" + pais);
                //JOptionPane.showMessageDialog(null, "https://www.google.com/maps/search/" + pais);
                break;
            
            case 2:
                System.out.print("Ingresa el nombre de una celebridad: ");
                String celebridad = input.next();
                System.out.println("https://twitter.com/search?q=" + celebridad);
                break;
                
            case 3:
                System.out.print("Ingresa el nombre de una celebridad: ");
                Integer telefono = input.nextInt();
                System.out.println("https://api.whatsapp.com/send?phone=" + telefono);
                break;
                
            case 4:
                System.out.println("Elige tu propia Aventura");
                
                System.out.println("Es una noche estrellada, te encuentras en un bosque misterioso: ");
                System.out.println("1) Exploras la oscuridad en busca de la fuente de un susurro escalofriante");
                System.out.println("2) Sigues el sendero iluminado hacia una pequeña cabaña acogedora");
                System.out.print("Elige una opcion: ");
                int opcion = input.nextInt();
                
                if (opcion == 1){
                    System.out.println("Fin de la aventura");
                }
                else if (opcion == 2){
                    System.out.println("Decides seguir el sendero iluminado hacia la pequeña cabaña acogedora. "
                            + "Al llegar a la cabaña, te das cuenta de que hay dos puertas: ");
                    System.out.println("1) Entras por la puerta de la izquierda ");
                    System.out.println("2) Optas por la puerta de la derecha");
                    System.out.print("Elige una opcion: ");
                    opcion = input.nextInt();
                    if (opcion == 1){
                        System.out.println("Al abrir la puerta de la izquierda, te encuentras con una habitación "
                            + "llena de tesoros brillantes y mágicos. Te maravillas con las joyas y los objetos "
                            + "preciosos que llenan la sala. Te das cuenta de que has encontrado el legendario "
                            + "tesoro perdido del bosque. Con tu corazón lleno de emoción y riquezas, decides "
                            + "regresar a casa para compartir tu increíble aventura con el mundo. ¡Felicidades, "
                            + "has tenido un final exitoso en tu búsqueda!");
                    }
                    else if(opcion == 2){
                        System.out.println("Fin de la aventura");
                    }
                    else{
                        System.out.println("Opcion invalida");
                    }
                    
                    
                }else{
                    System.out.println("Error, opcion invalida");
                }
                break;
                
            default: System.out.println("Opción invalida");
                
        }
         
    }
    
}
