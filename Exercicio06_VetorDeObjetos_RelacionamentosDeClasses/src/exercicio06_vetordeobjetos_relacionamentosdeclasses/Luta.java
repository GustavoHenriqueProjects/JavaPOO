package exercicio06_vetordeobjetos_relacionamentosdeclasses;

import java.util.Random;

public class Luta {

    //Atributos
    // desafiado é do tipo classe Lutador
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    private int vencedor;

    //Métodos
    public void marcarLuta(Lutador l1, Lutador l2) {

        if ((l1.getCategoria().equals(l2.getCategoria())) && (l1 != l2)) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;

        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }

    }

    public void lutar() {
        
        //se aprovada for verdadeiro então ...
        if(aprovada){
            
            desafiado.apresentar();
            desafiante.apresentar();
            
            System.out.println("---RESULTADo---");
            
            Random aleatorio = new Random();
            //Ele vai gerar 3 resultados: 0, 1 ou 2
            vencedor = aleatorio.nextInt(3);
            
            switch(vencedor){
                
                case 0 -> { 
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                }
                    
                case 1 -> {
                    System.out.println("Ganhou o desafiado "+this.getDesafiado().getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                }
                    
                case 2 -> {
                    System.out.println("Ganhou o desafiante "+this.getDesafiante().getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                }
                    
            }
                
            
        }else{
            System.out.println("A luta não ira acontecer");
        }

    }

    //Métodos especiais Geters e Setters que retornam um tipo abstrato de dados
    //Já que utilizam a classe Lutador
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
