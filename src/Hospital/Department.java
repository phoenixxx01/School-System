package Hospital;

public class Department {

    private Optometry optometry;
    private Paediatric paediatric;
    private Gynaecology gynaecology;

    public Department() {
    }
    public Department(Optometry optometry, Paediatric paediatric, Gynaecology gynaecology) {
        this.optometry = optometry;
        this.paediatric= paediatric;
        this.gynaecology = gynaecology;
    }

    public Optometry getOptometry() {
        return optometry;
    }

    public void setOptometry(Optometry optometry) {
        this.optometry = optometry;
    }

    public Paediatric getPaediatric() {
        return paediatric;
    }

    public void setPaediatric(Paediatric paediatric) {
        this.paediatric = paediatric;
    }

    public Gynaecology getGynaecology() {
        return gynaecology;
    }

    public void setGynaecology(Gynaecology gynaecology) {
        this.gynaecology = gynaecology;
    }

    @Override
    public String toString() {
        return "Department{" + '\n' +
                "Optometry=" + optometry +
                ", Paediatric=" + paediatric +
                ", Gynaecology=" + gynaecology +
                '}';
    }
}
