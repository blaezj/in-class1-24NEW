/**
 * BASIC COOL CAR CLASS
 *
 * @AUTHOR - Blaez Jibben
 * @DATE - 1/24/2024
 **/
import java.util.Scanner; //Scanner Class
 
class coolCar
{
	String color = "N/A";
	//describes car honk noise i guess
	public abstract void carHonk();
	
	public void setCarColor(String color);
	{
		coolCar.color = color;
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
		System.out.println("BEEEEEEEEEEEEEEEEEEEP TRUCK BEEEEEP");
	}		
}

class MiniCooper extends coolCar
{
	//MiniCooper has a not loud horn
	public void carHonk()
	{
		System.out.print("MiniCooper beep");

}

class Demo
{
	public static void main(String[] args)
	{
		Scanner theRead = new Scanner(System.in);
		Scanner.out.println("finish this");

	}


}
