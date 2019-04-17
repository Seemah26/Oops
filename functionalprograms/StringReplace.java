package com.bridgelabz.functionalprograms;
import com.bridgelabz.util.FunctionalLogic;
public class StringReplace {

	public static void main(String[] args) {
		String s1=new String("username");
		System.out.print("original string:");
		String s2=new String("hello<<"+s1+">>,how are you?");
		System.out.println(s2);
		String s3=FunctionalLogic.getString();
		FunctionalLogic.Username(s1,s2,s3);
		
	}

}