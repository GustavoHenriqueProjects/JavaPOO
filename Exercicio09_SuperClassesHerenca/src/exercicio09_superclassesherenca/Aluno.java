package exercicio09_superclassesherenca;

//A classe aluno Herda da Classe Pessoa
public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    
    //Método
    // Se colocar o public final void pagarMensalidade o método pagarMensalidade não poderá ser subscrito
    public void pagarMensalidade(){
        System.out.println("Realizando o pagamento da Mensalidade do aluno " +this.getNome());
    }
    
    //Métodos especiais

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
