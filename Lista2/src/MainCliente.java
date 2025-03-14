import exe1.Cliente;

public class MainCliente {
    public static void main(String[] args) {
        Cliente obj1 = new Cliente();
        obj1.setNroConta("123456-7");
        obj1.setNroAgencia("1234-5");
        obj1.setNome("sfdsfsd");
        obj1.setSaldo(0);
        System.out.println("Nro Conta: " + obj1.getNroConta());

        Cliente obj2 = new Cliente("836-x", "1284-2", "Pedro", -300);
    }
}
