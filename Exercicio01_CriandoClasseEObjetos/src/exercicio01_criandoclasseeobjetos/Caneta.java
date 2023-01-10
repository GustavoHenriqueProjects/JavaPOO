package exercicio01_criandoclasseeobjetos;

public class Caneta {
    
    //Atributos
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    //Metodos
    void rapiscar() {
        if (this.tampada == true) {
            System.out.println("Não pode rabiscar, a caneta está tampada");
        } else {
            System.out.println("Pode rabiscar");
        }
    }

    void canetaTampada() {
        this.tampada = true;

    }

    void canetaDestampada() {
        this.tampada = false;
    }

    void status() {
        //this. é para dizer que o objeto caneta01 esta chamando determinado atributo
        System.out.println("Caneta da categoria: " + this.modelo);
        System.out.println("Possui a cor :  " + this.cor);
        System.out.println("Com uma ponta de " + this.ponta);
        System.out.println("A caneta da cagoria " + this.modelo + " está tampada ? " + tampada);
        System.out.println("-----------------------------------------");
    }
}
