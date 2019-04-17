package com.bridgelabz.stock.model;

public class StockModel {
private String stockName;
private Long noOfShare;
private Long price;
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
public String toString() {
    return   "name  : "+stockName+"\n"
            +"number of share: "+noOfShare+"\n"
            +"price : "+price+"\n" ;
}

}
