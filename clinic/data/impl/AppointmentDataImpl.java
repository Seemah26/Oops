package com.bridgelabz.clinic.data.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.clinic.data.Appointment;
import com.bridgelabz.clinic.models.Patient;
import com.bridgelabz.data.main.ClinicUtility;

public class AppointmentDataImpl implements Appointment{
	static List<Appointment> listOfAppointments = new ArrayList<>();
	static final String appointment_File = "D:\\JAVA\\javaproject\\src\\com\\bridgelabz\\clinic\\models\\Appointment.json";
	PatientDataImpl patnt=new PatientDataImpl();

	@Override
	public void takeAppointment() {
		String string = null;
		try {
			string = ClinicUtility.readJsonFile(appointment_File);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		/*try {
			listOfAppointments = ClinicUtility.userReadValue(string, Appointment.class);
			System.out.println("File is not empty");

		} catch (Exception e) {
			System.out.println("File is empty");
		}
		Patient patient = null;
		try {
			patient = PatientDataImpl.searchByPhoneNo();
		} catch (IOException e) {
			
			e.printStackTrace();
		}*/
		Patient patient = null;
		if (patient != null) {
			try {
				patnt.operation(patient);
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else {
			patnt.addPatient();
			Patient patient2 = null;
			try {
				patient2 = PatientDataImpl.searchByPhoneNo();
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				patnt.operation(patient2);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			ClinicUtility.writeToFile(appointment_File, listOfAppointments);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
