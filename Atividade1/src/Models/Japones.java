package Models;

public class Japones extends Pessoa {
    
    public void Saudacao(){
        System.out.println("Kon'nichiwa!");
    }
    public void Apresentação(){
        System.out.println("Watashinonamaeha "+ getNome());
    }
    public void Sentimento(){
        System.out.println("Watashi wa kanjite imasu "+ getSentimento());
    }
}