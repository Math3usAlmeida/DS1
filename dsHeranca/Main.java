package dsHeranca;
 
public class Main {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Cliente Pablo = new Cliente();
		Pablo.setNome("Pablo");
		Pablo.setEndereco("Rua Bernadino Silva 150");
		Pablo.setIdade(22);
		Pablo.setValorPe(222.00); 

		System.out.println("o nome é " + Pablo.getNome());
		System.out.println("o endereço é " + Pablo.getEndereco());
		System.out.println("a idade é " + Pablo.getIdade());
		System.out.println("o valor do pedido é " + Pablo.getValorPe());
		System.out.println("o valor com desconto é " + Pablo.calculaDesc());
		System.out.println("--------------------------------");
		ClientePremium Jair = new ClientePremium();
		Jair.setNome("Jair");
		Jair.setEndereco("Rua Brasil Amado 221");
		Jair.setIdade(42);
		Jair.setValorPe(650); 

		System.out.println("o nome é " + Jair.getNome());
		System.out.println("o endereço é " + Jair.getEndereco());
		System.out.println("a idade é " + Jair.getIdade());
		System.out.println("o valor do pedido é " + Jair.getValorPe());
		System.out.println("o valor com desconto é " + Jair.calculaDesc());
	}
 
}