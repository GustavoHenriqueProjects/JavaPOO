package projetofinalyoutube;

public class Visualizacao {
    
    //Atributos com agregação
    private Aluno espectador;
    private Video filme;
    
    //Método construtor
    public Visualizacao(Aluno espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }
    
    //Metodos de sobrecarga
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(double porcento){
        int total = 0;
        if(porcento<=20){
            total = 3;
        }else if(porcento <= 50){
            total = 5;
        }else if(porcento <= 90){
            total = 8;
        }else{
            total = 10;
        }
        this.filme.setAvaliacao(total);
    }
            

    public Aluno getEspectador() {
        return espectador;
    }

    public void setEspectador(Aluno espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + " espectador = " + espectador + ", filme = " + filme + '}';
    }
    
    
    
    
}
