package Models;

public class Pessoa {
    private String nome;
    private String sentimento;

    public String getNome()
  {
     return this.nome;
  }
  public void setNome(String Nome)
  {
     this.nome = Nome;
  }

  public String getSentimento()
  {
     return this.sentimento;
  }
  public Pessoa(){
      
  }
  public Pessoa(String Nome, String Sentimento)
{
  this.nome = Nome;
  this.sentimento = Sentimento;
}
  public void setSentimento(String Sentimento)
  {
     this.sentimento = Sentimento;
  }
    public void Saudacao(){
        System.out.println("Saudação padrão");
    }
    public void Apresentação(){
        System.out.println("Olá, meu nome é: "+ getNome());
    }
    public void Sentimento(){
        System.out.println("No momento, meu sentimento é:"+ getSentimento());
    }
}