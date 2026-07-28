package model;

public class Prescription {

    private int prescriptionId;
    private int appointmentId;
    private String medicine;
    private String description;


    public Prescription(int appointmentId, String medicine, String description) {

        this.appointmentId = appointmentId;
        this.medicine = medicine;
        this.description = description;

    }


    public int getAppointmentId() {
        return appointmentId;
    }


    public String getMedicine() {
        return medicine;
    }


    public String getDescription() {
        return description;
    }

}
