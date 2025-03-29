package exe2;

import java.time.LocalDate;


public class Reserva {
    private int id;
    private LocalDate data;
    private int validade;
    // associação de agregação
    private Passageiro passageiro;
    private Voo voo;

    public Reserva(){
        this.passageiro = new Passageiro();
        this.voo = new Voo();
    }
    public Reserva(int id, int validade, Passageiro passageiro,
                   Voo voo) {
        this.id = id;
        this.validade = validade;
        this.passageiro = passageiro;
        this.voo = voo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getValidade() {
        return validade;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", data=" + data +
                ", validade=" + validade +
                ", passageiro=" + passageiro +
                ", voo=" + voo +
                '}';
    }

}
