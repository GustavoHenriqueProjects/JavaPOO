package exercicio04_contabancaria;

public class Exercicio04_ContaBancaria {

    public static void main(String[] args) {
     
        ClasseContaBanco cliente = new ClasseContaBanco();
        
        cliente.setNumeroConta(123);
        cliente.setCliente("Arnaldo");
        
        
        cliente.abriConta("Conta Corrente");
        cliente.deposita(100);
        cliente.estadoAtual();
        
        
        ClasseContaBanco cliente2 = new ClasseContaBanco();
        cliente2.setNumeroConta(231);
        cliente2.setCliente("Amanda");
        cliente2.abriConta("Conta Poupança");
        cliente2.deposita(500);
        
        
        cliente2.sacar(100);
        cliente2.estadoAtual();
       
        
        
        
    }
    
}
