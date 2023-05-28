public class ElevadorAtrio extends Elevador {

    // Construtor
    public ElevadorAtrio(int andarAtualAtribut, int pessoasPresentesAtribut) {
        // passei para as props estes valores
        super("Átrio", andarAtualAtribut, 5, new String[]{"Ss", "T", "1º Andar", "4º Andar", "5º Andar"}, 15, 1125, pessoasPresentesAtribut);
    }

    public void Desce() {
        super.Desce_elevador();
    }
}
