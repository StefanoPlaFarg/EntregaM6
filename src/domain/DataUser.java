/**
 * 
 */
package domain;
import java.util.Scanner;

/**
 * @author stefano
 *
 */
public class DataUser {

	private String typeVehicle;
	private String carBrand;
	private String carColour;
	private String carPlate;
	Scanner myObj = new Scanner(System.in);
	
	
	public  DataUser() {
		
		typeVehicle=null;
		carBrand = null;
		carColour = null;
		carPlate = null;
	}
	
	
	public DataUser(String typeVehicle)throws Exception {
		
		if (typeVehicle.equals("car")) {
		
		this.typeVehicle=typeVehicle.toLowerCase();
		
		}
		
		else {
			throw new Exception();
		}
				
	}
	
	
	/**
	 * 
	 * M�tode que pregunta les dades d'un vehicle a l'usuari i les emmagatzema
	 * @throws Exception
	 * 
	 * NOTE: Falta implementar llen�ar una excepci� segons si s'han introdu�t malament les dades 
	 */
	public void askDataToUser() throws Exception{
		//TODO: Llen�ar Exception en cas que la marca, color o matr�cula no encaixin
		if (typeVehicle.equals("car")) {
			
			System.out.println ("De quina marca �s el cotxe?" );
			setBrand(myObj.nextLine().toLowerCase());
			System.out.println ("De quina color �s el cotxe?" );
			setColour(myObj.nextLine().toLowerCase());
	    	System.out.println ("Quina matr�cula t� el cotxe?" );
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
		return carPlate;

	}

	public String getBrand() {
		return carBrand;

	}

	public String getColour() {
		return carColour;

	}
    
	public void setTypeVehicle(String typeVehicle) {
		this.typeVehicle=typeVehicle;
	}

	public void setPlate(String plate) {
		this.carPlate=plate;

	}

	public void setBrand(String brand) {
		this.carBrand=brand;

	}

	public void setColour(String colour) {
		this.carColour=colour;

	}
    
    
    

}
