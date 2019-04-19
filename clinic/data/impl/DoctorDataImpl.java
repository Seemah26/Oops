/*package com.bridgelabz.clinic.data.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.clinic.data.DoctorData;
import com.bridgelabz.clinic.models.Doctor;
import com.bridgelabz.opps.commonmethods.OopsCommonMethod;
import com.google.gson.Gson;

public class DoctorDataImpl implements DoctorData {
	static List<Doctor> listDoctor = new ArrayList<Doctor>();
	static final String doctor_File = "D:\\JAVA\\javaproject\\src\\com\\bridgelabz\\clinic\\models\\doctor.json";
    JSONArray jsonArray;
    JSONObject jobject=new JSONObject();
	@Override
	public void addDoctor() {
		String doct = null;
		try {
			doct = ClinicUtility.readJsonFile(doctor_File);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			//listDoctor = ClinicUtility.userReadValue(doct, Doctor.class);
			System.out.println("File is not empty!");
		} catch (Exception e) {
			System.out.println("File is empty!");
		}
		Doctor doctor = new Doctor();
	//	System.out.println("Setting id");
		doctor.setId(listDoctor.size() + 1);
		System.out.println("Id set");
		System.out.println("Enter the doctor's name");
		doctor.setName(OopsCommonMethod.getString());
		System.out.println("Enter the specialization");
		doctor.setSpeciality(OopsCommonMethod.getString());
		System.out.println("Enter the availability");
		doctor.setAvailability(OopsCommonMethod.getString());
		listDoctor.add(doctor);
		System.out.println("Doctor added successfully");
		
		
	}

	public void searchDoctor() {
		System.out.println(
				"Enter choice- 1:Search by ID \n 2:Search By Name\n 3:Search By Specialization\n4:Search By Availability");
		int choice = OopsCommonMethod.getInt();
		switch (choice) {
		case 1:
			System.out.println("Searching by id");

			Doctor doctor1 = null;
			try {
				doctor1 = searchById();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (doctor1 != null)
				System.out.println("Doctor is present");
			else
				System.out.println("Doctor is not present");
			break;

		case 2:
			System.out.println("Searching by name");

			List<Doctor> doctor2 = null;
			try {
				doctor2 = searchByName();
			} catch (IOException e) {
				e.printStackTrace();
			}

			if (!doctor2.isEmpty())
				System.out.println("Doctor is present");
			else
				System.out.println("Doctor is not present");
			break;
		case 3:
			System.out.println("Searching by specialization");

			List<Doctor> doctor3 = null;
			try {
				doctor3 = searchBySpecialization();
			} catch (IOException e) {
				e.printStackTrace();
			}

			if (!doctor3.isEmpty())
				System.out.println("Doctor is present");
			else
				System.out.println("Doctor is not present");
			break;
		case 4:

			System.out.println("Searching by availability");
			List<Doctor> doctor4 = null;
			try {
				doctor4 = searchBySpecialization();
			} catch (IOException e) {
				e.printStackTrace();
			}

			if (!doctor4.isEmpty())
				System.out.println("Doctor is present");
			else
				System.out.println("Doctor is not present");
			break;
		}
	}

	private static Doctor searchById() throws IOException {
		//readfile();
		//String string = OopsCommonMethod.readJsonFile(doctor_File);
		//listDoctor = OopsCommonMethod.userReadValue(string, Doctor.class);
		System.out.println("Enter the doctor's id to be searched");
		int id = OopsCommonMethod.getInt();
		for (Doctor doctor : listDoctor) {
			if (id == doctor.getId()) {
				return doctor;

			}
		}
		return null;
	}
	public static List<Doctor> searchByName() throws IOException {
		//String string = ClinicUtility.readJsonFile(doctor_File);
		try {
			//listDoctor = ClinicUtility.userReadValue(string, Doctor.class);
			List<Doctor> list = new ArrayList<>();
			System.out.println("Enter the doctor's name to be searched");
			//String name = ClinicUtility.getString();
			System.out.println(name);
			for (Doctor doctor : listDoctor) {
				if (name.equals(doctor.getName())) {
					list.add(doctor);
				}
			}
			return list;
		} catch (Exception e) {
			System.out.println("File is empty!");
			return null;
		}
	}

	public static List<Doctor> searchBySpecialization() throws IOException {
		String string = ClinicUtility.readJsonFile(doctor_File);
		try {
			listDoctor = ClinicUtility.userReadValue(string, Doctor.class);
			List<Doctor> list = new ArrayList<>();
			System.out.println("Enter the doctor's name to be searched");
			String specialization = ClinicUtility.getString();
			for (Doctor doctor : listDoctor) {
				if (specialization.equals(doctor.getSpeciality())) {
					list.add(doctor);
				}
			}

			return list;
		} catch (Exception e) {
			System.out.println("File is empty!");
			return null;
		}
	}

	public static List<Doctor> searchByAvailability() throws IOException {
		String string = ClinicUtility.readJsonFile(doctor_File);
		try {
			listDoctor = ClinicUtility.userReadValue(string, Doctor.class);
			List<Doctor> list = new ArrayList<>();
			System.out.println("Enter when you need the doctor (eg: am/pm)");
			String availability = ClinicUtility.getString();
			for (Doctor doctor : listDoctor) {
				if (availability.equals(doctor.getAvailability())) {
					list.add(doctor);
				}
			}
			return list;
		} catch (Exception e) {
			System.out.println("File is empty!");
			return null;
		}

	}
	public void WriteFile() throws IOException {
		Gson gson=new Gson();
		String json=gson.toJson(listDoctor);
		FileWriter file=new FileWriter("D:\\\\JAVA\\\\javaproject\\\\src\\\\com\\\\bridgelabz\\\\clinic\\\\models\\\\doctor.json");
	  file.write(json);
	}

}
*/