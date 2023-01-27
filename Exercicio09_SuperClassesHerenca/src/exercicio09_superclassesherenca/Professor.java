package exercicio09_superclassesherenca;

public class Professor extends Pessoa{
    //Atributos
    private String especialidade;
    private double salario;
    
    //Método
    public void receberAumento(double aumento){
        this.setSalario(this.getSalario()+aumento);
        System.out.println(" Agora senhor(a) "+this.getNome()+" o seu salario é de R$ "+this.getSalario()+" reais");
    }
    
    //Métodos especiais

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
