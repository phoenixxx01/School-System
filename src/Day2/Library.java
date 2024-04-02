package Day2;

public class Library {
    private Librarian librarianA;
    private Borrower borrowerA;
    private Cleaner cleanerA;

    public Library() {
    }
    public Library(Librarian librarianA, Borrower borrowerA, Cleaner cleanerA) {
        this.librarianA = librarianA;
        this.borrowerA = borrowerA;
        this.cleanerA = cleanerA;
    }
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

    public Cleaner getCleanerA() {
        return cleanerA;
    }
    public void setCleanerA(Cleaner cleanerA) {
        this.cleanerA = cleanerA;
    }
}
