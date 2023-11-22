import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "borrowers")
public class BookBorrowing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "borrowers_id", columnDefinition = "serial")
    private long id;
    @Column(name = "borrower_name", nullable = false)
    private String borrower_name;
    @Temporal(TemporalType.DATE)
    @Column(name = "borroing_date", nullable = false)
    private LocalDate borrowing_date;

    @Temporal(TemporalType.DATE)
    @Column(name = "return_date", nullable = false)
    private LocalDate return_date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "borrower_book_id", referencedColumnName = "book_id")
    private Book book;

    public BookBorrowing() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBorrower_name() {
        return borrower_name;
    }

    public void setBorrower_name(String borrower_name) {
        this.borrower_name = borrower_name;
    }

    public LocalDate getBorrowing_date() {
        return borrowing_date;
    }

    public void setBorrowing_date(LocalDate borrowing_date) {
        this.borrowing_date = borrowing_date;
    }

    public LocalDate getReturn_date() {
        return return_date;
    }

    public void setReturn_date(LocalDate return_date) {
        this.return_date = return_date;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "BookBorrowing{" +
                "id=" + id +
                ", borrower_name='" + borrower_name + '\'' +
                ", borrowing_date=" + borrowing_date +
                ", return_date=" + return_date +
                ", book=" + book +
                '}';
    }
}
