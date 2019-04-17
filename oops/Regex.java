package com.bridgelabz.oops;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.bridgelabz.opps.commonmethods.OopsCommonMethod;



public class Regex {
	
	/*
	* The main function is written to take input from the user and
	* replace the template in the json file with the input given
	*/
	public static void main(String[] args) throws FileNotFoundException {
		OopsCommonMethod replace=new OopsCommonMethod();
		FileReader f = new FileReader("C:\\Users\\RDRL\\Desktop\\seema\\regex.txt");
	        @SuppressWarnings("resource")
	       
	        BufferedReader read = new BufferedReader(f);
	        String line = "";
	        String word="";
	        try {
	            while ((word = read.readLine()) != null) {
	                line = word;
	            }
	            System.out.println(line);
	        }
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	        System.out.println("Please enter the first name");
	        String firstName =replace.getString(); 
	        System.out.println("Please enter the last name");
	        String lastName = replace.getString();
	        String fullName = firstName + " " + lastName;
	        System.out.println("Please enter your 10 digit phone number");
	        String phoneNum =replace.getString();
	        Date date=new Date();
	        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	        String formattedDate= dateFormat. format(date);
	        
	        String message= replace.replace(firstName, fullName, phoneNum, formattedDate, line);
	        
	        System.out.println(message);
	}
}
