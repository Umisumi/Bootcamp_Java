package Arrays_For;

import javax.swing.JOptionPane;


public class busqueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombresCompletos[] = {"MORALES MONTELONGO ARI RAMSES", "BELLO JIMENEZ JOSELINE IVETTE", "LARA BUSTAMANTE ISAAC", "TREJO MARTINEZ TAMARA SAMANTHA",
        "TREJO TREJO RODOLFO ALDAIR"};
        
        String busqueda = JOptionPane.showInputDialog("Ingrese el nombre de la persona a buscar: ");
        busquedaPersona2(nombresCompletos, busqueda);
        
    }
    
    public static void busquedaPersona(String nombresCompletos[], String busqueda){

        for(int i = 0; i < nombresCompletos.length; i++){
            String persona = nombresCompletos[i];

            //Busqueda por cualquier letra o palabra que coincida, la busqueda pasa a mayusculas
            if(persona.contains(busqueda.toUpperCase())){
                System.out.println("La persona es: " + persona);
            }

            //Busqueda solo por nombre completo
            /*if(busqueda.equalsIgnoreCase(persona)){
                System.out.println("La persona es: " + persona);
            }*/
        }
    }
    
    public static void busquedaPersona2(String nombresCompletos[], String busqueda){
        
        for(String persona : nombresCompletos){
            if(persona.contains(busqueda.toUpperCase())){
                System.out.println("La persona es: " + persona);
            }
        }
        
        
    }
    
}
