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
	 * Constructor de DataUser, el qual crea un objecte DataUser y emmagatzema el tipus de vehicle.
	 * 
	 * @param typeVehicle 
	 * @throws Exception Llança una excepció en cas que el @param sigui diferent de "car"
	 * NOTE: Per millorar el mètode es podria desenvolupar l'excepció i que es llençaria en
	 * cas d'introduir un tipus de vehicle que no sigui car
	 */
	public DataUser(String typeVehicle) throws Exception {

		if (typeVehicle.toLowerCase().equals("car")) {

			this.typeVehicle = typeVehicle.toLowerCase();

		}

		else {
			throw new Exception("El vehcile no és de tipus cotxe");
		}

	}

	/**
	 * 
	 * Mètode que pregunta les dades d'un vehicle (marca,color, matrícula) a
	 * l'usuari i les emmagatzema internament
	 * 
	 * @throws Exception
	 * 
	 * NOTE: Per millorar el mètode es podria desenvolupar l'excepció i que es llençaria en
	 * cas que el tipus de vehicle no sigui de tipus cotxe
	 */
	public void askBasicCarDataToUser() throws Exception {
		// TODO: Llençar Exception en cas que la marca, color o matrícula no encaixin
		if (typeVehicle.equals("car")) {

			System.out.println("De quina marca és el cotxe?");
			setBrand(myObj.nextLine().toLowerCase());
			System.out.println("De quina color és el cotxe?");
			setColor(myObj.nextLine().toLowerCase());			
			System.out.println("Quina matrícula té el cotxe?");			
			//checkPlate (myObj.nextLine().toLowerCase());
			checkPlate (myObj.nextLine());
		}

		else {
			throw new Exception("El vehicle no és de tipus cotxe");
		}
	}

	
	
	
	private void checkPlate (String userPlateToCheck) throws Exception  {		
		
		//String userPlate =userPlateToCheck.toLowerCase();
		String userPlate =userPlateToCheck;
		
		
		if (checkFourNumbers(userPlate)&& checkTwoThreeLetters(userPlate)) {
			setPlate(userPlate);
		}
		
		else {
			
			throw new Exception("Matrícula de cotxe mal introduïda");
		}
		
	}
	
	
	private boolean checkFourNumbers(String userPlate) {
		int numberCount=0;
		
		int length = 6;
		
		for (int i = 0; i <= length; i++) {
			if (isNumber(userPlate.charAt(i))) {

				numberCount++;

			}

		}
		
			
		return numberCount==4;
		
		
	}
	
	
	
    private boolean checkTwoThreeLetters(String userPlate) {
		
       int numberCount=0;
		
		for (int i = 0; i <= userPlate.length(); i++) {
			if (isCharacter(userPlate.charAt(i))) {

				numberCount++;

			}

		}
		
		
		return numberCount==2 || numberCount==3;
	}
	
	
    private boolean isCharacter (char letter) {
    	boolean flag=false;
    	switch (letter) {
    	case 'a':
    	case 'b':
    	case 'c':	
    	case 'd':
    	case 'e':
    	case 'f':	
    	case 'g':
    	case 'h':
    	case 'i':	
    	case 'j':
    	case 'k':
    	case 'l':	    		
    	case 'm':
    	case 'n':
    	case 'o':    	
    	case 'p':
    	case 'q':	
    	case 'r':
    	case 's':
    	case 't':	
    	case 'u':
    	case 'v':
    	case 'w':	
    	case 'x':
    	case 'y':
    	case 'z':    		
    		flag=true;
    	default:
    		flag=false;   	
    	}    	
    	return flag;    	 	
    	
    }
    
	private boolean isNumber(char letter) {
		boolean flag = false;
		switch (letter) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			flag = true;
		default:
			flag = false;

		}

		return flag;

	}

	/**
	 * 
	 * Mètode que pregunta les dades de les rodes davanteres i posteriors (marca i
	 * diàmetre) a l'usuari i les emmagatzema internament
	 * 
	 * @throws Exception
	 * 
	 * NOTE: Falta implementar el tipus d'excepció que llença en
	 * cas d'introduir malament les dades
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
