/**
 * 
 */
package application;

import persistence.VehicleRepository;
import domain.DataUser;
import domain.Vehicle;


import domain.Car;

/**
 * @author stefano
 *
 */

public class Controller {

	private VehicleRepository repository = new VehicleRepository();	
	

/**
 * Aquest mètode crea un vehicle en funció del paràmetre que se li passa i el guarda a un repositori
 * @param typeVehicle Aquest és el paràmetre que es passa el mètode per saber quin vehicle ha de crear
 * @throws Exception
 */
public void createVehicle (String typeVehicle) throws Exception {
 
	DataUser data = new DataUser(typeVehicle);
	
	if (data.getTypeVehicle().equals("car")){
	data.askDataToUser();	
	Car car = new Car(data.getPlate(),data.getBrand(),data.getColour());	
	repository.addVehicle(car);	
	
	} 
}
	

/**
 * Aquest mètode retorna el tipus de vehicle
 * @return String Retorna el tipus de vehicle
 * 
 * NOTA: mètode incomplert
 */
public String getAllVehicles() {
	String VehiclesList = "";

	if (repository == null) {
		VehiclesList = "No hi ha vehicles";

	} else {
		/*for (Vehicle vehicle : repository.getAllVehicles()) {

			if (!vehicle.getName().equals("")) {
				VehiclesList = VehiclesList + staff.getName() + ", ";

			}
		}
         */
	}

	return VehiclesList;
}



}