import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please type a number in to find whether it is even or odd");
		int number = input.nextInt();
		if (number % 2 == 0) {
			System.out.println("The number " + number + " is even");
		} else {
			System.out.println("The number " + number + " is odd");
		}
		input.close();

	}

}
