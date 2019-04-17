package com.bridgelabz.clinic.data.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.clinic.data.PatientData;
import com.bridgelabz.clinic.models.Doctor;
import com.bridgelabz.clinic.models.Patient;
import com.bridgelabz.data.main.ClinicUtility;

public class PatientDataImpl implements PatientData{
	static List<Patient> listPatient = new ArrayList<Patient>();
	static final String patient_File = "D:\\JAVA\\javaproject\\src\\com\\bridgelabz\\clinic\\models\\Patient.json";
	static DoctorDataImpl doctorData=new DoctorDataImpl();
	public  void addPatient() {

		try {
			String patient = ClinicUtility.readJsonFile(patient_File);

			listPatient = ClinicUtility.userReadValue(patient, Doctor.class);
			System.out.println("File is not empty!");
		} catch (Exception e) {
			System.out.println("File is empty!");
		}
		Patient patient = new Patient();
		System.out.println("Setting id");
		patient.setId(listPatient.size() + 1);
		System.out.println("set patient id");
		patient.setId(ClinicUtility.getInt());
		System.out.println("Enter the patient's name");
		patient.setName(ClinicUtility.getString());
		System.out.println("Enter the age");
		patient.setAge(ClinicUtility.getInt());
		System.out.println("Enter the phone number");
		patient.setMobileNumber(ClinicUtility.getLong());
		listPatient.add(patient);
		System.out.println("Patient added successfully");
		try {
			ClinicUtility.writeToFile(patient_File, listPatient);
		} catch (JsonGenerationException e) {

			e.printStackTrace();
		} catch (JsonMappingException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	public  void searchPatient()  {
		System.out.println("Enter the choice of property based on which you want to search");
		System.out.println("1:Search by ID  2:Search By Phone Number");
		int choice =ClinicUtility.getInt();
		switch (choice) {
		case 1:
			System.out.println("Searching by id");

			// Function call that searches patient by id, in Search.class
			// in com.bridgelabz.util package
			Patient patient1 = null;
			try {
				patient1 = searchByPatientId();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (patient1 != null)
				System.out.println("Patient is present");
			else
				System.out.println("Patient is not present");
			break;
		case 2:
			System.out.println("Searching by Phone Number");

			// Function call that searches patient by phone number, in Search.class
			// in com.bridgelabz.util package
			Patient patient2 = null;
			try {
				patient2 = searchByPhoneNo();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (patient2 != null)
				System.out.println("Patient is present");
			else
				System.out.println("Patient is not present");
			break;
		}
	}
	
	public static Patient searchByPatientId() throws IOException {
		String string =ClinicUtility.readJsonFile(patient_File);
		listPatient=ClinicUtility.userReadValue(string, Patient.class);
		System.out.println("Enter the patient's id to be searched");
		int id =ClinicUtility.getInt();
		for (Patient patient : listPatient) {
			if (id == patient.getId()) {
				return patient;
			}
		}
		return null;
	}
	public static Patient searchByPhoneNo() throws IOException {
		String string =ClinicUtility.readJsonFile(patient_File);
	listPatient =ClinicUtility.userReadValue(string, Patient.class);
		System.out.println("Enter the patient's phone number to search");
		long phoneNo =ClinicUtility.getLong();

		for (Patient patient : listPatient) {
			if (phoneNo == patient.getMobileNumber()) {
				return patient;
			}
		}
		return null;
	}
	public static void operation(Patient patient) throws IOException {
		System.out.println("Search doctor by- 1:Name 2:Speciality 3:Availability");
		int choice =ClinicUtility.getInt();
		switch (choice) {
		case 1:
			List<Doctor> doctorList = doctorData.searchByName();
			displayList(doctorList);
			//searchDoc(doctorList, patient);
			break;
		case 2:
			List<Doctor> doctorList1 =doctorData.searchBySpecialization();
			displayList(doctorList1);
			//searchDoc(doctorList1, patient);
			break;
		case 3:
			List<Doctor> doctorList2 = doctorData.searchByAvailability();
			displayList(doctorList2);
			//searchDoc(doctorList2, patient);
			break;
		}
	}
	public static void displayList(List<Doctor> docList) {
		    for(Doctor doctor: docList ) {
			System.out.println("Doctor's ID: " + doctor.getId());
			System.out.println("Doctor's name: " + doctor.getName());
			System.out.println("Doctor's specialization: " + doctor.getSpeciality());
			System.out.println("Doctor's availability: " + doctor.getAvailability());
		    }

}
	
}

