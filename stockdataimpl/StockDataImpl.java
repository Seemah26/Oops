package com.bridgelabz.stockdataimpl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.stock.model.StockModel;
import com.bridgelabz.stockinterface.StockData;

public class StockDataImpl implements StockData {
	JSONArray jsonArray;
	List<StockModel> stockList = new ArrayList<>();
	StockModel stock=new StockModel();
	JSONObject jobject = new JSONObject();
	@Override
	public void fileRead() {
		JSONParser parser = new JSONParser();
		{

			try {
				FileReader fr= new FileReader("D:\\javaproject\\Java\\src\\com\\bridgelabz\\stock\\model\\Stock.json");
				jsonArray = (JSONArray) parser.parse(fr);
				System.out.println(jsonArray);
				for (Object obj : jsonArray) {
					StockModel stockmodel = new StockModel();
					jobject = (JSONObject) obj;
					String name = (String) jobject.get("name");
					Long noOfShare =  (Long) jobject.get("share number");
					Long price = ((Long) jobject.get("share price"));
					stockmodel.setStockName(name);   //setWeight(weight);
					stockmodel.setNoOfShare(noOfShare);
					stockmodel.setPrice(price);
					System.out.println(stockmodel.toString());
					stockList.add(stockmodel);
				}


			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	@Override
	public void calculate(String name) {
		//System.out.println("--->>"+stockList);
		stockList.forEach(stocks -> {
			System.out.println("Ttal share of " + stocks.getStockName() + "is" +(stocks.getNoOfShare()*stocks.getPrice()));
		});
		//System.out.println("===>"+stockList);

	}

	@Override
	public void write() {


	}

}
