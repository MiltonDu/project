public class Main {
    public static void main(String[] args) {
        //Variable universal
        int numero = 0;
        var estacion = "otoño";

        //If
        if(numero > 0){
            System.out.println("Es positivo: " + numero);
        } else if (numero < 0) {
            System.out.println("Es negativo: "+ numero);
        } else {
            System.out.println("Es neutro: " + numero);
        }

        //While
        while (numero > 3){
            System.out.println(numero);
            numero--;
        }

        //Do while
        do {
            System.out.println(numero);
            numero--;
        } while (numero > 3);

        //For
        for (; numero <= 3; numero++){
            System.out.println(numero);
        }

        //Case
        switch (estacion){
            case "verano":
                System.out.println("Es " + estacion);
                break;
            case "otoño":
                System.out.println("Es " + estacion);
                break;
            case "invierno":
                System.out.println("Es " + estacion);
                break;
            case "primavera":
                System.out.println("Es " + estacion);
                break;
            default:
                System.out.println("No es una estación " + estacion);
        }
    }
}