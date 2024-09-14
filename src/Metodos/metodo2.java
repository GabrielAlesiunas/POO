package Metodos;
import java.util.Scanner;

public class metodo2 {
	 public static void main(String[] args) {
		 
		 	// Cria um objeto Scanner para permitir a entrada de dados pelo teclado
	        Scanner teclado = new Scanner(System.in);
	        
	        // Variaveis para armazenar o número que o usuário digitou
	        System.out.println("Informe o 1° numero: ");
	        double num1 = teclado.nextDouble();
	        
	        System.out.println("Informe o 2° numero: ");
	        double num2 = teclado.nextDouble();
	        
	        System.out.println("Informe o 3° numero: ");
	        double num3 = teclado.nextDouble();

	        // Criando a variavel media para calcular a média dos valores informados pelo usuario
	        double media = (num1 + num2 + num3) / 3;

	        // Exibindo o valor da média para o usuário
	        System.out.println("A média dos valores é: " + media);
	    }
}