import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("⚖️ Weight Converter");
        System.out.println("Choose an option:");
        System.out.println("1. Kilograms to Pounds");
        System.out.println("2. Pounds to Kilograms");
        System.out.println("3. Grams to Kilograms");
        System.out.println("4. Kilograms to Grams");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter weight in Kilograms: ");
                double kg = scanner.nextDouble();
                double pounds = kg * 2.20462;
                System.out.println(kg + " kg = " + pounds + " lbs");
                break;

            case 2:
                System.out.print("Enter weight in Pounds: ");
                pounds = scanner.nextDouble();
                kg = pounds * 0.453592;
                System.out.println(pounds + " lbs = " + kg + " kg");
                break;

            case 3:
                System.out.print("Enter weight in Grams: ");
                double grams = scanner.nextDouble();
                kg = grams / 1000;
                System.out.println(grams + " g = " + kg + " kg");
                break;

            case 4:
                System.out.print("Enter weight in Kilograms: ");
                kg = scanner.nextDouble();
                grams = kg * 1000;
                System.out.println(kg + " kg = " + grams + " g");
                break;

            default:
                System.out.println("Invalid choice. Please restart the program.");
        }

        scanner.close();
    }
}
