package exe1;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Loan {
    private int id;
    private Date date;
    // associação de agregação
    private Student student;
    // associação de composição
    private List<LoanItem> loanItens;
    // construtor
    public Loan() {
        this.loanItens = new ArrayList<LoanItem>();
        this.student = new Student();
    }
    public Loan(int id, Date date, Student student) {
        this.id = id;
        this.date = date;
        this.student = student;
        this.loanItens = new ArrayList<LoanItem>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    public void addLoanItem(int id, int daysLoaned, Book book) {
        this.loanItens.add(new LoanItem(id, daysLoaned, book));
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", date=" + date +
                ", student=" + student +
                ", loanItens=" + loanItens +
                '}';
    }
}
