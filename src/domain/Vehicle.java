package domain;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

	protected String typeVehicle;
	protected String plate;
	protected String brand;
	protected String color;
	private static int COUNTER_MEMBERS = 1;
	protected int id;
	protected List<Wheel> wheels = new ArrayList<Wheel>();

	public Vehicle(String plate, String brand, String color) throws Exception {
		if (plate.equals(""))
			throw new Exception();
		if (brand.equals(""))
			throw new Exception();
		if (color.equals(""))
			throw new Exception();
		
		this.plate = plate;
		this.brand = brand;
		this.color = color;
		id = COUNTER_MEMBERS;
		COUNTER_MEMBERS++;
	}
	
	public Vehicle() {
		this.plate = null;
		this.brand = null;
		this.color = null;
		id = COUNTER_MEMBERS;
		COUNTER_MEMBERS++;
	}
	
	public String getTypeVehicle() {
		return typeVehicle;

	}

	public String getPlate() {
		return plate;

	}

	public String getBrand() {
		return brand;

	}

	public String getColor() {
		return color;

	}
    
	public void setTypeVehicle(String typeVehicle) {
		this.typeVehicle=typeVehicle;
	}

	public void setPlate(String plate) {
		this.plate=plate;

	}

	public void setBrand(String brand) {
		this.brand=brand;

	}

	public void setColor(String color) {
		this.color=color;

	}
	
}
