import java.util.Scanner;
import java.util.Random;
public class JuegoAdivinanza {
    public static void main(String[] args) {
        int numAleatorio = new Random().nextInt(100);
        int numUsuario = 0;
        int intentos = 5;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un número entre 0 y 100");
        numUsuario = teclado.nextInt();
        intentos--;
        while(intentos!=0){
            intentos--;
            if(numUsuario==numAleatorio){
                break;
            }else{
                System.out.println("Ingrese un número entre 0 y 100");
                numUsuario = teclado.nextInt();
            }
        }
        if(intentos==0){
            System.out.println("Game Over, intentos disponibles = "+intentos);
        }else{
            System.out.println("Felicidades acertaste");
            System.out.println("El número era "+numAleatorio);
        }
    }
}
