import java.util.ArrayList;
import java.util.Date;
import java.util.TreeMap;

public class Patient extends Person{
    private int PatientId;
    private ArrayList<MedicalRecord> medicalHistory;
    private TreeMap<Date, Appointment> appointments;
   public Patient(String name, int age, String gender, String email, String phone, String gender1, String email1, String phone1) {
        super(name, age, gender, email, phone, gender1, email1, phone1);
    }



}
