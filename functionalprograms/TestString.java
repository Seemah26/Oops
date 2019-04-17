package com.bridgelabz.functionalprograms;
import com.bridgelabz.util.FunctionalLogic;

public class TestString {

	public static void main(String[] args) {
		String s1="username";
		System.out.println("original string:");
		String s3="hello <<"+s1+">>,how are you?";
		  System.out.println(s3);
		   System.out.println("Enter name to replace with username:");
		   s1=FunctionalLogic.getString();
		    s3="hello <<"+s1+">>,how are you?";
		   System.out.println(s3);
	}
}