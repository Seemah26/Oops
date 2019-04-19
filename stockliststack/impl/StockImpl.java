package com.bridgelabz.stockliststack.impl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.listofcompanyshare.model.CompanyShare;
import com.bridgelabz.opps.commonmethods.CustomLinkedList;
import com.bridgelabz.stock.model.StockModel;
import com.bridgelabz.stockdataimpl.GenericStack;
import com.bridgelabz.stockliststack.interfac.StockStackList;
import com.bridgelabz.stockliststack.model.StockStack;
import com.bridgelabz.util.datastructure.StackImplementation;

public class StockImpl implements StockStackList{
	GenericStack<StockStack> stack=new GenericStack<>();
	CustomLinkedList<StockStack> linkedList = new CustomLinkedList<>();

	List<StockStack> stockList = new ArrayList<>();
	StockModel stockmodel=new StockModel();
	JSONObject jobject = new JSONObject();
	@Override
	public void fileRead() throws IOException, ParseException {
		JSONParser parser = new JSONParser();
		
				FileReader fr= new FileReader("D:\\javaproject\\Java\\src\\com\\bridgelabz\\stock\\model\\Stock.json");
				JSONArray jsonArray = (JSONArray) parser.parse(fr);
				for (Object obj : jsonArray) {
					StockStack stockmodel = new StockStack();
					jobject = (JSONObject) obj;
					String name = (String) jobject.get("name");
					Long noOfShare =  (Long) jobject.get("share number");
					Long price = ((Long) jobject.get("share price"));
					stockmodel.setStockName(name); 
					stockmodel.setNoOfShare(noOfShare);
					stockmodel.setPrice(price);
					//System.out.println(stockmodel.toString());
					 stack.push(stockmodel);
					 //stack.toString();
					 System.out.println("content inside stack");
					 System.out.println(stack.peek().toString());
					linkedList.add(stack.peek());
					
					
					
				}
		/*		System.out.println("content inside stack");
			System.out.println(stack);*/
			System.out.println(linkedList.toString());
			//System.out.println("content of linked list"+linkedList);
			
			
	}
	@Override
	public void purchase(String product) {
		
		
		
	}

	@Override
	public void sold(String product) {
		
	}

}
