package com.bridgelabz.data.main;

import java.io.IOException;

import com.bridgelabz.clinic.data.Appointment;
import com.bridgelabz.clinic.data.DoctorData;
import com.bridgelabz.clinic.data.PatientData;
import com.bridgelabz.clinic.data.impl.AppointmentDataImpl;
import com.bridgelabz.clinic.data.impl.DoctorDataImpl;
import com.bridgelabz.clinic.data.impl.PatientDataImpl;

public class ClinicManagement {

	public static void main(String[] args) throws IOException {
		DoctorData doctorData=new DoctorDataImpl();
		PatientData patientData=(PatientData) new PatientDataImpl();
		Appointment Appoint=new AppointmentDataImpl();
		System.out.println("Enter the choice");
		System.out.println(" 1-To add doctor or patient \n 2-To Search doctor or patient \n 3-To take Appointment");
		int choice = ClinicUtility.getInt();
		switch (choice) {
		case 1:
				System.out.println("press :\n 1-To Add Doctor\n 2-To Add Patient");
				int ch1 = ClinicUtility.getInt();
				switch (ch1) {
				case 1:
					doctorData.addDoctor();
					break;
				case 2:
					patientData.addPatient();
					break;
				}
		case 2:
			   System.out.println("Enter choice: 1:Search Doctor  2:Search Patient");
			   int ch2 =ClinicUtility.getInt();
			   switch (ch2) {
			   case 1:
				   doctorData.searchDoctor();
				break;
			   case 2:
				   patientData.searchPatient();
				break;
		        }
		case 3:
			   System.out.println("Taking Appointment");
			   Appoint.takeAppointment();
			   break;
	}
}
}
