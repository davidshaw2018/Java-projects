package mousefollower;

import sedgewick.StdDraw;

public class FollowTheMouse {
	
	public static double[] getMousePosition() {
		double[] mousePosition = {StdDraw.mouseX(), StdDraw.mouseY()};
		return mousePosition;
	}
	
	
		
}
