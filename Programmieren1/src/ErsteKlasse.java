import java.util.Scanner;

import java.util.*;
public class Programmieren1

	public static void main(String[]args) {

			Scanner sc = new Scanner (System.in);
			System.out.print("geben Sie die Temperatur in Farenheit an");
			float fahrenheit = sc.nextFloat();
			
			float celsius = fahrenheit -273;

					
			System.out.print("die Temperatur in Celsius beträgt "+celsius);
	}
}
