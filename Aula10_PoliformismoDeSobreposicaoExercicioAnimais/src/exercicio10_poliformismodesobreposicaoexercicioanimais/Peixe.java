package exercicio10_poliformismodesobreposicaoexercicioanimais;

public class Peixe extends Animal{
    
    //atributos
    private String corEscama;
    

    //Métodos sobre escritos
    @Override
    public void locomover() {
        System.out.println("Nadando");
                
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo algas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
    
    //Método
    
    public void soltarBolhas(){
        System.out.println("Soltando bolhas");
    }
    
    //Métodos especiais

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
