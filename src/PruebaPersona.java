public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setNombre("SAMUEL HERNANDEZ");
        persona1.setEdad(25);
        persona1.setDni(1090254811);
        persona1.mostrar();
        persona1.esMayorDeEdad();

        Persona persona2 = new Persona("MANUEL CONTRERAS",16,1012546755);
        persona2.mostrar();
        persona2.esMayorDeEdad();

        System.out.println(persona1.mostrar());
        System.out.println(persona1.esMayorDeEdad());
        System.out.println(persona2.mostrar());
        System.out.println(persona2.esMayorDeEdad());
    }
}
