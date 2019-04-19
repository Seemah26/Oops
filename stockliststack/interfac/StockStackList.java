package com.bridgelabz.stockliststack.interfac;

import java.io.IOException;

import org.json.simple.parser.ParseException;

public interface StockStackList {
	public void purchase(String product);
	public void sold(String product);
	public void fileRead() throws IOException, ParseException;
}
