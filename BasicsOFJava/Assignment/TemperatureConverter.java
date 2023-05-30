import java.util.Scanner;

public class TemperatureConverter {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.print("Enter the temperature: ");

double temperature = scanner.nextDouble();

System.out.println("\n----- Conversion Menu -----");

System.out.println("1. Celsius to Fahrenheit");

System.out.println("2. Fahrenheit to Celsius");

System.out.println("---------------------------");

System.out.print("Enter your choice: ");

int choice = scanner.nextInt();

//double convertedTemperature;

switch (choice) {

case 1:
celsiusToFahrenheit(temperature);
break;



case 2:

fahrenheitToCelsius(temperature);

break;

default:

System.out.println("Invalid choice!");

break;

}

scanner.close();

}

public static void celsiusToFahrenheit(double celsius) {

    
    double convertedTemperature = (celsius*9/5)+32;
    System.out.println(convertedTemperature);
    
    

}

public static  void fahrenheitToCelsius(double fahrenheit) {
    
    double convertedTemperature = ((fahrenheit-32)*5)/9;
    System.out.println(convertedTemperature);

 }

}