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
		for (int m = 0; m < 12; ++m) {
			for (int d = 0; d < 31; ++d) {
				if (calendar[m][d] > 1) {
					sameBirthdays = sameBirthdays + 1;
				}
				monthBirthdays[m] = monthBirthdays[m] + calendar[m][d];
				dayBirthdays[d] = dayBirthdays[d] + calendar[m][d];	
			}

		}
		double[] monthPercent = new double[12];
		double[] dayPercent = new double[31];
		double monthSum = 0;
		double daySum = 0;

		for (int i = 0; i < monthPercent.length; ++i) {
			monthPercent[i] = (double)Math.round(1000 * (double)monthBirthdays[i] / N) / 10;
			monthSum = monthSum + monthPercent[i];
		}
		for (int i = 0; i < dayPercent.length; ++i) {
			dayPercent[i] = (double)Math.round(1000 * (double)dayBirthdays[i] / N) / 10;
			daySum = (double)Math.round(10 * (daySum + dayPercent[i])) / 10;
		}
		System.out.println(sameBirthdays);

	}

}









