import java.util.Scanner;
import java.util.Random;

public class DogGenetics {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your dog's name");
		String dogName = scanner.nextLine();
		System.out.println();
		
		Random r = new Random();
		int breed1 = r.nextInt(100);
		int breed2 = r.nextInt(100 - breed1);
		int breed3 = r.nextInt(100 - breed1 - breed2);
		int breed4 = r.nextInt(100 - breed1 - breed2 - breed3);
		int breed5 = r.nextInt(100 - breed1 - breed2 - breed3 - breed4);
		
		System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");
		System.out.println();

		System.out.println(breed1 + "% St. Bernard");
		System.out.println(breed2 + "% Chihuahua");
		System.out.println(breed3 + "% Dramatic RedNosed Asian Pug");
		System.out.println(breed4 + "% Common Cur");
		System.out.println(breed5 + "% King Doberman");
		System.out.println();

		System.out.println("Wow, that's QUITE the dog!");
	}

}
