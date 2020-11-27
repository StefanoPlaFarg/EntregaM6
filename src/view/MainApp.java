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
	 * <h1>MainApp</h1>
	 * Classe que crea un vehicle de tipus "car", l'emmagatzema en un repositori de Vehicles i imprimeix 
	 * una llista de tots els vehicles guardats (imprimeix paràmetre tipus vehicle) i les característiques de les rodes
	 * 
	 * @param args
	 */
	
	private static Controller controller = new Controller();
	
	public static void main(String[] args) {
		
		System.out.println ("Comença el programa" );
		
		try {
			controller.createVehicle("car");//Creem el primer cotxe
			System.out.println ("S'ha creat el cotxe correctament" );	
			String allTypeVehiclesStored = controller.getAllTypeVehicles();
			String allWheelsStored = controller.getAllWheelsFromVehicles();
			System.out.println("Llista de vehicles guardats: " + allTypeVehiclesStored );	
			System.out.println("Llista de rodes de cada vehicle: " + allWheelsStored + " \n");
		
		}catch (Exception e){
			System.out.println (e);
			
		}finally {
			System.out.println ("Programa finalitzat" );   		
			
		}
		
		

	}

}
