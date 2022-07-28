public class Main {
    public static void main(String[] args) {

        coche miCoche = new coche();
        miCoche.aumentarPuertas();
        System.out.println("Numero de puertas: "+ miCoche.puerta);

        int param_a = 5;
        int param_b = 6;
        int param_c = 7;
        var resultado = suma(param_a, param_b, param_c);
        System.out.println("Suma = "+ resultado);
    }

    public static int suma (int a, int b, int c){
        return a + b + c;
    }
}

class coche {
    public int puerta = 0;

    public void aumentarPuertas(){
        this.puerta++;
    }
}