package main;

import java.util.Scanner;

import service.HospitalService;
import model.Patient;
import model.Doctor;
import model.Appointment;


public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        HospitalService service = new HospitalService();


        while(true) {


            System.out.println("\n===== Hospital Management System =====");

            System.out.println("1. Patient Register");
            System.out.println("2. Patient Login");
            System.out.println("3. Add Doctor");
            System.out.println("4. View Doctors");
            System.out.println("5. Book Appointment");
            System.out.println("6. Cancel Appointment");
            System.out.println("7. View Appointments");
            System.out.println("8. Exit");


            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            sc.nextLine();



            switch(choice) {


                case 1:


                    System.out.print("Name: ");
                    String name = sc.nextLine();


                    System.out.print("Age: ");
                    int age = sc.nextInt();

                    sc.nextLine();


                    System.out.print("Gender: ");
                    String gender = sc.nextLine();


                    System.out.print("Phone: ");
                    String phone = sc.nextLine();


                    System.out.print("Email: ");
                    String email = sc.nextLine();


                    System.out.print("Password: ");
                    String password = sc.nextLine();



                    Patient patient =
                    new Patient(name, age, gender, phone, email, password);


                    service.registerPatient(patient);

                    break;



                case 2:


                    System.out.print("Email: ");
                    String loginEmail = sc.nextLine();


                    System.out.print("Password: ");
                    String loginPass = sc.nextLine();



                    boolean result =
                    service.login(loginEmail, loginPass);


                    if(result)
                        System.out.println("Login Success");
                    else
                        System.out.println("Invalid Login");


                    break;



                case 3:


                    System.out.print("Doctor Name: ");
                    String dname = sc.nextLine();


                    System.out.print("Specialization: ");
                    String spec = sc.nextLine();


                    System.out.print("Phone: ");
                    String dphone = sc.nextLine();


                    System.out.print("Email: ");
                    String demail = sc.nextLine();



                    Doctor doctor =
                    new Doctor(dname, spec, dphone, demail);


                    service.addDoctor(doctor);


                    break;



                case 4:

                    service.viewDoctors();

                    break;



                case 5:


                    System.out.print("Patient ID: ");
                    int pid = sc.nextInt();


                    System.out.print("Doctor ID: ");
                    int did = sc.nextInt();


                    sc.nextLine();


                    System.out.print("Date (YYYY-MM-DD): ");
                    String date = sc.nextLine();


                    System.out.print("Time: ");
                    String time = sc.nextLine();



                    Appointment appointment =
                    new Appointment(pid, did, date, time, "Booked");


                    service.bookAppointment(appointment);


                    break;



                case 6:


                    System.out.print("Appointment ID: ");

                    int aid = sc.nextInt();


                    service.cancelAppointment(aid);


                    break;



                case 7:


                    service.viewAppointments();

                    break;



                case 8:

                    System.out.println("Thank You");

                    System.exit(0);



                default:

                    System.out.println("Invalid Choice");

            }

        }

    }

}
