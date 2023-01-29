package exercicio11_polimorfismodesobrecarga;

public class Exercicio11_PolimorfismoDeSobreCarga {

    public static void main(String[] args) {
        
     Mamifero mamifero = new Mamifero();
     Lobo lobo = new Lobo();
     Cachorro cachorro = new Cachorro();
     
     mamifero.emitirSom();
     lobo.emitirSom();
     cachorro.emitirSom();
     cachorro.reagir("Olá");
        
    }
    
}
