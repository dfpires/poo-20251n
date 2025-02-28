import exe0.Carro;

import javax.swing.*;

public class MainCarro {
    public static void main(String[] args) {
        // criação dos objetos da classe Carro
        // instanciando a classe Carro
        Carro obj1 = new Carro();
        obj1.ano = Integer.parseInt(JOptionPane.showInputDialog("Ano"));;
        obj1.velocidade = Float.parseFloat(JOptionPane.showInputDialog("Velocidade"));;
        obj1.marca = JOptionPane.showInputDialog("Marca");
        obj1.modelo = JOptionPane.showInputDialog("Modelo");
        obj1.exibirDetalhes();
        obj1.acelerar(50);
        obj1.frear(10);
        obj1.exibirDetalhes();

        Carro obj2 = new Carro(2023, 30, "Fiat", "Argo");
        obj2.exibirDetalhes();
        obj2.acelerar(60);
        obj2.frear(100);
        obj2.exibirDetalhes();

        Carro obj3 = new Carro();
        obj3.exibirDetalhes();
    }
}