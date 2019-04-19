package com.bridgelabz.listofcompanyshares.main;

import java.util.LinkedList;

import com.bridgelabz.listofcompanyshare.data.CompanyShareInterface;
import com.bridgelabz.listofcompanyshare.impl.CompanyShareImpl;
import com.bridgelabz.listofcompanyshare.model.CompanyShare;
import com.bridgelabz.opps.commonmethods.OopsCommonMethod;

public class ListOfCompanyShares {

	public static void main(String[] args) {
		
		 CompanyShareInterface ref=new CompanyShareImpl();
		 LinkedList<CompanyShare> shares = new LinkedList<>();
		ref.fileRead();
	    ref.add();
		System.out.println("enter the name you want to delet");
		String name=OopsCommonMethod.getString();
		ref.remove(name);
		ref.writeFile();
	}
}
