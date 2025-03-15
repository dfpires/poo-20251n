package exe1;
public class Cliente {
    private String nroAgencia, nroConta, nome;
    private float saldo;
    public Cliente(){
        this.nroConta = "111111-1";
        this.nroAgencia = "1111-1";
        this.nome = "sem nome";
    }
    public Cliente(String nroConta, String nroAgencia, String nome, float saldo){
        this.setNroConta(nroConta);
        this.setNroAgencia(nroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }
    public void setNroConta(String nroConta){
        if (nroConta.length() == 8){
            if (nroConta.charAt(6) == '-'){
                this.nroConta = nroConta;
            }
            else System.out.println("problema no DV");
        }
        else System.out.println("problema no tamanho");
    }
    public void setNroAgencia(String nroAgencia) {
        // quando um método é chamado por um objeto
        // esse método é chamado de método de instância
        if (nroAgencia.length() == 6){
            if (nroAgencia.charAt(4) == '-'){
                this.nroAgencia = nroAgencia;
            }
            else System.out.println("problema no DV");
        }
        else System.out.println("problema no tamanho");
    }
    public void setNome(String nome) {
        if (nome.length() <= 30){
            this.nome = nome;
        }
        else System.out.println("nome inválido");
    }
    public void setSaldo(float saldo){
        if (saldo >= 0){
            this.saldo = saldo;
        }
        else {
            System.out.println("Saldo negativo não pode");
        }
    }
    public String getNroConta() {
        return this.nroConta;
    }
    public String getNroAgencia() {
        return this.nroAgencia;
    }
    public String getNome() {
        return this.nome;
    }
    public float getSaldo() {
        return this.saldo;
    }
    public void depositar(float x){
        this.setSaldo(this.getSaldo() + x);
    }
    public void sacar(float x){
        this.setSaldo(this.getSaldo() - x);
    }

    public String exibeDetalhes() {
        return "Cliente{" +
                "nroAgencia='" + nroAgencia + '\'' +
                ", nroConta='" + nroConta + '\'' +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
