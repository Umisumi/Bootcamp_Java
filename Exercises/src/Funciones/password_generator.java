package Funciones;


public class password_generator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Genrador de contraseñas
        System.out.println(createPassword());
  
    }
    
    private static String createPassword(){
        long numerosAleatorios = (long)(Math.random() * 1000000000);
        //Redondeo del valor numerico
        //long numeros = Math.round(numerosAleatorios);
        
        String password = "Abcdef" + numerosAleatorios;
        
        //return password;
        return password;
    }
    
}
