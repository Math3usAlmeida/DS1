package polimorfismo;

public class Ain {
    public static void main(String[] args) {
        // Criação e configuração de um Funcionário
        Funcionario f1 = new Funcionario();
        f1.setNome("Domi");
        f1.setCpf("444444.3333.4");
        f1.setSalario(2500);

        // Impressão dos dados do Funcionário
        System.out.println(f1.getNome());
        System.out.println(f1.getCpf());
        System.out.println(f1.getSalario());

        // Criação e configuração de um Gerente
        Gerente g1 = new Gerente();
        g1.setNome("PEDRO");
        g1.setCpf("32323322");
        g1.setSalario(2500);
        g1.setSenha(2222);

        // Impressão dos dados do Gerente e verificação da autenticação
        System.out.println("------------------------------");
        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());
        System.out.println(g1.autentica(2222));

        // Criação e configuração de um Coordenador
        Coordenador c1 = new Coordenador();
        c1.setNome("Coord");
        c1.setCpf("32323322");
        c1.setSalario(3600);

        // Impressão dos dados do Coordenador
        System.out.println("------------------------------");
        System.out.println(c1.getNome());
        System.out.println(c1.getCpf());
        System.out.println(c1.getSalario());

        // Controle de bonificação
        System.out.println("------------------------------");
        ControleBonificacao control = new ControleBonificacao();
        control.registra(f1);
        control.registra(g1);
        control.registra(c1);

        // Impressão dos gastos com bonificação
        System.out.println("Gastos com bonificação " + control.getSoma());
    }
}

