package Metodos;
import java.util.Scanner;

public class metodo5 {
	public static void main(String[] args) {
		
		// Cria um objeto Scanner para permitir a entrada de dados pelo teclado
        Scanner teclado = new Scanner(System.in);
        
        // Pergunta ao usuario os minutos e guarda na variavel minuto
        System.out.println("Informe os minutos");
        int minuto = teclado.nextInt();

        // Faz a divisão os minutos informados por 60
        int hora = minuto / 60;
        
        // O restante da divisão é guardado na variavel minutosRestantes
        int minutosRestantes = minuto % 60;
        
        
        // Informa os minutos que o usuario digitou e mostra as horas e se tiver minutos restantes
        System.out.println(minuto + " minutos em horas é: " + hora + " horas e " + minutosRestantes + " minutos");
    }
}