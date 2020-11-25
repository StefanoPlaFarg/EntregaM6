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
		
		try {
		controller.createVehicle("car");
		}catch (Exception e){
			System.out.println ("No s'ha pogut crear el cotxe correctament" );
			
		}finally {
			
			System.out.println ("S'ha creat el cotxe correctament" );
			
		}
		

	}

}
