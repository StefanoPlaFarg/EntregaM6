/**
 * 
 */
package domain;
import java.util.Scanner;

/**
 * 
 * <h1>DataUser</h1>
 * Aquesta classe serveix per agafar els paràmetres que l'usuari introdueix 
 * a la consola per crear un vehicle
 * 
 * 
 * @author stefano
 *
 */
public class DataUser {

	private String typeVehicle;
	private String Brand;
	private String Color;
	private String Plate;
	Scanner myObj = new Scanner(System.in);
	
	
	/**
	 * Constructor DataUser
	 */
	public  DataUser() {
		
		typeVehicle=null;
		Brand = null;
		Color = null;
		Plate = null;
	}
	
	
	
	/**
	 * Constructor de DataUser 
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
	 *NOTE: Falta implementar el tipus d'excepció que llença
	 * en cas d'introduir malament les dades
	 */
	public void askDataToUser() throws Exception {
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
	
	
	public String getTypeVehicle() {
		return typeVehicle;

	}

	public String getPlate() {
		return Plate;

	}

	public String getBrand() {
		return Brand;

	}

	public String getColor() {
		return Color;

	}
    
	public void setTypeVehicle(String typeVehicle) {
		this.typeVehicle=typeVehicle;
	}

	public void setPlate(String plate) {
		this.Plate=plate;

	}

	public void setBrand(String brand) {
		this.Brand=brand;

	}

	public void setColor(String colour) {
		this.Color=colour;

	}
    
    
    

}
