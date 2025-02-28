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
}
