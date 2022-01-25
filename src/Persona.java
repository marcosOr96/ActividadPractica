public class Persona {

    private String nombre;
    private int edad;
    private int dni;

    public Persona() {
    }

    public Persona(String nombre, int edad, int dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String mostrar(){
        return nombre+
        "\n"+edad+
        "\n"+dni;
    }
    public boolean esMayorDeEdad(){
        if (getEdad()>=18) {
            return true;
        }
        else {
            return false;
        }
    }
}
