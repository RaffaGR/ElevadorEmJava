public class Elevador {
    // Atributos encapsulados;
    // Oque o elevador CONTEM - atributos herdaveis para todos tipos
    private String ElevadorEscolhido;
    private int andarAtual;
    private int totalAndares;
    private String[] andaresAtendidos;
    private int capacidadeMaximaPessoas;
    private int capacidadeMaximaPeso;
    private int pessoasPresentes;


    // Quantidade de AÇÕES do elevador - atributos para metodos
    private int sobeAndares;
    private int desceAndares;
    private int entraPessoas = 1;
    private int saiPessoas;


    // Construtor;
    // forma para definir os atributos herdaveis
    public Elevador(String ElevadorEscolhidoProps, int andarAtualProps, int totalAndaresProps, String[] andaresAtendidosProps, int capacidadeMaximaPessoasProps, int capacidadeMaximaPesoProps, int pessoasPresentesProps) {
        this.ElevadorEscolhido = ElevadorEscolhidoProps;
        this.andarAtual = andarAtualProps;
        this.totalAndares = totalAndaresProps;
        this.andaresAtendidos = andaresAtendidosProps;
        this.capacidadeMaximaPessoas = capacidadeMaximaPessoasProps;
        this.capacidadeMaximaPeso = capacidadeMaximaPesoProps;
        this.pessoasPresentes = pessoasPresentesProps;
    }

    // Metodos;
    // tecnica para alterar atributos como se fossem resultado de ações, criando as ações;

    public void Entra_pessoa() {
        //int acrescetadas;
        if (this.pessoasPresentes < this.capacidadeMaximaPessoas) {
            this.pessoasPresentes += this.entraPessoas;
            System.out.println("Alguem entrou no elevador");
            infoPessoas();
            //acrescetadas = 1;
            //this.pessoasPresentes += acrescetadas;
        } else {
            System.out.println("Atingiu a capaciade máxima!");
        }
    }
    public int Sai_pessoa() {
        int reduzidas = -1;
        if (this.pessoasPresentes < this.capacidadeMaximaPessoas) {
            this.pessoasPresentes += reduzidas;
            System.out.println("Alguem saiu no elevador");
            infoPessoas();
        } else {
            System.out.println("Atingiu a capaciade máxima!");
        }
        return this.pessoasPresentes;
    }
    public void Sobe_elevador() {
        /*
        if (this.andarAtual < this.totalAndares) {
            this.andarAtual++;
        } else {
            System.out.println("Este é o ultimo andar");
        }
        */
        if (this.andarAtual < 5) { // não preciso disso, && this.andarAtual <= 5, por que subir não pode passar do 5
            if (this.ElevadorEscolhido == "Átrio" || this.ElevadorEscolhido == "Biblioteca" || this.andarAtual == -1 && this.andarAtual == 0 && this.andarAtual == 4) {
                this.andarAtual++;
                System.out.println("O elevador subiu 1 andar");
                infoElevador();
            } else if (this.ElevadorEscolhido == "Átrio" || this.ElevadorEscolhido == "Biblioteca" || this.andarAtual == 1) {
                this.andarAtual += 3;
                System.out.println("O elevador subiu 3 andares");
                infoElevador();
            } else {
                System.out.println("Existe algum erro");
            }
        } else {
            System.out.println("O elevador não sobe mais do que isso isso");
        }

        // Entrada
        if (this.andarAtual > -1) { // não preciso disso, && this.andarAtual <= 5, por que subir não pode passar do 5
            if (this.ElevadorEscolhido == "Entrada" || this.andarAtual == -1 && this.andarAtual == 2) {
                this.andarAtual++;
                System.out.println("O elevador desceu 1 andar");
                infoElevador();
            } else if (this.ElevadorEscolhido == "Entrada" || this.andarAtual == 0 && this.andarAtual == 3) {
                this.andarAtual += 2;
                System.out.println("O elevador desceu 3 andares");
                infoElevador();
            } else {
                System.out.println("Existe algum erro");
            }
        } else {
            System.out.println("O elevador não desce mais que isso");
        }
    }
    public void Desce_elevador() {
        // Atrio e Biblioteca
        if (this.andarAtual > -1) { // não preciso disso, && this.andarAtual <= 5, por que subir não pode passar do 5
            if (this.ElevadorEscolhido == "Átrio" || this.ElevadorEscolhido == "Biblioteca" || this.andarAtual == 0 && this.andarAtual == 1 && this.andarAtual == 5) {
                this.andarAtual--;
                System.out.println("O elevador desceu 1 andar");
                infoElevador();
            } else if (this.ElevadorEscolhido == "Átrio" || this.ElevadorEscolhido == "Biblioteca" || this.andarAtual == 4) {
                this.andarAtual -= 3;
                System.out.println("O elevador desceu 3 andares");
                infoElevador();
            } else {
                System.out.println("Existe algum erro");
            }
        } else {
            System.out.println("O elevador não desce mais que isso");
        }

        // Entrada
        if (this.andarAtual > -1) { // não preciso disso, && this.andarAtual <= 5, por que subir não pode passar do 5
            if (this.ElevadorEscolhido == "Entrada" || this.andarAtual == 0 && this.andarAtual == 3) {
                this.andarAtual--;
                System.out.println("O elevador desceu 1 andar");
                infoElevador();
            } else if (this.ElevadorEscolhido == "Entrada" || this.andarAtual == 2 && this.andarAtual == 5) {
                this.andarAtual -= 2;
                System.out.println("O elevador desceu 3 andares");
                infoElevador();
            } else {
                System.out.println("Existe algum erro");
            }
        } else {
            System.out.println("O elevador não desce mais que isso");
        }
    }

    public void infoPessoas() {
        switch (this.andarAtual) {
            case -1:
                System.out.printf("O total de pessoas nesse elevador é igual a %d\n", pessoasPresentes);
                break;
            case 0:
                System.out.printf("O total de pessoas nesse elevador é igual a %d\n", pessoasPresentes);
                break;
            case 1:
                System.out.printf("O total de pessoas nesse elevador é igual a %d\n", pessoasPresentes);
                break;
            case 2:
                System.out.printf("O total de pessoas nesse elevador é igual a %d\n", pessoasPresentes);
                break;
            case 3:
                System.out.printf("O total de pessoas nesse elevador é igual a %d\n", pessoasPresentes);
                break;
            case 4:
                System.out.printf("O total de pessoas nesse elevador é igual a %d\n", pessoasPresentes);
                break;
            case 5:
                System.out.printf("O total de pessoas nesse elevador é igual a %d\n", pessoasPresentes);
                break;
            default:
                System.out.println("Algo está incorreto");
                break;
        }
    }

    public void infoElevador() {
        switch (this.andarAtual) {
            case -1:
                System.out.println("Andar atual: " + this.andaresAtendidos[this.andarAtual + 1]);
                break;
            case 0:
                System.out.println("Andar atual: " + this.andaresAtendidos[1]);
                break;
            case 1:
                System.out.println("Andar atual: " + "1º Andar");
                break;
            case 2:
                System.out.println("Andar atual: " + "2º Andar");
                break;
            case 3:
                System.out.println("Andar atual: " + "3º Andar");
                break;
            case 4:
                System.out.println("Andar atual: " + "4º Andar");
                break;
            case 5:
                System.out.println("Andar atual: " + "5º Andar");
                break;
            default:
                System.out.println("Algo está incorreto");
                break;
        }
    }

/*
    public void allInfoExtras() {
        System.out.println(this.sobeAndares);
        System.out.println(this.desceAndares);
        System.out.println(this.saiPessoas);
        System.out.println(this.capacidadeMaximaPeso);
        System.out.println(this.totalAndares);
    }

    private int andarEscolhido;
    public int pessoaEscolheAndar(int andarEscolhido) {
        switch (andarEscolhido) {
            case -1:
                switch (this.andarAtual) {

                }
                // ou
                for (int index = this.andarAtual; index < andarEscolhido; index++) {
                    if (this.andarAtual < this.totalAndares) {
                        this.andarAtual++;
                    } else {
                        System.out.println("Este é o ultimo andar");
                    }
                    if (this.andarAtual < 5) { // não preciso disso, && this.andarAtual <= 5, por que subir não pode passar do 5
                        if (this.ElevadorEscolhido == "Átrio" && this.andarAtual == -1 || this.andarAtual == 0 || this.andarAtual == 4) {
                            this.andarAtual++;
                            System.out.println("O elevador subiu 1 andar");
                            infoElevador();
                        } else if (this.ElevadorEscolhido == "Átrio" && this.andarAtual == 1) {
                            this.andarAtual += 3;
                            System.out.println("O elevador subiu 3 andares");
                            infoElevador();
                        } else {
                            System.out.println("Existe algum erro");
                        }
                    } else {
                        System.out.println("O elevador não sobe mais do que isso isso");
                    }
                System.out.println("Chegamos no andar y");
                break;
        }
        return this.andarEscolhido;
    }
 */



    // podemos adicionar fisica, distancia(m = 6 por andar) e velocidade media(ms x peso = 0.002x1000 = 2ms / d = 3s por andar) velocidade escalavel(0.001 do 1ms no 2ms 0.5 no 3 ativa frenagem(0.006in1ms - 0.5ms = -1ms > 0[da uma catrancada kk)  tornando 0;
}
