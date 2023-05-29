public class ElevadorEntrada extends Elevador {

    // Construtor
    public ElevadorEntrada(int andarAtualAtribut, int pessoasPresentesAtribut) {
        super("Entrada", andarAtualAtribut, 7-2, new String[]{"Ss", "T", "2º Andar", "3º Andar", "5º Andar"}, 24, 1800, pessoasPresentesAtribut);
    }
}
