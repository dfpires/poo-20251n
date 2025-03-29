package exe1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Marcos");
        Book b1 = new Book(11, "Deitel", "Java");
        Book b2 = new Book(12, "Oracle", "JDK");

        Loan lo1 = new Loan(100, new Date(), s1);
        lo1.addLoanItem(1001, 15, b1);
        lo1.addLoanItem(1002, 15, b2);

        System.out.println(lo1);
    }
}
