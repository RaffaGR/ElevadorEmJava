public class ElevadorBiblioteca extends Elevador {

    // Construtor
    public ElevadorBiblioteca(int andarAtualAtribut, int pessoasPresentesAtribut) {
        super("Biblioteca", andarAtualAtribut, 5, new String[]{"Ss", "T", "1º Andar", "4º Andar", "5º Andar"}, 15, 1125, pessoasPresentesAtribut);
    }
}
