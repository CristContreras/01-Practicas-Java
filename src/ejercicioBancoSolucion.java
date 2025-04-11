import java.util.Scanner;

public class ejercicioBancoSolucion {
    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoCuenta = "Corriente";
        double saldo = 1599.99;

        System.out.println("*************************************");
        System.out.println("\nNombre del cliente: "+ nombre);
        System.out.println("El tipo de cuenta es: "+tipoCuenta);
        System.out.println("Su saldo disponible es: "+saldo+"$");
        System.out.println("\n*************************************");

        String menu = """
                Escriba el número del la opcion deseada ***
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
        int opcion=0;
        Scanner teclado = new Scanner (System.in);

        while(opcion!=9){
            System.out.println(menu);
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("El saldo actualizado es: "+saldo+"$");
                    break;
                case 2:
                    System.out.println("¿CUal es el valor que desea retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if(saldo<valorARetirar){
                        System.out.println("Saldo insuficiente");
                    }else{
                        saldo=saldo-valorARetirar;
                        System.out.println("El saldo actualizado es: "+saldo+"$");

                    }
                    break;
                case 3:
                    System.out.println("¿Cual es el valor a depositar?");
                    double valorADepositar = teclado.nextDouble();
                    saldo +=valorADepositar;
                    System.out.println("El saldo actualizado es: "+saldo+"$");
                    break;
                case 9:
                    System.out.println("Saliendo del programa, gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        }

    }
}
