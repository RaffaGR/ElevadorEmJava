// import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ElevadorEntrada ElevadorDaEntrada = new ElevadorEntrada(0, 0);
        ElevadorAtrio ElevadorDoAtrio = new ElevadorAtrio(0, 0);
        ElevadorBiblioteca ElevadorDaBiblioteca = new ElevadorBiblioteca(0, 0);

        System.out.printf("\nElevador da Biblioteca\n\n");

        ElevadorDaBiblioteca.Entra_pessoa();
        ElevadorDaBiblioteca.Sobe_elevador();
        ElevadorDaBiblioteca.Sai_pessoa();
        ElevadorDaBiblioteca.Entra_pessoa();
        ElevadorDaBiblioteca.Desce_elevador();
        ElevadorDaBiblioteca.Entra_pessoa();

        System.out.printf("Elevador da Entrada\n\n");

        ElevadorDaEntrada.Entra_pessoa();
        ElevadorDaEntrada.Sobe_elevador();
        ElevadorDaEntrada.Sai_pessoa();
        ElevadorDaEntrada.Entra_pessoa();
        ElevadorDaEntrada.Desce_elevador();
        ElevadorDaEntrada.Entra_pessoa();

        System.out.printf("\nElevador do Átrio\n\n");

        ElevadorDoAtrio.Entra_pessoa();
        ElevadorDoAtrio.Sobe_elevador();
        ElevadorDoAtrio.Sai_pessoa();
        ElevadorDoAtrio.Entra_pessoa();
        ElevadorDoAtrio.Desce();
        ElevadorDoAtrio.Entra_pessoa();


        //ElevadorDaEntrada.infoElevador();
        //Elevador allElevador = new Elevador("Átrio que não é",0, 0, new String[]{"1", "2"}, 1,2,3);
        //allElevador.allInfoExtras();

        /*
        System.out.print("Qual o andar escolhido?(Ss = -1, T = 0, 1º = 1, 4º = 4, 5º = 5) ");
        Scanner entrada = new Scanner(System.in);
        int andar = entrada.nextInt();
        //ElevadorDoAtrio.pessoaEscolheAndar(andar);
        */

        // Criando um elevador, escolhendo e definindo o andar do elevador

        // editando a entrada
        // System.out.print("Qual o escolhido elevador?(Atrio, Biblioteca, Entrada) ");
        // Scanner entrada = new Scanner(System.in);
        // ElevadorEscolhido = entrada.nextLine();
        // this.ElevadorEscolhido = ElevadorEscolhido;

        /*
    // Métodos para Escolher o andar dos elevadores
    public void andaresAtrio() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual o botão do andar foi pressionado?(T, Ss, 1, 4, 5)");
        this.AndarEscolhido = entrada.nextLine();
    }

    public void andaresBiblioteca() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual o botão do andar foi pressionado?(Ss, T, 1, 4, 5)");
        this.AndarEscolhido = entrada.nextLine();
    }

    public void andaresEntrada() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual o botão do andar foi pressionado?(T, Ss, 2, 3, 5)");
        this.AndarEscolhido = entrada.nextLine();
    }
*/

    }
}
