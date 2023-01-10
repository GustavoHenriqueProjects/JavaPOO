package exercicio01_criandoclasseeobjetos;

public class Exercicio01_CriandoClasseEObjetos {

    public static void main(String[] args) {
       
         //Instanciando um objeto da classe caneta
        Caneta caneta1 = new Caneta();
        caneta1.modelo = "Big";
        caneta1.cor = "Azul";
        caneta1.ponta = (float) 0.5; //Convertendo double para float
        
        Caneta caneta2 = new Caneta();
        caneta2.modelo = "Fabcastelo";
        caneta2.cor = "Vermelho";
        caneta2.ponta = (float) 1.5;

        //Chamando
        caneta1.canetaDestampada();
        caneta1.rapiscar();
        caneta1.status();
        
        caneta2.canetaTampada();
        caneta2.rapiscar();
        caneta2.status();
    }
    
}
