package ss3_array_method.thuc_hanh;

import java.util.Scanner;

public class doi_nhiet_do {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double fahrenheit;
        double celsius;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            int choice=scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter fahrenheit: ");
                    fahrenheit = scanner.nextInt();
                    System.out.println("Fahrenheit to Celsius: "+ fahrenheitToCelsius(fahrenheit));
                case 2:
                    System.out.println("Enter celsius: ");
                    celsius=scanner.nextInt();
                    System.out.println("Celsius to Fahrenheit: "+celsiusToFahrenheit(celsius));
            }
        }while (true);
    }
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius +32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
