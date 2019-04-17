package com.bridgelabz.listofcompanyshares.main;

import com.bridgelabz.listofcompanyshare.data.CompanyShareInterface;
import com.bridgelabz.listofcompanyshare.impl.CompanyShareImpl;
import com.bridgelabz.opps.commonmethods.OopsCommonMethod;

public class ListOfCompanyShares {

	public static void main(String[] args) {
		//CustomLinkedList list=new CustomLinkedList();
		
		 CompanyShareInterface ref=new CompanyShareImpl();
		 ref.fileRead();
		ref.add();
		System.out.println("enter the name you want to delet");
		String name=OopsCommonMethod.getString();
		ref.remove(name);
		ref.fileRead();
		//ref.writeFile();
		
	}

}
