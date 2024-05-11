import java.text.DecimalFormat;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n========================================");
        System.out.println("RESOLUÇÃO DOS DESAFIOS DE JAVA: POO # 01\n(ﾉ◕ヮ◕)ﾉ*:･ﾟ✧");
        System.out.println("========================================\n");

        System.out.println();

        Pessoa pessoa = new Pessoa();
        pessoa.saudacao();

        System.out.println("\n========================================\n");

        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dobrarNumero(42);
        System.out.println("O dobro de 42 é " + resultado + ".");

        System.out.println("\n========================================\n");

        Musica musica = new Musica();
        musica.titulo = "Do Me A Favour";
        musica.artista = "Arctic Monkeys";
        musica.anoLancamento = 2007;

        musica.exibirFichaTecnica();

        musica.avaliar(8.2);
        musica.avaliar(10);
        musica.avaliar(5.5);

        DecimalFormat df = new DecimalFormat("#.##");
        double mediaAvaliacoes = musica.calcularMedia();
        System.out.println("Média das avaliações: " + df.format(mediaAvaliacoes));

        System.out.println("\n========================================\n");

        Carro carro = new Carro();
        carro.modelo = "Fiat Mobi";
        carro.ano = 2018;
        carro.cor = "Branco";

        carro.exibirFichaTecnica();

        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        String idadeDoCarro = carro.calcularIdade(anoAtual);
        System.out.println(idadeDoCarro);

        System.out.println("\n========================================\n");

        Aluno aluno = new Aluno();
        aluno.nome = "Rodion Românovitch Raskólnikov";
        aluno.idade = 23;

        aluno.exibirInformacoes();

        System.out.println("\n========================================\n");
    }
}
