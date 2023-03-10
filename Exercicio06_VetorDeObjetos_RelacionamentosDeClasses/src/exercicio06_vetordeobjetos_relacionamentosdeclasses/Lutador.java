package exercicio06_vetordeobjetos_relacionamentosdeclasses;

public class Lutador {

    //Atributos
    private String nome;
    private String nacionalidade;
    private String categoria;
    private int idade;
    private float altura;
    private float peso;
    private int vitorias;
    private int derrotas;
    private int empates;
            

    //Metodos publicos
    public void apresentar() {
        System.out.println("----------------------------------");
        System.out.println("Lutador " + this.getNome());
        System.out.println("Origem " + this.getNacionalidade());
        System.out.println(this.getIdade() + " anos de idade");
        System.out.println(this.getAltura() + "m de altura");
        System.out.println("Pesando " + this.getPeso() + " Kg");
        System.out.println("Ganhou " + this.getVitorias());
        System.out.println("Perdeu " + this.getDerrotas());
        System.out.println("Empates " + this.getEmpates());

    }

    public void status() {
        System.out.println(this.getNome() + " na categoria: " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");
        System.out.println("--------------------------------------");
    }

    //Metodo Especial construtor
    public Lutador(
            String nome,
            String nacionalide,
            int idade,
            float altura,
            int peso,
            int derrotas,
            int empates) {

        this.nome = nome;
        this.nacionalidade = nacionalide;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.derrotas = derrotas;
        this.empates = empates;

    }
    
    public Lutador(){
        
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);

    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);

    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    //metodos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    //M??todo interno, a cagoria muda automaticamente deacordo com o peso
    // Esse m??todo n??o recebe par??metro
    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inv??lido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "M??dio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inv??lido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

}
