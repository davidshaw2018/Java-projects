package exercises8;

public class PersonalProperty implements Valuable {
	
	private final int initialValue;
	private int age;
	
	public PersonalProperty(int initialValue) {
		this.initialValue = initialValue;
	}

	@Override
	public String toString() {
		return "PersonalProperty [initialValue=" + initialValue + ", age=" + age + "]";
	}
	
	public int depreciatedValue() {
		return initialValue*(int)Math.pow(.80, age);
	}

	@Override
	public int getLiquidValue() {
		return this.depreciatedValue();
	}
	
	

}
