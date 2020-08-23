package Models;

public class Americano extends Pessoa {
    public void Saudacao(){
        System.out.println("Hello!");
    }
    public void Apresentação(){
        System.out.println("My name is "+ getNome());
    }
    public void Sentimento(){
        System.out.println("Right now, I'm feeling "+ getSentimento());
    }
}