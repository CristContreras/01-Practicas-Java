import java.util.Scanner;

public class ejericioBancoIndividual {
    public static double saldoCliente = 1599.99;
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        String nombreCliente = "Tony Stark";
        String tipoCuenta = "Corriente";

        mostrarMenu(nombreCliente, tipoCuenta);

    }

    public static void mostrarMenu(String nombreCliente, String tipoCliente){

        byte opcionCliente=0;

        String menu = """
                    *** Escriba el número de la opción deseada ***
                    1 - Consultar saldo
                    2 - Retirar
                    3 - Depositar
                    4 - Salir""";
        while(true){
            mostrarAUsuario("Nombre del Cliente: "+nombreCliente);
            mostrarAUsuario("Tipo de cuenta: "+tipoCliente);
            mostrarAUsuario("Saldo disponible: $"+String.format("%.2f",saldoCliente));
            mostrarAUsuario("\nEscriba el número de la opción deseada");
            mostrarAUsuario(menu);
            System.out.print("\nOpción: ");
            opcionCliente = teclado.nextByte();

            switch (opcionCliente){
                case 1:
                    mostrarAUsuario(consultarSaldo());
                    break;
                case 2:
                    retirarDinero();
                    break;
                case 3:
                    depositarDinero();
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }

    }

    public static void depositarDinero(){
        mostrarAUsuario("¿Cuanto dinero quiere depositar?");
        double deposito = teclado.nextDouble();
        saldoCliente = saldoCliente+deposito;
        mostrarAUsuario("Tu dinero fue depositador, cantidad: "+deposito);
        mostrarAUsuario("Saldo actual: "+saldoCliente);
    }
    public static String consultarSaldo(){
        return "Saldo disponible: $"+ String.format("%.2f", saldoCliente);
    }

    public static void retirarDinero(){
        mostrarAUsuario(consultarSaldo());
        mostrarAUsuario("Ingrese la cantidad de dinero a retirar");

        double cantidadRetiro = teclado.nextDouble();

        while(cantidadRetiro>saldoCliente){
            mostrarAUsuario("La cantidad solicitada excede el saldo disponible");
            mostrarAUsuario("Ingrese la cantidad de dinero a retirar");
            cantidadRetiro=teclado.nextDouble();
        }
        mostrarAUsuario("Procesando retiro de dinero, monto: $"+cantidadRetiro);
        saldoCliente = saldoCliente-cantidadRetiro;
        System.out.println(consultarSaldo());

    }

    public static void mostrarAUsuario(String msj){
        System.out.println(msj);
    }



}
