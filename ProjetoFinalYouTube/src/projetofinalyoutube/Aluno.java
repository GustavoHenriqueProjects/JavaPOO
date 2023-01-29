package projetofinalyoutube;

public class Aluno extends Pessoa{
    
    //Atributos
    private String login;
    private int totAssistido;

    public Aluno(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    //Super é o toString da classe Pessoa
    @Override
    public String toString() {
        return "Aluno{"+ super.toString() + "\n login = " + login + ", totAssistido = " + totAssistido + '}';
    }
    
    
    
    //Métodos especiais

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    
}
