import exe0.Carro;

public class MainCarro {
    public static void main(String[] args) {
        Carro obj1 = new Carro();
        obj1.setVelocidade(-65);
        System.out.println("Marca: " + obj1.getMarca());
        System.out.println(obj1.exibeDados());
    }
}
