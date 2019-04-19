package com.bridgelabz.addressbook.main;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

import com.bridgelabz.addressbook.impl.AddressBookImpl;
import com.bridgelabz.addressbook.interfacedata.AddressBookInterface;
import com.bridgelabz.opps.commonmethods.OopsCommonMethod;

public class AddressBookMain {
    public static void main(String[] args) throws IOException, ParseException{
        AddressBookInterface AddressBookImpl = new AddressBookImpl();
        AddressBookImpl imp= new AddressBookImpl();
        {
            try {
				imp.fileRead();
			} catch (org.json.simple.parser.ParseException e) {
				e.printStackTrace();
			}
            
            System.out.println(" 1.addperson \n 2.remove person \n 3.sortbyname \n 4.sortzip");
            System.out.println("Input choice");
            int input = OopsCommonMethod.getInt();
            switch (input){
            case 1:
                imp.addPerson("Anu", "Kavya", 213211l, 1234567898l,"Rajmathe","Mysore","Bangalore");
                break;
            case 2:
                imp.removePerson();
                break;
            case 3:
              imp.sortByLastName();
                break;
            case 4:
                imp.sortByZipCode();
                break;
            }
            imp.writeFile();
                        
        }
        }
    }