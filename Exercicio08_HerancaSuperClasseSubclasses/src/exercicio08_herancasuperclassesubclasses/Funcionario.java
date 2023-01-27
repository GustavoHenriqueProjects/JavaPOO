package exercicio08_herancasuperclassesubclasses;

public class Funcionario extends Pessoa{
    
    //Atributos
    private String setor;
    private boolean trabalhando;
    
    //Métodos
    public void mudarTrabalho(){
        //Chamar o metodo mudarTrabalho() ele recebe o inverso do valor
        this.trabalhando = ! this.trabalhando;
        
    }
    
    //Métodos especiais

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
}
