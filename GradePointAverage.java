import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class GradePointAverage {
	static double[] grades = {0, 0, 0, 0, 0, 0, 0} ;
	static ArrayList<Double>  convertedGPA = new ArrayList<Double>();
	
	public static void conversion(double[] grades) {
		for (int i = 0; grades[i] >= 90; i++) {
			convertedGPA.add(4.0);
		} for (int i = 0; grades[i] >= 80; i++) {
			convertedGPA.add(3.0);
		} for (int i = 0; grades[i] >= 70; i++) {
			convertedGPA.add(2.0);
		} for (int i = 0; grades[i] >= 60; i++) {
			convertedGPA.add(1.0);
		} for (int i = 0; grades[i] < 60; i++) {
			convertedGPA.add(0.1);
		} for (int i = 0; i > 5; i++) {
			if (i >= 5) {
				break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input your math grade");
		grades[0] = input.nextDouble();
		System.out.println("Please input your science grade");
		grades[1] = input.nextDouble();
		System.out.println("Please input your religion grade");
		grades[2] = input.nextDouble();
		System.out.println("Please input your social studies grade");
		grades[3] = input.nextDouble();
		System.out.println("Please input your language grade");
		grades[4] = input.nextDouble();
		System.out.println("Please input your english grade");
		grades[5] = input.nextDouble();
		System.out.println("Please input the amount of APs you are taking");
		double aps = input.nextDouble();
		System.out.println("Please input the amount of Honors classes you are taking");
		double honors = input.nextDouble();
		grades[6] = 0;
		input.close();
		conversion(grades);
		System.out.println((convertedGPA.get(0) + convertedGPA.get(1) + convertedGPA.get(2) + convertedGPA.get(3) + convertedGPA.get(4) + convertedGPA.get(5) + aps + 0.5 * honors) / 6 + " is your gpa");
	}
}
