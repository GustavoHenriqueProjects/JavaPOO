package exercicio11_polimorfismodesobrecarga;

public class Mamifero extends Animal{
    
    //Atributos
    protected String corPelo;
    
    //Métodos abstratos
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");
    }
    
    
    
}
