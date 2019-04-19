package com.bridgelabz.clinic.data.impl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.clinic.data.DoctorData;
import com.bridgelabz.clinic.models.Doctor;
import com.bridgelabz.listofcompanyshare.model.CompanyShare;
import com.bridgelabz.opps.commonmethods.OopsCommonMethod;

public class DoctorImpl implements DoctorData{
	static List<Doctor> listDoctor = new ArrayList<Doctor>();
	Doctor doct=new Doctor();
	@Override
	public void addDoctor() {
		Doctor doctor=new Doctor();
		doctor.setId(listDoctor.size() + 1);
		System.out.println("enter doctor name");
		String name=OopsCommonMethod.getString();
		doctor.setName(name);
		System.out.println("enter doctor speciality ");
		String speciality=OopsCommonMethod.getString();
		doctor.setSpeciality(speciality);
		System.out.println("enter availability ");
		String availability=OopsCommonMethod.getString();
		doctor.setAvailability(availability);
		listDoctor .add(doctor);
		
		
	}

	@Override
	public void searchDoctor() {
		System.out.println("enter choice \n"+"1-serach by name\n"+"2-by specialization");
		int n=OopsCommonMethod.getInt();
		switch(n) {
		case 1:
			System.out.println("enter doctor name to serach");
			String name=OopsCommonMethod.getString();
			for(Doctor doct:listDoctor) {
			if(name.equals(listDoctor)) 
				System.out.println("doctor is present");
			    System.out.println("doctor is not present");
			
		}
		}
		
	}
	public void fileRead() {
		JSONParser parser = new JSONParser();
		FileReader fr;
	
			try {
				fr = new FileReader("D:\\javaproject\\Java\\src\\com\\bridgelabz\\clinic\\models\\doctor.json");
	
				JSONArray	jsonArray = (JSONArray) parser.parse(fr);
			
		
		for (Object obj : jsonArray) {
			JSONObject jobject = (JSONObject) obj;
			String name = (String) jobject.get("name");
			Long noOfShare = (Long) jobject.get("mobileNumber");
			String speciality=(String) jobject.get("speciality");
			int id= (int) jobject.get("id");
			Long mobileNumber=(Long) jobject.get("mobilenumber");
			doct.setName(name);
			doct.setId(id);
			doct.setMobileNumber(mobileNumber);
			doct.setSpeciality(speciality);
			listDoctor.add(doct);
		}
			}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		}
	}


