package Day2;

public class Librarian extends Person{

    private int yearsOfExperience;
    private int numberOfBooks;

    public Librarian() {
    }
    public Librarian(String name, int id, String phone, String address, int age, int yearsOfExperience, int numberOfBooks) {
        super(name, id, phone, address, age);
        this.yearsOfExperience = yearsOfExperience;
        this.numberOfBooks = numberOfBooks;
    }
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    public int getNumberOfBooks() {
        return numberOfBooks;
    }
    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }
    @Override
    public String toString() {
        return "Librarian{" +
                "yearsOfExperience=" + yearsOfExperience +
                ", numberOfBooks=" + numberOfBooks +
                '}';
    }
}
