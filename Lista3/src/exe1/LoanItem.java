package exe1;

public class LoanItem {
    private int id;
    private int daysLoaned;
    // associação - agregação
    private Book book;

    public LoanItem() {
    }
    public LoanItem(int id, int daysLoaned, Book book) {
        this.id = id;
        this.daysLoaned = daysLoaned;
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDaysLoaned() {
        return daysLoaned;
    }

    public void setDaysLoaned(int daysLoaned) {
        this.daysLoaned = daysLoaned;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "\n LoanItem{" +
                "id=" + id +
                ", daysLoaned=" + daysLoaned +
                ", book=" + book + // chama toString() do Book
                '}';
    }
}
