package exercicio02publicprivateprotected;

public class Caneta {
    
    //Atributos
   public String modelo;
   public String cor;
   private float ponta;
   protected int carga;
   protected boolean tampada;

    //Metodos
    private void rapiscar() {
        if (this.tampada == true) {
            System.out.println("Não pode rabiscar, a caneta está tampada");
        } else {
            System.out.println("Pode rabiscar");
        }
    }

    public void canetaTampada() {
        this.tampada = true;

    }

    public void canetaDestampada() {
        this.tampada = false;
    }
    
    //metodo get para pegar o valor da variavel privada ponta
    public float getPonta(){
        return ponta;
    }
    
    //metodo set pata colocar valor na variavel ponta
    public void setPonta(float ponta){
        this.ponta = ponta;
    }

    public void status() {
        //this. é para dizer que o objeto caneta01 esta chamando determinado atributo
        System.out.println("Caneta da categoria: " + this.modelo);
        System.out.println("Possui a cor :  " + this.cor);
        System.out.println("Com uma ponta de " + this.ponta);
        System.out.println("Tem uma carga de "+carga+"%");
        System.out.println("A caneta da cagoria " + this.modelo + " está tampada ? " + tampada);
        System.out.println("-----------------------------------------");
    }
}
