import java.util.Scanner;

public class DistanceFormula {

		public static void main(String[] args) {
			System.out.println("Please input the first point's length/x value");
			Scanner input = new Scanner(System.in);
			double xOne = input.nextDouble();
			System.out.println("Please input the first point's height/y value");
			double yOne = input.nextDouble();
			System.out.println("Please input the second point's length/x value");
			double xTwo = input.nextDouble();
			System.out.println("Please input the second point's height/y value");
			double yTwo = input.nextDouble();
			input.close();
			double xx = xTwo - xOne;
			double xSquared = Math.pow(xx, 2);
			double yy = yTwo - yOne;
			double ySqaured = Math.pow(yy, 2);
			double xy = ySqaured + xSquared;
			double distance = Math.pow(xy, 0.5);
			System.out.println("The distance is " + distance);
		}
}
