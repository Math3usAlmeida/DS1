package games;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com as informa��es do jogo f�sico:");
        System.out.print("Nome: ");
        String nomeFisico = scanner.nextLine();
        System.out.print("Pre�o: ");
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
        System.out.println("Entre com as informa��es do jogo eletr�nico:");
        System.out.print("Nome: ");
        String nomeEletronico = scanner.nextLine();
        System.out.print("Pre�o: ");
        double precoEletronico = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Distribuidora: ");
        String distribuidoraEletronico = scanner.nextLine();
        System.out.print("Plataforma: ");
        String plataformaEletronico = scanner.nextLine();
        System.out.print("G�nero: ");
        String generoEletronico = scanner.nextLine();

        JogoEletronico jogoEletronico = new JogoEletronico(nomeEletronico, precoEletronico, distribuidoraEletronico, plataformaEletronico, generoEletronico);

        System.out.println("\nInforma��es do Jogo F�sico:");
        System.out.println("Nome: " + jogoFisico.getNome());
        System.out.println("Pre�o: $" + jogoFisico.getPreco());
        System.out.println("Distribuidora: " + jogoFisico.getDistribuidora());
        System.out.println("N�mero de Jogadores: " + jogoFisico.getQntdJogadores());
        System.out.println("Tempo de Partida: " + jogoFisico.getTempPartida() + " minutos");
        System.out.println("Tempo Total para " + qntdPartidas + " partidas: " + tempTotalFisico + " minutos");

        System.out.println("\nInforma��es do Jogo Eletr�nico:");
        System.out.println("Nome: " + jogoEletronico.getNome());
        System.out.println("Pre�o: $" + jogoEletronico.getPreco());
        System.out.println("Distribuidora: " + jogoEletronico.getDistribuidora());
        System.out.println("Plataforma: " + jogoEletronico.getPlataforma());
        System.out.println("G�nero: " + jogoEletronico.getGenero());

        scanner.close();
    }
}
