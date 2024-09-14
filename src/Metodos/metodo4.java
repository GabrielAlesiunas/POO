package Metodos;

public class metodo4 {
	
	// Define o método calcularPotencia que calcula a base elevada ao expoente
    public static int calcularPotencia(int base, int expoente) {
        int resultado = 1;
        for(int i = 0; i < expoente; i++){
            resultado *= base;
        }
        return resultado;
    }
    	// Essa parte o método main calcula a potência da base e do expoente fornecidos e exibe o resultado
    public static void main(String[] args){
        int base = 4;
        int expoente = 3;
        int resultado = calcularPotencia(base, expoente);
        System.out.println(base + "^" + expoente + " = " + resultado);
    }
}