package exercicio10_poliformismodesobreposicaoexercicioanimais;

//Classe Mamifero extende e sobrescreve os métodos animal
public class Mamifero extends Animal{
    
    //Atributos
    private String corPelo;
    
    //Métodos de sobrepor da classe Animal
    @Override
    public void emitirSom(){
        System.out.println("Som de Mamifero");
    };

    @Override
    public void alimentar(){
        System.out.println("Mamando");
        
    };

    @Override
    public void locomover(){
        System.out.println("Correndo");
    };
    
    //Métodos especiais

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}
