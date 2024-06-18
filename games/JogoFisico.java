package games;

public class JogoFisico extends Jogo {
	private int qntdJogadores;
	private double tempPartida;
	public JogoFisico(String nome, double preco, String distribuidora) {
		super(nome, preco, distribuidora);
		this.qntdJogadores = qntdJogadores;
		this.tempPartida = tempPartida;
		
		
	}
	public int getQntdJogadores() {
		return qntdJogadores;
		
	}
	public void setQntdJogadores(int qntdJogadores) {
		this.qntdJogadores = qntdJogadores;
		
	}
	public double getTempPartida() {
		return tempPartida;
		
	}
	public void setTempPartida(double tempPartida) {
		this.tempPartida = tempPartida;
		
	}
	
public double calcularTempTotal(int qntdPartidas) {
	double tempTotal = tempPartida * qntdPartidas;
	return tempTotal;
}
}
