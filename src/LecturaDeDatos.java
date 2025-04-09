import java.util.Scanner;

public class LecturaDeDatos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu película favorita");
        String nombrePelicula = teclado.nextLine();
        System.out.println("Ahora escribe la fecha de lanzamiento");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("Por último dinos que nota le das a esta Película");
        double nota = teclado.nextDouble();
        teclado.close();
        System.out.println(nombrePelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);

        System.out.printf("%s",nombrePelicula);

    }
}
