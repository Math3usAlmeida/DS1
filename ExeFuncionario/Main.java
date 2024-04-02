package exe1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        Produto PrimeiroProduto = new Produto();
		System.out.println("Coloque o nome do produto:");
		PrimeiroProduto.setNome(in.next());
		
		System.out.println("Coloque o preço de custo:");	
		PrimeiroProduto.setPrecoCusto(in.nextDouble());
		
		System.out.println("Coloque o preço de venda:");
		PrimeiroProduto.setPrecoVenda(in.nextDouble());
		
        System.out.println("Produto: " + PrimeiroProduto.getNome());
        System.out.printf("Lucro: R$%.2f\n", PrimeiroProduto.calcularMargemLucro());
        System.out.printf("Porcentagem de lucro: %.2f%%\n", PrimeiroProduto.getMargemLucroPorcentagem());
		
			
		}

}


