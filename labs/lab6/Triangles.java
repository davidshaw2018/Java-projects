package lab6;

import java.awt.Color;

import sedgewick.StdDraw;

public class Triangles {

/**
 * 
 * @param lower x vertex
 * @param lower y vertex
 * @param size 
 */
	public static void triangles(double x, double y, double size) {

		if (size < .04) {
			return;
		}
		StdDraw.setPenColor(Color.white);
		double[] triangleX = {x+.25*size,x+.75*size, x+.5*size};
		double[] triangleY = {y+.5*size, y+.5*size, y};
		StdDraw.filledPolygon(triangleX, triangleY);
		
		triangles(x+.25*size, y+size/2, size/2);
		triangles(x+.5*size, y, size/2);
		triangles(x,y,size/2);
	}


	public static void main(String[] args) {

		double[] bTrianglex = {0,.5,1};
		double[] bTriangley = {0,1,0};
		StdDraw.filledPolygon(bTrianglex, bTriangley);
		triangles(0,0,1);

		}
	}