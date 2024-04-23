package clculattt;

import java.util.List;

public class Calculadoiira {
    private String nome;
    private double resultado;

    public Calculadoiira(String nome) {
        this.nome = nome;
        this.resultado = 0.0; // Inicializa o resultado como zero
    }

    // M�todo para soma de dois inteiros
    public int soma(int a, int b) {
        this.resultado = a + b;
        return (int) this.resultado;
    }

    // M�todo para soma de dois decimais
    public double soma(double a, double b) {
        this.resultado = a + b;
        return this.resultado;
    }

    // M�todo para soma de uma lista de n�meros
    public double soma(List<Double> numeros) {
        this.resultado = 0.0;
        for (double num : numeros) {
            this.resultado += num;
        }
        return this.resultado;
    }

    // M�todo para subtra��o de dois inteiros
    public int subtracao(int a, int b) {
        this.resultado = a - b;
        return (int) this.resultado;
    }

    // M�todo para subtra��o de dois decimais
    public double subtracao(double a, double b) {
        this.resultado = a - b;
        return this.resultado;
    }

    // M�todo para subtra��o de uma lista de n�meros
    public double subtracao(List<Double> numeros) {
        if (numeros.isEmpty()) {
            return 0.0; // Retorna zero se a lista estiver vazia
        }

        this.resultado = numeros.get(0); // Inicializa com o primeiro n�mero
        for (int i = 1; i < numeros.size(); i++) {
            this.resultado -= numeros.get(i); // Subtrai os n�meros subsequentes
        }
        return this.resultado;
    }
}
