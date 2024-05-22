package dsheranca;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motoca C400x = new Motoca();
		C400x.setMarca("BMW");
		C400x.setModelo("C400x");
		C400x.setAno(2021);
		C400x.setCor("Preta");
		C400x.setCilindrada(350);
		System.out.println("a marca é "+C400x.getMarca());
		System.out.println("a modelo é "+C400x.getModelo());
		System.out.println("o ano é "+C400x.getAno());
		System.out.println("a cor é "+C400x.getCor());
		System.out.println("n° cilindradas é "+C400x.getCilindrada());
		System.out.println("---------------------");
		Car renegade = new Car();
		renegade.setMarca("Jeep");
		renegade.setModelo("Renegade");
		renegade.setAno(2024);
		renegade.setCor("Branco");
		renegade.setQtdDePortas(4);
		System.out.println("a marca é "+renegade.getMarca());
		System.out.println("a modelo é "+renegade.getModelo());
		System.out.println("o ano é "+renegade.getAno());
		System.out.println("a cor é "+renegade.getCor());
		System.out.println("n° portas é "+renegade.getQtdDePortas());


	}
 

}