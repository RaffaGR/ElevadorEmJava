public class Elevador {
    /*
    Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares atendidos,, quais andares é possível atuar, capacidade do elevador e quantas pessoas estão presentes nele. A classe deve também disponibilizar os seguintes métodos:

- Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
- Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
- Sobe: para subir um andar (não deve subir se já estiver no último andar atendido);
- Desce: para descer um andar (não deve descer se já estiver no térreo);

Agora é hora mostrar o funcionamento desse elevador.

Utilizando o Senac Lapa Tito como exemplo, crie três instâncias desse elevador. Eles devem ser nomeados como Elevadores da Entrada, Átrio e Biblioteca e devem atender e deixar de atender os mesmos andares (incluindo o subsolo e o quinto andar) como no mundo "real".
Não esqueça da capacidade máxima de cada elevador.
     */




    // Atributos
    private int velocidadeMax, velocidade, peso, portaAberta, capacidadeMaximaE, andar, sobe, desce, entra, sai, totalAndar, andarInviavel, pessoasElevador;
    protected String porta;

    //public String[][] EntraAndar = { {"Rafael", "Caique", "Luiz", "Gabriel"}, {"-1","4","2","5"} };
   /*
    switch (this.andar) {
        case -1:
            System.out.println("subsolo");
        case 0:
            System.out.println("terrio");
        case 1:
            System.out.println("andar 1");
        case 2:
            System.out.println("andar 2");
        case 3:
            System.out.println("andar 3");
        case 4:
            System.out.println("andar 4");
        case 5:
            System.out.println("andar 5");
        default:
            System.out.println("Algum problema ocorreu");
    }
    */

    // Construtor
    public Elevador() {
        this.totalAndar = 7;
        this.andar = 0;
        this.peso = 450;
        this.velocidadeMax = 10;
        this.portaAberta = 1;
        this.capacidadeMaximaE = 7;
        this.pessoasElevador = 0;
    }
    //public String[] sair = new String[this.capacidadeMaximaE];



    // Métodos

    public void Entra() {
        int acrescetadas;
        if (this.pessoasElevador < capacidadeMaximaE) {
            acrescetadas = 1;
            this.pessoasElevador += acrescetadas;

        } else {
            System.out.println("Atingiu a capaciade máxima!");
        }
    }
    public int Sai() {
        int reduzidas = -1;
        if (this.pessoasElevador < capacidadeMaximaE) {
            this.pessoasElevador -= reduzidas;

        } else {
            System.out.println("Atingiu a capaciade máxima!");
        }
        return this.pessoasElevador;
    }
    public void Sobe() {
        if (this.andar < this.totalAndar) {
            this.andar++;
        } else {
            System.out.println("Este é o ultimo andar");
        }
    }
    public void Desce() {
        if (this.andar > 0) {
            this.andar--;
        } else {
            System.out.println("O elevador não desce mais que isso");
        }
    }

    /*
    public void abrirPorta() {

        if (this.portaAberta == 1) {
            this.porta = "Aberta";
        } else {
            this.porta = "Aberta";
        }
    }

    public void elevadorSubindo(int andar) {
        for (andar = andar; this.andar < andar; this.andar++) {
            System.out.println("Chegamos no andar " + this.andar);
        }
    }

    public void elevadorDescendo(int andar) {
        for (andar = andar; this.andar > andar; this.andar--) {
            System.out.println("Chegamos no andar " + this.andar);
        }
    }

    public int pessoaSaindo(int pessoasSai) {
        this.sai = pessoasSai;
        return this.sai;
    }

    public void pessoaEntrando(int pessoasEntra) {
        this.entra = pessoasEntra;
        System.out.println("Entraram " + this.entra);
    }

    public int andar() {
        return this.andar;
    }
    */
    // https://www.devmedia.com.br/trabalhando-com-arrays-em-java/25530
}
