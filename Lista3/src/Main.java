import exe0.CarItem;
import exe0.Product;
import exe0.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        // crie 2 produtos
        Product prod1 = new Product(1, "Raquete", 300);
        Product prod2 = new Product(2, "Bolinha", 10);
        // crie 1 item de carrinho para cada produto
      //  CarItem ci1 = new CarItem(11, 5, prod1);
      //  CarItem ci2 = new CarItem(12, 10, prod2);
     //   System.out.println(ci1.exibeCarItem());
      //  System.out.println(ci2.exibeCarItem());

        ShoppingCart sc1 = new ShoppingCart(111, "Franca");
        sc1.addCarItem(11, 5, prod1);
        sc1.addCarItem(12, 10, prod2);

        System.out.println(sc1.toString());
    }
}