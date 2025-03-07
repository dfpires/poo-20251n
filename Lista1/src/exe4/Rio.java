package exe4;
public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;

    // construtor sem parâmetro
    public Rio(){
        this.nome = "sem nome";
    }
    // construtor com parâmetro
    public Rio(String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    public void chover(float x){
        this.nivel += x;
    }
    public void ensolarar(float x){
        if (this.nivel >= x) {
            this.nivel -= x;
        }
        else {
            System.out.println("Nível do rio continua inalterado");
        }
    }
    public void limpar(){
        this.poluido = false;
    }
    public void sujar(){
        this.poluido = true;
    }
    public String mostra(){
        return "Nome: " + this.nome + " Nível: " + this.nivel +
                " Poluido: " + (this.poluido ? "Sim": "Não");

    }
}
