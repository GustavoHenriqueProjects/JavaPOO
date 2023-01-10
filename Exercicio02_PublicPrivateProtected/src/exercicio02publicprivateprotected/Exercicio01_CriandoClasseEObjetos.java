package exercicio02publicprivateprotected;

public class Exercicio01_CriandoClasseEObjetos {

    public static void main(String[] args) {
       
         //Instanciando um objeto da classe caneta
        Caneta caneta1 = new Caneta();
        
        //public
        caneta1.modelo = "Big";
        caneta1.cor = "Azul";
        
        //private somente a propria classe pode mecher
        caneta1.setPonta(20f);
        caneta1.canetaTampada();
        
        //protected funciona normalmente já que o objeto Caneta pertence a classe Caneta 
        caneta1.carga = 50;
        caneta1.tampada = true;
        
        caneta1.status();
        System.out.println(caneta1.getPonta());
       
    }
    
}
