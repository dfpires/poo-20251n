import exe4.Rio;

public class MainRio {
    public static void main(String[] args) {
        // cria objeto - instanciar a classe
        Rio obj1 = new Rio();

        Rio obj2 = new Rio("Amazonas", 0.30f, false);
        System.out.println(obj2.mostra());
        obj2.chover(0.35f);
        obj2.sujar();
        System.out.println(obj2.mostra());

        Rio obj3 = new Rio("Paraná", 0.62f, true);
        System.out.println(obj3.mostra());
        obj3.ensolarar(0.84f);
        obj3.limpar();
        System.out.println(obj3.mostra());
    }

}
