package Day2;

public class Borrower {

    private boolean isEligible;
    private int numOfBorrowedBooks;

    private String yearsOfSubcription;

    public Borrower() {
    }

    public Borrower(boolean isEligible, int numOfBorrowedBooks, String yearsOfSubcription) {
        this.isEligible = isEligible;
        this.numOfBorrowedBooks = numOfBorrowedBooks;
        this.yearsOfSubcription = yearsOfSubcription;
    }

    public boolean isEligible() {
        return isEligible;
    }

    public void setEligible(boolean eligible) {
        isEligible = eligible;
    }

    public int getNumOfBorrowedBooks() {
        return numOfBorrowedBooks;
    }

    public void setNumOfBorrowedBooks(int numOfBorrowedBooks) {
        this.numOfBorrowedBooks = numOfBorrowedBooks;
    }

    public String getYearsOfSubcription() {
        return yearsOfSubcription;
    }

    public void setYearsOfSubcription(String yearsOfSubcription) {
        this.yearsOfSubcription = yearsOfSubcription;
    }

    @Override
    public String toString() {
        return "Borrower{" +
                "isEligible=" + isEligible +
                ", numOfBorrowedBooks=" + numOfBorrowedBooks +
                ", yearsOfSubcription='" + yearsOfSubcription + '\'' +
                '}';
    }
}
