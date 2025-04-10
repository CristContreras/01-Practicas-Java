import java.util.Scanner;

public class ejericioBanco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombreCliente = "Tony Stark";
        String tipoCuenta = "Corriente";
        double saldoCliente = 1599.99;

        mostrarMenu(teclado, saldoCliente);

    }

    public static void mostrarMenu(Scanner teclado, double saldoCliente){

        byte opcionCliente=0;
        mostrarAUsuario("Escriba el número de la opción deseada");
        mostrarAUsuario("1. Consultar saldo");
        mostrarAUsuario("2. Retirar");
        System.out.print("\nOpción: ");
        opcionCliente = teclado.nextByte();

        switch (opcionCliente){
            case 1:
                mostrarAUsuario(consultarSaldo(saldoCliente));
            break;
            case 2:
                retirarDinero(teclado, saldoCliente);
                break;
            default:
                System.out.println("Opción incorrecta");
            break;
        }
    }

    public static String consultarSaldo(double saldoCliente){
        return "Saldo disponible: $"+ saldoCliente;
    }

    public static void retirarDinero(Scanner teclado, double saldoCliente){
        System.out.println(consultarSaldo(saldoCliente));
        System.out.println("Ingrese la cantidad de dinero a retirar");
        double cantidadRetiro = teclado.nextDouble();

        while(cantidadRetiro>saldoCliente){
            System.out.println("La cantidad solicitada excede el saldo disponible");

            System.out.println("Ingrese la cantidad de dinero a retirar");
            cantidadRetiro=teclado.nextDouble();
        }

        System.out.println("Procesando retiro de dinero, monto: $"+cantidadRetiro);
        saldoCliente = saldoCliente-cantidadRetiro;
        System.out.println(consultarSaldo(saldoCliente));

    }

    public static void mostrarAUsuario(String msj){
        System.out.println(msj);
    }



}
