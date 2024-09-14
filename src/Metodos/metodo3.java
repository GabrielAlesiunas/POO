package Metodos;
import java.util.Scanner;

public class metodo3 {
	public static void main(String[] args) {
		
		// Cria um objeto Scanner para permitir a entrada de dados pelo teclado
        Scanner teclado = new Scanner(System.in);
        
        // Variaveis para armazenar o número que o usuário digitou
        System.out.println("Informe o 1° número:");
        double num1 = teclado.nextDouble();
        
        System.out.println("Informe o 2° número:");
        double num2 = teclado.nextDouble();
        
        System.out.println("Informe o 3° número:");
        double num3 = teclado.nextDouble();
        
        // Atribiu o num1 como o maior valor
        double maior = num1;
        
        
        // Verifica se o num2 é maior que o num1
        if(num2 > maior){
            maior = num2;
        }
        
        // Verifica se o num3 é maior que o num1
        if(num3 > maior){
            maior = num3;
        }
        
        // Exibindo o maior valor para o usuário
        System.out.println("O maior número entre " + num1 + ", " + num2 + " e " + num3 + " é: " + maior);
    }
}




