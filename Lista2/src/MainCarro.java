import exe0.Carro;

public class MainCarro {
    public static void main(String[] args) {
        Carro obj1 = new Carro();
        obj1.setVelocidade(-65);
        obj1.setMarca("Fiat");
        obj1.setModelo("FastBack");
        obj1.setAno(2023);
        System.out.println("Marca: " + obj1.getMarca());
        System.out.println(obj1.exibeDados());

        Carro obj2 = new Carro("Volks", "Gol", 2023, 0.0f);
        System.out.println(obj2.exibeDados());
        obj2.acelerar(60);
        System.out.println(obj2.exibeDados());
        obj2.acelerar(60);
        System.out.println(obj2.exibeDados());
        obj2.acelerar(90);
        System.out.println(obj2.exibeDados());
    }
}
