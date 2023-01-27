package exercicio09_superclassesherenca;

/*Classe abstrada porque não será instánciada apenas compartilhara a sua herança
  com as sub-classes
*/
public abstract class Pessoa {
    //Atributos
    private String nome, sexo;
    private int idade;
    
    //Método
    public void fazerAniversario(){
        this.idade++;
    }
    
    //Métodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Dados pessoais : \n" 
                + "\n Nome " + nome 
                + ",\n Sexo " + sexo 
                + ",\n Idade " + idade + ' ';
    }
    
    
}
