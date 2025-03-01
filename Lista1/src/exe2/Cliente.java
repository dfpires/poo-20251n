package exe2;
public class Cliente {
    public int nroAgencia, nroConta;
    public String nome;
    public float saldo;

    // método construtor sem parâmetro
    public Cliente(){
        this.nome = "sem nome";
    }
    public Cliente(int nroAgencia, int nroConta, String nome, float saldo) {
        this.nroAgencia = nroAgencia;
        this.nroConta = nroConta;
        this.nome = nome;
        this.saldo = saldo;
    }
    // fazer depósito
    public void depositar(float valor){
        this.saldo += valor;
        System.out.println(" Depósito de " + valor + " realizado com sucesso");
    }
    // fazer saque
    public void sacar(float valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso");
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }
    public void exibirDetalhes(){
        System.out.println("Nro Agencia: " + this.nroAgencia + " Nro da conta " + this.nroConta +
                " Nome: " + this.nome + " Saldo " + this.saldo);
    }
}
