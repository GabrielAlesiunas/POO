package ContaBancaria;

// Construindo a classe ContaBancaria
public class ContaBancaria {

    // Atributos encapsulados
    private double saldo; 
    private int numeroConsultas;

    // Construtor da classe
    public ContaBancaria(double saldoInicial) {
    	// Inicializa o saldo com o valor fornecido
        saldo = saldoInicial; 
        
        // Inicializa o contador de consultas
        numeroConsultas = 0; 
    }

    // Método para realizar um depósito com taxa de 1%
    public void deposito(double valor) {
    	
    	// Calcula a taxa de 1%
        double taxa = valor * 0.01; 
        
        // Adiciona o valor líquido ao saldo
        saldo += (valor - taxa);
    }

    // Método para realizar um saque com taxa de 0.5%
    public boolean saque(double valor) {
    	
    	// Calcula a taxa de 0,5%
        double taxa = valor * 0.005; 
        
        // Calcula o total a ser retirado (saque + taxa)
        double totalSaque = valor + taxa; 
        
        // Verifica se o saldo é suficiente
        if (totalSaque <= saldo) { 
            saldo -= totalSaque;
            return true; 
            
        // Saldo insuficiente para o saque
        } else {
            return false;
        }
    }

    // Método para realizar uma consulta e cobrar taxa a cada 5 consultas
    public double consulta() {
    	
    	// Incrementa o contador de consultas
        numeroConsultas++; 
        
        // Verifica se é a cada 5ª consulta
        if (numeroConsultas % 5 == 0) {
        	
        	 // Deduz 0,10 reais do saldo como taxa de consulta
            saldo -= 0.10;
        }
        
        // Retorna o saldo atual
        return saldo; 
    }

    // Método para obter o saldo da conta
    public double getSaldo() {
    	
    	// Retorna o saldo atual
        return saldo; 
    }
}
