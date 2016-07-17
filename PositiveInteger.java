
public class PositiveInteger extends Semigroup<PositiveInteger>{
	int x = 0;
	
	
	public PositiveInteger(int x)
	{
		
		if(x >= 0)
			this.x = x;
		else
			throw new IllegalArgumentException("Number must be "
					+ "greater than 0.");
		
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}

	//add method here
	@Override
	public PositiveInteger operator(PositiveInteger input) {
		
		PositiveInteger sum = new PositiveInteger(0);
		int x = this.getX(), y = input.getX(), z = sum.getX();
		z = x + y;
		sum.setX(z);
		System.out.println(x + " + " + y + " = " + z);
		return sum;
	}

	
}
