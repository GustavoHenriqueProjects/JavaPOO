package exercicio08_herancasuperclassesubclasses;

// A classe sub Classe Aluno tem as caracteristicas da classe mãe Pessoa
public class Aluno extends Pessoa{
    
    //Atributos 
    private int matricula;
    private String curso;
    
    //Método
    public void cancalarMatricula(){
        System.out.println("Matrícula Cancelada");
    }
    
    //Métodos Especiais
    
    public int getMatricula(){
        return matricula;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    
}
