package Metodos;

public class metodo6 {
	
	// Método que calcula o fatorial de um número
    public long calcularFatorial(int numero) {
    	// Deixa uma exceção para quando o número for negativo
        if(numero < 0){
            throw new IllegalArgumentException("Fatorial não é definido para números negativos.");
        }
        
        // Função para calcular o fatorial de um número determinado
        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    	// Aqui está criando uma instância da classe metodo, que calcula o fatorial do número 5, e imprime o resultado.
    public static void main(String[] args) {
    	
    	// Corrigido para instanciar a classe 'metodo'
        metodo6 f = new metodo6();  
        
        // Aqui é um exemplo de número para calcular o fatorial
        int numero = 5; 	
        long resultado = f.calcularFatorial(numero);
        
        // Aqui exibe para o usuário o fatorial
        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }
}
