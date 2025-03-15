public class Aluno {

    private int nroAluno;
    private String nome;
    private int idade;
    private float p1, p2;

    public Aluno() {
        this.nome = "sem nome";
    }

    public Aluno(int nroAluno, String nome, int idade, float p1,
                 float p2) {
        this.setNroAluno(nroAluno);
        this.setNome(nome);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }

    public void setNroAluno(int nroAluno) {
        // converte int para String
        // quando um método é chamado pela classe,
        // esse método é um método de classe
        String aux = String.valueOf(nroAluno);
        if (aux.length() == 6) {
            this.nroAluno = nroAluno;
        }
       else System.out.println("Nro aluno inválido");
    }
    public void setNome(String nome) {
        if (nome.length() <= 30){
            this.nome = nome;
        }
        else System.out.println("nome inválido");
    }
    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        }
        else System.out.printf("Idade inválida");
    }
    public void setP1(float p1) {
        if (p1 >= 0){
            this.p1 = p1;
        }
        else System.out.println("p1 inválida");
    }
    public void setP2(float p2) {
        if (p2 >= 0){
            this.p2 = p2;
        }
        else System.out.println("p2 inválida");
    }

    public int getNroAluno() {
        return nroAluno;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getP1() {
        return p1;
    }

    public float getP2() {
        return p2;
    }
}
