/**
 * 
 */
package persistence;

import domain.Vehicle;
import java.util.ArrayList;




/**
 * Classe que permet guardar vehicles en una ArraList i que permet accedir a ells
 * @author stefano
 *
 */
public class VehicleRepository {

	private static ArrayList<Vehicle> vehicleRepository=new ArrayList<>();
	
	public VehicleRepository(){
		
	}
	
	/**
	 * Mètode que retorna una còpia del repositori vehicleRepository 
	 * @return ArrayList<Vehicle>
	 */
	public ArrayList<Vehicle> getAllVehicles(){
		return new ArrayList<>(vehicleRepository);
	}
	
	
	public void addVehicle(Vehicle vehicle) throws Exception{
		if(vehicle==null) throw new Exception();
		vehicleRepository.add(vehicle);
	}
	
	
	
	
}
