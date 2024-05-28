package provads;

public class Main {
	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.setTitulo("Diario De Um Banana");
		livro.setAutor("Jeff Kinny");
	    livro.setAnoPublicacao(2007);
	    System.out.println("O Livro  é "+livro.getTitulo());
	    System.out.println("O Autor é "+livro.getAutor());
	    System.out.println("O Ano é "+livro.getAnoPublicacao());
	    System.out.println("--------------------------------");
	    
	    Revista revista = new Revista();
	    revista.setTitulo("Turma da Monica");
	    revista.setAutor("Mauricio de Sousa");
	    revista.setAnoPublicacao(1970);
	    System.out.println("A Revista  é "+revista.getTitulo());
	    System.out.println("O Autor é "+ revista.getAutor());
	    System.out.println("O Ano é "+revista.getAnoPublicacao());
	    
	    
		
		
	}

}
