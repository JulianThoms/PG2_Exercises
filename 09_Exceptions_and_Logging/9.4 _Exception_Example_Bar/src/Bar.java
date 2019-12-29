import Exceptions.NoMoreDrinksException;
import Exceptions.WrongTemperatureException;

import java.util.Scanner;

public class Bar {
	int amountDrinks;
	Scanner sc;

	public Bar(int amountDrinks) {
		sc = new Scanner(System.in);
		this.amountDrinks = amountDrinks;
	}

	public void serveDrink() {

		System.out.println("Please Insert the Temperature of the cold Drink : ");
		int temp;
		while (true) {
			try {
				temp = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Please enter a valid temperature (An Integer number)!");
				e.printStackTrace();
				continue;
			}
			break;
		}
		try {
			checkTemp(temp);
			checkAmountDrinks();
			amountDrinks--;
			System.out.println("Drinks in Storage: " + amountDrinks);
			System.out.println("The drink is optimal and the customer is happy!");
		} catch (WrongTemperatureException | NoMoreDrinksException e) {
			System.err.println(e.getLocalizedMessage());
		}
	}

	public void checkTemp(int temp) throws WrongTemperatureException {
		if (temp < 7) {
			throw new WrongTemperatureException("Too cold!", temp);
		} else if (temp > 9) {
			throw new WrongTemperatureException("Too warm!", temp);
		}
	}

	public void checkAmountDrinks() throws NoMoreDrinksException {
		if (amountDrinks <= 0) {
			throw new NoMoreDrinksException();
		}
	}
}