package com.bridgelabz.listofcompanyshare.impl;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.listofcompanyshare.data.CompanyShareInterface;
import com.bridgelabz.listofcompanyshare.model.CompanyShare;
import com.bridgelabz.opps.commonmethods.CustomLinkedList;
import com.bridgelabz.opps.commonmethods.OopsCommonMethod;
import com.google.gson.Gson;

public class CompanyShareImpl implements  CompanyShareInterface{
	JSONArray jsonArray;
	CompanyShare shares=new CompanyShare();

	List<CompanyShare> list=new ArrayList<>();
	CustomLinkedList linkedList=new CustomLinkedList();
	
	//List<CustomLinkedList> linkedList=new ArrayList<>();
	JSONObject jobject = new JSONObject();
	
	@Override
	public void add() {
		CompanyShare share=new CompanyShare();
		System.out.println("enter company name");
		String name=OopsCommonMethod.getString();
		System.out.println("enter the number of share");
		Long noOfShare=OopsCommonMethod.getLong();
		String name1=share.setComapanyName(name);
		Long noshare=share.setNoOfShare(noOfShare);
		linkedList.add(share);
		//linkedList.add(share);
		//linkedList.toString();
		//System.out.println(linkedList);
		// linkedList.forEach(comList -> System.out.println(comList.toString()));
		linkedList.printList();
		
	}
	@Override
	public void remove(String name) {
		if(linkedList.search(name))
				{
			int index=linkedList.index(name);
			linkedList.remove(index);
			System.out.println("removed");
			linkedList.printList();
		}
	}
	@Override
	public void fileRead() {
		JSONParser parser = new JSONParser();
		{
				FileReader fr;
				try {
					fr = new FileReader("D:\\javaproject\\Java\\src\\com\\bridgelabz\\stock\\model\\Stock.json");
				
				
					jsonArray = (JSONArray) parser.parse(fr);
				} catch (IOException e) {
					
					e.printStackTrace();
				} catch (ParseException e) {
					e.printStackTrace();
				}
				//System.out.println(jsonArray);
				for (Object obj : jsonArray) {
					CompanyShare comShare=new CompanyShare();
					jobject = (JSONObject) obj;
					String name=(String) jobject.get("name");
					Long noOfShare =  (Long) jobject.get("share number");
					comShare.setComapanyName(name);
					comShare.setNoOfShare(noOfShare);
					linkedList.add(comShare);
					
				}
				//shares.setList(linkedList);

			}
		

		
	}
	/*public void writeFile() {
		Gson gson = new Gson();
		while(linkedList!=null) {
			
		shares.setComapanyName(linkedList.getHead());
		}
		}
		shares.setList(linkedList);
		System.out.println(shares);
		String json = gson.toJson(shares);
		System.out.println(json);
		

		try {
			FileWriter file = new FileWriter("D:\\javaproject\\Java\\src\\com\\bridgelabz\\stock\\model\\Stock.json"); 
			
			//shares.setList(linkedList);

			file.write(json);
				
		} catch (IOException e) {
			e.printStackTrace();
		}

	
	
	*/
	
}
