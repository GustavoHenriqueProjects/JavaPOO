package exercicio05_encapsulamento;

//public class ControleRemoto 
public class ControleRemoto implements Controlador {

    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //Métodos especiais
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //Métodos abstratos
    // @Override significa sobreescrever ja que os metodos foram criados
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void deslidar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(this.getLigado()){
        System.out.println("Está ligado: "+this.getLigado());
        System.out.println("Está tocando: "+this.getTocando());
        System.out.print("Está com som: "+this.getVolume());
        
        for( int i = 0; i<= this.getVolume(); i+=10){
            System.out.print("|");
            
        }
        }else{
            System.out.println("Impossivel abrir menu com a TV desligada");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");

    }

    @Override
    public void maisVolume() {
       if(this.getLigado() == true){
           this.setVolume(this.getVolume()+5);
       }else{
           System.out.println("Impossivel aumentar a TV");
       }

    }

    @Override
    public void menosVolume() {
        /* OU
         *   
         *  if(this.getLigado){
         *  this.setVolume(this.getVolume()+1)
         *
         * 
        */
        if(this.getLigado()==true){
            this.setVolume(this.getVolume()+5);
        }else{
            System.out.println("Impossivel diminuir a TV");
        }
    }

    @Override
    public void ligarMudo() {
        if((this.getLigado()== true) && (this.getVolume()<0)){
            this.setVolume(0);
        }

    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume()==0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        // se o getLigado for verdadeiro e não estiver tocando setTocando
        if(this.getLigado()&& !(this.getTocando())){
            this.setTocando(true);
        }else{
            System.out.println("Impossivel dar play");
        }

    }

    @Override
    public void pause() {
         if(this.getLigado()&&this.getTocando()){
             this.setTocando(false);
         }else{
             System.out.println("Impossivel pausa");
         }
    }

}
