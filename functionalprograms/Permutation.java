package com.bridgelabz.functionalprograms;
import com.bridgelabz.util.FunctionalLogic;
public class Permutation {	
	
	 public static void main(String[] args) 
	    { 
	        String string = "MOP"; 
	        int l = string.length(); 
	       FunctionalLogic.permute(string,0,l-1);
	    }  
	} 
	
