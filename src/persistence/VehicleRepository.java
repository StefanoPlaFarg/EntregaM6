/**
 * 
 */
package persistence;

import domain.Vehicle;
import java.util.ArrayList;




/**
 * @author stefano
 *
 */
public class VehicleRepository {

	private static ArrayList<Vehicle> vehicleRepository=new ArrayList<>();
	
	public VehicleRepository(){
		
	}
	
	public ArrayList<Vehicle> getAllVehicles(){
		return new ArrayList<>(vehicleRepository);
	}
	
	
	public void addVehicle(Vehicle vehicle) throws Exception{
		if(vehicle==null) throw new Exception();
		vehicleRepository.add(vehicle);
	}
	
	
	
	
}
