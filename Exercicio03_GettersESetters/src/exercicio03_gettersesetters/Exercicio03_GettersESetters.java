package exercicio03_gettersesetters;

public class Exercicio03_GettersESetters {

    public static void main(String[] args) {
        
        /* Construtor simples
        Caneta caneta = new Caneta();
        caneta.modelo = "Bic";
        caneta.setPonta(1.5f);
        caneta.Status();
        */
        
        Caneta caneta = new Caneta(
                "Big", 
                "Vermelho", 
                1.5f, 
                true);
        
        caneta.Status();
        
    }
            
    
}
