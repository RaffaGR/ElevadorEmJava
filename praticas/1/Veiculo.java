public class Veiculo {

        // Atributos
        private String modelo;
        private String cor;
        private int ano;
        private int velocidade;

        // Construtor
        public Veiculo(String modelo, String cor, int ano) {
            this.modelo = modelo;
            this.cor = cor;
            this.ano = ano;
            this.velocidade = 0;
            System.out.print("Esse modelo foi criado!");
        }

        // Métodos
        public void acelerar(int incremento) {
            this.velocidade += incremento;
        }

        public void frear(int decremento) {
            if (this.velocidade != 0) {
                this.velocidade -= decremento;
            } else if (this.velocidade < 0) {
                this.velocidade += 1;
            }
        }

        public void imprimirDados() {
            System.out.println("Modelo: " + this.modelo);
            System.out.println("Cor: " + this.cor);
            System.out.println("Ano: " + this.ano);
            System.out.println("Velocidade: " + this.velocidade + " km/h");
        }
    }