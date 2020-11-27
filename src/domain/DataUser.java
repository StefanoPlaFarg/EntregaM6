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

	List<Wheel> frontWheels = new ArrayList<Wheel>();//repositori de les dues rodes davanteres
	List<Wheel> backWheels = new ArrayList<Wheel>();//repositori de les dues rodes posteriors
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
	 *  
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
	 * 
	 */
	public void askBasicCarDataToUser() throws Exception {
		// TODO: Llençar Exception en cas que la marca, color o matrícula no encaixin
		if (typeVehicle.equals("car")) {

			System.out.println("De quina marca és el cotxe?");
			setBrand(myObj.nextLine().toLowerCase());
			System.out.println("De quina color és el cotxe?");
			setColor(myObj.nextLine().toLowerCase());			
			System.out.println("Quina matrícula té el cotxe?");		
			checkPlate (myObj.nextLine().toLowerCase()); //Comprovem si la matrícula compleix uns requeriments
		}

		else {
			throw new Exception("El vehicle no és de tipus cotxe");
		}
	}

	
	
	
	/**
	 * Metode que comproba si la matrícula introduida per l'usuari té 4 números i 2 o 3 lletres de l'abeçadari (anglès)
	 * Ex: 1111dd o 2145bsd són exemple de matrícules correctes
	 * 
	 * @param userPlateToCheck La matrícula introduida per l'usuari
	 * @throws Exception
	 */
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
	
	
	/**
	 * Mètode que comprova si la matrícula introduïda per l'usuari te 4 números
	 * @param userPlate
	 * @return boolean
	 */
	private boolean checkFourNumbers(String userPlate) {
		int numberCount = 0;

		for (int i = 0; i < userPlate.length(); i++) {
			if (isNumber(userPlate.charAt(i))) {

				numberCount++;

			}

		}

		return numberCount == 4;

	}
	
	
    /**
     * Mètode que comprova si la matrícula introduïda per l'usuari te 2 o 3 lletres
     * @param userPlate
     * @return boolean
     */
	private boolean checkTwoThreeLetters(String userPlate) {

		int numberCount = 0;

		for (int i = 0; i < userPlate.length(); i++) {
			if (isCharacter(userPlate.charAt(i))) {

				numberCount++;

			}

		}

		return numberCount == 2 || numberCount == 3;
	}
	
    /**
     * Metode que comprova si un caracter es una lletra de l'abeçadari (angles)
     * @param letter
     * @return boolean
     */
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
    		break;
    	default:
    		flag=false;   	
    	}    	
    	return flag;    	 	
    	
    }
    
	/**
	 * Metode que comprova si un caracter és un número
	 * @param letter
	 * @return boolean
	 */
	private boolean isNumber(char letter) {
		boolean flag = false;
		switch (letter) {
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			flag = true;
			break;
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
			checkDiameter (myObj.nextLine().toLowerCase(),"frontWheels" ); //Comprovem si el diametre de la roda ha de ser superior a 0.4 i inferior a 4 			
			System.out.println("Quina marca tenen els pneumatics posteriors?");
			setBackWheelBrand(myObj.nextLine().toLowerCase());
			System.out.println("Quina diametre tenen els pneumatics posteriors?");
			checkDiameter (myObj.nextLine().toLowerCase(),"backWheels" ); //Comprovem si el diametre de la roda ha de ser superior a 0.4 i inferior a 4 
		}

		else {
			throw new Exception("Les rodes introduides no formen de cap tipus de vehicle");
		}
	}
	
	/**
	 * Metode que comprova si el diametre de les rodes són entre 0.4 i 4 i les assigna internament
	 * @param diameter
	 * @param tire Roda davantera o posterior
	 * @throws Exception
	 */
	private void checkDiameter(String diameter, String tire) throws Exception {

		float diam = Float.parseFloat(diameter);

		if (tire.equals("backWheels") && (diam >= 0.4 && diam <= 4)) {

			setBackWheelDiameter(diameter);

		}

		else if (tire.equals("frontWheels") && (diam >= 0.4 && diam <= 4)) {

			setFrontWheelDiameter(diameter);

		}

		else {
			throw new Exception("Diametre mal introduit");
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
