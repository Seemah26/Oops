package com.bridgelabz.clinic.main;

import com.bridgelabz.clinic.data.DoctorData;
import com.bridgelabz.clinic.data.PatientData;
import com.bridgelabz.clinic.data.impl.DoctorImpl;
import com.bridgelabz.clinic.data.impl.PatientDataImpl;
import com.bridgelabz.opps.commonmethods.OopsCommonMethod;

public class ClinicManagement {

	public static void main(String[] args) {
		PatientData patient=new PatientDataImpl();
		DoctorData doct=new DoctorImpl();
		int n = 0;
		do {
			System.out.println("select choice  \n" + "1-To add \n" + "2-To Search \n" + "3-To take appointment");
			n = OopsCommonMethod.getInt();
			switch (n) {
			case 1:
				System.out.println("select choice  \n" + "1-To add doctor \n" + "2-To add patient");
				int choice = OopsCommonMethod.getInt();
				switch (choice) {
				case 1:doct.addDoctor();
				break;
				case 2:patient.addPatient();
				}
			case 2:
				System.out.println("select coice \n"+"1-to search doctor\n"+"2-to search patient");
				int choice1 = OopsCommonMethod.getInt();
				switch (choice1) {
				case 1:doct.searchDoctor();
				break;
				case 2:patient.searchPatient();
				}
		   case 3:System.out.println("taking appointment");
					
			default:
				System.out.println("Invalid choice");
				System.exit(0);
			}
		} while (n < 1);
	}

}
