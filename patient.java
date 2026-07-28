package service;

import dao.PatientDAO;
import dao.DoctorDAO;
import dao.AppointmentDAO;
import dao.PrescriptionDAO;

import model.Patient;
import model.Doctor;
import model.Appointment;
import model.Prescription;


public class HospitalService {


    PatientDAO patientDAO = new PatientDAO();

    DoctorDAO doctorDAO = new DoctorDAO();

    AppointmentDAO appointmentDAO = new AppointmentDAO();

    PrescriptionDAO prescriptionDAO = new PrescriptionDAO();



    // Patient Register

    public void registerPatient(Patient patient){

        patientDAO.registerPatient(patient);

    }



    // Patient Login

    public boolean login(String email, String password){

        return patientDAO.loginPatient(email, password);

    }



    // Add Doctor

    public void addDoctor(Doctor doctor){

        doctorDAO.addDoctor(doctor);

    }



    // View Doctor

    public void viewDoctors(){

        doctorDAO.viewDoctors();

    }



    // Book Appointment

    public void bookAppointment(Appointment appointment){

        appointmentDAO.bookAppointment(appointment);

    }



    // Cancel Appointment

    public void cancelAppointment(int id){

        appointmentDAO.cancelAppointment(id);

    }



    // View Appointment

    public void viewAppointments(){

        appointmentDAO.viewAppointments();

    }



    // Add Prescription

    public void addPrescription(Prescription prescription){

        prescriptionDAO.addPrescription(prescription);

    }



    // View Prescription

    public void viewPrescription(int id){

        prescriptionDAO.viewPrescription(id);

    }

}
