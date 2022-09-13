import java.util.Scanner;

public class HealthyHearts {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your age?");
		int age = scanner.nextInt();
		
		int heartRate = 220 - age;
		double lowerZone = heartRate * 0.5;
		double higherZone = heartRate * 0.85;
		int intLowerZone = (int) Math.round(lowerZone);
		int intHigherZone = (int) Math.round(higherZone);
		
		System.out.println("Your maximum heart rate should be " + heartRate + " beats per minute");
		System.out.println("Your target HR Zone is " + intLowerZone + " - " + intHigherZone + " beats per minute");
	}

}
