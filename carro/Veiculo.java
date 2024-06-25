package carro;

public class Veiculo {
	private String modelo;
	private double valorTabela;
	private String cor;
	private String combustivel;
	private double ipva;
	//Construtor
	public Veiculo (String modelo, double valorTabela, String cor, String combustivel, double ipva ) {
		this.modelo = modelo;
		this.valorTabela = valorTabela;
		this.cor = cor;
		this.combustivel = combustivel;
		this.ipva = 0.0;
		
		}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public double getValorTabela() {
		return valorTabela;
	}
	
	public void setValorTabela(double valorTabela) {
		this.valorTabela = valorTabela;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getCombustivel() {
		return combustivel;
	}
	
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	
	public double getIpva() {
		return ipva;
	}
	
	public void setIpva(double ipva) {
		this.ipva = ipva;
	}
	public void calcularIpva(double porcentagem){
		
		
	this.ipva = this.valorTabela*porcentagem;
		System.out.println("modelo:" + modelo);
		System.out.println("Valor Tabela:R$" + valorTabela);
		System.out.println("cor:" + cor);
		System.out.println("IPVA:R$" + ipva );
		System.out.println("------------------------");
		
	}
	
}