package dsHeranca;
 
public class ClientePremium extends Cliente {
 
	@Override
	public double calculaDesc() {
		return super.getValorPe() - (super.getValorPe()*0.15); 
	}
}