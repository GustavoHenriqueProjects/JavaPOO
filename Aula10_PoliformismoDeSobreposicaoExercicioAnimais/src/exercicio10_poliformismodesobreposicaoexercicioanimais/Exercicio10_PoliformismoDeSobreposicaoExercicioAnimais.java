package exercicio10_poliformismodesobreposicaoexercicioanimais;

public class Exercicio10_PoliformismoDeSobreposicaoExercicioAnimais {

    public static void main(String[] args) {
        
        Mamifero mamifero = new Mamifero();
        Reptil reptil = new Reptil();
        Peixe peixe = new Peixe();
        Ave ave = new Ave();
        Canguru canguru = new Canguru();
        
       
        mamifero.setPeso(20);
        mamifero.setIdade(5);
        mamifero.setMembros(4);
        mamifero.setCorPelo("Azul");
        System.out.println("A cor do cabelo é "+mamifero.getCorPelo()+" seu peso é de "+mamifero.getPeso()+" Kg, Possui "+mamifero.getMembros()+" membros e sua idade é de "+mamifero.getIdade()+" anos");
        mamifero.alimentar();
        mamifero.locomover();
        mamifero.emitirSom();
        System.out.println("-------------------------------");
        
        canguru.setPeso(80);
        canguru.setIdade(20);
        canguru.setMembros(4);
        canguru.setCorPelo("Laranja");
        System.out.println("A cor do cabelo é "+canguru.getCorPelo()+" seu peso é de "+canguru.getPeso()+" Kg, Possui "+canguru.getMembros()+" membros e sua idade é de "+canguru.getIdade()+" anos");
        canguru.locomover();
        
        
        
        
    }
    
}
