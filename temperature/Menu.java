package com.octaviomagana.Temperature;

import java.util.*;

public class Menu {

	public void display() {

		Scanner scan = new Scanner(System.in);
		int option = 0;
		double inputTemp;
		boolean errorflag = false;
		Temperature temp = new Temperature(); // Creating temperature instance

		do {

			System.out.println("Choose Temperature Conversion option:");
			System.out.println("Option [1]: Fahrenheit to Celsius. ");
			System.out.println("Option [2]: Celsius to Fahrenheit. ");
			System.out.println("Option [3]: Exit the program. ");

			if (scan.hasNextInt()) {

				option = scan.nextInt();

				switch (option) {

				case 1:
					do {
						System.out.println("Option [1]: Fahrenheit to Celsius.");
						System.out.print("Enter a Fahrenheit temperature: ");

						if (scan.hasNextDouble()) {
							inputTemp = scan.nextDouble();
							temp.setFarenheit(inputTemp);
							temp.setCelsius((temp.getFarenheit() - 32) / 1.8);
							System.out.println("Your temperature in Celsius: " + temp.getCelsius());
							errorflag = false;

						} else {
							System.out.println("Your temperature has to be numeric. Try again");
							scan.nextLine();
							scan.nextLine();
							errorflag = true;
						}
					} while (errorflag == true);
					break;
				case 2:
					do {
						System.out.println("Option [2]: Celsius to Fahrenheit.");
						System.out.print("Enter a Celsius temperature: ");
						if (scan.hasNextDouble()) {
							inputTemp = scan.nextDouble();
							temp.setCelsius(inputTemp);
							temp.setFarenheit(temp.getCelsius() * 1.8 + 32);
							System.out.println("Your temperature in Farenheit: " + temp.getFarenheit());
							errorflag = false;
						} else {
							System.out.println("Your temperature has to be numeric. Try again");
							scan.nextLine();
							scan.nextLine();
							errorflag = true;
						}
					} while (errorflag == true);
					break;
				case 3:
					System.out.println("You chose option 3. Exit");
					break;
				default:
					System.out.println("Error: Try a valid option");
					break;
				}

			} else {

				System.out.println("Your option has to be numeric. Try again");
				scan.nextLine();
			}

		} while (option != 3);

		scan.close();
	}

}
