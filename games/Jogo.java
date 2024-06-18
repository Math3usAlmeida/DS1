package games;

public class Jogo {

	private String nome;
	private double preco;
	private String distribuidora;
	
	
	public Jogo(String nome, double preco, String distribuidora) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.distribuidora = distribuidora;
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public String getDistribuidora() {
		return distribuidora;
	}


	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}
	
	


}