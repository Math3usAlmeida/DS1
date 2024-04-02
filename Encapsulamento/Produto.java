package exe1;

public class Produto {
	 private String nome;
	  private double precoCusto;
	  private double precoVenda;
	  private double margemLucro;
	  
	  public String getNome() {
		  return nome;
		  
	  }
	  public void setNome(String nome) {
		  this.nome = nome;
	  }
	  
	  public double getpPrecoCusto() {
		  return precoCusto;
		  
	  }
	  public void setPrecoCusto(double precoCusto) {
		  this.precoCusto = precoCusto;
	  }
	  
	  public double getPrecoVenda() {
		  return precoVenda;
	  }
	  public void setPrecoVenda(double precoVenda) {
		  if (precoVenda >= precoCusto ) {
			  this.precoVenda = precoVenda;
		  }else {
			  System.out.println("O valor de venda do produto n�o pode ser inferior ao valor de custo");
		  }
		  
	  }
	  
	  public double getMargemLucro() {
		  return margemLucro;
	  }
	  public void setMargemLucro(double margemLucro) {
		  this.margemLucro = margemLucro;
	  }
	  
	    public double calcularMargemLucro() {
	        double margem = precoVenda - precoCusto;
	        setMargemLucro(margem);
	        return margem;
	    }
	    
	    public double getMargemLucroPorcentagem() {
	        return (getMargemLucro() / precoCusto) * 100;
	    }
	  



}
