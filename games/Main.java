package games;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com as informações do jogo físico:");
        System.out.print("Nome: ");
        String nomeFisico = scanner.nextLine();
        System.out.print("Preço: ");
        double precoFisico = scanner.nextDouble();
        scanner.nextLine();         System.out.print("Distribuidora: ");
        String distribuidoraFisico = scanner.nextLine();
        System.out.print("Quantidade de Jogadores: ");
        int qntdJogadoresFisico = scanner.nextInt();
        System.out.print("Tempo de Partida (em minutos): ");
        double tempPartidaFisico = scanner.nextDouble();

        JogoFisico jogoFisico = new JogoFisico(nomeFisico, precoFisico, distribuidoraFisico);
        jogoFisico.setQntdJogadores(qntdJogadoresFisico);
        jogoFisico.setTempPartida(tempPartidaFisico);

        System.out.print("Quantidade de partidas: ");
        int qntdPartidas = scanner.nextInt();
        double tempTotalFisico = jogoFisico.calcularTempTotal(qntdPartidas);

        scanner.nextLine(); 
        System.out.println("Entre com as informações do jogo eletrônico:");
        System.out.print("Nome: ");
        String nomeEletronico = scanner.nextLine();
        System.out.print("Preço: ");
        double precoEletronico = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Distribuidora: ");
        String distribuidoraEletronico = scanner.nextLine();
        System.out.print("Plataforma: ");
        String plataformaEletronico = scanner.nextLine();
        System.out.print("Gênero: ");
        String generoEletronico = scanner.nextLine();

        JogoEletronico jogoEletronico = new JogoEletronico(nomeEletronico, precoEletronico, distribuidoraEletronico, plataformaEletronico, generoEletronico);

        System.out.println("\nInformações do Jogo Físico:");
        System.out.println("Nome: " + jogoFisico.getNome());
        System.out.println("Preço: $" + jogoFisico.getPreco());
        System.out.println("Distribuidora: " + jogoFisico.getDistribuidora());
        System.out.println("Número de Jogadores: " + jogoFisico.getQntdJogadores());
        System.out.println("Tempo de Partida: " + jogoFisico.getTempPartida() + " minutos");
        System.out.println("Tempo Total para " + qntdPartidas + " partidas: " + tempTotalFisico + " minutos");

        System.out.println("\nInformações do Jogo Eletrônico:");
        System.out.println("Nome: " + jogoEletronico.getNome());
        System.out.println("Preço: $" + jogoEletronico.getPreco());
        System.out.println("Distribuidora: " + jogoEletronico.getDistribuidora());
        System.out.println("Plataforma: " + jogoEletronico.getPlataforma());
        System.out.println("Gênero: " + jogoEletronico.getGenero());

        scanner.close();
    }
}
