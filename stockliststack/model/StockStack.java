package com.bridgelabz.stockliststack.model;

import java.util.List;

public class StockStack {
	private String stockName;
	private Long noOfShare;
	private Long price; 
	private List<StockStack> stockList;
	public List<StockStack> getStockList() {
		return stockList;
	}
	public void setStockList(List<StockStack> stockList) {
		this.stockList = stockList;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public Long getNoOfShare() {
		return noOfShare;
	}
	public void setNoOfShare(Long noOfShare) {
		this.noOfShare = noOfShare;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
}
