package com.bridgelabz.util.datastructure;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utility {
		BufferedReader br;
			
		//constructor to initialize bufferedReader
		public Utility(){
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		
		
		//take input word
		public String inputString(){
			try{
				return br.readLine();
			}
			catch(IOException ioe){
				System.out.println(ioe.getMessage());
			}
			return "";
		}

		//Take Integer Input
		public int inputInteger(){
			try{
				try{	
					return Integer.parseInt(br.readLine());
				}
				catch(NumberFormatException nfe){
					System.out.println(nfe.getMessage());	
				}
			}catch(IOException ioe){
				System.out.println(ioe.getMessage());
			}
			return 0;
		}

		//Take Double Input
		public double inputDouble(){
			try{
				try{	
					return Double.parseDouble(br.readLine());
				}
				catch(NumberFormatException nfe){
					System.out.println(nfe.getMessage());	
				}
			}catch(IOException ioe){
				System.out.println(ioe.getMessage());
			}
			return 0.0;
		}


		
		//Take file name as input and return string of file text
		public String getFileText(String fileName){
			try{
				br=new BufferedReader(new FileReader(fileName));
				StringBuilder sb=new StringBuilder();
				String line=br.readLine();
				while(line!=null){
					sb.append(line);
					sb.append(System.lineSeparator());
					line=br.readLine();
				}
				return sb.toString();
			 }
			catch(Exception e){
				return null;
			}
			finally{
				try{
					br.close();
				}
				catch(IOException ioe){
				}	
			}
		}
		
		//this function take two parameter 
		// 1 what data to write.
		// 2 file name
		public void writeToFile(String data,String fileName)throws Exception{
			File file = new File(fileName);
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter writer = new FileWriter(file); 
			// Writes the content to the file
			writer.write(data); 
			writer.flush();
			writer.close();
		}
		 public static int day(int month, int day, int year) {
		        int y = year - (14 - month) / 12;
		        int x = y + y/4 - y/100 + y/400;
		        int m = month + 12 * ((14 - month) / 12) - 2;
		        int d = (day + x + (31*m)/12) % 7;
		        return d;
		    }
		 // return true if the given year is a leap year
		    public static boolean isLeapYear(int year) {
		        if  ((year % 4 == 0) && (year % 100 != 0)) return true;
		        if  (year % 400 == 0) return true;
		        return false;
		    }


	

}
