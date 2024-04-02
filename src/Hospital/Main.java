package Hospital;

public class Main {
    public static void main(String[] args) {
        Doctor doctorA = new Doctor();
        doctorA.setName("Timi Jason");
        doctorA.setGender("Male");
        doctorA.setAge(35);
        doctorA.setStateOfOrigin("Ogun");
        doctorA.setQualification("Master Degree");
        doctorA.setId("223Ad245");
        doctorA.setYearsOfExperience("10");

        Doctor doctorB= new Doctor();
        doctorB.setName("Omoyele Victor");
        doctorB.setGender("Male");
        doctorB.setAge(60);
        doctorB.setStateOfOrigin("Osun");
        doctorB.setQualification("Master Degree");
        doctorB.setId("443Ad245");
        doctorB.setYearsOfExperience("25");

        Doctor doctorC= new Doctor();
        doctorC.setName("Banke Olukoya");
        doctorC.setGender("Female");
        doctorC.setAge(40);
        doctorC.setStateOfOrigin("Lagos");
        doctorC.setQualification("Master Degree");
        doctorC.setId("883Ad245");
        doctorC.setYearsOfExperience("30");

        Patient patientA = new Patient();
        patientA.setName("Bisi Olugoke");
        patientA.setGender("Female");
        patientA.setAge(40);
        patientA.setId("845Ad245");
        patientA.setAdmitted(true);
        patientA.setCardNumber("RTTGG1425");
        patientA.setBill(23000);
        patientA.setStateOfOrigin("Ondo");

        Patient patientB = new Patient();
        patientB.setName("Bisi Olugoke");
        patientB.setGender("Female");
        patientB.setAge(40);
        patientB.setId("675Ad245");
        patientB.setAdmitted(true);
        patientB.setCardNumber("BTGG1425");
        patientB.setBill(3000);
        patientB.setStateOfOrigin("Rivers");

        Patient patientC = new Patient();
        patientC.setName("Tolani Obasanjo");
        patientC.setGender("Female");
        patientC.setAge(25);
        patientC.setId("777Ad245");
        patientC.setAdmitted(false);
        patientC.setCardNumber("CARR1425");
        patientC.setBill(1000);
        patientC.setStateOfOrigin("Ekiti");

        Nurse nurseA = new Nurse();
        nurseA.setName("Ebuka Chijioke");
        nurseA.setGender("Male");
        nurseA.setAge(40);
        nurseA.setId("675Ad245");
        nurseA.setStateOfOrigin("Rivers");

        Nurse nurseB = new Nurse();
        nurseB.setName("Ajike Bola");
        nurseB.setGender("Male");
        nurseB.setAge(20);
        nurseB.setId("675Ad245");
        nurseB.setStateOfOrigin("Oyo");

        Nurse nurseC = new Nurse();
        nurseC.setName("Ronke Adebola");
        nurseC.setGender("Female");
        nurseC.setAge(18);
        nurseC.setId("675Ad245");
        nurseC.setStateOfOrigin("Edo");

        MedicalEquipment medicalEquipmentA = new MedicalEquipment();
        medicalEquipmentA.setNameOfEquipment("   ");
        medicalEquipmentA.setSize("Big");
        medicalEquipmentA.setUsage(" ");

        MedicalEquipment medicalEquipmentB = new MedicalEquipment();
        medicalEquipmentB.setNameOfEquipment("   ");
        medicalEquipmentA.setSize("small");
        medicalEquipmentA.setUsage(" ");

        MedicalEquipment medicalEquipmentC = new MedicalEquipment();
        medicalEquipmentC.setNameOfEquipment("   ");
        medicalEquipmentA.setSize("medium");
        medicalEquipmentA.setUsage(" ");

        Gynaecology gynaecology = new Gynaecology();
        gynaecology.setDoctor(doctorA);
        gynaecology.setNurse(nurseA);
        gynaecology.setPatient(patientA);
        gynaecology.setMedicalEquipment(medicalEquipmentA);


        Optometry optometry = new Optometry();
        optometry.setDoctor(doctorB);
        optometry.setNurse(nurseB);
        optometry.setPatient(patientB);
        optometry.setMedicalEquipment(medicalEquipmentB);

        Paediatric paediatric = new Paediatric();
        paediatric.setDoctor(doctorC);
        paediatric.setNurse(nurseC);
        paediatric.setPatient(patientC);
        paediatric.setMedicalEquipment(medicalEquipmentC);

        Department department = new Department();
        department.setOptometry(optometry);
        department.setGynaecology(gynaecology);
        department.setPaediatric(paediatric);

        System.out.println(department);






    }
}




