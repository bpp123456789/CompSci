import java.util.Scanner;

public class priceCheckAndTaxTshirts {
	static double cost;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		if (amount <= 9 && amount > 0) {
			cost = amount * 15;
		} else if (amount > 9 && amount < 15) {
			cost = amount * 12.5;
		} else if (amount >= 15) {
			cost = amount * 11.75;
		}
		System.out.println("Please input your state's abbreviation");
		String state = input.next();
		
		if (state == "MA") {
			double fullPrice = cost;
		} else if (state == "RI") {
			double fullPrice = cost;
		} else if (state == "NH") {
			double fullPrice = cost;
		} else if (state == "ME") {
			double fullPrice = 0.055 * cost + cost;
		} else if (state == "CT") {
			double fullPrice = 0.0635 * cost + cost;
		} else {
			System.out.println("You must be from MA, RI, NH, ME, or CT");
		}
		input.close();
		System.out.println("Your full price is " + String.format("%, .2f, fullprice"));
	}
}

