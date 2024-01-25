/**
 * BASIC COOL CAR CLASS
 *
 * @AUTHOR - Blaez Jibben
 * @DATE - 1/24/2024
 **/
import java.util.Scanner; //Scanner Class
 
abstract class coolCar
{
	String color = "N/A";
	//describes car honk noise i guess
	public abstract void carHonk();
	
	public void setCarColor(String color)
	{
		color = color;
	}

	public void displayCarColor()
	{
		System.out.println("The car color is: " + color + ".");
	}
}


class Truck extends coolCar 
{
	//truck has a annoying horn installed
	public void carHonk()
	{
		System.out.println("BEEEEEEEEEEEEEEEEEEEP TRUCK BEEEEEP\n");
	}		
}

class MiniCooper extends coolCar
{
	//MiniCooper has a not loud horn
	public void carHonk()
	{
		System.out.print("MiniCooper beep\n");
	}
}

class Demo
{
	public static void main(String[] args)
	{
		MiniCooper coop = null;
		Truck truck = null;
		String response = "";
		Scanner theRead = new Scanner(System.in);
		System.out.println("Hello. Which car would you like: Truck or MiniCooper. Please type your response\n");
		while (!(response.equals("truck") || response.equals("Truck") || response.equals("mini cooper") || response.equals("Mini Cooper") || response.equals("MiniCooper") || response.equals(("minicooper"))))
		{
			response = theRead.nextLine();
			if(!(response.equals("truck") || response.equals("Truck") || response.equals("mini cooper") || response.equals("Mini Cooper") || response.equals("MiniCooper") || response.equals(("minicooper"))))

			{
				System.out.println("Error in responce. Please choose between Truck or MiniCooper.\n"); 
			}
			else
			{
				//create object
				if(response.equals("truck") || response.equals("Truck"))
				{
					truck = new Truck();
				}
				else
				{
					coop = new MiniCooper();
				}		
				System.out.println("Thank you. You chose: " + response + ". Now please chose a color for your vehicle.\n");
				String color = theRead.nextLine();
				
				if(response.equals("truck") ||  response.equals("Truck"))
                                {
                                        truck.color = color;
                                }
                                else
                                {
                                        coop.color = color;
                                }
				
				System.out.println("Wow. " + color + ". Thats a great one. Here is some info about your car.\n");
				System.out.println("Car Type: " + response +  ". Car Color: " + color + ". Car HONK: ");
				
                                if(response.equals("truck") ||  response.equals("Truck"))
                                {
                                 truck.carHonk();       
                                }
				else
				{
				 coop.carHonk();
				}					
			}
		}

	}


}
