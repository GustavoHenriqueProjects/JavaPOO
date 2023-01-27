package exercicio09_superclassesherenca;

public class Bolsista extends Aluno{
    private double bolsa;
    
    //Método
    public void renovarbolda(){
        System.out.println("Renovando a bolsa do aluno(a) "+this.getNome());
    }
    
    //Método especial

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
    
    
    //Sobrescrevendo uma nova imformação no pagarMensalidade
    @Override
    public void pagarMensalidade(){
        System.out.println("A bolsa do "+this.getNome()+" está sendo paga.");
    }
        
    
}
