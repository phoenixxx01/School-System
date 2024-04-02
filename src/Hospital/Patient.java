package Hospital;

public class Patient extends Person {
    private boolean isAdmitted;
    private int bill;
    private String cardNumber;

    public Patient() {
    }

    public Patient(String name, String id, String gender, String stateOfOrigin, int age, boolean isAdmitted,
                   int bill, String cardNumber) {
        super(name, id, gender, stateOfOrigin, age);
        this.isAdmitted = isAdmitted;
        this.bill = bill;
        this.cardNumber = cardNumber;
    }

    public boolean isAdmitted() {
        return isAdmitted;
    }

    public void setAdmitted(boolean admitted) {
        isAdmitted = admitted;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "Patient{" + super.toString() +
                "isAdmitted=" + isAdmitted +
                ", bill=" + bill +
                ", cardNumber='" + cardNumber + '\'' +
                "} ";
    }
}
