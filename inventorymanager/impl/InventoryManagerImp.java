package com.bridgelabz.inventorymanager.impl;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.inventorymanager.interfacedata.InventoryManagerInterface;
import com.bridgelabz.inventorymanager.model.InventoryManager;

public class InventoryManagerImp implements InventoryManagerInterface {
	InventoryManager invt = new InventoryManager();

	List<InventoryManager> rice = new ArrayList<>();
	List<InventoryManager> wheat = new ArrayList<>();
	List<InventoryManager> pulses = new ArrayList<>();

	JSONArray jsonarray = new JSONArray();

	@Override
	public void fileRead() {
		try {
			JSONParser parser = new JSONParser();

			FileReader reader = new FileReader("D:\\javaproject\\Java\\src\\com\\bridgelabz\\inventorymanager\\model\\inventorymanager.json");
					
			Object obj = parser.parse(reader);
			JSONObject job = (JSONObject) obj;

			jsonarray = (JSONArray) job.get("rice");
			System.out.println(obj);
			for (Object obj1 : jsonarray) {
				InventoryManager inventory = new InventoryManager();
				JSONObject jobject = (JSONObject) obj1;
				String name = (String) jobject.get("name");
				long price = (Long) jobject.get("price");
				long weight = ((Long) jobject.get("weight"));
				inventory.setWeight(weight);

				inventory.setName(name);

				inventory.setPrice(price);

				rice.add(inventory);
				System.out.println(inventory.toString());
			}

			invt.setRice(rice);

			jsonarray = (JSONArray) job.get("wheat");
			System.out.println(obj);
			for (Object obj1 : jsonarray) {
				InventoryManager inventory = new InventoryManager();
				JSONObject jobject = (JSONObject) obj1;
				String name = (String) jobject.get("name");
				long price = (Long) jobject.get("price");
				long weight = ((Long) jobject.get("weight"));
				inventory.setWeight(weight);

				inventory.setName(name);

				inventory.setPrice(price);

				wheat.add(inventory);
				System.out.println(inventory.toString());
			}
			invt.setWheat(wheat);

			jsonarray = (JSONArray) job.get("pulses");
			System.out.println(obj);
			for (Object obj1 : jsonarray) {
				InventoryManager inventory = new InventoryManager();
				JSONObject jobject = (JSONObject) obj1;
				String name = (String) jobject.get("name");
				long price = (Long) jobject.get("price");
				long weight = (Long) jobject.get("weight");
				inventory.setWeight(weight);

				inventory.setName(name);

				inventory.setPrice(price);

				pulses.add(inventory);
				System.out.println(inventory.toString());
			}
			invt.setPulses(pulses);

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

	@Override
	public void calculate() {
invt.getRice().forEach(inventory -> {
	System.out.println(
			"Total price of " + inventory.getName() + " is " + (inventory.getPrice() * inventory.getWeight()));
});
invt.getWheat().forEach(inventory -> {
	System.out.println(
			"Total price of " + inventory.getName() + " is " + (inventory.getPrice() * inventory.getWeight()));
});
invt.getPulses().forEach(inventory -> {
	System.out.println(
			"Total price of " + inventory.getName() + " is " + (inventory.getPrice() * inventory.getWeight()));
});


	}
}