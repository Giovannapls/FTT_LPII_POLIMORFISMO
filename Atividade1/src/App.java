import Models.Americano;
import Models.Japones;
import Models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("----------------");
        Pessoa japones = new Japones();
        japones.setNome("Kyo");
        japones.setSentimento("Kanashi");
        Pessoa americano = new Americano();
        americano.setNome("Richard");
        americano.setSentimento("Confused");

        japones.Saudacao();
        americano.Saudacao();

        japones.Apresentação();
        americano.Apresentação();

        japones.Sentimento();
        americano.Sentimento();
        System.out.println("----------------");
    }
}
