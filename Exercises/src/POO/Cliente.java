package POO;

public class Cliente {
    private String nombre;
    private String apellido;
    private String ocupacion;

    public void mostrarDatos() {
        System.out.println("Nombre completo: " + nombre + " " + apellido);
        System.out.println("Ocupacion: "+ ocupacion);
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
}