
public class Imc {
	  String nome;
	  int idade;
	  double peso;
	  double altura;
	  
	  double calcular() {
		  double imc = peso / (altura*altura);
		  imc = Math.round(imc * 100.0) / 100.0;
		  

		  if (imc < 18.5) {
			  System.out.println("Abaixo do peso");
		  }
		  else if (imc <=24.9) {
			  System.out.println("Peso normal");
		  }
		  else if (imc <= 29.9) {
			  System.out.println("Sobrepeso");
		  }
		  else if (imc <= 34.9) {
			  System.out.println("Obesidade gral 1");
		  }
		  else if (imc <= 39.9) {
			  System.out.println("Obesidade gral 2");
		  }
		  else {
			  System.out.println("Obesidade gral 3");
		  };
		  
	  return imc;
	  }
}