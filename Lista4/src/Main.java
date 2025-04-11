import rh.Assistente;
import rh.Diretor;
import rh.Funcionario;
import rh.Gerente;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void mostraDadosDetalhados(Funcionario obj){
        System.out.println(obj.toString() + " salário final " + obj.calculaSalario());
    }
    public static void main(String[] args) {

        Assistente as1 =
new Assistente("João", "Franca", "123", 3000, 10);
        mostraDadosDetalhados(as1);
       Gerente ge1 =
new Gerente("Pedro", "SJB", "456", 5000, 2000);
        mostraDadosDetalhados(ge1);
       Diretor di1 =
new Diretor("Vitor", "Claraval", "789", 7000, 1000);
        mostraDadosDetalhados(di1);

        // vetor de funcionários
        List<Funcionario> vetor = new ArrayList<Funcionario>();
        // adiciona no vetor
        vetor.add(as1);
        vetor.add(ge1);
        vetor.add(di1);

        // calcula folha de pagto
        float folha = 0;
        for (Funcionario f : vetor){
            folha += f.calculaSalario();
        }
        System.out.println(folha);
    }

}