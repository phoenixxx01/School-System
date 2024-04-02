package Hospital;

public class Doctor extends Person {

    private String yearsOfExperience;
    private String qualification;

    public Doctor() {
    }
    public Doctor(String name, String id, String gender, String stateOfOrigin, int age, String yearsOfExperience,
                  String qualification) {
        super(name, id, gender, stateOfOrigin, age);
        this.yearsOfExperience = yearsOfExperience;
        this.qualification = qualification;
    }

    public String getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(String yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Doctor{" + super.toString() +
                "yearsOfExperience='" + yearsOfExperience + '\'' +
                ", qualification='" + qualification + '\'' +
                "} ";
    }
}
