package Day2;

public class Main {
    public static void main(String[] args) {
        Borrower borrower = new Borrower();
        Cleaner cleaner = new Cleaner();
        Librarian librarian = new Librarian();
        Library library = new Library();
        library.setLibrarianA(librarian);
        library.setBorrowerA(borrower);
        library.setCleanerA(cleaner);
    }
}
