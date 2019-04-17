package com.bridgelabz.inventorymanager.main;

import com.bridgelabz.inventorymanager.impl.InventoryManagerImp;
import com.bridgelabz.inventorymanager.interfacedata.InventoryManagerInterface;

public class InventoryFactoryMain {

	public static void main(String[] args) {
		InventoryManagerInterface imp=new InventoryManagerImp();
		imp.fileRead(); 
		imp.calculate();

	}

}