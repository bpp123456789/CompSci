import java.util.Scanner;

public class AverageNumberOfThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input your first number");
		double numberOne = input.nextDouble();
		System.out.println("Please input your second number");
		double numberTwo = input.nextDouble();
		System.out.println("Please input your thrid number");
		double numberThree = input.nextDouble();
		double average = ((numberOne + numberTwo + numberThree) / 3);
		System.out.println(average + " is the average of the three numbers");
		input.close();

	}

}
