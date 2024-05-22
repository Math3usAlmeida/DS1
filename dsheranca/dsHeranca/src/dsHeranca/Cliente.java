package dsHeranca;
 
public class Cliente {
	private String nome;
	private int idade;
	private String endereco;
	private double valorPe;
	private double valorPro;
 
 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getValorPe() {
		return valorPe;
	}
	public void setValorPe(double valorPe) {
		this.valorPe = valorPe;
	}
	public double getValorPro() {
		return valorPro;
	}
	public void setValorPro(double valorPro) {
		this.valorPro = valorPro;
	}
	public double calculaDesc() {
		return valorPro = valorPe - (valorPe*0.10);
	}
}
