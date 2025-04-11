package rh;

public class Assistente extends Funcionario {
    private float horaExtra;
    public Assistente(){
      super(); // chama o construtor da superclasse
    }
    public Assistente(String nome, String endereco, String cpf, float salario, float horaExtra) {
        super(nome, endereco, cpf, salario);
        this.horaExtra = horaExtra;
    }
    public float getHoraExtra() {
        return horaExtra;
    }
    public void setHoraExtra(float horaExtra) {
        this.horaExtra = horaExtra;
    }

    @Override
    public float calculaSalario(){
        return this.salario + (this.horaExtra * 30);
    }

    @Override // anula um método herdado
    public String toString(){
        return super.toString() +
                "\nHoraExtra: " + horaExtra;
    }
}
