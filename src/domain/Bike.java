package domain;

import java.util.ArrayList;
import java.util.List;

public class Bike extends Vehicle {

	public Bike() {
		super();
	}
	
	
	public Bike(String plate, String brand, String color) throws Exception {
		super(plate, brand, color);
	}
	
	public Bike(String typeVehicle, String plate, String brand, String color) throws Exception {
		super(plate, brand, color);
		this.typeVehicle= typeVehicle;
	}
	
public void createWheels(String frontWheelBrand, String backWheelBrand, float frontWheelDiameter, float backWheelDiameter ) throws Exception {
		
		Wheel frontWheel = new Wheel(frontWheelBrand,frontWheelDiameter);
		Wheel backWheel = new Wheel(backWheelBrand,backWheelDiameter);
		List<Wheel> frontWheelList = new ArrayList<Wheel>();
		List<Wheel> backWheelList = new ArrayList<Wheel>();
		frontWheelList.add(frontWheel);//add front Wheel		
		backWheelList.add(backWheel);//add back Wheel		
		addWheels (frontWheelList,backWheelList);
	}
	
	
	private void addWheels(List<Wheel> frontWheelsList, List<Wheel> backWheelsList) throws Exception {
		addOneWheel(frontWheelsList);
		addOneWheel(backWheelsList);
	}

	private void addOneWheel(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 1)
			throw new Exception();

		Wheel wheel= wheels.get(0);
		
		this.wheels.add(wheel);
		
	}
	
	
	public String getFrontWheelBrand() {
		return wheels.get(0).getBrand();

	}
	
	public String getBackWheelBrand() {
		 return wheels.get(1).getBrand();

	}
	
	public double getFrontWheelDiameter() {
		return wheels.get(0).getDiameter();

	}
	
	public double getBackWheelDiameter() {
		return wheels.get(1).getDiameter();

	}
	
	
}
