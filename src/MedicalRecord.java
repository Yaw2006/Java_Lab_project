public class MedicalRecord {
    private double temperature;
    private String allergies;
    private double systolicBloodPressure;
    private double diastolicBloodPressure;

    public MedicalRecord(double temperature, String allergies, double systolicBloodPressure, double diastolicBloodPressure) {
        this.temperature = temperature;
        this.allergies = allergies;
        this.systolicBloodPressure = systolicBloodPressure;
        this.diastolicBloodPressure = diastolicBloodPressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public double getSystolicBloodPressure() {
        return systolicBloodPressure;
    }

    public void setSystolicBloodPressure(double systolicBloodPressure) {
        this.systolicBloodPressure = systolicBloodPressure;
    }

    public double getDiastolicBloodPressure() {
        return diastolicBloodPressure;
    }

    public void setDiastolicBloodPressure(double diastolicBloodPressure) {
        this.diastolicBloodPressure = diastolicBloodPressure;
    }
    public enum bloodTypes{
        O_POSITIVE,
        O_NEGATIVE,
        A_POSITIVE,
        A_NEGATIVE,
        B_POSITIVE,
        B_NEGATIVE,
        AB_POSITIVE,
        AB_NEGATIVE;




    }
}
