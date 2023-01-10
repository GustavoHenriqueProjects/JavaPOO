package exercicio03_gettersesetters;

public class Caneta {

    //Atributos
    public String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;
    

    //Métodos contrutores
    public Caneta() {
        this.tampada();
        this.cor = "Azul";

    }

    public Caneta(
            String m,
            String c,
            float p,
            boolean t) {
        
        this.setModelo(m);//setModelo colocar o que esta na variavel m
        this.setCor(c);
        
        this.ponta = p; // ponta recebe o que está na variavel 
        this.tampada = t;

    }

    //Métodos
    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;

    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;

    }

    public void tampada() {
        this.tampada = true;
    }

    public void destampada() {
        this.tampada = false;
    }

    public boolean getCanetaTampadaDestampada() {
        return this.tampada;

    }

    public void setCor(String c) {
        this.cor = c;
    }

    public String getCor() {
        return cor;
    }

    public void Status() {
        System.out.println("O modelo da sua caneta é " + this.getModelo());
        System.out.println("A ponta da sua caneta é de: " + this.getPonta());
        System.out.println("A cor da caneta é: " + this.getCor());
        System.out.println("A caneta está tampada? " + getCanetaTampadaDestampada());
    }

}
