package studio7;

public class Rectangle {
 
	
	private int length;
	private int width;
	
	public int area (int a, int b) {
		a = this.length;
		b = this.width;
		return a*b;
	}
	
	public int perimeter (int a, int b){
		a = this.length;
		b = this.width;
		return 2*a + 2*b;
	
	}

	public boolean square (int a, int b){
		a = this.length;
		b = this.width;
		if (a==b){
		return true;
		}
		else return false;
	}
	public boolean bigger (int a, int b, int c , int d){
		a = this.length;
		b = this.width;
		if (a*b > c*d){
			return true;
		}
		else return false;

		
		
		}
	public Rectangle (int length, int w){
		this.length = length;
		this.width = w;
	}
	

	public static void main(String[] args) {
		Rectangle dave = new Rectangle(10,5);
		System.out.println("Area "+dave.area(10, 5));
		System.out.println("Perimeter "+dave.perimeter(10, 5));
		System.out.println("Square "+dave.square(10, 5));
		System.out.println("Bigger "+dave.bigger(10, 5,2,4));

		
		
	}
	
}