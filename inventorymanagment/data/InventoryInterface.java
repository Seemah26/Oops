package com.bridgelabz.inventorymanagment.data;
public interface InventoryInterface {
    //public void add(String name, int weight);

    
	public void fileRead();
	
	public void writeFile();
	public void add(String name, double weight, double price);
	public void remove(String name);
	public void calculateInventory();
	
}