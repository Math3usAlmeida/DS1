
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        Imc primeiroImc = new Imc();
        System.out.println("Insira seu nome: ");
        primeiroImc.nome = in.next();
        System.out.println(primeiroImc.nome+" Insira sua idade: ");
        primeiroImc.idade = in.nextInt();
		System.out.println(" Insira a sua altura: ");
		primeiroImc.altura = in.nextDouble();
		System.out.println("Agora insira o seu peso: ");
		primeiroImc.peso = in.nextDouble();
		
		System.out.println(primeiroImc.nome+" você tem "+primeiroImc.idade+" anos e seu imc é: "+primeiroImc.calcular());
	}

}

