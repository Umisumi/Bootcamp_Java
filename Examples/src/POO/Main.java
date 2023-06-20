import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       //Cliente cliente = new Cliente();

        /*Cliente cliente1 = cargarCliente();
        cliente1.mostrarDatos();*/
        //System.out.println("Nombre completo: " + cliente.getNombre());

        //CLASE CUENTA
        Cuenta cuenta = new Cuenta();
        System.out.println("Ingrese su nombre de usuario: ");
        String nombreTitular = input.nextLine();
        System.out.print("Ingresa la cantida a ingresar: $");
        float cantidadIntroducidad = input.nextFloat();
        cuenta.ingresar(cantidadIntroducidad);

        System.out.print("Ingrese la cantidad a retirar: $");
        float cantidadRetirada = input.nextFloat();
        cuenta.retirar(cantidadRetirada);

        cuenta.mostrar(nombreTitular);

    }

    public static Cliente cargarCliente() {
        Scanner input = new Scanner(System.in);
        Cliente cliente = new Cliente();

        System.out.print("Ingresa tu nombre: ");
        cliente.setNombre(input.nextLine());

        System.out.print("Ingresa tu apellido paterno: ");
        cliente.setApellido(input.nextLine());

        System.out.print("Ingresa tu ocupacion: ");
        cliente.setOcupacion(input.nextLine());

        return cliente;
    }

}
