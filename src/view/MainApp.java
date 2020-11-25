/**
 * 
 */
package view;

import application.Controller;

/**
 * @author stefano
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	
	private static Controller controller = new Controller();
	
	public static void main(String[] args) {
		
		System.out.println ("Comença el programa" );
		
		controller.createCar(controller.getDataToCreateVehicle("Car"));
		
		
		
		

	}

}
