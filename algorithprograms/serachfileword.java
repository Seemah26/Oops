package com.bridgelabz.algorithprograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtil;

public class serachfileword {
	 public static void main(String[] args) throws FileNotFoundException {
	        String word = "";
	        int val = 0;
	        while (!word.matches("exit")) {
	            System.out.println("Enter the word to be searched for");
	            Scanner input = new Scanner(System.in);
	            word = AlgorithmUtil.getString();
	            Scanner file = new Scanner(new File("C:\\Users\\RDRL\\Desktop\\seema\\soni.txt"));

	            while (file.hasNextLine()) {
	                String line = file.nextLine();
	                if (line.indexOf(word) != -1) {
	                    System.out.println("Word EXISTS in the file");
	                    val = 1;
	                    break;
	                } else {
	                    val = 0;
	                    continue;
	                }
	            }
	            if (val == 0) {
	                System.out.println("Word does not exist");
	            }
	            System.out.println("-------continue or exit--- enter continue or exit");
	            word = input.next();
	        }
	    }



	 
}
