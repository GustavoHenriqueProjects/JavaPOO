package exercicio10_poliformismodesobreposicaoexercicioanimais;

public class Canguru extends Mamifero {

    @Override
    public void locomover() {
        System.out.println("Pulando");
    };

    //Métodos
    public void usandoBolsa(){
        System.out.println("Filho na Bolsa");
    }
}
