package com.bridgelabz.inventorymanager.model;
import java.util.List;

public class InventoryManager {
	private String name;
	private long weight;
	private long price;
	private List<InventoryManager> rice;
	private List<InventoryManager> pulses;

	private List<InventoryManager> wheat;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getWeight() {
		return weight;
	}

	public void setWeight(long weight) {
		this.weight = weight;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "name: " + name + "\n "
				+ "weight: " + weight + "\n "
						+ "price: " + price + "";
	}

	public List<InventoryManager> getRice() {
		return rice;
	}

	public void setRice(List<InventoryManager> rice) {
		this.rice = rice;
	}

	public List<InventoryManager> getPulses() {
		return pulses;
	}

	public void setPulses(List<InventoryManager> pulses) {
		this.pulses = pulses;
	}

	public List<InventoryManager> getWheat() {
		return wheat;
	}

	public void setWheat(List<InventoryManager> wheat) {
		this.wheat = wheat;
	}
}