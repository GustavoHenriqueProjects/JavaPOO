package exercicio05_encapsulamento;

public interface Controlador {
    
    // Se utiliza a classe abstract para impedir que ela seja instanciada//
    
    //lista de métodos
    public abstract void ligar();
    public abstract void deslidar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
    
}
