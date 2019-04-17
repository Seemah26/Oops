package com.bridgelabz.stockmanagement.main;

import com.bridgelabz.stockdataimpl.StockDataImpl;
import com.bridgelabz.stockinterface.StockData;

public class StockManagement {

	public static void main(String[] args) {
		StockData stock=new StockDataImpl();
		stock.fileRead();
		
		stock.calculate("SBI Bank");
	}

}
