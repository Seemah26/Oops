package com.bridgelabz.inventorymanagement.dataimpl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.inventory.models.Inventory;
import com.bridgelabz.inventorymanagment.data.InventoryInterface;
import com.google.gson.Gson;

public class InventoryManagementImpl implements InventoryInterface {
	JSONArray jsonArray;
	List<Inventory> inventories = new ArrayList<>();

	JSONObject jobject = new JSONObject();

	public void fileRead() {
		JSONParser parser = new JSONParser();
		{

			try {
				jsonArray = (JSONArray) parser.parse(new FileReader(
						"D:\\javaproject\\Java\\src\\com\\bridgelabz\\inventory\\models\\Inventory.json"));
				System.out.println("====>>" + jsonArray);
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

			for (Object obj : jsonArray) {
				Inventory inventory = new Inventory();

				jobject = (JSONObject) obj;
				String name = (String) jobject.get("name");
				double price = ((Double) jobject.get("price")).doubleValue();
				double weight = ((Double) jobject.get("weight")).doubleValue();
				inventory.setWeight(weight); // setWeight(weight);
				inventory.setName(name);
				// System.out.println(inventory.getName());

				// System.out.println(inventory.getWeight());
				inventory.setPrice(price);
				// System.out.println(inventory.getPrice());
				inventories.add(inventory);

				System.out.println(inventory.toString());

			}
		}
	}

	public void calculateInventory() {
		inventories.forEach(inventory -> System.out.println(
				"Total price of " + inventory.getName() + "is" + (inventory.getPrice() * inventory.getWeight())));

	}

	public void writeFile() {
		Gson gson = new Gson();
		String json = gson.toJson(inventories);
		System.out.println(json);
		System.out.println("===>" + inventories);

		try (FileWriter file = new FileWriter(
				"D:\\javaproject\\Java\\src\\com\\bridgelabz\\inventory\\models\\Inventory.json")) {
			file.write(json);
			System.out.println("SuccessFully copied to JSON  Object to File......");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void add(String name, double weight, double price) {
		Inventory inventory = new Inventory();
		inventory.setName(name);
		inventory.setPrice(price);
		inventory.setWeight(weight);
		inventories.add(inventory);
		inventories.forEach(inventory1 -> System.out.println(inventory1.toString()));

	}

	@Override
	public void remove(String name) {
		Inventory inventory = new Inventory();
		System.out.println("enter the name you wan to delete");
		Scanner sc = new Scanner(System.in);
		String name1 = sc.next();

		inventories.removeIf(inventory2 -> inventory2.getName().equals(name1));
		System.out.println(inventories);
		// System.out.println(inventories);
		System.out.println("removed successfully");
		writeFile();

	}
}
