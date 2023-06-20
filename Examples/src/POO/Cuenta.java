import java.util.Scanner;

public class Cuenta {
    private String titular;
    private float cantidad;

    public Cuenta() {

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public void mostrar(String nombreTitular) {
        titular = nombreTitular;
        System.out.println("Nombre del titular: " + titular);
        System.out.println("Cantidad: $" + cantidad);
    }

    public void ingresar(float cantidadIntroducidad) {

        if (cantidadIntroducidad > 0) {
            cantidad += cantidadIntroducidad;
        }
    }

    public void retirar(float cantidadRetirada) {
        cantidad -= cantidadRetirada;
    }
}
