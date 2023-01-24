package exercicio07_projetolivro_trabalhandocomclassesencapsulamento;

public interface Publicacao {
    
    //Classe abstract para que os metodos sejam instanciados
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear(int pagina);
    public abstract void avancarPagina();
    public abstract void voltarPagina();
    
}
