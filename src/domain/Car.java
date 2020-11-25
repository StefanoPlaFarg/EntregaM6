package domain;

import java.util.ArrayList;
import java.util.List;


public class Car extends Vehicle {

	
	public Car() {
		super();
	}
	
	
	public Car(String plate, String brand, String color) throws Exception {
		super(plate, brand, color);
	}
	
	public Car(String typeVehicle, String plate, String brand, String color) throws Exception {
		super(plate, brand, color);
		this.typeVehicle= typeVehicle;
	}
	
	public void createWheels(String frontWheelBrand, String backWheelBrand, float frontWheelDiameter, float backWheelDiameter ) throws Exception {
		
		Wheel frontWheel = new Wheel(frontWheelBrand,frontWheelDiameter);
		Wheel backWheel = new Wheel(backWheelBrand,backWheelDiameter);
		List<Wheel> frontWheelsList = new ArrayList<Wheel>();
		List<Wheel> backWheelsList = new ArrayList<Wheel>();
		frontWheelsList.add(frontWheel);//right front Wheel
		frontWheelsList.add(frontWheel);//left front Wheel
		backWheelsList.add(backWheel);//right back Wheel
		backWheelsList.add(backWheel);//left back Wheel
		addWheels (frontWheelsList,backWheelsList);
	}
	
	
	private void addWheels(List<Wheel> frontWheelsList, List<Wheel> backWheelsList) throws Exception {
		addTwoWheels(frontWheelsList);
		addTwoWheels(backWheelsList);
	}

	private void addTwoWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new Exception();

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);

		if (!rightWheel.equals(leftWheel))
			throw new Exception();

		this.wheels.add(rightWheel);
		this.wheels.add(leftWheel);
	}
	
	
	public String getFrontWheelBrand() {
		return wheels.get(0).getBrand();

	}
	
	public String getBackWheelBrand() {
		 return wheels.get(2).getBrand();

	}
	
	public double getFrontWheelDiameter() {
		return wheels.get(0).getDiameter();

	}
	
	public double getBackWheelDiameter() {
		return wheels.get(2).getDiameter();

	}
	

}
