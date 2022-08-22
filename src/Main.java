public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre = "Milton Durand";
        cliente.edad = 27;
        cliente.telefono = "5776965";
        cliente.credito = "$1000.00";

        System.out.println(cliente.nombre);
        System.out.println(cliente.edad);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);
    }
}
class Persona {
    int edad;
    String nombre;
    String telefono;
}

final class Cliente extends Persona {
    String credito;
}

final class Trabajador extends Persona {
    String salario;
}