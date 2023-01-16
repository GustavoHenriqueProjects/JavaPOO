package exercicio04_contabancaria;

public class ClasseContaBanco {

//Atributos
    public int numeroConta;
    protected String tipoDeConta;
    private String cliente;
    private double saldo;
    private boolean status;

    //Métodos especiais
    public ClasseContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);

    }

    //Métodos personalizados (void)
    public void estadoAtual(){
        System.out.println("Conta: "+this.getNumeroConta());
        System.out.println("Tipo: "+this.getTipoDeConta()); 
        System.out.println("");
        System.out.println("Dono: "+this.getCliente());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
        System.out.println("-----------------------------");
    }
    
    public void abriConta(String tipo) {
        this.setTipoDeConta(tipo);
        this.setStatus(true);

        if (tipo.equals("Conta Corrente")) {
            this.setSaldo(50);
        } else if (tipo.equals("Conta Poupança")) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro e não pode ser fechada");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void deposita(float valor) {
        if (this.getStatus() == true) {
            this.saldo = this.saldo + valor;
            System.out.println("Depósito realizado com sucesso na conta de " + getCliente());

        } else {
            System.out.println("Não foi possivel realizar o depósito");
        }

    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + getCliente());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel sacar de uma conta fechada ");
        }
    }

    public void pagarMensalidade() {
        int v = 0;
        if(this.getTipoDeConta() == "Conta Corrente"){
            v = 12;
        }else if(this.getTipoDeConta() == "Conta Poupança"){
            v = 20;
            
        }if(this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso pelo "+this.getCliente());
        }else{
            System.out.println("Conta fechada");
        }

    }

    // Getters ans Setters
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
