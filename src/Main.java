public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad("27");
        System.out.println("Mi edad es: " + persona.getEdad());

        persona.setNombre("Milton Durand");
        System.out.println("Mi nombre es: " + persona.getNombre());

        persona.setTelefono("950167330");
        System.out.println("Mi telefono es: " + persona.getTelefono());
    }
}

class Persona {
    private String edad, nombre, telefono;

    public void setEdad(String edad){
        this.edad = edad;
    }
    public String getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return  this.nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }
}