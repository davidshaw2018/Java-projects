package david_shawexam2;

import java.awt.Color;

import sedgewick.StdDraw;


/* 
* Compile Error Deductions: 
* __ [-1] Needed to fix a compilation problem in the code
*/  

public class ExamReturned { 
	public static void main(String[] args) {
		System.out.println(dragon(2));
	}
	

/* Question 1: 15

* __ [+25points] Code produces correct output and follows question specifications appropriately.

* Otherwise, check off as many of these as applicable:

* _x_ [+5] Correct method signature: public static String koch(int n); variable name n can change. Small typos and upper/lower case should not be penalized.
* _x_ [+5] "Correctly identifies the base case - when n==0 returns ""F"""
* _x_ [+5] "When n > 0 gets koch(n-1)"
* __ [+5] "When n > 0  replaces F's in koch(n-1) with ""F+F-F-F+F"""
*/

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
	

/* Question 2: 16

* __ [+25points] Code produces correct output and follows question specifications appropriately.

* Otherwise, check off as many of these as applicable:

* _x_ [+4] Correct method signature: public static String dragon(int n); variable name n can change. Small typos and upper/lower case should not be penalized.
* _x_ [+4] "Declares an initial dragonString (name doesn't matter) that equals ""F-H"""
* _x_ [+4] Uses a for loop i = o; i < n or equivalent while loop 
* _x_ [+4] Replaces F's with F-H and H's with F+H
* __ [+4] "When replacing F's and H's avoids incorrect additions (e.g. F-H becomes F-H - F+H NOT F-F+H -F+H OR F-H-F-H+H)"
*/

	public static String dragon (int n) {
		String dragonString = "F-H";
		for (int i = 0; i < n; ++i) {
			dragonString = dragonString.replaceAll("F", "F-H");
			dragonString = dragonString.replaceAll("H-", "F+H-");
		}
		return dragonString;
	}
	

/* Question 3: 25

* _x_ [+25points] Code produces correct output and follows question specifications appropriately. 

* Otherwise, check off as many of these as applicable:

* __ [+4] Correct method signature: public static double computeScale(String lString); variable name lString can change. Small typos and upper/lower case should not be penalized.
* __ [+4] Uses a loop i = 0; i < lString.length() or equivalent while loop
* __ [+4] Uses charAt(i) to get the ith character in the string within the loop
* __ [+4] "When character is either an F or an H adds 1 to a count variable (name substitutions are fine)"
* __ [+4] Returns 1/(2*Math.sqrt(count)) with parentheses that ensure the correct order of operations
*/

	public static double computeScale(String l) {
		int lines = 0;
		for (int i = 0; i < l.length(); ++i) {
			if (l.charAt(i) == 'F' || l.charAt(i) == 'H') {
				lines += 1;
			}
		}
		return 1.0/(2*Math.pow((double)lines, 0.5));
	}
	

/* Question 4: 21

* __ [+25points] Code produces correct output and follows question specifications appropriately.

* Otherwise, check off as many of these as applicable:

* _x_ [+3] Correct method signature: public static void drawLString(String lString); variable name lString can change. Small typos and upper/lower case should not be penalized.
* _x_ [+3] Calls computeScale to get the scale value
* _x_ [+3] Uses a loop i = 0; i < lString.length() or equivalent while loop
* _x_ [+3] Uses charAt(i) to get the ith character in the string within the loop
* _x_ [+3] Maintains x and y directions that are used within the StdDraw.line call
* _x_ [+3] Uses one or more if statement/if-else statements to draw lines for F or H characters
* _x_ [+3] Uses one or more if statement/if-else statements to change x and y directions for + and - characters
*/

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
