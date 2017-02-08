package bankinterest;

public class BankInterest {

	public static void main(String[] args) {
		double wealth = 4000;

System.out.println("Day       Type          Amount   Current Wealth");

		for (int i = 0; i < 30; ++i) {
			String type = "Deposit";
			double change = -100;
			if (Math.random() < .5) {
				change = 200.5;
			}
			else {
				type = "Withdrawal";
			}
			wealth = wealth + change;
			if (i < 9) {
				if (type == "Withdrawal") {System.out.println("Day " + (i + 1) + ":    " + type + "    "
					+ Math.abs(change) + "    " + wealth);}
				else {System.out.println("Day " + (i + 1) + ":    " + type + "       "
						+ Math.abs(change) + "    " + wealth);
			
			}
				}
				
			else {if (type == "Withdrawal") {System.out.println("Day " + (i + 1) + ":   " + type + "    "
					+ Math.abs(change) + "    " + wealth);}
			else {System.out.println("Day " + (i + 1) + ":   " + type + "       "
					+ Math.abs(change) + "    " + wealth);
				
			

			}
			}
		}
		double interest = (double)Math.round(2 * wealth) / 100;
		System.out.println();
		System.out.println("Interest earned:        " + interest);
		System.out.println("Total wealth:                    " + (interest + wealth));
	}
}

