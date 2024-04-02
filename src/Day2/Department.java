package Day2;

public class Department {
    private Librarian librarianA;
    private Borrower borrowerA;
    private Cleaner cleanersA;

    public Librarian getLibrarianA() {
        return librarianA;
    }

    public void setLibrarianA(Librarian librarianA) {
        this.librarianA = librarianA;
    }

    public Borrower getBorrowerA() {
        return borrowerA;
    }

    public void setBorrowerA(Borrower borrowerA) {
        this.borrowerA = borrowerA;
    }

    public Cleaner getCleanersA() {
        return cleanersA;
    }

    public void setCleanersA(Cleaner cleanersA) {
        this.cleanersA = cleanersA;
    }

    @Override
    public String toString() {
        return "Department{" +
                "librarianA=" + librarianA +
                ", borrowerA=" + borrowerA +
                ", cleanersA=" + cleanersA +
                '}';
    }
}
