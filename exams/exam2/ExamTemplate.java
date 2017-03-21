package exam2;

import java.awt.Color;

import sedgewick.StdDraw;

public class ExamTemplate {
	public static void main(String[] args) {
		System.out.println(dragon(2));
	}
	
	public static String koch(int n) {
		String kochString = "F";
		if (n==0) {
			return kochString;
		}
		if (n==1) {
			return kochString.replaceAll(koch(0), "F+F-F-F+F");
		}
		else return koch(n-1).replaceAll(koch(0), koch(n-1));
	}
	
	public static String dragon (int n) {
		String dragonString = "F-H";
		for (int i = 0; i < n; ++i) {
			dragonString = dragonString.replaceAll("F", "F-H");
			dragonString = dragonString.replaceAll("H-", "F+H-");
		}
		return dragonString;
	}
	
	public static double computeScale(String l) {
		int lines = 0;
		for (int i = 0; i < l.length(); ++i) {
			if (l.charAt(i) == 'F' || l.charAt(i) == 'H') {
				lines += 1;
			}
		}
		return 1.0/(2*Math.pow((double)lines, 0.5));
	}
	
	public static void drawLString(String lString) {
		double xPos = 0.5;
		double yPos = 0.5;
		int[] dir = {1,0};
		double scale = computeScale(lString);
		int xHist = 1;
		int yHist = 0;
		StdDraw.setPenColor(Color.black);
		StdDraw.setPenRadius(.00001);
		for (int i = 0; i < lString.length(); ++i) {
			if (lString.charAt(i) == 'F' || lString.charAt(i) == 'H') {
				StdDraw.line(xPos, yPos, xPos + scale*dir[0], yPos+scale*dir[1]);
				xPos = xPos + scale*dir[0];
				yPos = yPos + scale*dir[1];
			}
			else if (lString.charAt(i) == '+') {
				dir[0] = -yHist;
				dir[1] = xHist;
				xHist = dir[0];
				yHist = dir[1];	
			}
			else if (lString.charAt(i) == '-') {
				dir[0] = yHist;
				dir[1] = -xHist;
				xHist = dir[0];
				yHist = dir[1];	
			}
		}
	}
}
