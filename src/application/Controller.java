/**
 * 
 */
package application;

import persistence.VehicleRepository;
import domain.DataUser;
import domain.Vehicle;
import domain.Car;

/**
 * <h1>Controller</h1> Aquesta classe es la classe de control del programa i
 * s'encarga de crear el repositori de vehicles, crear vehicles al repositori i
 * accedir-hi
 * 
 * @author stefano
 *
 */

public class Controller {

	private VehicleRepository repository = new VehicleRepository();

	/**
	 * Aquest mètode crea un vehicle en funció del paràmetre (tipus de vehicle) que
	 * se li passa i el guarda a un repositori de vehicles
	 * 
	 * @param typeVehicle paràmetre que es passa el mètode per saber quin vehicle ha
	 *                    de crear
	 * @throws Exception
	 */
	public void createVehicle(String typeVehicle) throws Exception {

		DataUser data = new DataUser(typeVehicle);

		if (data.getTypeVehicle().equals("car")) {
			data.askBasicCarDataToUser(); // Preguntem les dades bàsiques del cotxe a l'usuari
			Car car = new Car(data.getTypeVehicle(), data.getPlate(), data.getBrand(), data.getColor()); // Passem dades
																											// de marca,
																											// color i
																											// matrícula
																											// al
																											// constructor
																											// a un
																											// objecte
																											// de tipus
																											// car
			data.askWheelDataToUser(); // Preguntem les dades bàsiques de la roda l'usuari
			car.createWheels(data.getFrontWheelBrand(), data.getBackWheelBrand(), data.getFrontWheelDiameter(),
					data.getBackWheelDiameter());
			repository.addVehicle(car);

		}
	}

	/**
	 * Aquest mètode retorna el tipus dels vehicles emmaguetzamats al repositori de
	 * vehicles
	 * 
	 * @return String Retorna el tipus de vehicle
	 * 
	 */
	public String getAllTypeVehicles() {
		String VehiclesList = "";

		if (repository == null) {
			VehiclesList = "No hi ha vehicles";

		} else {
			for (Vehicle vehicle : repository.getAllVehicles()) {

				if (!vehicle.getTypeVehicle().equals("")) {
					VehiclesList = VehiclesList + vehicle.getTypeVehicle() + " ";

				}
			}

		}

		return VehiclesList;
	}

	/**
	 * Aquest mètode retorna el tipus de rodes de cada vehicle emmaguetzamats al
	 * repositori de vehicles
	 * 
	 * @return String Retorna el tipus de vehicle
	 * 
	 */
	public String getAllWheelsFromVehicles() {
		String wheelsVehicleList = "";

		if (repository == null) {
			wheelsVehicleList = "No hi ha vehicles";

		} else {
			for (Vehicle vehicle : repository.getAllVehicles()) {
				Car car = (Car) vehicle;
				if (!vehicle.getTypeVehicle().equals("")) {
					wheelsVehicleList = wheelsVehicleList + car.getFrontWheelBrand() + "," + car.getFrontWheelDiameter()
							+ " " + car.getFrontWheelBrand() + "," + car.getBackWheelDiameter() + " ";

				}
			}

		}

		return wheelsVehicleList;
	}


}