package com.bridgelabz.clinic.models;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.clinic.models.Patient;

public class Appointment {
	static String doctorName;
	private List<Patient> listOfPatients = new ArrayList<Patient>();
	public static String getDoctorName() {
		return doctorName;
	}
	public static void setDoctorName(String doctorName) {
		Appointment.doctorName = doctorName;
	}
	public List<Patient> getListOfPatients() {
		return listOfPatients;
	}
	public void setListOfPatients(List<Patient> listOfPatients) {
		this.listOfPatients = listOfPatients;
	}

}
