
package aula05.aula05;


public class ContaBanco {
    //Atributos
    public int NumeroConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    //Métodos personalizados 
    public void estadoAtual(){
        System.out.println("-----------------------------");
        System.out.println("Conta: "+this.getNumeroConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
       
    }
    //Métodos 
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if( "ContaCorrente".equals(t)){
            this.setSaldo(50);
        }else if("ContaPoupança".equals(t)){
            this.setSaldo(150);
        }
        System.out.println("A sua conta foi aberta com sucesso !");
    }
    public void fecharConta(){
        if (this.getSaldo()>0){
            System.out.println("Conta não pode ser fechada porque ainda tem saldo em conta");
        }else if (this.getSaldo()<0){
            System.out.println("Conta não pode ser fechada pois tem débito em conta");
        }else{
            this.setStatus(false);
            System.out.println("Sua conta foi fechada com sucesso!");
        }
    }
    public void depositar(float valor){
        if (this.getStatus()){
            //this.saldo = this.saldo + valor;
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
        }else{
            System.out.println("Não foi possivel depositar em uma conta que esta fechada ! Abra uma conta ");
        }
        
    }
    public void sacar(float valor){
        if (this.getStatus()){
            if (this.getSaldo()>= valor){
                this.setSaldo(this.getSaldo()-valor);
                System.out.println("Saque foi realizado na conta de " +this.getDono());
            }else{
                 System.out.println("Saldo insuficiente para saque");
            }
        }else{
            System.out.println("Impossível sacar de uma conta fechada ! Abra uma conta");
        }
    }
    public void pagarMensalidade(){
        int valor = 0;
        if("ContaCorrente".equals(this.getTipo())){
            valor=12;
        }else if("ContaPoupanca".equals(this.getTipo())){
            valor = 20;
        }
        if(this.getStatus()){
            this.setSaldo(this.getSaldo()-valor);
            System.out.println("Mensalidade paga por " +this.getDono());
        }else{
            System.out.println("Impossível pagar uma conta fechada!");
        }
    }
    //metodos especiais
    public ContaBanco() {
        this.saldo = 0; 
        this.status = false;
    }

    public int getNumeroConta() {
        return NumeroConta;
    }

    public void setNumeroConta(int nmumeroConta) {
        this.NumeroConta = NumeroConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
