package exercises4;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class MouseFollower {

	public static void main(String[] args) {
		
		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt("How many steps behind?");
		double[] histX = new double[N];
		double[] histY = new double[N];
		int currentPos = 0;
		
		StdDraw.setPenRadius(.05);
		while (true) {
			StdDraw.clear();
			//
			// Render one frame of your animation below here
			//
			double ballX = StdDraw.mouseX();
			double ballY = StdDraw.mouseY();
			histX[currentPos] = ballX;
			histY[currentPos] = ballY;
			currentPos = currentPos + 1;
			if (currentPos >= histX.length) {
				currentPos = 0;
			}
			int oldest = currentPos;
			StdDraw.filledCircle(histX[oldest], histY[oldest], .05);
			
			//  
			// End of your frame
			//
			// Stdraw.show(..) achieves double buffering and
			//   avoids the tight spinning loop
			StdDraw.show(10);
		}

	}

}
