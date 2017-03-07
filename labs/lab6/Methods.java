package lab6;

public class Methods {
	
	//
	// In this class, implement the f and g functions described on the lab page
	//
	/**
	 * 
	 * @param int x
	 * @return if x>100, x-10; else f(f(x+11))
	 */
	public static int fx(int x) {
		if (x > 100) {
			return x-10;
		}
		else return fx(fx(x+11));
	}
	//f(99) = f(f(110)) = f(100) = f(f(111)) = f(101) = 91
	//f(87) = f(f(98)) = f(f(109)) = f(99) = 91
	
	public static int gxy(int x, int y) {
		if (x==0) {
			return y + 1;
		}
		else if (x>0 && y==0) {
			return gxy(x-1, 1);
		}
		else {
			return gxy(x-1, gxy(x, y-1));
		}
	}
	
	// g(1,0) = g(0,1) = 2
	// g(1,2) = g(0,g(1,1)) = g(0, g(0,g(1,0)) = g(0,3) = 4
	// g(2,2) = g(1, g(2,1)) = g(1,5) = 7
	// 
	// g(2,1) = g(1,g(2,0)) = g(1,g(1,1))
	// g(1,1) = g(0,g(1,0)) = g(0,2) = 3
	// g(2,1) = g(1,3) 
	// g(1,3) = g(0,g(1,2)) = g(0,4) = 5
	// g(2,1) = 5
	// g(2,2) = g(1,5)
	// g(1,5) = g(0,g(1,4)) = g(1,4) + 1
	// g(1,4) = g(0, g(1,3)) = g(1,3) + 1 = 6
	// g(1,5) = 6+1 = 7
	
	// The recursion does not stop for x => 4 or x=3, y=>13, with the exception of x=4, y=0.
	// g(1,y) = g(0, g(1, y-1)) 
	//	= g(1,y-1) + 1
	//	= g(1,y-2) + 2 = ... 
	//	= g(1,0) + y 
	//	= y+2
	// 
	// g(2,y) = g(1,g(2,y-1)) 
	//	= g(2,y-1) + 2 
	//	= g(2,y-2) + 4 = ... 
	//	= g(2,0) + 2y 
	//	= g(1,1) + 2y 
	//	= 3 + 2y;
	// 
	// g(3,y) = g(2,g(3,y-1)) 
	//	= 3 + 2*g(3,y-1) 
	//	= 3 + 2*g(2,g(3,y-2))
	//	= 3 + 2*(3 + 2*g(3,y-2)) 
	// 	= 3 + 2*3 + (2^2)*g(3,y-2)
	//  = 3*3 + (2^2)*(g(2,g(3,y-3)))
	//	= 3*3 + (2^2)*(3 + 2*g(3,y-3))
	//	= 3 + 2*3 + (2^2)*3 + (2^3)*g(3,y-3) = ...
	//	= 3*(1+2+2^2+...+2^(y-1)) + (2^y)*g(3,0)
	// 	= 3*(1+2+..+2^(y-1)) + (2^y)*g(2,1)
	//	= 3*(1+2+..+2^(y-1)) + (2^y)*5 
	// 	sum of (2^0 + 2^1 + ... 2^n) = 2^(n+1) - 1; 
	// ==> g(3,y) = (2^y)*5 + [(2^y)-1]*3
	
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//
		// from here, call f or g with the appropriate parameters
		//
		System.out.println(gxy(3,10));
		System.out.println(gxy(3,11));
		System.out.println(gxy(3,12));
		System.out.println(gxy(3,13));
	}

}
