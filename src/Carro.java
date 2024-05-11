// Crie uma classe Carro com atributos modelo, ano, cor
// e métodos para exibir a ficha técnica e calcular a idade do carro.

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibirFichaTecnica(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    String calcularIdade(int anoAtual){
        int idade = anoAtual - ano;
        return "O carro " + modelo + " tem " + idade + " anos.";
    }
}
