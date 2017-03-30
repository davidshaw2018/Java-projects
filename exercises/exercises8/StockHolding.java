package exercises8;

public class StockHolding {
	
	private final String name, owner;
	private int nShare;
	private double pShare;
	
	
	

	public StockHolding(String name, String owner, int nShare, double pShare) {
		this.name = name;
		this.owner = owner;
		this.nShare = nShare;
		this.pShare = pShare;
	}

	


	@Override
	public String toString() {
		return "Name=" + name + ", owner=" + owner + "\nNumber of shares=" + nShare + "\nPrice per share=" + pShare;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nShare;
		long temp;
		temp = Double.doubleToLongBits(pShare);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}




	public String getName() {
		return name;
	}




	public String getOwner() {
		return owner;
	}




	public int getnShare() {
		return nShare;
	}




	public double getpShare() {
		return pShare;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StockHolding other = (StockHolding) obj;
		if (nShare != other.nShare)
			return false;
		if (Double.doubleToLongBits(pShare) != Double.doubleToLongBits(other.pShare))
			return false;
		return true;
	}




	public static void main(String[] args) {
		StockHolding apple = new StockHolding("AAPL","DShaw",30,31.71);
		System.out.println(apple);
	}

}
