package com.bridgelabz.stockliststack.main;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgelabz.stockliststack.impl.StockImpl;
import com.bridgelabz.stockliststack.interfac.StockStackList;

public class StockManagement {

	public static void main(String[] args) throws IOException, ParseException {
		StockStackList stock=new StockImpl();
		stock.fileRead();

	}

}
