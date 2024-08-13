
import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        ArrayList<Formas> figuras = new ArrayList<>();
 
        while (true) {
            System.out.print("Digite a forma (circulo, retangulo) ou 'fim' para encerrar: ");
            String tipo = scanner.next().toLowerCase();
 
            if (tipo.equals("fim")) {
                break;
            }
 
            switch (tipo) {
                case "circulo":
                    System.out.print("Digite o raio do círculo: ");
                    double raio = scanner.nextDouble();
                    figuras.add(new Circulo(raio));
                    break;
 
                case "retangulo":
                    System.out.print("Digite a largura do retângulo: ");
                    double largura = scanner.nextDouble();
                    System.out.print("Digite a altura do retângulo: ");
                    double altura = scanner.nextDouble();
                    figuras.add(new Retangulo(largura, altura));
                    break;
 
                default:
                    System.out.println("Forma inválida. Tente novamente.");
                    break;
            }
        }
 
        System.out.println("Áreas das figuras:");
        for (Formas figura : figuras) {
            System.out.println(figura.calcularArea());
        }
 
        scanner.close();
    }
}
