package Hospital;

public class Paediatric extends Department {
    private Doctor doctor;
    private Nurse nurse;
    private Patient patient;
    private MedicalEquipment medicalEquipment;

    public Paediatric() {
    }

    public Paediatric(Doctor doctor, Nurse nurse, Patient patient, MedicalEquipment medicalEquipment) {
        this.doctor = doctor;
        this.nurse = nurse;
        this.patient = patient;
        this.medicalEquipment = medicalEquipment;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public MedicalEquipment getMedicalEquipment() {
        return medicalEquipment;
    }

    public void setMedicalEquipment(MedicalEquipment medicalEquipment) {
        this.medicalEquipment = medicalEquipment;
    }

    @Override
    public String toString() {
        return "Paediatric{" +
                "doctor=" + doctor +
                ", nurse=" + nurse +
                ", patient=" + patient +
                ", medicalEquipment=" + medicalEquipment +
                "} ";
    }
}
