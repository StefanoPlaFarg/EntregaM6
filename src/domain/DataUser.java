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
	private String carNumber;
	Scanner myObj = new Scanner(System.in);
	
	public DataUser(String typeVehicle)throws Exception {
		this.typeVehicle=typeVehicle;
		
		if (isCar()) {
			
			DataCarToStore();
			
		}else {
			
			throws Exception;
		}
		
	}
	
	private boolean isCar() {
		
		return this.typeVehicle.equals("Car");
	}
	
    private void DataCarToStore() {
		
    	System.out.println ("De quina marca �s el cotxe?" );
    	carBrand = myObj.nextLine();
    	System.out.println ("De quina color �s el cotxe?" );
    	carColour = myObj.nextLine();
    	System.out.println ("Quina matr�cula t� el cotxe?" );
    	carNumber = myObj.nextLine();
	}
	
	

}
