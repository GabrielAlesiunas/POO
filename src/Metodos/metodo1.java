package Metodos;
import java.util.Scanner;

public class metodo1 {
	public static void main(String[] args) {

        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número:");
        double numero = teclado.nextDouble();

        // Verifica se o número é positivo ou negativo
        if (numero >= 0) {
            System.out.println("O número é positivo");
        } else {
            System.out.println("O número é negativo");
        }
        
        // Fecha o Scanner para liberar os recursos
        teclado.close();
    }
}