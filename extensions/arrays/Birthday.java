package arrays;
import cse131.ArgsProcessor;

public class Birthday {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt("How many people enter the room?");
		int[][] calendar = new int[12][31];

		for (int i = 0; i < N; ++i) {
			int month = (int)(12 * Math.random());
			int day = (int)(31 * Math.random());
			calendar[month][day] = calendar[month][day] + 1;
		}

		int sameBirthdays = 0;
		int[] monthBirthdays = new int[12];
		int[] dayBirthdays = new int[31];
		System.out.println("Calendar:\n");
		for (int m = 0; m < 12; ++m) {
			for (int d = 0; d < 31; ++d) {
				if (calendar[m][d] > 1) {
					sameBirthdays = sameBirthdays + calendar[m][d];
				}
				monthBirthdays[m] = monthBirthdays[m] + calendar[m][d];
				dayBirthdays[d] = dayBirthdays[d] + calendar[m][d];	
				System.out.print(calendar[m][d] + " ");
			}
				System.out.println();
		}
		System.out.println("\nBirthdays per month: ");
		for (int m = 0; m < 12; ++m) {
			System.out.print(monthBirthdays[m] + " ");
		}
		System.out.println("\n\nBirthdays by day: ");
		for (int d = 0; d < 31; ++d) {
			System.out.print(dayBirthdays[d] + " ");
		}
		double[] monthPercent = new double[12];
		double[] dayPercent = new double[31];
		double monthSum = 0;
		double daySum = 0;
		System.out.print("\n\nPercent of birthdays by month: \n");
		
		for (int i = 0; i < monthPercent.length; ++i) {
			monthPercent[i] = (double)Math.round(1000 * (double)monthBirthdays[i] / N) / 10;
			monthSum = monthSum + monthPercent[i];
			System.out.print(monthPercent[i] + "%  ");
		}
		System.out.println("\n\nPercent of birthdays by day: ");
		
		for (int i = 0; i < dayPercent.length; ++i) {
			dayPercent[i] = (double)Math.round(1000 * (double)dayBirthdays[i] / N) / 10;
			daySum = (double)Math.round(10 * (daySum + dayPercent[i])) / 10;
			System.out.print(dayPercent[i] + "%  ");
		}
		System.out.println();
		double monthAverage = (double)Math.round(10 * monthSum / 12) / 10;
		double dayAverage = (double)Math.round(10 * daySum / 31) / 10;
		double samePercent = (double)Math.round(10 * (double)sameBirthdays / N) / 10;
		
		System.out.println("\nMonthly percent average: " + monthAverage + "%");
		System.out.println("Daily percent average: " + dayAverage + "%");
		System.out.println("Percent of people with same birthday: " + samePercent + "%");
	}

}









