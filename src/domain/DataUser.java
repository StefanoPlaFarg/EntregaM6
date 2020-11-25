/**
 * 
 */
package domain;
import java.util.Scanner;

/**
 * 
 * <h1>DataUser</h1>
 * Aquesta classe serveix per agafar els par�metres que l'usuari introdueix 
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
	 * M�tode que pregunta les dades d'un vehicle (marca,color, matr�cula) a
	 * l'usuari i les emmagatzema internament
	 * 
	 * @throws Exception
	 * 
	 *NOTE: Falta implementar el tipus d'excepci� que llen�a
	 * en cas d'introduir malament les dades
	 */
	public void askDataToUser() throws Exception {
		// TODO: Llen�ar Exception en cas que la marca, color o matr�cula no encaixin
		if (typeVehicle.equals("car")) {

			System.out.println("De quina marca �s el cotxe?");
			setBrand(myObj.nextLine().toLowerCase());
			System.out.println("De quina color �s el cotxe?");
			setColor(myObj.nextLine().toLowerCase());
			System.out.println("Quina matr�cula t� el cotxe?");
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
