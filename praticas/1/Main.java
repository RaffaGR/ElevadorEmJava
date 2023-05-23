public class Main {
    public static void main(String[] args) {

            // Criando um carro
            Veiculo carro = new Veiculo("Fusca", "Azul", 1970);
            carro.acelerar(50);
            carro.imprimirDados();

            // Criando uma lancha
            Veiculo lancha = new Veiculo("Lancha X", "Branca", 2021);
            lancha.acelerar(80);
            lancha.imprimirDados();

    }
}