package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.FunctionalLogic;

public class ReplaceName {
	public static void main(String[] args) {
		String sentance="Hello <<userName>> , How are you?";
		System.out.println("original string:"+sentance);
		System.out.println("Enter name to replace with username:");
		String userName=FunctionalLogic.getString();
		if(userName.length()>=3)
		System.out.println(FunctionalLogic.replaceUserName(sentance,userName));
		else
			System.out.println("please enter atleast 3 character");
	}
}