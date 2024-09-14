package Filme;

//Construindo a classe Filme
public class Filme {
    private 	String 	titulo;
    private 	int 	duracaoEmMinutos;
    private 	String 	genero;

    // Construtor da classe Filme
    public Filme(String titulo, int duracaoEmMinutos, String genero) {
    	
    	// Fazendo a verificação do titulo para que ele não fique vazio
        if(titulo == null || titulo.trim().isEmpty())
            throw new IllegalArgumentException("O título não pode estar vazio.");
        
        // Fazendo a verificação da duração para que não fique com um valor menor que 0
        if(duracaoEmMinutos <= 0)
            throw new IllegalArgumentException("A duração deve ser maior que zero.");
        
        // Fazendo a validação do genero para que só tenha Romance Terror ou Comédia
        if(!genero.equalsIgnoreCase("Romance") && 
            !genero.equalsIgnoreCase("Terror") && 
            !genero.equalsIgnoreCase("Comédia"))
            throw new IllegalArgumentException("O gênero deve ser Romance, Terror ou Comédia.");
 
        // Atribui os valores validados aos atributos da classe Filme
        this.titulo = titulo;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.genero = genero;
    }
    
    // Aqui está retornando o Título, Duração e o Genero do Filme
    public String getTitulo() { return titulo; }
    public int getDuracaoEmMinutos() { return duracaoEmMinutos; }
    public String getGenero() { return genero; }

    
    @Override
    public String toString() {
        // Fornece uma representação objeto Filme incluindo seus atributos título duração e gênero
        return "Filme{Título='" + titulo + "', Duração=" + duracaoEmMinutos + " minutos, Gênero='" + genero + "'}";
    }
}

