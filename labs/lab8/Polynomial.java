package lab8;

import java.util.Iterator;
import java.util.LinkedList;

public class Polynomial {

	final private LinkedList<Double> list;
	private Object String;

	/**
	 * Constructs a Polynomial with no terms yet.
	 */
	public Polynomial() {
		//
		// Set the instance variable (list) to be a new linked list of Double type
		//

		list = new LinkedList<Double>();  
	}

	public String toString() {
		String ans = "";
		if (list.size() == 0) {
			return "0";
		}
		else ans = list.get(0) + "";
		for (int i = 1; i < list.size() - 1; ++i) {
			if (list.get(i) < 0) {
				ans += " " + list.get(i) + "x^" + i;
			}
			if (list.get(i) > 0) {
				ans += " + " + list.get(i) + "x^" + i;
			}
		}
		if (list.get(list.size()-1) < 0) {
			ans += " - " + list.get(list.size() - 1) + "x^" + (list.size() - 1);
		}
		if (list.get(list.size()-1) > 0) {
			ans += " + " + list.get(list.size() - 1) + "x^" + (list.size() - 1);
		}
		return ans; 
	}
/**
 * 
 * @param coefficient of next highest order term
 * @return new term with coefficient
 */
	public Polynomial addTerm(double coef) {
		list.add(coef);
		return this;  // required by lab spec
	}

	public double evaluate(double x) {
		return helper(x,0);
	}
/**
 * 
 * @param value of x
 * @param list position
 * @return recursive method of list(i) + x*next value
 */
	public double helper(double x, int listPosition) {
		if (listPosition >= list.size()) {
			return 0;
		}
		else return list.get(listPosition) + x*helper(x,listPosition+1);	
	}
/**
 * 
 * @return derivative of the polynomial
 */
	public Polynomial derivative() {
		Polynomial ans = new Polynomial();
		for (int i = 0; i < list.size()-1; ++i) {
			ans.addTerm((i+1)*list.get(i+1));
		}
		return ans;
	}
/**
 * 
 * @param another polynomial
 * @return sum of two polynomial coefficients
 */
	public Polynomial sum(Polynomial another) {
		Polynomial ans = new Polynomial();
		int size = 0;
		boolean thisLonger = false;
		if (this.list.size() > another.list.size()) {
			size = another.list.size();
			thisLonger = true;
		}
		else size = this.list.size();
		for (int i = 0; i < size; ++i) {
			ans.list.add(i, list.get(i) + another.list.get(i));
		}
		if (thisLonger) {
			for (int i = size; i < this.list.size(); ++i) {
				ans.list.add(i,this.list.get(i));
			}
		}
		else {
			for (int i = size; i < another.list.size(); ++i) {
				ans.list.add(i,another.list.get(i));
			}
		}
		return ans;   
	}

	/**
	 * This is the "equals" method that is called by
	 *    assertEquals(...) from your JUnit test code.
	 *    It must be prepared to compare this Polynomial
	 *    with any other kind of Object (obj).  Eclipse
	 *    automatically generated the code for this method,
	 *    after I told it to use the contained list as the basis
	 *    of equality testing.  I have annotated the code to show
	 *    what is going on.
	 */

	public boolean equals(Object obj) {
		// If the two objects are exactly the same object,
		//    we are required to return true.  The == operator
		//    tests whether they are exactly the same object.
		if (this == obj)
			return true;
		// "this" object cannot be null (or we would have
		//    experienced a null-pointer exception by now), but
		//    obj can be null.  We are required to say the two
		//    objects are not the same if obj is null.
		if (obj == null)
			return false;

		//  The two objects must be Polynomials (or better) to
		//     allow meaningful comparison.
		if (!(obj instanceof Polynomial))
			return false;

		// View the obj reference now as the Polynomial we know
		//   it to be.  This works even if obj is a BetterPolynomial.
		Polynomial other = (Polynomial) obj;

		//
		// If we get here, we have two Polynomial objects,
		//   this and other,
		//   and neither is null.  Eclipse generated code
		//   to make sure that the Polynomial's list references
		//   are non-null, but we can prove they are not null
		//   because the constructor sets them to some object.
		//   I cleaned up that code to make this read better.


		// A LinkedList object is programmed to compare itself
		//   against any other LinkedList object by checking
		//   that the elements in each list agree.

		return this.list.equals(other.list);
	}

	public static void main (String[] args) {
		Polynomial a = new Polynomial();
		a.addTerm(-2).addTerm(-4).addTerm(2);
		System.out.println(a);
		Polynomial b = new Polynomial();
		b.addTerm(4).addTerm(3);
		System.out.println(a.sum(b));
		System.out.println(b.evaluate(3));
	}


}
