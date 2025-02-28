import exe1.Aluno;

public class MainAluno {

    public static void main(String[] args) {
        // instanciar uma classe -> objeto
        Aluno obj1 = new Aluno(); // chama construtor
        obj1.dadosAluno();
        System.out.println(obj1.notaFinal());
        Aluno obj2 = new Aluno(123, "Pedro", 19, 7.6f, 8.9f);
        obj2.dadosAluno();
        System.out.println(obj2.notaFinal());
    }
}
