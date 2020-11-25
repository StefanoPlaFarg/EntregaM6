/**
 * 
 */
package domain;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * <h1>DataUser</h1> Aquesta classe serveix per agafar els paràmetres que
 * l'usuari introdueix a la consola per crear un vehicle
 * 
 * 
 * @author stefano
 *
 */
public class DataUser {

	private String typeVehicle;
	private String brand;
	private String color;
	private String plate;
	private String frontWheelBrand;
	private String backWheelBrand;
	private float frontWheelDiameter;
	private float backWheelDiameter;

	List<Wheel> frontWheels = new ArrayList<Wheel>();
	List<Wheel> backWheels = new ArrayList<Wheel>();
	Scanner myObj = new Scanner(System.in);

	/**
	 * Constructor DataUser
	 */
	public DataUser() {

		typeVehicle = null;
		brand = null;
		color = null;
		plate = null;
		frontWheels = null;
		backWheels = null;
		frontWheelBrand = null;
		backWheelBrand = null;
		frontWheelDiameter = 0;
		backWheelDiameter = 0;
	}

	/**
	 * Constructor de DataUser
	 * 
	 * @param typeVehicle
	 * @throws Exception
	 */
	public DataUser(String typeVehicle) throws Exception {

		if (typeVehicle.equals("car")) {

			this.typeVehicle = typeVehicle.toLowerCase();

		}

		else {
			throw new Exception();
		}

	}

	/**
	 * 
	 * Mètode que pregunta les dades d'un vehicle (marca,color, matrícula) a
	 * l'usuari i les emmagatzema internament
	 * 
	 * @throws Exception
	 * 
	 *                   NOTE: Falta implementar el tipus d'excepció que llença en
	 *                   cas d'introduir malament les dades
	 */
	public void askBasicCarDataToUser() throws Exception {
		// TODO: Llençar Exception en cas que la marca, color o matrícula no encaixin
		if (typeVehicle.equals("car")) {

			System.out.println("De quina marca és el cotxe?");
			setBrand(myObj.nextLine().toLowerCase());
			System.out.println("De quina color és el cotxe?");
			setColor(myObj.nextLine().toLowerCase());
			System.out.println("Quina matrícula té el cotxe?");
			setPlate(myObj.nextLine().toLowerCase());

		}

		else {
			throw new Exception();
		}
	}

	/**
	 * 
	 * Mètode que pregunta les dades de les rodes davanteres i posteriors (marca i
	 * diàmetre) a l'usuari i les emmagatzema internament
	 * 
	 * @throws Exception
	 * 
	 *                   NOTE: Falta implementar el tipus d'excepció que llença en
	 *                   cas d'introduir malament les dades
	 */
	public void askWheelDataToUser() throws Exception {

		if (typeVehicle.equals("car")) {

			System.out.println("Quina marca tenen els pneumatics davanters?");
			setFrontWheelBrand(myObj.nextLine().toLowerCase());
			System.out.println("Quina diametre tenen els pneumatics davanters?");
			setFrontWheelDiameter(myObj.nextLine());
			System.out.println("Quina marca tenen els pneumatics posteriors?");
			setBackWheelBrand(myObj.nextLine().toLowerCase());
			System.out.println("Quina diametre tenen els pneumatics posteriors?");
			setBackWheelDiameter(myObj.nextLine());
		}

		else {
			throw new Exception();
		}
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
		this.typeVehicle = typeVehicle;
	}

	public void setPlate(String plate) {
		this.plate = plate;

	}

	public void setBrand(String brand) {
		this.brand = brand;

	}

	public void setColor(String colour) {
		this.color = colour;

	}

	public String getFrontWheelBrand() {
		return frontWheelBrand;

	}

	public String getBackWheelBrand() {
		return backWheelBrand;

	}

	public float getFrontWheelDiameter() {
		return frontWheelDiameter;

	}

	public float getBackWheelDiameter() {
		return backWheelDiameter;

	}

	public void setFrontWheelBrand(String frontWheelBrand) {
		this.frontWheelBrand = frontWheelBrand;

	}

	public void setBackWheelBrand(String backWheelBrand) {
		this.backWheelBrand = backWheelBrand;

	}

	public void setFrontWheelDiameter(String frontWheelDiameter) {
		this.frontWheelDiameter = Float.parseFloat(frontWheelDiameter);

	}

	public void setBackWheelDiameter(String backWheelDiameter) {
		this.backWheelDiameter = Float.parseFloat(backWheelDiameter);

	}

}
