package studio4;

import java.awt.Color;
import java.awt.Font;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import sedgewick.StdAudio;
import sedgewick.StdDraw;
import sedgewick.StdIn;

public class Flag {

	
	public static void main(String[] args) throws FileNotFoundException {
		StdDraw.setPenColor(new Color(42,0,69));
		StdDraw.filledRectangle(.5, .5, .5, .167);
		
		StdDraw.setPenColor(new Color(100,50,180));
		StdDraw.filledRectangle(.5, .167, .5, .167);
		
		StdDraw.setPenColor(Color.blue);
		StdDraw.filledRectangle(.5, .833, .5, .167);
		
		StdDraw.setPenColor(Color.magenta);
		StdDraw.setPenRadius(.05);
		StdDraw.line(1, 0, 0, 1);
		StdDraw.line(1, 1, 0, 0);
		StdDraw.setPenColor(Color.black);
		StdDraw.line(0, 0, 1, 0);
		
		StdDraw.line(1, 0, 1, 1);
		StdDraw.line(0, 0, 0, 1);
		StdDraw.line(1, 1, 0, 1);
		
		StdDraw.setPenColor(Color.white);
		Font font = new Font("Arial", Font.BOLD, 24);
		StdDraw.setFont(font);
		double x = 0;
		double y = 1;
		while (x < 1 && y > 0) {
		
			
			
		StdDraw.text(x, y, "ROSSLANDIA");
		x = x + .05;
		y = y - .05;
		StdDraw.pause(500);
		
		
		}
		System.setIn(new FileInputStream("music/National_Anthem.txt"));

        // repeat as long as there are more integers to read in
        while (!StdIn.isEmpty()) {

            // read in the pitch, where 0 = Concert A (A4)
            int pitch = StdIn.readInt();

            // read in duration in seconds
            double duration = StdIn.readDouble();

            // build sine wave with desired frequency
            double hz = 440 * Math.pow(2, pitch / 12.0);
            int N = (int) (StdAudio.SAMPLE_RATE * duration);
            double[] a = new double[N+1];
            for (int i = 0; i <= N; i++) {
                a[i] = Math.sin(2 * Math.PI * i * hz / StdAudio.SAMPLE_RATE);
            }

            // play it using standard audio
            StdAudio.play(a);
        }
	}

}
