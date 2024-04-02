package Hospital;

public class MedicalEquipment {
    private String nameOfEquipment;
    private String Usage;
    private String size;

    public MedicalEquipment() {
    }
    public MedicalEquipment(String nameOfEquipment, String usage, String size) {
        this.nameOfEquipment = nameOfEquipment;
        this.Usage = usage;
        this.size = size;
    }

    public String getNameOfEquipment() {
        return nameOfEquipment;
    }

    public void setNameOfEquipment(String nameOfEquipment) {
        this.nameOfEquipment = nameOfEquipment;
    }

    public String getUsage() {
        return Usage;
    }

    public void setUsage(String usage) {
        Usage = usage;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "MedicalEquipment{" +
                "nameOfEquipment='" + nameOfEquipment + '\'' +
                ", Usage='" + Usage + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
